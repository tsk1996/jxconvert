package com.jxconvert.utils;


import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class fileOps {
    public void generateOPFile(String content,String name) throws IOException {
        String def_filepath="src/main/resources/generatedFiles/";

//        File file=new File(def_filepath+name);
        FileWriter myWriter = new FileWriter(def_filepath+name);
        myWriter.write(content);
        myWriter.close();
    }

    public String readFile(InputStream in) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line + System.lineSeparator());
        }

        return sb.toString();
    }

    public String addDateStamp(String filename){
        String datetime;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM_dd HH_mm_ss");
        LocalDateTime now = LocalDateTime.now();
        datetime=dtf.format(now);

        return datetime;
    }
}
