package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private static final int LENGTH = 5;
    private final Product[] basket;

    public ProductBasket() {
        this.basket = new Product[LENGTH];
    }

    public void add(Product product) {
        int flag = 0;
        for (int i = 0; i < LENGTH; i++) {
            if (basket[i] == null) {
                basket[i] = product;
                return;
            } else {
                flag++;
            }
        }
        if (flag == 5) {
            System.out.println("Невозможно добавить продукт!");
        }
    }

    public void delete(Product product) {
        for (int i = 0; i < LENGTH; i++) {
            if (basket[i] == null) continue;
            if (basket[i].equals(product)) {
                for (int j = i; j < LENGTH - 1; j++) {
                    basket[j] = basket[j + 1];
                }
            }
            if (i == LENGTH - 1) basket[i] = null;
        }
    }

    public int samOfBasket() {
        int sum = 0;
        for (Product product : basket) {
            if (product != null) sum += product.getPrice();
        }
        return sum;
    }

    public void print() {
        int flag = 0;
        for (Product product : basket) {
            if (product != null) System.out.println(product);
            flag++;
        }
        System.out.printf("Итого: %d\n", this.samOfBasket());

        if (flag == 0) System.out.println("В корзине пусто!");
    }

    public void clear() {
        for (int i = 0; i < LENGTH; i++) {
            basket[i] = null;
        }
    }

    public boolean checkAvailability(String name) {
        boolean check = false;
        for (Product p : basket) {
            if (p == null) continue;
            if (name.equals(p.getName())) {
                check = true;
                break;
            }
        }
        return check;
    }

    @Override
    public String toString() {
        return Arrays.toString(basket);
    }
}
