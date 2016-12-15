package ru.sorter;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper {
    public ArrayList readInFile(String inFilePath, String typeElement) {
        ArrayList arrayList = null;
        Scanner inFile = null;
        try {
            inFile = new Scanner(new File(inFilePath));
        } catch (FileNotFoundException e) {
            System.out.println("File with incoming data not found. Program will be shut down.");
            System.exit(0);
        }
        if (typeElement.equals("-s")) {
            arrayList = new ArrayList<String>();
            while (inFile.hasNextLine() ) {
                String line = inFile.nextLine();
                if (!line.equals("")){
                    arrayList.add(line);
                }
            }
        } else if (typeElement.equals("-i")) {
            arrayList = new ArrayList<Integer>();
            while (inFile.hasNextLine()) {
                String currentElement = null;
                try {
                    currentElement = inFile.next();
                    arrayList.add(Integer.parseInt(currentElement));
                } catch (NumberFormatException e) {
                    System.out.println(currentElement.toString() + " is not numeric. Program will be shut down.");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Unknown arguments");
        }
        inFile.close();
        return arrayList;
    }

    public void writeOutFile(ArrayList lines, String fileName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, false));
        for (int i = 0; i < lines.size(); i++) {
            bufferedWriter.write(lines.get(i).toString());
            bufferedWriter.write(System.lineSeparator());
        }
        bufferedWriter.close();
    }
}
