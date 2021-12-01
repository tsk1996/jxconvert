package com.jxconvert;

import com.jxconvert.utils.fileOps;
import com.jxconvert.utils.toJson;
import com.jxconvert.utils.toXML;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Locale;

public class mainClass {
    public static void main(String[] args) throws IOException {
        fileOps fp = new fileOps();
        Integer option = optionSelect(args);

        String filepath = fp.fileValidate(args[1]);

        switch (option) {
            case 1:
                toXML obj1 = new toXML();
                System.out.println(obj1.convertToXML(filepath));
            case 2:
                toJson obj2 = new toJson();
                System.out.println(obj2.convertToJson(filepath));
            default:
                System.err.println("Switch case error");
        }
    }

    private static Integer optionSelect(String[] args) {
        Integer option = 0;

        if (args.length != 2) {
            System.err.println("Arguments count mismatch");
            System.err.println("Example: java -jar jarfilename.jar sourcetype filepath");
            System.exit(1);
        } else {
            String arg = args[0].toString().toLowerCase();
            if (arg.contains("json")) {
                option = 1;
            } else if (arg.contains("xml")) {
                option = 2;
            } else {
                System.err.println("Arguments mismatch");
                System.err.println("Example: java -jar jarfilename.jar sourcetype filepath");
                System.exit(1);
            }
        }
        return option;
    }

    private static void oldMain() throws IOException {
        String jsonIn = "data/jsonSample.json";
        String xmlIn = "data/xmlSample.xml";
        String xmlOut = "data/xmlOP.xml";
        String jsonOut = "data/jsonOP.xml";

        toJson obj1 = new toJson();
        toXML obj2 = new toXML();

        FileWriter fp1 = new FileWriter(jsonOut);
        fp1.write(obj1.convertToJson(xmlIn));
        fp1.close();

        FileWriter fp2 = new FileWriter(xmlOut);
        fp2.write(obj2.convertToXML(jsonIn));
        fp2.close();
    }

}
