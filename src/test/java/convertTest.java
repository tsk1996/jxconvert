import com.jxconvert.convert;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.IOException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class convertTest {
    @Test
    @Order(1)
    public void xml2jsonTest() throws IOException {
        System.out.println("Test 1 : XML to Json Conversion");
        String xmlSource = "data/xmlSample.xml";

        String[] args = {"xml", xmlSource};

        convert.main(args);
    }

    @Test
    @Order(2)
    public void json2xmlTest() throws IOException {
        System.out.println("Test 2 : Json to XML Conversion");
        String jsonSource = "data/jsonSample.json";

        String[] args = {"json", jsonSource};

        convert.main(args);
    }
}
