package com.Tasksly.tasksly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Task_list_adapter extends RecyclerView.Adapter {
    private ArrayList<Task_Model> tasks_list = new ArrayList<>();
    private Context context ;

    public Task_list_adapter(Context context) {
        this.context = context;
    }

    public void setTasks(ArrayList<Task_Model> tasks_list) {
        this.tasks_list = tasks_list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view ;
        view = layoutInflater.inflate(R.layout.task_recycler_view,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return tasks_list.size();
    }
    class Viewholder extends RecyclerView.ViewHolder {


        public Viewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
