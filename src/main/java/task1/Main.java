/** Створити Maven-проєкт і налаштувати його під Hibernate.
 *  Взяти приклад ex_003_hibernate_get_and_insert.
 *  Отримати об'єкт Book та колекцію об'єктів. Отримати конкретний Book за id.
 *  Додати новий Book. І все це реалізувати у класі BookHelper.
 */



package task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AuthorHelper helper = new AuthorHelper();
        Author author = new Author();
        author.setName("Mazepa");
        helper.addAuthor(author);
        System.out.println("Автор книги: " + author.getName());

        List<Author> authorList = helper.getAuthorList();
        for (Author a : authorList) {
            System.out.println(author.getId() + " " + author.getName());
        }

    }

}
