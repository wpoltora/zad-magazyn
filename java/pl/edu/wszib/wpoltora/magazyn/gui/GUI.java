package pl.edu.wszib.wpoltora.magazyn.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.wpoltora.magazyn.database.IDataBase;
import pl.edu.wszib.wpoltora.magazyn.model.Product;

import java.util.List;
import java.util.Scanner;

@Component
public class GUI implements IGUI {
    Scanner scanner = new Scanner(System.in);

    @Autowired
    public IDataBase dataBase;

    @Override
    public void showMainMenu() {
        System.out.println("1.Wyswietl produkty");
        System.out.println("2.Dodaj produkt");
        System.out.println("3.Usuń produkt");
        System.out.println("0.Zakoncz");
        

        switch (scanner.nextLine()){
            case "1":
                this.showAllProducts();
                this.showMainMenu();
                break;
            case "2":
                this.addNewProduct();
                this.showMainMenu();
                break;
            case "3":
                this.deleteProduct();
                this.showMainMenu();
                break;
            case "0":
                break;
            default:
                System.out.println("Zły numer");
                this.showMainMenu();
                break;
        }
    }

    private void showAllProducts(){
        List<Product> productList = this.dataBase.getAllProducts();
        for (Product product : productList) {
            System.out.println("nazwa:" + product.getName() + " ID:" + product.getId());
        }
    }

    private void addNewProduct(){
        System.out.println("Podaj nazwe produktu");
        String name = scanner.nextLine();
        System.out.println("Podaj ID");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = new Product(name, id);
        this.dataBase.addNewProduct(product);
    }

    private void deleteProduct(){
        System.out.println("podaj id do usuniecia");
        int id = Integer.parseInt(scanner.nextLine());
        this.dataBase.deleteProduct(id);

    }

}
