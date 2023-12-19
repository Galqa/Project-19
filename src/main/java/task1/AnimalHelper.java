package task1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AnimalHelper {
    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public AnimalHelper() {
        factory = Persistence.createEntityManagerFactory("animalhelper");
        entityManager = factory.createEntityManager();
    }

    public void createAnimal(Animal animal) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(animal);
        transaction.commit();
    }

    public Animal readAnimal(int id) {
        return entityManager.find(Animal.class, id);

    }

    public void updateAnimal(Animal animal) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(animal);
        transaction.commit();
    }

    public void deleteAnimal(int id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Animal animal = readAnimal(id);
        if (animal != null) {
            entityManager.remove(animal);
        }
        transaction.commit();
    }

    public void close() {
        factory.close();
    }
}

