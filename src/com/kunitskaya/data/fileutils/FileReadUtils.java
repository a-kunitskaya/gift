package com.kunitskaya.data.fileutils;

import com.kunitskaya.domain.Sweet;

import java.io.*;

public class FileReadUtils {

    /**
     * Update the price in a Sweet instance from a file
     *
     * @param sweet - instance of Sweet
     * @param path  - path to get the data from
     * @throws IOException
     */
    public static void updateSweetPriceFromFile(Sweet sweet, String path) throws IOException {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(path));
            String inputString = in.readLine();

            sweet.setPrice(Double.parseDouble(inputString));
        } finally {
            if (in != null) in.close();
        }
    }
}