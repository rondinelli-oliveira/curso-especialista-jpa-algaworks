package br.com.evolution.ecommerce;

import br.com.evolution.ecommerce.model.Product;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class OperationsTrasactionTest extends EntityManagerTest {

    @Test
    public void insertFirstObject() {

        Product product = new Product();
        product.setId(2);
        product.setName("Camera Canon");
        product.setDescription("The best definition for your photos.");
        product.setPrice(new BigDecimal(5000));

        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Product checkProduct = entityManager.find(Product.class, product.getId());
        Assert.assertNotNull(checkProduct);
    }

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
