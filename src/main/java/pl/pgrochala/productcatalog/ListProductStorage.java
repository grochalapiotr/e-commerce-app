package pl.pgrochala.productcatalog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProductStorage implements ProductStorage {
    public Map<String, ProductData> productList = new HashMap<String, ProductData>();
    @Override
    public void save(ProductData newProduct) {
        productList.put(newProduct.getId(), newProduct);
    }

    @Override
    public ProductData load(String productId) {
        return productList.get(productId);
    }

    @Override
    public List<ProductData> allPublished() {
        return new ArrayList<ProductData>(productList.values());
    }
}
