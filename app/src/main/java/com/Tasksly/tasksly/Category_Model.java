package com.Tasksly.tasksly;

import android.widget.RelativeLayout;
import android.widget.TextView;

public class Category_Model {
    
    private String category_name;
    private RelativeLayout parent_relative_layout;
    public Category_Model(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    @Override
    public String toString() {
        return "Category_Model{" +
                "category_name=" + category_name +
                '}';
    }

}
