package com.kototo.mvc.resttest.pojo;


public class Schedule {

    private Integer id;
    private String title;

    private Boolean completed;

    public Schedule() {
    }

    public Schedule(Integer id, String title, Boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}