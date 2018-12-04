/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudcoin.depositer.utils;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.cloudcoin.depositer.Depositer.*;


/**
 *
 * @author neeraj
 */
public class CoinUtil {


    public static void createDummyCoin() throws IOException {
        int denomination;
        int sn;
        denomination = 1;
        sn = getDenomination(denomination);
        saveCloudCoin(makeCloudCoin(sn), denomination);
    }

    public static void saveCloudCoin(byte[] cloudCoin, int sn) throws IOException {
        String filename = ensureFilenameUnique("1.CloudCoin.1." + sn,
                ".stack", IDFolder);
        Files.write(Paths.get(IDFolder + File.separator + filename), cloudCoin);
    }

    public static byte[] makeCloudCoin(int sn) {
        return ("{\n"
                + "  \"cloudcoin\": [\n"
                + "    {\n"
                + "      \"nn\": 1,\n"
                + "      \"sn\": " + sn + ",\n"
                + "      \"an\": [\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\",\n"
                + "        \"00000000000000000000000000000000\"\n"
                + "      ],\n"
                + "      \"ed\": \"11-2020\",\n"
                + "      \"pown\": \"ppppppppppppppppppppppppp\",\n"
                + "      \"aoid\": []\n"
                + "    }\n"
                + "  ]\n"
                + "}").getBytes();
    }


}
