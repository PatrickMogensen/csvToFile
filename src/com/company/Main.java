package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, NullPointerException {
       URL url = new URL("https://drive.google.com/u/0/uc?id=1bj8hvAteDn-yKUPFasBSvg9P8jvripwd&export=download");
        //  InputStream in = url.openStream();

        // Scanner scan = new Scanner(in);

       csvReader csvr = new csvReader(url);

      List<LineObj> list = csvr.scanCSV();

      //  System.out.println(list.get(1));
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i).getActor_1_name() + " ");
            System.out.print(list.get(i).getDirector_name() + " ");
            System.out.print(list.get(i).getMovie_title() + " ");
            System.out.print(list.get(i).getTitle_year() + " \n");




        }
    }
}
