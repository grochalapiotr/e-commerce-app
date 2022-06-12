package pl.pgrochala.productcatalog;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ListProductStorageTest {

    @Test
    void itAllowsToStoreAndLoadProduct() {
        ProductData product = thereIsExampleProduct();
        ProductStorage listProductStorage = thereIsListProductStorage();

        listProductStorage.save(product);
        ProductData loaded = listProductStorage.load(product.getId());

        assertEquals(product.getId(), loaded.getId());
        assertEquals(product.getName(), loaded.getName());
    }
    @Test
    void itContainsProducts() {
        ProductData product1 = new ProductData("lego", "Nice One");
        ProductData product2 = new ProductData("hotwheels", "Nice Two");
        ProductStorage listProductStorage = thereIsListProductStorage();
        ArrayList<ProductData> lista = new ArrayList<ProductData>();


        listProductStorage.save(product1);
        lista.add(product1);
        listProductStorage.save(product2);
        lista.add(product2);

        assertEquals(listProductStorage.allPublished(), lista);
    }

    private ProductStorage thereIsListProductStorage() {
        return new ListProductStorage();
    }

    private ProductData thereIsExampleProduct() {
        return new ProductData("lego", "Nice One");
    }
}
