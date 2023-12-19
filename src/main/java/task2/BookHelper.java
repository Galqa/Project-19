package task2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import java.awt.print.Book;
import java.util.List;

public class BookHelper {

    private EntityManager entityManager;
    public BookHelper(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public Book getBook(Long id) {
        return entityManager.find(Book.class, id);
    }
    public List<Book> getAllBooks() {
        TypedQuery<Book> query = entityManager.createQuery("SELECT b FROM Book b", Book.class);
        return query.getResultList();
    }
    public void addBook(Book book) {
        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();
    }
}

