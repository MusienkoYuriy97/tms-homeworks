package entity;

import javax.xml.bind.annotation.XmlElement;
import java.util.HashSet;
import java.util.Set;

public class Cities {
    private final Set<String> setCities = new HashSet<>();

    public Cities() {
    }

    @XmlElement(name = "�����")
    public Set<String> getCities() {
        return setCities;
    }

    @Override
    public String toString() {
        return "������ ������� - " + setCities;
    }

    public boolean isEmpty(){
        return setCities.isEmpty();
    }
}
