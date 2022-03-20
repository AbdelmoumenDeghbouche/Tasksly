package com.Tasksly.tasksly;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class Categoty_list_adapter extends RecyclerView.Adapter {
    private ArrayList<Category_Model> categories = new ArrayList<>();
    private Context context ;
    private  int row_index;
    private int counter;

    public Categoty_list_adapter(Context context) {
        this.context = context;
    }
    public void setCategories(ArrayList<Category_Model> categories) {
        this.categories = categories;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (categories.get(position).getCategory_name().equals("add_category")){
            return 0;
        }
        return 1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view ;
        if (viewType==0){
            view = layoutInflater.inflate(R.layout.add_category_view,parent,false);
            return new ViewHolderTwo(view);
        }
        view=layoutInflater.inflate(R.layout.category_item_recycler_view,parent,false);
        return  new ViewHolderOne(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (categories.get(position).getCategory_name().equals("add_category")) {
            ViewHolderTwo viewHolderTwo = (ViewHolderTwo) holder;
            }
        else {
            ViewHolderOne viewHolderOne = (ViewHolderOne) holder;
            viewHolderOne.txt_category_name.setText(categories.get(position).getCategory_name().toString());
            viewHolderOne.parent_cardview_layout_of_category_name.setOnClickListener(new View.OnClickListener() {
                @Override
                @SuppressLint("ResourceAsColor")
                public void onClick(View view) {
                    row_index = position;
                    notifyDataSetChanged();
                }
            });
            if (row_index==position){
                if (row_index==0 && counter==0) {
                    viewHolderOne.parent_relative_layout_of_category_name.setBackgroundResource(R.drawable.cardview_style);
                    counter++;
                }
                else if (row_index==position) {
                    viewHolderOne.parent_relative_layout_of_category_name.setBackgroundResource(R.drawable.cardview_style2);
                }
            }
            else {
                viewHolderOne.parent_relative_layout_of_category_name.setBackgroundResource(R.drawable.cardview_style);

            }

        }

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
    class ViewHolderOne extends RecyclerView.ViewHolder {
        //this view holder will hold the category name layout
        //return 1
        private RelativeLayout parent_relative_layout_of_category_name;
        private MaterialCardView parent_cardview_layout_of_category_name;
        private TextView txt_category_name;
        public ViewHolderOne(@NonNull View itemView) {
            super(itemView);
            parent_cardview_layout_of_category_name = itemView.findViewById(R.id.parent_cardview_layout_of_category_name);
            parent_relative_layout_of_category_name = itemView.findViewById(R.id.parent_relative_layout_of_category_name);
            txt_category_name = itemView.findViewById(R.id.txt_category_name);


        }
    }
    static class ViewHolderTwo extends RecyclerView.ViewHolder{
        //this view holder will hold the add category layout
        //return 0
        private MaterialCardView parent_cardview_layout_of_add_category;
        private RelativeLayout parent_relative_layout_of_add_category;
        public ViewHolderTwo(@NonNull View itemView) {
            super(itemView);
            parent_cardview_layout_of_add_category= itemView.findViewById(R.id.parent_cardview_layout_of_add_category);
            parent_relative_layout_of_add_category = itemView.findViewById(R.id.parent_cardview_layout_of_add_category);
        }
    }
}
