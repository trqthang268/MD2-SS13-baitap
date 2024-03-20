package baitapmain.baitap03.business.entity;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double price;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, double price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void inputData(){
        System.out.println();
    }
    public void displayData(){

    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                "| nameProduct='" + nameProduct + '\'' +
                "| price=" + price +
                '}';
    }
}
