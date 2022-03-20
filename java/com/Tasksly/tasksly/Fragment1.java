package com.Tasksly.tasksly;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fragment1 extends Fragment {
    private RecyclerView category_recyclerview;
    private Categoty_list_adapter adapter;
    private TextView txt_hello_name;
    private TextView txt_name_of_client;



    Category_Model sport = new Category_Model("Sport");
    Category_Model education = new Category_Model("Education");
    Category_Model Health = new Category_Model("Health");
    Category_Model Gaming = new Category_Model("Gaming");
    Category_Model General = new Category_Model("General");
    Category_Model personal = new Category_Model("Personal");
    Category_Model add_category = new Category_Model("add_category");





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment1_layout,container,false);
        category_recyclerview = view.findViewById(R.id.category_recyclerview);
        txt_hello_name = view.findViewById(R.id.txt_hello_name);
        txt_name_of_client = view.findViewById(R.id.txt_name_of_client);
        adapter = new Categoty_list_adapter(this.getContext());
        category_recyclerview.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext(),LinearLayoutManager.HORIZONTAL,false);
        category_recyclerview.setLayoutManager(linearLayoutManager);
        ArrayList<Category_Model> categories = new ArrayList<>();
        categories.add(sport);
        categories.add(education);
        categories.add(Health);
        categories.add(Gaming);
        categories.add(General);
        categories.add(personal);
        categories.add(add_category);
        adapter.setCategories(categories);


        return view;

    }
}
