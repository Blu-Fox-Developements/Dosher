package com.blufox.dosher;

import java.io.FileReader;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLConnection;
import com.google.gson.*;


public class PlacesParser {
    URL url;
    URLConnection reqeust;
    Gson placesGson = new Gson();
    String ripper;

    public PlacesParser(String sURL){
        try {
            url = new URL(sURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void getJSON() throws Exception{
        reqeust = url.openConnection();
        placesGson = (Gson) reqeust.getContent();
        ripper = placesGson.toString();
    }

    public String getRipper() {
        return ripper;
    }
}
