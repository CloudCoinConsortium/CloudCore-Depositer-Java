/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudcore.depositer.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author neeraj
 */
public class Utils {

    public static int milliSecondsToTimeOutDetect = 20000;

    /**
     * Creates a Gson object, a JSON parser for converting JSON Strings and objects.
     *
     * @return a Gson object.
     */
    public static Gson createGson() {
        return new GsonBuilder()
                .disableHtmlEscaping()
                .setPrettyPrinting()
                .create();
    }

    public static String getHtmlFromURL(String urlAddress) {
        String data = "";

        try {

            URL url = new URL(urlAddress);
            HttpURLConnection connect = (HttpURLConnection) url.openConnection();
            connect.setConnectTimeout(milliSecondsToTimeOutDetect);
            connect.setRequestMethod("GET");
            connect.setRequestProperty("Content-Type", "application/json");
            connect.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");
            if (200 != connect.getResponseCode())
                return data;

            BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));

            StringBuilder builder = new StringBuilder();
            while ((data = in.readLine()) != null)
                builder.append(data);
            in.close();
            data = builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            data = "";
        }

        return data;
    }

}
