import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MoviePosterManager;

public class MoviePosterManagerTest {
    @Test //тест менеджера, когда не добавляется ни одного фильма
    public void testNoAdding() {
        MoviePosterManager manager = new MoviePosterManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // тест на добавление фильма
    public void testAddingMovie() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test //тест на показ последнего фильма
    public void testLastMovie() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
