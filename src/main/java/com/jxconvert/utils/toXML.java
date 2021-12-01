package com.jxconvert.utils;


import com.github.underscore.lodash.U;
import com.jxconvert.def.xmlConvert;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class toXML implements xmlConvert {
    @Override
    public String convertToXML(String FilePath) throws IOException, JSONException {
        InputStream is = new FileInputStream(FilePath);
        String xmlString= convertToXML(is);
        return xmlString;
    }

    @Override
    public String convertToXML(InputStream objStream) throws IOException, JSONException {
        String result = IOUtils.toString(objStream, StandardCharsets.UTF_8);
        String xmlString = U.jsonToXml(result);
        return xmlString;
    }
}
