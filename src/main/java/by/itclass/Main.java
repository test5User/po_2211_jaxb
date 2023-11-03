package by.itclass;

import by.itclass.model.CatJaxb;
import jakarta.xml.bind.JAXBException;

import java.io.IOException;
import java.util.List;

import static by.itclass.utils.JaxbCatUtils.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<CatJaxb> cats = unmarshal();

            printCats(cats);

            marshall(cats);
        } catch (JAXBException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
