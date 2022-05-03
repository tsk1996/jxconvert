package com.jxconvert;

import com.jxconvert.utils.fileOps;
import com.jxconvert.utils.toJson;
import com.jxconvert.utils.toXML;
import java.io.IOException;


public class convert {
    public static void main(String[] args) throws IOException{
        fileOps fp = new fileOps();
        Integer option = optionSelect(args);

        String filepath = fp.fileValidate(args[1]);
        String result = "";
        switch (option) {
            case 1:
                toXML obj1 = new toXML();
                result = obj1.convertToXML(filepath).trim();
//                fp.generateOPFile(result, "xmlOp.xml");
                System.out.println(result);
                break;
            case 2:
                toJson obj2 = new toJson();
                result = obj2.convertToJson(filepath).trim();
//                fp.generateOPFile(result, "jsonOp.json");
                System.out.println(result);
                break;
            default:
                System.err.println("Switch case error");
        }
    }


    private static Integer optionSelect(String[] args) {
        int option = 0;

        if (args.length != 2) {
            System.err.println("Arguments count mismatch");
            System.err.println("Example: java -jar jarfilename.jar sourcetype filepath");
            System.exit(1);
        } else {
            String arg = args[0].toLowerCase();
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

//    private static void oldMain() throws IOException {
//        String jsonIn = "data/jsonSample.json";
//        String xmlIn = "data/xmlSample.xml";
//        String xmlOut = "data/xmlOP.xml";
//        String jsonOut = "data/jsonOP.xml";
//
//        toJson obj1 = new toJson();
//        toXML obj2 = new toXML();
//
//        FileWriter fp1 = new FileWriter(jsonOut);
//        fp1.write(obj1.convertToJson(xmlIn));
//        fp1.close();
//
//        FileWriter fp2 = new FileWriter(xmlOut);
//        fp2.write(obj2.convertToXML(jsonIn));
//        fp2.close();
//    }

}
