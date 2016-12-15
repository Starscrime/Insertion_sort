package ru.sorter;

import java.io.IOException;
import java.util.ArrayList;

public class StrProcessor extends Processor {

    boolean sortTypeFlag;

    void process(String[] args) {
        if (args.length < 4 || args[1] == null || args[2] == null || args[3] == null) {
            System.out.println("Missing arguments. Program will be shut down.");
            printHelpSuggestion();
            return;
        }
        if (args[1].equals("-a")) {
            sortTypeFlag = true;
        } else if (args[1].equals("-d")) {
            sortTypeFlag = false;
        }
        FileHelper fileHelper = new FileHelper();
        ArrayList arrayList = fileHelper.readInFile(args[2], args[0]);
        Sorter sorter = new Sorter();
        sorter.sorterStr(arrayList, sortTypeFlag);
        try {
            fileHelper.writeOutFile(arrayList, args[3]);
        } catch (IOException e) {
            System.out.println("Can not write output file. Program will be shut down.");
        }
    }
}
