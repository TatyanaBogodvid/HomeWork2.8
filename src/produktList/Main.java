package produktList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Product banan = new Product("Банан", 23.5, 0.5);
        Product flour = new Product("Мука", 74.9, 2.5);
        Product potato = new Product("Картофель", 28.5, 4.5);
        Product carrots = new Product("Морковь", 13.5, 1.3);
        Product meat = new Product("Мясо", 250.9, 312);
        Product onion = new Product("Лук", 18.6, 0.7);

        Set<Product> products = new HashSet<>();
        products.add(banan);
        products.add(flour);
        products.add(potato);
        products.add(carrots);
        products.add(meat);
        products.add(onion);

        ProductList list = new ProductList(products);
        System.out.println(list);
        System.out.println("");
        list.add(new Product("шоколад", 65.8, 1.2));
        System.out.println(list);
        System.out.println("");
        list.remove(potato);
        System.out.println(list);
        System.out.println("");
        /*list.add(banan);
        System.out.println(list);
        list.remove(potato);
        System.out.println("");
        System.out.println(list);*/

        Set<Product> productsForRecipe = new HashSet<>();
        productsForRecipe.add(potato);
        productsForRecipe.add(carrots);
        productsForRecipe.add(meat);
        productsForRecipe.add(onion);
        ProductList listForRecipe = new ProductList(productsForRecipe);

        Recipe recipe = new Recipe("Жаркое", listForRecipe, 248);
        System.out.println(recipe);


    }
}