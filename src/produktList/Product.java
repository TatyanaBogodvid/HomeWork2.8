package produktList;

import java.util.Objects;

public class Product {
    private final String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
        if (name == null || name.isEmpty() || name.isBlank()){
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }
        if (price <= 0){
            throw  new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }
        if (weight <= 0){
            throw  new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.weight = weight;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw  new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }
    }

    public void setWeight(double weight) {
        if (weight <= 0){
            throw  new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return  '\n' + "{" + name + '\n' +
                " по цене " + price + '\n' +
                " весом " + weight + " кг.}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
