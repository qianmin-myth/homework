package com.example.demo.model;

public class User {
    private long Id;
    private String Img;
    private String Title;
    private String Name;
    private String Des;
    private String Classify;
    private Integer IsDownload;
    private String Empower;

    public long getId() {
        return Id;
    }

    public String getImg() {
        return Img;
    }

    public String getTitle() {
        return Title;
    }

    public String getName() {
        return Name;
    }

    public String getClassify() {
        return Classify;
    }

    public String getDes() {
        return Des;
    }

    public String getEmpower() {
        return Empower;
    }

    public int getISDownLoad() {
        return IsDownload;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setImg(String img) {
        Img = img;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDes(String des) {
        Des = des;
    }

    public void setClassify(String classify) {
        Classify = classify;
    }

    public void setISDownload(Integer IsDownload) {
        this.IsDownload = IsDownload;
    }

    public void setEmpower(String empower) {
        Empower = empower;
    }
}