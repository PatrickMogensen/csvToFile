package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class csvReader {

    private URL url;
    private Scanner scan;

    public String[] getFirstLine(URL url) throws IOException{
        this.url = url;
        InputStream in = url.openStream();
        scan = new  Scanner(in);

        String[] arr = scan.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        return arr;


    }

    public csvReader(URL url) throws IOException {
        this.url = url;
        InputStream in = url.openStream();
        scan = new  Scanner(in);
    }
    List<LineObj> objList = new ArrayList<LineObj>();
    List<LineObj> sortedList = new ArrayList<LineObj>();

    public List scanCSV(){
        scan.reset();
        scan.nextLine();
        while (scan.hasNextLine()){

        String[] arr = scan.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        objList.add(new LineObj(arr[1],arr[11],arr[10],arr[23]));
        }
        for (int y = 0; y < 2020 ; y++) {
        for (int i = 0; i < objList.size(); i++) {
            if (objList.get(i).getTitle_year().equals("")){
                objList.get(i).setTitle_year("0");
            }
            int counter = Integer.parseInt(objList.get(i).getTitle_year());

            if (counter == y) { sortedList.add(objList.get(i));
            }

           // System.out.println(y);
            // System.out.println(objList.get(i).getTitle_year());
        }

        }




        System.out.println(sortedList.get(1).getTitle_year());
        return sortedList;

    }

    public String getLine(int line){
        int counter = 1;
        scan.reset();
        while (scan.hasNextLine()){
            if(counter == line){
                return scan.nextLine();
            }
            scan.nextLine();
            counter++;

        } scan.reset();
        return null;
    }

}
