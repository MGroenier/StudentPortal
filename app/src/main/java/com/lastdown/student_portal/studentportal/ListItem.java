package com.lastdown.student_portal.studentportal;

/**
 * Created by Martijn on 18/09/2016.
 */
public class ListItem {

    private String url;
    private String title;

    public ListItem(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

}