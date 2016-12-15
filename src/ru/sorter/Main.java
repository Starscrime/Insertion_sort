package ru.sorter;

import java.util.*;

public class Main {

    static final String ARG_HELP = "-h";
    static final String ARG_TYPE_STRING = "-s";
    static final String ARG_TYPE_INTEGER = "-i";

    private static final Map<String, Processor> PROCESSORS = new HashMap<String, Processor>();

    static {
        PROCESSORS.put(ARG_HELP, new HelpProcessor());
        PROCESSORS.put(ARG_TYPE_INTEGER, new IntProcessor());
        PROCESSORS.put(ARG_TYPE_STRING, new StrProcessor());
    }

    public static void main(String[] args) {

        if (args == null || args.length == 0) {
            System.out.println("You have not provided arguments.");
            return;
        }

        String mainArg = args[0];

        Processor processor = PROCESSORS.get(mainArg);
        if (processor != null) {
            processor.process(args);
        } else {
            System.out.println("Unknown arguments");
        }
    }
}
