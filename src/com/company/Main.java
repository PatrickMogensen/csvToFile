package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, NullPointerException {
       URL url = new URL("https://drive.google.com/u/0/uc?id=1bj8hvAteDn-yKUPFasBSvg9P8jvripwd&export=download");

        File file = new File("fourColumns.csv");

        // creates the file
        file.createNewFile();

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);

         csvReader csvr = new csvReader(url);

         List<LineObj> list = csvr.scanCSV();

        String[] firstLine = csvr.getFirstLine(url);

        writer.write(firstLine[1] + "," + firstLine[11] + "," + firstLine[10] + "," + firstLine[23] + " \n");

        for (int i = 0; i < list.size() ; i++) {

            writer.write(list.get(i).getDirector_name() + ",");
            writer.write(list.get(i).getMovie_title() + ",");
            writer.write(list.get(i).getActor_1_name() + ",");
            writer.write(list.get(i).getTitle_year() + " \n");




        }
    }
}
