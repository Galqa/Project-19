package task2;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class AuthorHelper {
    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public AuthorHelper() {
        factory = Persistence.createEntityManagerFactory("authorhelper");
        this.entityManager = factory.createEntityManager();
    }

    public List<Author> getAuthorList() {
        TypedQuery<Author> query = entityManager.createQuery("SELECT a FROM Author a", Author.class);
        return query.getResultList();
    }

    public Author getAuthorById(long id) {
        return entityManager.find(Author.class, id);
    }

    public Author addAuthor(Author author) {
        entityManager.getTransaction().begin();
        entityManager.persist(author);
        entityManager.getTransaction().commit();
        return author;

    }
}

