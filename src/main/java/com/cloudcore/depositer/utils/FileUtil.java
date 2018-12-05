/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudcore.depositer.utils;




import com.cloudcore.depositer.Depositer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author neeraj
 */
public class FileUtil {

    public static String readFile(String filePath) {

        InputStream is;

        try {
            is = new FileInputStream(filePath);
            BufferedReader buf = new BufferedReader(new InputStreamReader(is));

            String line = buf.readLine();
            StringBuilder sb = new StringBuilder();

            while (line != null) {
                sb.append(line).append("\n");
                line = buf.readLine();
            }

            return sb.toString();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Depositer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Depositer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public static String getCommandFileContnet(String folderPath) {
        File folder = new File(folderPath);
        String commandFile = "";
        if (folder.isDirectory()) {

            File[] filenames = folder.listFiles();

            if (null != filenames) {
                for (File file : filenames) {
                    if (file.isFile()) {
                        if (file.getName().equalsIgnoreCase("Depositer.retrieve.txt")) {
                            commandFile = readFile(file.getAbsolutePath());
                            break;
                        }
                    }
                }
            }
        }
        return commandFile;
    }

    public static String getFileContnet(String folderPath) {
        File folder = new File(folderPath);
        String commandFile = "";
        if (folder.isDirectory()) {

            File[] filenames = folder.listFiles();

            if (null != filenames) {
                for (File file : filenames) {
                    if (file.isFile()) {
                        commandFile = readFile(file.getAbsolutePath());
                        break;
                    }
                }
            }
        }
        return commandFile;
    }

}
