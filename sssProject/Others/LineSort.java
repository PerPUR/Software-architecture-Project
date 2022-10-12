package com.sssProject.Others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class LineSort {

    private ArrayList<String> lineText = null;
    private ArrayList<String> lineSorted = new ArrayList<String>();

    public LineSort(ArrayList<String> lines){
        this.lineText = lines;
    }

    public void  sortLines(){
        Comparator<String> linesComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1 == null && o2==null){
                    throw new NullPointerException();
                }
                char ch1 = o1.toLowerCase().charAt(0);
                char ch2 = o2.toLowerCase().charAt(0);
                return (int)(ch1-ch2);
            }
        };
         Collections.sort(lineText,linesComparator);
         this.lineSorted = lineText;
    }
    public void PrintSortedLines(){
        for (String str : lineSorted){
            System.out.println(str);
        }
    }
    public ArrayList<String> getLineSorted(){
        return this.lineSorted;
    }
}
