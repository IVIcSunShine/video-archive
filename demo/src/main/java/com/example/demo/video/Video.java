package com.example.demo.video;


public class Video {
    
    private String title;
    private String agerating;
    private String description;
    private String genre;

    public Video() {

    }

    public Video(String title, String agerating, String description, String genre){
        super();
        this.title = title;
        this.agerating = agerating;
        this.description = description;
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAgerating(){
        return agerating;
    }

    public void setAgerating(String agerating){
        this.agerating = agerating;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
}
