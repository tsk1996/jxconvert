package com.jxconvert;

import com.jxconvert.utils.toJson;
import com.jxconvert.utils.toXML;

import java.io.FileWriter;
import java.io.IOException;

public class mainClass {
    public static void main(String[] args) throws IOException {
        String jsonIn = "data/input/jsonSample.json";
        String xmlIn = "data/input/xmlSample.xml";
        String xmlOut = "data/output/Xml_OP.xml";
        String jsonOut = "data/output/json_OP.json";

        toJson obj1=new toJson();
        toXML obj2=new toXML();

        FileWriter fp1 = new FileWriter(jsonOut);
        fp1.write(obj1.convertToJson(xmlIn));
        fp1.close();

        FileWriter fp2 = new FileWriter(xmlOut);
        fp2.write(obj2.convertToXML(jsonIn));
        fp2.close();
    }

}
