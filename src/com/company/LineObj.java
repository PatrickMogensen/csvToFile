package com.company;

public class LineObj {
    public LineObj(String director_name, String movie_title, String actor_1_name, String title_year) {
        Director_name = director_name;
        this.movie_title = movie_title;
        this.actor_1_name = actor_1_name;
        this.title_year = title_year;
    }

    public String getDirector_name() {
        return Director_name;
    }

    public void setDirector_name(String director_name) {
        Director_name = director_name;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getActor_1_name() {
        return actor_1_name;
    }

    public void setActor_1_name(String actor_1_name) {
        this.actor_1_name = actor_1_name;
    }

    public String getTitle_year() {
        return title_year;
    }

    public void setTitle_year(String title_year) {
        this.title_year = title_year;
    }

    private String Director_name;
    private String movie_title;
    private String actor_1_name;
    private String title_year;
}
