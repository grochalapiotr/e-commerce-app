package pl.pgrochala.productcatalog;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class SQLProductStorage implements ProductStorage {
    private JdbcTemplate jdbcTemplate;

    public SQLProductStorage(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        jdbcTemplate.execute("DROP TABLE products IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE products(" +
                "id VARCHAR(255), name VARCHAR(255), PRIMARY KEY(id))");
    }

    @Override
    public void save(ProductData newProduct) {
        jdbcTemplate.update(
                "INSERT INTO Products (id, name) VALUES (?, ?)",
                newProduct.getId(), newProduct.getName()
        );

    }

    @Override
    public ProductData load(String productId) {
        return null;
    }

    @Override
    public List<ProductData> allPublished() {
        return null;
    }
}
