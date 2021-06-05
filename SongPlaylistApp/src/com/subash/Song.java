package com.subash;

public class Song {
    public String title;
    public double duration;

    //Constructor with parameter
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    //Constructor without parameter
    public Song(){

    }

    //getters
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
