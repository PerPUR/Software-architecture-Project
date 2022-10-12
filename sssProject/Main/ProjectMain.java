package com.sssProject.Main;

import com.sssProject.Others.LineSort;
import com.sssProject.Others.WordSort;
import com.sssProject.Others.WriteAndRead;

import java.util.ArrayList;

public class ProjectMain {
    public static void main(String[] args) {

        String fileRead = "D://wang.txt";
        String fileWrite = "D://wangyilan.txt";

        WriteAndRead read = new WriteAndRead();
        WriteAndRead write = new WriteAndRead();
        WordSort wordSort = new WordSort();

        read.readThings(fileRead);
        ArrayList<String> readlist = read.getReadlist();

        wordSort.obtainText(readlist);
        wordSort.sortWords();

        ArrayList<String> wordsorted = wordSort.getSortedText();

        LineSort lineSort = new LineSort(wordsorted);
        lineSort.sortLines();
        //打印结果
        lineSort.PrintSortedLines();
        //写入结果
        write.writeThings(lineSort.getLineSorted(),fileWrite);
    }
 }
