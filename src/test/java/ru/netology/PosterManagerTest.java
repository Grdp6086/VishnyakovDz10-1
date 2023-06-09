package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();


    DataClass movie1 = new DataClass("Матрица", "Боевик", "1999");
    DataClass movie2 = new DataClass("Матрица: Перезагрузка", "Боевик", "2003");
    DataClass movie3 = new DataClass("Матрица: Революция", "Боевик", "2003");
    DataClass movie4 = new DataClass("Трон", "Научная фантастика", "1982");
    DataClass movie5 = new DataClass("Аватар", "Боевик", "2009");
    DataClass movie6 = new DataClass("Муха", "Ужасы", "1986");
    DataClass movie7 = new DataClass("Нечто", "Ужасы", "1982");
    DataClass movie8 = new DataClass("Мумия", "Приключения", "1999");
    DataClass movie9 = new DataClass("Впусти меня", "Ужасы", "2010");
    DataClass movie10 = new DataClass("Беги без оглядки", "Триллер", "2005");
    DataClass movie11 = new DataClass("Битва титанов", "Фентези", "2010");
    DataClass movie12 = new DataClass("300 спартанцев", "Боевик", "2007");

    @BeforeEach
    public void setup() {
        manager.saveMovies(movie1);
        manager.saveMovies(movie2);
        manager.saveMovies(movie3);
        manager.saveMovies(movie4);
        manager.saveMovies(movie5);
        manager.saveMovies(movie6);
        manager.saveMovies(movie7);
        manager.saveMovies(movie8);
        manager.saveMovies(movie9);
        manager.saveMovies(movie10);
        manager.saveMovies(movie11);
        manager.saveMovies(movie12);
    }

    @Test
    public void shouldAllArray() {

        DataClass[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
                movie6,
                movie7,
                movie8,
                movie9,
                movie10,
                movie11,
                movie12
        };
        DataClass[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversMoviesNormal() {


        DataClass[] expected = {movie12, movie11, movie10, movie9, movie8};
        DataClass[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}