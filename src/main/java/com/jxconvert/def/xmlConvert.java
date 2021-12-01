package com.jxconvert.def;

import org.json.JSONException;
import java.io.IOException;
import java.io.InputStream;

public interface xmlConvert {
    public String convertToXML(String FilePath) throws IOException, JSONException;
    public String convertToXML(InputStream objStream) throws IOException, JSONException;
}
