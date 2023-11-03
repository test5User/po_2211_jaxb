package by.itclass.utils;

import by.itclass.model.CatAggregator;
import by.itclass.model.CatJaxb;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JaxbCatUtils {
    public static final String INPUT_FILE = "src/main/resources/input.xml";
    public static final String OUTPUT_FILE = "src/main/resources/output.xml";

    public static List<CatJaxb> unmarshal() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(CatAggregator.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        CatAggregator aggregator = (CatAggregator) unmarshaller.unmarshal(new FileReader(INPUT_FILE));
        return aggregator.getCats();
    }

    public static void marshall(List<CatJaxb> cats) throws JAXBException, IOException {
        CatAggregator aggregator = new CatAggregator();
        aggregator.setCats(cats);
        JAXBContext context = JAXBContext.newInstance(CatAggregator.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(aggregator, new FileWriter(OUTPUT_FILE));
    }

    public static void printCats(List<CatJaxb> cats) {
        cats.forEach(System.out::println);
    }
}
