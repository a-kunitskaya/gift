package com.kunitskaya.data.fileutils;

import com.kunitskaya.domain.Sweet;

import java.io.*;


public class FileWriteUtils {

    /**
     * Write a Sweet instance price value to a file
     * put it in the path directory
     *
     * @param sweet - a Sweet instance
     * @param path  -  path to put the created file in
     * @throws IOException
     */
    public static void writeSweetPriceToFile(Sweet sweet, String path) throws IOException {

        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter(path));
            out.write("The price of " + sweet + " is " + sweet.getPrice());

        } finally {
            if (out != null) out.close();
        }

    }
}
