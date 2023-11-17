package com.scanner;

import java.io.BufferedReader;
import java.io.IOException;

class StreamGobbler extends Thread {
    BufferedReader bufferedReader;
    StringBuilder stringBuilder;

    StreamGobbler(BufferedReader bufferedReader, StringBuilder stringBuilder) {
        this.bufferedReader = bufferedReader;
        this.stringBuilder = stringBuilder;
    }

    public void run() {
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null)
                stringBuilder.append(line).append("\n");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
