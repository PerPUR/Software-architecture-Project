package com.sssProject.Others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class WriteAndRead {

    private BufferedWriter writer=null;
    private BufferedReader reader=null;
    private ArrayList<String> readlist=new ArrayList<String>();

    public WriteAndRead(){

    }

    //写入
    public void writeThings(ArrayList<String> list,String filename) {
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            for (String str:list){
                writer.write(str+"\n");
            }
        } catch (Exception E) {
            System.out.println("file open defaultedly!");
            E.printStackTrace();
        }finally {
            if(writer !=null){
                try {
                    writer.flush();
                    writer.close();
                }catch (Exception e){
                    System.out.println("writer close defaultedly");
                }
            }
        }

    }

    //读取
    public void readThings(String filename){
        try{
            reader = new BufferedReader(new FileReader(filename));
        } catch (Exception E){
            System.out.println("read file faultedly!");
            E.printStackTrace();
        }
        String line=null;
        try {
          while ((line = reader.readLine())!=null){
              readlist.add(line);
          }
        }catch (Exception e){
            System.out.println("read false!");
            e.printStackTrace();
        }
    }

    public ArrayList<String> getReadlist(){
        return this.readlist;
    }
}
