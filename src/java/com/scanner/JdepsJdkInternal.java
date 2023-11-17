package com.scanner;

import java.io.*;
import java.util.List;


public class JdepsJdkInternal {

    public static final String command = "/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home/bin/jdeps -jdkinternals --multi-release 17";

    public static void main(String[] args) throws IOException, InterruptedException {
        String folder = "/path/to/folder/with/jars/";
        File directoryPath = new File(folder);
        List<String> fileNames = List.of(directoryPath.list()).stream()
                .sorted().toList();

        String outputFileName = folder.replace("/", "-") + "jdeps-jdkinternal.txt";

        FileWriter fw = new FileWriter(outputFileName, true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (String fileName : fileNames) {
            System.out.println("File #" + fileNames.indexOf(fileName) + ": " + fileName);
            Process process = Runtime.getRuntime().exec(command + " " + folder + fileName);

            StringBuilder output = new StringBuilder();
            StreamGobbler outputGobbler = new StreamGobbler(process.inputReader(), output);
            outputGobbler.start();

            StringBuilder errors = new StringBuilder();
            StreamGobbler errorGobbler = new StreamGobbler(process.errorReader(), errors);
            errorGobbler.start();

            int exitVal = process.waitFor();


            if (exitVal == 0) {
                System.out.println("done");

            } else {
                System.out.println("!!!!!!!!!!!!!!!!!!Error:");
                System.out.println(output);
            }
            bw.write("File #" + fileNames.indexOf(fileName) + " " + fileName + "\n");
            bw.write(output.toString());
            bw.write(errors.toString());

            bw.newLine();
            bw.newLine();
            bw.newLine();
        }

        bw.close();
    }
}
