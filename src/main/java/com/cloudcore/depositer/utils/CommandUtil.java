/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudcore.depositer.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.cloudcore.depositer.Depositer.CommandFolder;

/**
 *
 * @author neeraj
 */
public class CommandUtil {


    public static void saveCommand(byte[] command) throws IOException {
        String filename = "Depositer.retrieve.txt";
        Files.write(Paths.get(CommandFolder + filename), command);
    }

    public static byte[] makeCommand() {
        return ("{\n"
                + "      \"command\": \"getDeposit\",\n"
                + "      \"bankURL\": \"https://raida0.cloudcoin.global/service/\",\n"
                + "      \"account\": \"default\",\n"
                + "      \"ID\": \"default\",\n"
                + "      \"moveTo\": \"Import" + "\"\n"
                + "}").getBytes();
    }
// for dummy response
    /*public static byte[] makeCommand() {
        return ("{\n"
                + "      \"command\": \"getDeposit\",\n"
                + "      \"bankURL\": \"http://cloudcoinconsortium.org/retrieve\",\n"
                + "      \"account\": \"default\",\n"
                + "      \"ID\": \"default\",\n"
                + "      \"moveTo\": \"Import" + "\"\n"
                + "}").getBytes();
    }*/

}
