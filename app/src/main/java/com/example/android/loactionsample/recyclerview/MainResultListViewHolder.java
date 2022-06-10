package com.example.android.loactionsample.recyclerview;

import static android.widget.Toast.LENGTH_SHORT;
import static com.uber.autodispose.AutoDispose.autoDisposable;
import static com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider.from;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.android.loactionsample.DetailPage;
import com.example.android.loactionsample.R;
import com.example.android.loactionsample.datamodel_main.MainResultUnit;
import com.example.android.loactionsample.datamodel_photo.PhotoResult;
import com.example.android.loactionsample.datamodel_photo.PhotoUnit;
import com.example.android.loactionsample.retrofit.PhotoRepository;
import com.example.android.loactionsample.util.AppConstants;
import java.util.ArrayList;
import java.util.List;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainResultListViewHolder extends RecyclerView.ViewHolder{
    LinearLayout parent_layout;
    TextView location_name;
    ImageView location_photo;
    String detailName,location_address,phone,url;
    List<PhotoUnit> photoList;

    public MainResultListViewHolder(@NonNull View itemView) {
        super(itemView);
        parent_layout = itemView.findViewById(R.id.list_item_main_result);
        location_name = itemView.findViewById(R.id.location_name);
        location_photo = itemView.findViewById(R.id.location_photo);
    }
    public void bindMainResultData(MainResultUnit mainResultUnit){
        location_name.setText(mainResultUnit.poi().name());

        detailName = mainResultUnit.poi().name();
        phone = mainResultUnit.poi().phone();
        url = mainResultUnit.poi().url();
        location_address = mainResultUnit.address().freeformAddress();

        PhotoRepository
                .getPhotoResult(AppConstants.key,
                        mainResultUnit.dataSources().poiDetails().get(0).photoId())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .as(autoDisposable(from((LifecycleOwner) this)))
                .subscribe(this::onSuccess,this::onError);
    }

    private void onError(Throwable throwable) {
        Toast.makeText(itemView.getContext(), throwable.getMessage(), LENGTH_SHORT).show();
    }

    private void onSuccess(PhotoResult photoResult) {
        photoList = photoResult.photoInfo().photoList();
        Glide.with(itemView.getContext())
                .load(AppConstants.baseUrl +
                        "search/2/poiPhoto?key=" +
                        AppConstants.key + "&id=" +
                        photoList.get(0).id())
                .error(R.drawable.image_error)
                .into(location_photo);

        parent_layout.setOnClickListener(view -> {
            Intent intent = new Intent(itemView.getContext(), DetailPage.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  //Important
            intent.putExtra("detailName", detailName);
            intent.putExtra("phone", phone);
            intent.putExtra("url", url);
            intent.putExtra("location_address", location_address);

            ArrayList<PhotoUnit> transList = new ArrayList<>(photoList);
            Bundle bundle = new Bundle();
            bundle.putSerializable("photoList", transList);

            intent.putExtras(bundle);
            itemView.getContext().startActivity(intent);
        });
    }
}