package produktList;

import java.util.Objects;
import java.util.Set;

public class ProductList {
    private Set <Product> products;

    public ProductList(Set<Product> products) {
        this.products = products;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void add(Product product){
        if(products.contains(product)){
            throw new IllegalArgumentException("Такой продукт уже есть!");
        }
        products.add(product);
    }
    public void remove(Product product){
        if(!products.remove(product)){
            throw new IllegalArgumentException("Такого продукта нет!");
        }
        products.remove(product);
    }

    @Override
    public String toString() {
        return products.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
