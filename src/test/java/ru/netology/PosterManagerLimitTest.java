package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerLimitTest {


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


    @Test
    public void shouldReversUnderLimit() {
        PosterManager managerLimit = new PosterManager(-1);
        managerLimit.saveMovies(movie1);
        managerLimit.saveMovies(movie2);
        managerLimit.saveMovies(movie3);
        managerLimit.saveMovies(movie4);
        managerLimit.saveMovies(movie5);
        managerLimit.saveMovies(movie6);
        managerLimit.saveMovies(movie7);
        managerLimit.saveMovies(movie8);
        managerLimit.saveMovies(movie9);
        managerLimit.saveMovies(movie10);
        managerLimit.saveMovies(movie11);
        managerLimit.saveMovies(movie12);

        DataClass[] expected = {
                movie12,
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1};
        DataClass[] actual = managerLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReversWithZero() {
        PosterManager managerLimit = new PosterManager(0);
        managerLimit.saveMovies(movie1);
        managerLimit.saveMovies(movie2);
        managerLimit.saveMovies(movie3);
        managerLimit.saveMovies(movie4);
        managerLimit.saveMovies(movie5);
        managerLimit.saveMovies(movie6);
        managerLimit.saveMovies(movie7);
        managerLimit.saveMovies(movie8);
        managerLimit.saveMovies(movie9);
        managerLimit.saveMovies(movie10);
        managerLimit.saveMovies(movie11);
        managerLimit.saveMovies(movie12);

        DataClass[] expected = {
                movie12,
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1};
        DataClass[] actual = managerLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReversWithMin() {
        PosterManager managerLimit = new PosterManager(1);
        managerLimit.saveMovies(movie1);
        managerLimit.saveMovies(movie2);
        managerLimit.saveMovies(movie3);
        managerLimit.saveMovies(movie4);
        managerLimit.saveMovies(movie5);
        managerLimit.saveMovies(movie6);
        managerLimit.saveMovies(movie7);
        managerLimit.saveMovies(movie8);
        managerLimit.saveMovies(movie9);
        managerLimit.saveMovies(movie10);
        managerLimit.saveMovies(movie11);
        managerLimit.saveMovies(movie12);

        DataClass[] expected = {movie12};
        DataClass[] actual = managerLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReversMax() {
        PosterManager managerLimit = new PosterManager(12);
        managerLimit.saveMovies(movie1);
        managerLimit.saveMovies(movie2);
        managerLimit.saveMovies(movie3);
        managerLimit.saveMovies(movie4);
        managerLimit.saveMovies(movie5);
        managerLimit.saveMovies(movie6);
        managerLimit.saveMovies(movie7);
        managerLimit.saveMovies(movie8);
        managerLimit.saveMovies(movie9);
        managerLimit.saveMovies(movie10);
        managerLimit.saveMovies(movie11);
        managerLimit.saveMovies(movie12);

        DataClass[] expected = {
                movie12,
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1};
        DataClass[] actual = managerLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shoulReversOverLimit() {
        PosterManager managerLimit = new PosterManager(13);
        managerLimit.saveMovies(movie1);
        managerLimit.saveMovies(movie2);
        managerLimit.saveMovies(movie3);
        managerLimit.saveMovies(movie4);
        managerLimit.saveMovies(movie5);
        managerLimit.saveMovies(movie6);
        managerLimit.saveMovies(movie7);
        managerLimit.saveMovies(movie8);
        managerLimit.saveMovies(movie9);
        managerLimit.saveMovies(movie10);
        managerLimit.saveMovies(movie11);
        managerLimit.saveMovies(movie12);

        DataClass[] expected = {
                movie12,
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1};
        DataClass[] actual = managerLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}
