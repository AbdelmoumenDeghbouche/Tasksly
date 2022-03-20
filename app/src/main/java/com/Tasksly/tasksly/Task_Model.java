package com.Tasksly.tasksly;

public class Task_Model {
    private String task_title;
    private String time;
    private String date;
    private Category_Model category;
    private boolean is_finished;
    private String description;

    public Task_Model(String task_title, String time, String date, Category_Model category, String description) {
        this.task_title = task_title;
        this.time = time;
        this.date = date;
        this.category = category;
        this.is_finished = false;
        this.description = description;
    }

    public String getTask_title() {
        return task_title;
    }

    public void setTask_title(String task_title) {
        this.task_title = task_title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Category_Model getCategory() {
        return category;
    }

    public void setCategory(Category_Model category) {
        this.category = category;
    }

    public boolean isIs_finished() {
        return is_finished;
    }

    public void setIs_finished(boolean is_finished) {
        this.is_finished = is_finished;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task_Model{" +
                "task_title='" + task_title + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", category=" + category +
                ", is_finished=" + is_finished +
                ", description='" + description + '\'' +
                '}';
    }
}
