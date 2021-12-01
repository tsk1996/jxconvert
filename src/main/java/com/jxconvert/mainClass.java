package com.jxconvert;

import com.jxconvert.utils.toJson;
import com.jxconvert.utils.toXML;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class mainClass {
    public static void main(String[] args) throws IOException {
        String jsonIn = "data/jsonSample.json";
        String xmlIn = "data/xmlSample.xml";

        toJson obj1=new toJson();
        toXML obj2=new toXML();

        File file = new File(jsonIn);
        String parent = file.getParent();

        System.out.println(parent.toString());

//        FileWriter fp1 = new FileWriter(Paths.get(jsonIn).toAbsolutePath().toString()+ "/jsonOP.json");
//        fp1.write(obj1.convertToJson(xmlIn));
//        fp1.close();
//
//        FileWriter fp2 = new FileWriter(xmlOut);
//        fp2.write(obj2.convertToXML(jsonIn));
//        fp2.close();
    }

}
