package com.example.sushi.first;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * Created by sushi on 27.05.17.
 */

public class HttpRest {
    // private static final String urlString = "http://bitnaesser.xyz/fangen/api.php";
    private static final String urlString = "http://google.de";

    public static int updateLocation(int playerId, double longitude, double latitude) throws IOException {
        HttpURLConnection httpConn;
        try {
            URL url = new URL(urlString + "?playerid=" + playerId + "&longitude=" + longitude + "&latitude=" + latitude);
            httpConn = (HttpURLConnection) url.openConnection();
            return httpConn.getResponseCode();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}