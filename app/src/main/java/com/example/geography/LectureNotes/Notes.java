package com.example.geography.LectureNotes;

public class Notes {
    private String title;
    private int imgRes;

    public Notes(String title, int imgRes) {
        this.title = title;
        this.imgRes = imgRes;
    }

    public String getTitle() {
        return title;
    }

    public int getImgRes() {
        return imgRes;
    }
}
