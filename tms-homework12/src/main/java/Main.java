import com.fasterxml.jackson.databind.ObjectMapper;
import data.Categories;
import data.Category;
import data.Product;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Categories.class, Category.class, Product.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Categories categories = (Categories) unmarshaller.unmarshal(new File("categories.xml"));

            //1-я часть задания
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("categories.json"), getPriceOverThreeHundred(categories));

            //2-я часть задания
            Files.write(Paths.get("categories-info.txt"),information(categories));
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Categories getPriceOverThreeHundred(Categories categories){
        Categories result = new Categories();
        List<Category> categoryList = new ArrayList<>();
        categoryList.addAll(categories.getCategoryList());
        result.setCategoryList(categoryList);

        for (int i = 0; i < categories.getCategoryList().size(); i++) {
            List<Product> products = new ArrayList<>();
            for (Product p : result.getCategoryList().get(i).getProductList()){
                if (p.getPrice() > 300){
                    products.add(p);
                }
            }
            result.getCategoryList().get(i).setProductList(products);
        }

        return result;
    }

    public static List<String> information(Categories categories){
        List<String> stringList = new ArrayList<>();
        for (Category c: getPriceOverThreeHundred(categories).getCategoryList()){
            stringList.add(c.getName() + ": " + c.getProductList().size());
        }

        return stringList;
    }
}