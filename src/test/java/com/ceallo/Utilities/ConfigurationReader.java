package com.ceallo.Utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    private static Properties properties = new Properties();

    //after creating to object we need to open the file java memory: FileInputStream

    static {


        //load the properties object using FileInputStream object

        try {


            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);

            //close the file

            file.close();

        } catch (IOException e) {

            System.out.println("file not found");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyWord) {
        return properties.getProperty(keyWord);
    }


}

