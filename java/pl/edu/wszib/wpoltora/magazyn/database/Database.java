package pl.edu.wszib.wpoltora.magazyn.database;

import org.springframework.stereotype.Component;
import pl.edu.wszib.wpoltora.magazyn.model.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class Database implements IDataBase {
    private List<Product> products = new ArrayList<>();

    public Database() {
        
    }

    @Override
    public List<Product> getAllProducts() {
        return this.products;
    }

    @Override
    public void addNewProduct(Product e) {
        products.add(e);
    }

    @Override
    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}
