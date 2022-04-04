package pl.pgrochala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.pgrochala.creditcard.NameProvider;
import pl.pgrochala.productcatalog.MapProductStorage;
import pl.pgrochala.productcatalog.ProductCatalog;
import pl.pgrochala.productcatalog.ProductData;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Bean
    NameProvider createNameProvider() {
        return new NameProvider();
    }

    @Bean
    ProductCatalog createMyProductCatalog() {
        return new ProductCatalog(new MapProductStorage());
    }
}
