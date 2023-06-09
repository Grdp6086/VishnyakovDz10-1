package ru.netology;

import java.util.Arrays;


public class PosterManager {

    private int limit; // лимит вывода на экран
    private DataClass[] poster = new DataClass[0];

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
        this.limit = 5;
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

    public DataClass[] findLast() { // массив в обратном порядке
        int resultLenght = limit;
        if (limit > poster.length) {
            resultLenght = poster.length;
        }
        if (limit <= 0) {
            resultLenght = poster.length;
        }
        DataClass[] all = findAll();
        DataClass[] reverse = new DataClass[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            reverse[i] = all[all.length - 1 - i];
        }
        return reverse;
    }


}
