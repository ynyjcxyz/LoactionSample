package com.example.android.loactionsample.recyclerview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.android.loactionsample.R;
import com.example.android.loactionsample.datamodel_photo.PhotoUnit;
import java.util.List;

public class PhotoListRecyclerViewAdapter extends RecyclerView.Adapter<PhotoListViewHolder>{
    private List<PhotoUnit> photoList;

    public PhotoListRecyclerViewAdapter(List<PhotoUnit> itemList) {
        this.photoList = itemList;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setPhotoList(List<PhotoUnit> listAdd){
        this.photoList = listAdd;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PhotoListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhotoListViewHolder
                (LayoutInflater
                        .from(parent.getContext())
                        .inflate(R.layout.photo_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoListViewHolder holder, int position) {
        holder.bindPhotoListData(photoList.get(position));
    }

    @Override
    public int getItemCount() {
        if(photoList == null){
            return 0;
        }else{
            return photoList.size();
        }
    }
}
