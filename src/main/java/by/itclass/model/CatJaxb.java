package by.itclass.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@ToString
public class CatJaxb {
    @XmlAttribute
    private int id;
    private String name;
    private int age;
}
