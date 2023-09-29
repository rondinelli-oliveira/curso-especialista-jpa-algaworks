package br.com.evolution.ecommerce;

import br.com.evolution.ecommerce.model.Product;
import org.junit.Assert;
import org.junit.Test;

public class SearchingRecordsTest extends EntityManagerTest{

    @Test
    public void findById() {
        Product product = entityManager.find(Product.class, 1);
//        Product product = entityManager.getReference(Product.class,1);

        Assert.assertNotNull(product);
        Assert.assertEquals("Kindle", product.getName());
    }

    @Test
    public void updateReference() {
        Product product = entityManager.find(Product.class, 1);
        product.setName("Microphone Samson");

        entityManager.refresh(product);

        Assert.assertEquals("Kindle", product.getName());
    }
}
