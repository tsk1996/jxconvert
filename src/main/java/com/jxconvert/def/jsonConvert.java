package com.jxconvert.def;

import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;

public interface jsonConvert {
    public String convertToJson(String FilePath) throws JSONException, IOException;
    public String convertToJson(InputStream objStream) throws JSONException, IOException;
}
