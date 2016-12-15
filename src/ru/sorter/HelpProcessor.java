package ru.sorter;

import static ru.sorter.Main.ARG_HELP;
import static ru.sorter.Main.ARG_TYPE_INTEGER;
import static ru.sorter.Main.ARG_TYPE_STRING;

public class HelpProcessor extends Processor {
    void process(String[] args) {
        System.out.println(ARG_HELP);
        System.out.println("prints this help message");
        System.out.println();
        System.out.println(ARG_TYPE_INTEGER + " <type sorting> <in file> <out file>");
        System.out.println("Sort in file, and write sorted list to out file.");
        System.out.println("Only numeric value list. <type sorting>:");
        System.out.println("-a sort ascending");
        System.out.println("-d sort descending");
        System.out.println();
        System.out.println(ARG_TYPE_STRING + " <type sorting> <in file> <out file>");
        System.out.println("Sort in file, and write sorted list to out file. <type sorting>:");
        System.out.println("-a sort ascending");
        System.out.println("-d sort descending");
    }
}
