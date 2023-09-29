package br.com.evolution.ecommerce;

import br.com.evolution.ecommerce.model.Product;

public class OpenAndCloseTrasactionTest extends EntityManagerTest{

    public void openAndCloseTransaction() {

        //just to stop the errors
        Product product = new Product();

        entityManager.getTransaction().begin();

        entityManager.persist(product);
        entityManager.merge(product);
        entityManager.remove(product);

        entityManager.getTransaction().commit();

    }
}
