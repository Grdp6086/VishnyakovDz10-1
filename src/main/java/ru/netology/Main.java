package ru.netology;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PosterManager manager = new PosterManager();
        DataClass movie1 = new DataClass("Матрица", "Боевик", "1999");
        DataClass movie2 = new DataClass("Матрица: Перезагрузка", "Боевик", "2003");
        DataClass movie3 = new DataClass("Матрица: Революция", "Боевик", "2003");

        manager.saveMovies(movie1);
        manager.saveMovies(movie2);
        manager.saveMovies(movie3);

        String str = Arrays.toString(manager.findAll());

        System.out.print(str);


    }
}