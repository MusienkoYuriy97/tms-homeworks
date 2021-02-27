package exercise2.data;

import exercise2.exceptions.IdAlreadyExistsException;
import exercise2.exceptions.IdNotExistException;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>(0);

    public Shop() { ;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void addProduct(Product product) throws IdAlreadyExistsException{
        if (products.contains(product)){
            throw new IdAlreadyExistsException("Причина - Product с таким id уже существует");
        }
        products.add(product);
    }

    public void removeProduct(int id) throws IdNotExistException{
        for (Product p: products){
            if (p.getId() == id) {
                products.remove(p);
                return;
            }
        }
        throw new IdNotExistException("Причина - Product с таким id не существует");
    }


    public void setProductValues(Product product) throws IdNotExistException {
        if (!products.contains(product)){
            throw new IdNotExistException("Причина - Product с таким id не существует");
        }
        int x = products.indexOf(product);
        products.remove(x);
        products.add(x,product);
    }
}
