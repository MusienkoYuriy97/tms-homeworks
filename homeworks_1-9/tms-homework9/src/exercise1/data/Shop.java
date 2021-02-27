package exercise1.data;

import exercise1.exceptions.IdAlreadyExistsException;
import exercise1.exceptions.IdNotExistException;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public Shop() {
        products = new ArrayList<>();
    }


    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void addProduct(Product product) throws IdAlreadyExistsException{
        if (products.contains(product)){
            throw new IdAlreadyExistsException("Product с таким id уже существует");
        }
        products.add(product);
    }

    //удаление товара по индексу
    public void removeProduct(int id) throws IdNotExistException {
        for (Product p: products){
            if (p.getId() == id) {
                products.remove(p);
                return;
            }
        }
        throw new IdNotExistException("Product с таким id не существует");

    }

    //изменение имени и цены товара
    public void setProductValues(Product product) throws IdNotExistException {
        if (!products.contains(product)){
            throw new IdNotExistException("Product с таким id не существует");
        }
        int x = products.indexOf(product);
        products.set(x,product);
    }
}
