package ru.netology;

public class DataClass {
    private String name = "";
    private String genre = "";
    private String release = "";

    public DataClass (String name, String genre, String release) {
        this.name = name;
        this.genre = genre;
        this.release = release;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre() {
        this.genre = genre;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease() {
        this.release = release;
    }
}
