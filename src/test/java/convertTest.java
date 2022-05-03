import com.jxconvert.convert;
import org.junit.Test;
import org.xml.sax.SAXParseException;

import java.io.IOException;

public class convertTest {
    @Test
    public void xml2jsonTest() throws IOException {
        String xmlSource = "data/xmlSample.xml";

        String[] args = {"xml", xmlSource};

        convert.main(args);
    }

    @Test
    public void json2xmlTest() throws IOException {
        String jsonSource = "data/jsonSample.json";

        String[] args = {"json", jsonSource};

        convert.main(args);
    }
}
