package com.example.android.loactionsample.recyclerview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.android.loactionsample.R;
import com.example.android.loactionsample.datamodel_main.MainResultUnit;
import java.util.List;

public class MainResultListRecyclerViewAdapter extends RecyclerView.Adapter<MainResultListViewHolder>{
    private List<MainResultUnit> resultList;

    public MainResultListRecyclerViewAdapter(List<MainResultUnit> itemList) {
        this.resultList = itemList;
    }

    @SuppressLint("NotifyDataSetChanged")
     public void setResultList(List<MainResultUnit> listAdd){
        this.resultList = listAdd;
         notifyDataSetChanged();
     }

    @NonNull
    @Override
    public MainResultListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainResultListViewHolder
                (LayoutInflater
                        .from(parent.getContext())
                        .inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainResultListViewHolder holder, int position) {
        holder.bindMainResultData(resultList.get(position));
    }

    @Override
    public int getItemCount() {
        if(resultList == null){
            return 0;
        }else{
            return resultList.size();
        }
    }
}
