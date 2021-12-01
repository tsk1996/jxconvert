package com.jxconvert.utils;

import com.github.underscore.lodash.U;
import com.jxconvert.def.jsonConvert;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class toJson implements jsonConvert {

    @Override
    public String convertToJson(String FilePath) throws JSONException, IOException {
        InputStream is = new FileInputStream(FilePath);
        String jsonString = convertToJson(is);
        return jsonString;
    }

    @Override
    public String convertToJson(InputStream objStream) throws JSONException, IOException {
        String result = IOUtils.toString(objStream, StandardCharsets.UTF_8);
        String jsonString = U.xmlToJson(result);
        return jsonString;
    }
}
