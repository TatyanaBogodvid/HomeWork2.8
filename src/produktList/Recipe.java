package produktList;

import java.util.Objects;

public class Recipe {
    private String name;
    private  ProductList productList;
    private double totalCost;

    public Recipe(String name, ProductList productList, double totalCost) {
        if (name == null || name.isEmpty() || name.isBlank()){
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }
        this.productList = productList;
        this.totalCost = totalCost;
    }

    public String getName() {
        return name;
    }

    public ProductList getProductList() {
        return productList;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Руцепт " + name + '\n' +
                "Список продуктов: " + productList + '\n' +
                "Стоимость: " + totalCost;
    }
}
