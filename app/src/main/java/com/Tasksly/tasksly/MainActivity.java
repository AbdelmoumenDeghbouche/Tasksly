package com.Tasksly.tasksly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView category_recyclerview;
    private Categoty_list_adapter adapter;
    private TextView txt_hello_name;
    private ImageView img_user_profile;
    private TextView txt_name_of_client;
    private MaterialCardView card_view_holding_user_image_profile;
    private ImageView img_view_add_new_task, img_view_settings,img_view_home_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        initViewsOfMainActivity();
        Utils.initCategories();
        ArrayList<Category_Model> categories =categories =Utils.getCategories_list();
        adapter = new Categoty_list_adapter(getApplicationContext());
        category_recyclerview.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        category_recyclerview.setLayoutManager(linearLayoutManager);
        adapter.setCategories(categories);
        img_user_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add intent settings

//                Intent intent = new Intent(MainActivity.this, Fragment.class);
            }
        });

    }

    private void initViewsOfMainActivity() {
        category_recyclerview = findViewById(R.id.category_recyclerview);
        img_user_profile =findViewById(R.id.img_user_profile);
        txt_hello_name = findViewById(R.id.txt_hello_name);
        card_view_holding_user_image_profile =findViewById(R.id.card_view_holding_user_image_profile);
        txt_name_of_client = findViewById(R.id.txt_name_of_client);
        img_view_add_new_task = findViewById(R.id.img_view_add_new_task);
        img_view_settings = findViewById(R.id.img_view_settings);
        img_view_home_page = findViewById(R.id.img_view_home_page);
    }
}