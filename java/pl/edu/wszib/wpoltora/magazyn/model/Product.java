package pl.edu.wszib.wpoltora.magazyn.model;


public class Product {
    private String name;
    private int id;

    public Product(){

    }

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
