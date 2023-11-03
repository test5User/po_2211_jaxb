package by.itclass.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.util.List;

@XmlRootElement(name = "cats")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class CatAggregator {
    @XmlElement(name = "cat")
    private List<CatJaxb> cats;
}
