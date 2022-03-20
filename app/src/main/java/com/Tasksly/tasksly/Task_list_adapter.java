package com.Tasksly.tasksly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class Task_list_adapter extends RecyclerView.Adapter<Task_list_adapter.Viewholder> {
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
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view ;
        view = layoutInflater.inflate(R.layout.task_recycler_view,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.txt_task_name.setText(tasks_list.get(position).getTask_title().toString());
        holder.txt_time_of_task.setText(tasks_list.get(position).getTime());
        holder.txt_description_of_task.setText(tasks_list.get(position).getDescription().toString());
        holder.img_view_check_box_oval_not_checked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.img_view_check_box_oval_not_checked.getVisibility()==View.VISIBLE){
                    holder.img_view_check_box_oval_not_checked.setVisibility(View.GONE);
                    holder.img_view_check_box_oval_checked.setVisibility(View.VISIBLE);
                }

            }
        });
        holder.img_view_check_box_oval_checked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if ( holder.img_view_check_box_oval_checked.getVisibility()==View.VISIBLE) {
                  holder.img_view_check_box_oval_checked.setVisibility(View.GONE);
                  holder.img_view_check_box_oval_not_checked.setVisibility(View.VISIBLE);
              }

            }
        });
    }


    @Override
    public int getItemCount() {
        return tasks_list.size();
    }
    class Viewholder extends RecyclerView.ViewHolder {
        private MaterialCardView card_view_layout_of_task_item;
        private TextView txt_time_of_task,txt_description_of_task,txt_task_name;
        private ImageView img_view_clock,img_view_check_box_oval_checked,img_view_check_box_oval_not_checked;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            card_view_layout_of_task_item = itemView.findViewById(R.id.card_view_layout_of_task_item);
            txt_time_of_task = itemView.findViewById(R.id.txt_time_of_task);
            img_view_clock =itemView.findViewById(R.id.img_view_clock);
            img_view_check_box_oval_checked = itemView.findViewById(R.id.img_view_check_box_oval_checked);
            img_view_check_box_oval_not_checked = itemView.findViewById(R.id.img_view_check_box_oval_not_checked);
            txt_description_of_task = itemView.findViewById(R.id.txt_description_of_task);
            txt_task_name= itemView.findViewById(R.id.txt_task_name);

        }
    }
}
