package ru.sorter;

import java.util.ArrayList;

public class Sorter {
    public ArrayList sorterStr(ArrayList<String> arrayList, boolean typeSortFlag) {

        for (int j = 0; j < arrayList.size(); j++) {
            String tempElement = arrayList.get(j);
            int l = j - 1;
            if (typeSortFlag) {
                while (l >= 0 && arrayList.get(l).compareTo(tempElement) > 0) {
                    arrayList.set(l + 1, arrayList.get(l));
                    l--;
                }
            } else if (!typeSortFlag) {
                while (l >= 0 && arrayList.get(l).compareTo(tempElement) < 0) {
                    arrayList.set(l + 1, arrayList.get(l));
                    l--;
                }
            }
            arrayList.set(l + 1, tempElement);
        }
        arrayList.forEach(System.out::println);
        return arrayList;
    }

    public ArrayList sorterInt(ArrayList<Integer> arrayList, boolean typeSortFlag) {

        for (int j = 0; j < arrayList.size(); j++) {
            int tempElement = arrayList.get(j);
            int l = j - 1;
            if (typeSortFlag) {
                while (l >= 0 && arrayList.get(l) > tempElement) {
                    arrayList.set(l + 1, arrayList.get(l));
                    l--;
                }
                arrayList.set(l + 1, tempElement);
            } else if (!typeSortFlag) {
                while (l >= 0 && arrayList.get(l) < tempElement) {
                    arrayList.set(l + 1, arrayList.get(l));
                    l--;
                }
                arrayList.set(l + 1, tempElement);
            }
        }
        arrayList.forEach(System.out::println);
        return arrayList;
    }
}
