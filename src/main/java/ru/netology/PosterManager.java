package ru.netology;

import java.util.Arrays;


public class PosterManager {

    private int limit; // лимит вывода на экран
    private DataClass[] poster = new DataClass[0];

    public PosterManager(int limit) {
        this.limit = limit;
    }
    public PosterManager() {
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit() {
        this.limit = limit;
    }

    public void saveMovies(DataClass movies) { // создание массива с фильмами
        DataClass[] tmp = new DataClass[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = movies;
        poster = tmp;

    }

    public DataClass[] findAll() { // вывод массива
        return poster;

    }

    private DataClass[] reversArray() { // массив в обратном порядке
        int resultLenght = limit;
        if (limit > poster.length) {
            resultLenght = 5;
        }
        if (limit <= 0) {
            resultLenght = 5;
        }
        DataClass[] all = findAll();
        DataClass[] reverse = new DataClass[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            reverse[i] = all[all.length - 1 - i];
        }
        return reverse;
    }

    public DataClass[] resultRevers() {
        return reversArray();
    }

}
