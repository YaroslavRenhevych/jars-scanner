package com.scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JdeprscanForFolderWithCompiledClasses {

    public static void main(String[] args) throws IOException, InterruptedException {
        String folder = "/path/to/folder/with/compiled/classes";

        String outputFileName = "compiled-classes-in" + folder.replace("/", "-") + "-jdeprscan.txt";

        FileWriter fw = new FileWriter(outputFileName, true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int javaVersion = 8; javaVersion <= 17; javaVersion++) {
            System.out.println("Folder " + folder + " for java " + javaVersion);
            Process process = Runtime.getRuntime().exec("/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home/bin/jdeprscan --release " + javaVersion + " " + folder);

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
            bw.write("Folder " + folder + " for java " + javaVersion + " " + "\n");
            bw.write(output.toString());
            bw.write(errors.toString());

            bw.newLine();
            bw.newLine();
            bw.newLine();
        }
        bw.close();
    }
}
