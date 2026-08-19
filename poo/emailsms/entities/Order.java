package poo.emailsms.entities;

public class Order {

    private String costumer;
    private String product;
    private double price;

    public Order(String costumer, String product, double price) {
        this.costumer = costumer;
        this.product = product;
        this.price = price;
    }

    public String getCostumer() {
        return costumer;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
