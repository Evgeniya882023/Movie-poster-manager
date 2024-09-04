package ru.netology;

public class MoviePosterManager {
    private String[] movies = new String[0];
    private int limit;

    public MoviePosterManager() {
        this.limit = 5;
    }

    public MoviePosterManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {

        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];//создаем массив результата поиска последних фильмов
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}


