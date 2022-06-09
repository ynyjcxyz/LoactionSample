package com.example.android.loactionsample;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.android.loactionsample.datamodel_photo.PhotoUnit;
import com.example.android.loactionsample.recyclerview.PhotoListRecyclerViewAdapter;
import java.util.ArrayList;
import java.util.List;

public class DetailPage extends AppCompatActivity {
    private TextView detail_name;
    private TextView location_address;
    private TextView phone;
    private TextView url;
    RecyclerView photo_list;
    PhotoListRecyclerViewAdapter photoListAdapter;
    List<PhotoUnit> photoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_page);

        initView();
        setView();
    }

    private void setView() {
        detail_name.setText(getIntent().getStringExtra("detailName"));
        location_address.setText(getIntent().getStringExtra("location_address"));
        phone.setText(getIntent().getStringExtra("phone"));
        url.setText(getIntent().getStringExtra("url"));

        @SuppressWarnings("unchecked")
        ArrayList<PhotoUnit> listObj = (ArrayList<PhotoUnit>) getIntent().getSerializableExtra("photoList");
        photoList.addAll(listObj);
        photoListAdapter.setPhotoList(photoList);
    }

    private void initView() {
        detail_name = findViewById(R.id.detail_name);
        location_address = findViewById(R.id.location_address);
        phone = findViewById(R.id.phone);
        url = findViewById(R.id.url);

        photo_list = findViewById(R.id.photo_list);
        photo_list.setHasFixedSize(true);
        photo_list.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));
        photo_list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        photoListAdapter = new PhotoListRecyclerViewAdapter(photoList);
        photo_list.setAdapter(photoListAdapter);
    }
}
