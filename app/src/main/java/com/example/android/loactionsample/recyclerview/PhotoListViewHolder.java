package com.example.android.loactionsample.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.android.loactionsample.R;
import com.example.android.loactionsample.datamodel_photo.PhotoUnit;
import com.example.android.loactionsample.util.AppConstants;

public class PhotoListViewHolder extends RecyclerView.ViewHolder{
    LinearLayout parent_layout;
    ImageView location_photo;

    public PhotoListViewHolder(@NonNull View itemView) {
        super(itemView);
        parent_layout = itemView.findViewById(R.id.list_item_photo_list);
        location_photo = itemView.findViewById(R.id.location_photo);
    }

    public void bindPhotoListData(PhotoUnit photoUnit) {
        Glide.with(itemView.getContext())
                .load(AppConstants.baseUrl +
                        "search/2/poiPhoto?key=" + AppConstants.key +
                        "&id=" + photoUnit.id())
                .into(location_photo);
    }
}