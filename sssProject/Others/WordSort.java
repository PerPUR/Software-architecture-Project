package com.sssProject.Others;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class WordSort {

    private ArrayList<String> text=null;
    private ArrayList<String> sortedText = new ArrayList<String>();

    public WordSort(){

    }

    //设置文本list
    public void obtainText(ArrayList<String> strs){
        this.text = strs;
    }

    //获取新的list
    public void sortWords(){
         for (String str : text){
             StringTokenizer tokenizer = new StringTokenizer(str);
             sortTokens(tokenizer);
         }
    }
    private void SetNewString(ArrayList<String> list){

        String tempStr = "";
        for (String str : list){
            tempStr=tempStr+str+" ";
        }
      if(tempStr != null){
          tempStr.trim();
          this.sortedText.add(tempStr);
      }
    }
    private void sortTokens(StringTokenizer tokenizer){

        ArrayList<String> templist = new ArrayList<String>();

        int len = tokenizer.countTokens();

        for(int i=0;i< len ; i++){
            templist.add(tokenizer.nextToken());
        }
        String temp ,st;
        SetNewString(templist);
        for(int j = 1 ;j<len;j++){
            temp = templist.get(0);
            templist.remove(0);
            templist.add(temp);
            SetNewString(templist);
        }
    }
    //获取已经产生的新list
    public ArrayList<String> getSortedText(){
        return  this.sortedText;
    }
    public void PrintSortedText(){
        for (String str : sortedText){
            System.out.println(str);
        }
    }
}
