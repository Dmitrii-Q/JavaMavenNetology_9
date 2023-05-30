package JavaMavenNetology.JavaMavenNetology_9.goodsManager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {

    @Test
    public void searchBySameValues() {
        Repo repo = new Repo();
        Manager manager = new Manager(repo);
        Book book_1 = new Book(1, "Storybook_1", 100, "Noname");
        Book book_2 = new Book(2, "Storybook_2", 110, "Noname");
        Book book_3 = new Book(3, "Storybook_3", 120, "Noname");
        Book book_4 = new Book(4, "Grief from the mind", 130, "Alexander Griboyedov");

        manager.add(book_1);
        manager.add(book_2);
        manager.add(book_3);
        manager.add(book_4);

        Product[] expected = {book_1, book_2, book_3};
        Product[] actual = manager.searchBy("Story");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByOneValue() {
        Repo repo = new Repo();
        Manager manager = new Manager(repo);
        Book book_1 = new Book(1, "Storybook_1", 100, "Noname");
        Book book_2 = new Book(2, "Storybook_2", 110, "Noname");
        Book book_3 = new Book(3, "Storybook_3", 120, "Noname");
        Book book_4 = new Book(4, "Grief from the mind", 130, "Alexander Griboyedov");

        manager.add(book_1);
        manager.add(book_2);
        manager.add(book_3);
        manager.add(book_4);

        Product[] expected = {book_4};
        Product[] actual = manager.searchBy("Gr");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByNonExistentValue() {
        Repo repo = new Repo();
        Manager manager = new Manager(repo);
        Book book_1 = new Book(1, "Storybook_1", 100, "Noname");
        Book book_2 = new Book(2, "Storybook_2", 110, "Noname");
        Book book_3 = new Book(3, "Storybook_3", 120, "Noname");
        Book book_4 = new Book(4, "Grief from the mind", 130, "Alexander Griboyedov");

        manager.add(book_1);
        manager.add(book_2);
        manager.add(book_3);
        manager.add(book_4);

        Product[] expected = {};
        Product[] actual = manager.searchBy("story");

        Assertions.assertArrayEquals(expected, actual);
    }
}

