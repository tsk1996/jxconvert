import com.jxconvert.convert;
import org.junit.Test;
import org.xml.sax.SAXParseException;

import java.io.IOException;

public class convertTest {
    @Test
    public void xml2jsonTest() throws IOException {
        System.out.println("Test 1 : XML to Json Conversion");
        String xmlSource = "data/xmlSample.xml";

        String[] args = {"xml", xmlSource};

        convert.main(args);
    }

    @Test
    public void json2xmlTest() throws IOException {
        System.out.println("Test 2 : Json to XML Conversion");
        String jsonSource = "data/jsonSample.json";

        String[] args = {"json", jsonSource};

        convert.main(args);
    }
}
