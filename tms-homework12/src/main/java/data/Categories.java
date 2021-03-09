package data;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "categories")
public class Categories {
    private List<Category> categoryList;

    public Categories(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public Categories() {
    }

    @JsonProperty("Список категорий")
    @XmlElement(name = "category")
    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }


}
