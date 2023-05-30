package JavaMavenNetology.JavaMavenNetology_9.goodsManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepoTest {

    @Test
    public void returnGoodsBook() {
        Repo repo = new Repo();
        Book book_1 = new Book(1, "Storybook_1", 100, "Noname");
        Book book_2 = new Book(2, "Storybook_2", 110, "Noname");
        Book book_3 = new Book(3, "Storybook_3", 120, "Noname");
        Book book_4 = new Book(4, "Grief from the mind", 130, "Alexander Griboyedov");

        repo.add(book_1);
        repo.add(book_2);
        repo.add(book_3);
        repo.add(book_4);

        Product[] expected = { book_1, book_2, book_3, book_4 };
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnGoodsSmartphone() {
        Repo repo = new Repo();
        Smartphone phone_1 = new Smartphone(1, "Sony", 1000, "China");
        Smartphone phone_2 = new Smartphone(2, "Samsung", 1000, "China");
        Smartphone phone_3 = new Smartphone(3, "Apple", 1000, "China");

        repo.add(phone_1);
        repo.add(phone_2);
        repo.add(phone_3);

        Product[] expected = { phone_1, phone_2, phone_3, };
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnMixGoods() {
        Repo repo = new Repo();
        Smartphone phone_1 = new Smartphone(1, "Sony", 1000, "China");
        Smartphone phone_2 = new Smartphone(2, "Samsung", 1000, "China");
        Smartphone phone_3 = new Smartphone(3, "Apple", 1000, "China");
        Book book_1 = new Book(1, "Storybook_1", 100, "Noname");
        Book book_2 = new Book(2, "Storybook_2", 110, "Noname");
        Book book_3 = new Book(3, "Storybook_3", 120, "Noname");

        repo.add(phone_1);
        repo.add(phone_2);
        repo.add(phone_3);
        repo.add(book_1);
        repo.add(book_2);
        repo.add(book_3);

        Product[] expected = { phone_1, phone_2, phone_3, book_1, book_2, book_3 };
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeByIDbot() {
        Repo repo = new Repo();
        Smartphone phone_1 = new Smartphone(1, "Sony", 1000, "China");
        Smartphone phone_2 = new Smartphone(2, "Samsung", 1000, "China");
        Smartphone phone_3 = new Smartphone(3, "Apple", 1000, "China");
        Book book_1 = new Book(4, "Storybook_1", 100, "Noname");


        repo.add(phone_1);
        repo.add(phone_2);
        repo.add(phone_3);
        repo.add(book_1);
        repo.removeByID(4);


        Product[] expected = { phone_1, phone_2, phone_3 };
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeByIDtop() {
        Repo repo = new Repo();
        Smartphone phone_1 = new Smartphone(1, "Sony", 1000, "China");
        Smartphone phone_2 = new Smartphone(2, "Samsung", 1000, "China");
        Smartphone phone_3 = new Smartphone(3, "Apple", 1000, "China");
        Book book_1 = new Book(4, "Storybook_1", 100, "Noname");


        repo.add(phone_1);
        repo.add(phone_2);
        repo.add(phone_3);
        repo.add(book_1);
        repo.removeByID(1);


        Product[] expected = { phone_2, phone_3, book_1 };
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}

