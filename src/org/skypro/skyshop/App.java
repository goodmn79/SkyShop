package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {

    public static void main(String[] args) {
        Product product1 = new Product("Можжевельник казацкий Тамарисцифолия (Tamariscifolia)", 1100);
        Product product2 = new Product("Ель колючая Глаука Глобоза (Glauca Globosa)", 5700);
        Product product3 = new Product("Ель канадская Глаука Коника (Glauca Conica)", 16900);
        Product product4 = new Product("Можжевельник скальный Блю Арроу (Blue Arrow)", 4300);
        Product product5 = new Product("Туя западная Смарагд (Smaragd)", 2900);
        Product product6 = new Product("Гортензия метельчатая Ванилла Фрайз (Vanille Fraise)", 1800);

        ProductBasket basket = new ProductBasket();

        System.out.println("Добавление товара в корзину");
        basket.add(product1);
        basket.add(product2);
        basket.add(product3);
        basket.add(product4);
        basket.add(product5);

        System.out.println("и печать содержимого корзины с несколькими товарами:");
        basket.print();
        System.out.println();

        System.out.println("Получение стоимости корзины с несколькими товарами:");
        System.out.println(basket.samOfBasket());
        System.out.println();


        System.out.println("Добавление товара в заполненную корзину, в которой нет свободного места:");
        basket.add(product6);
        System.out.println();

        System.out.println("Удаление товара \"Ель канадская Глаука Коника (Glauca Conica)\" из корзины");
        basket.delete(product3);

        System.out.println("и печать содержимого корзины с удалённым товаром:");
        basket.print();
        System.out.println();

        System.out.println("Получение стоимости корзины с несколькими товарами:");
        System.out.println(basket.samOfBasket());
        System.out.println();

        System.out.println("Добавление товара \"Гортензия метельчатая Ванилла Фрайз (Vanille Fraise)\" в корзину");
        basket.add(product6);

        System.out.println("и печать содержимого корзины с добавленным товаром:");
        basket.print();
        System.out.println();

        System.out.println("Поиск товара \"Можжевельник казацкий Тамарисцифолия (Tamariscifolia)\", который есть в корзине:");
        System.out.println(basket.checkAvailability("Можжевельник казацкий Тамарисцифолия (Tamariscifolia)"));
        System.out.println();

        System.out.println("Поиск товара \"Туя западная Даника (Danica)\", которого нет в корзине:");
        System.out.println(basket.checkAvailability("Туя западная Даника (Danica)"));
        System.out.println();

        System.out.println("Очистка корзины");
        basket.clear();

        System.out.println("и печать содержимого пустой корзины:");
        basket.print();
        System.out.println();

        System.out.println("Получение стоимости пустой корзины:");
        System.out.println(basket.samOfBasket());
        System.out.println();

        System.out.println("Поиск товара по имени \"Можжевельник казацкий Тамарисцифолия (Tamariscifolia)\" в пустой корзине:");
        System.out.println(basket.checkAvailability("Можжевельник казацкий Тамарисцифолия (Tamariscifolia)"));
    }
}