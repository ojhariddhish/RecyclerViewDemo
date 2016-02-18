package com.dnsoftindia.recyclerviewdemo;

/**
 * Created by Ganesha on 2/18/2016.
 */
public class Movie {

    private String name = new String();
    private String year = new String();
    private String genre = new String();
    private String tagLine = new String();
    private String director = new String();
    private String storyBy = new String();
    private String screenplayBy = new String();
    private String starActor = new String();
    private String starActress = new String();

    public Movie() {

    }

    public Movie(String director, String genre, String name, String screenplayBy, String starActor, String starActress, String storyBy, String tagLine, String year) {
        this.director = director;
        this.genre = genre;
        this.name = name;
        this.screenplayBy = screenplayBy;
        this.starActor = starActor;
        this.starActress = starActress;
        this.storyBy = storyBy;
        this.tagLine = tagLine;
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenplayBy() {
        return screenplayBy;
    }

    public void setScreenplayBy(String screenplayBy) {
        this.screenplayBy = screenplayBy;
    }

    public String getStarActor() {
        return starActor;
    }

    public void setStarActor(String starActor) {
        this.starActor = starActor;
    }

    public String getStarActress() {
        return starActress;
    }

    public void setStarActress(String starActress) {
        this.starActress = starActress;
    }

    public String getStoryBy() {
        return storyBy;
    }

    public void setStoryBy(String storyBy) {
        this.storyBy = storyBy;
    }

    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
