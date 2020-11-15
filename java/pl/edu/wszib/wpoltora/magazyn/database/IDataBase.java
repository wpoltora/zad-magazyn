package pl.edu.wszib.wpoltora.magazyn.database;

import pl.edu.wszib.wpoltora.magazyn.model.Product;

import java.util.List;

public interface IDataBase {
    List<Product> getAllProducts();
    void addNewProduct(Product e);
    void deleteProduct(int ID);
}
