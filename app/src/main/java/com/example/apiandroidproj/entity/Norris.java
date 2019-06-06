package com.example.apiandroidproj.entity;

public class Norris {

    private String id;
    private String url;
    private String value;

    public Norris() {
    }

    @Override
    public String toString() {
        return "Norris{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
