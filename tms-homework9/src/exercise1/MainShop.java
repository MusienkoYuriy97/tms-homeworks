package exercise1;

import exercise1.data.Product;
import exercise1.data.Shop;
import exercise1.exceptions.IdAlreadyExistsException;
import exercise1.exceptions.IdNotExistException;
import exercise1.sorts.ComparatorSortByPrice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MainShop {
    public static void main(String[] args) {
        //Создаём объект магазина
        Shop shop = new Shop();

        //Создаём товары
        Product product0 = new Product(10,"tomato",3);
        Product product1 = new Product(2,"apple",1);
        Product product2 = new Product(4,"juice",5);
        Product product3 = new Product(4,"juice",5);

        //Добавляем товары в магазин
        try {
            shop.addProduct(product0);
            shop.addProduct(product1);
            shop.addProduct(product2);
            shop.addProduct(product3);
        }catch (IdAlreadyExistsException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();

        //Исходный список
        System.out.println("Исходный список:");
        System.out.println(shop.getAllProducts());
        System.out.println();

        //сортировка по цене
        List<Product> listSortByPrice = new ArrayList<>();
        listSortByPrice.addAll(shop.getAllProducts());
        System.out.println("Сортировка по цене по возрастанию: ");
        Collections.sort(listSortByPrice, new ComparatorSortByPrice());
        System.out.println(listSortByPrice);
        System.out.println();

        //Сортировка по дате добавления способ 1
        System.out.println("Сортировка по дате добавления способ 1:");
        List<Product> sortedByDate1 = new ArrayList<>();
        sortedByDate1.addAll(shop.getAllProducts());

        for (int i = 0; i < sortedByDate1.size()-i-1; i++) {
            Product p = sortedByDate1.get(i);
            sortedByDate1.set(i, sortedByDate1.get(sortedByDate1.size()-i-1));
            sortedByDate1.set(sortedByDate1.size()-i-1,p);
        }
        System.out.println(sortedByDate1);
        System.out.println();

        //сортировка по дате добавления способ 2 через last in first out
        System.out.println("Сортировка по дате добавления способ 2:");
        Stack<Product> stack = new Stack<>();
        stack.addAll(shop.getAllProducts());
        List<Product> sortedByDate2 = new ArrayList<>();
        while (!stack.isEmpty()){
            sortedByDate2.add(stack.pop());
        }
        System.out.println(sortedByDate2);
        System.out.println();

        //меняем вид нашего списка на отсортированный по дате
        shop.setProducts(sortedByDate2);

        //редактируем 1 продукт(повысили цену товара apple)
        try {
            shop.setProductValues(new Product(2,"apple",3));
        } catch (IdNotExistException e) {
            System.out.println(e.getMessage());
        }

        //Получаем список товаров в консоли после редактирования
        System.out.println("Список после редактирования цены apple до 3$:");
        System.out.println(shop.getAllProducts());
    }
}
