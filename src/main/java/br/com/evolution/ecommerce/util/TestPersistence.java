package br.com.evolution.ecommerce.util;

import br.com.evolution.ecommerce.model.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestPersistence {

    public static void main(String[] args) {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ecommerce-PU");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    Product product = entityManager.find(Product.class, 1);
        System.out.println(product.getName());

        entityManager.close();
        entityManagerFactory.close();
    }

}
