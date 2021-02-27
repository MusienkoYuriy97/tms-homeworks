package exercise2.sorts;

import exercise2.data.Product;

import java.util.Comparator;

public class ComparatorByDate implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getIndexByDateAdd() - o1.getIndexByDateAdd();
    }
}
