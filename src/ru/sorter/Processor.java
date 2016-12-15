package ru.sorter;

abstract class Processor {
    abstract void process(String []args);

    void printHelpSuggestion(){
        System.out.println("Use \"-h\" to see available arguments");
    }

}
