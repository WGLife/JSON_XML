package com.company;

import parsers.JsonParser;
import parsers.XmlParser;

import java.io.*;
import java.util.Properties;

public class Main {

    private static final String JSON_PATH = "c:\\Information.json";
    private static final String XML_PATH = "c:\\Information.xml";

    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("src/main/resources/locators.properties");
        Properties prop = new Properties();
        prop.load(stream);
        FileWriter fileWriter = new FileWriter("c:\\Examples.txt");
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("Hello world");
//        bufferedWriter.close();
//        fileWriter.close();

//        FileReader fileReader = new FileReader("c:\\Examples.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String str;
//        while ((str = bufferedReader.readLine()) != null) {
//            System.out.println(str);
//        }
//
//        bufferedReader.close();
//        fileReader.close();

//        Contact cont = new Contact("Vasily", "Pupkin");
//        Contact cont1 = new Contact("Ivan", "Ivanov");
//        HomePhone hp = new HomePhone("Minsk", "80172293255");
//        MobilePhone mp = new MobilePhone("MTS", "+375296669777");
//        cont1.setMobilePhone(mp);
//        cont1.setHomePhone(hp);
//        cont.setHomePhone(hp);
//        cont.setMobilePhone(mp);
//
//        cont.printAllInformation();
//
//        Information inf1 = new Information("Work group");
//
//        inf1.setInformation("Work group");
//        inf1.addContact(cont1);
//        inf1.addContact(cont);
//        inf1.printAllInformation();
//
//
//
//        XmlParser.write(inf1, XML_PATH);
//        Information infoFromXml = XmlParser.read(XML_PATH);
//
//        JsonParser.write(inf1, JSON_PATH);
//        Information infoFromJson = JsonParser.read(JSON_PATH);
//
//        System.out.println("After parsing:\nXML:");
//        infoFromXml.printAllInformation();
//        System.out.println("After parsing:\nJSON:");
//        infoFromJson.printAllInformation();
    }
}
