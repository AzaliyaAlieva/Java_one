package ru.geekbrains.java_one.lesson_f.online;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        try {
            FileInputStream fis = new FileInputStream("Sh1.txt");
            Scanner sc = new Scanner(fis);
            int a;
            while((a = fis.read()) != -1) {
                FileOutputStream fos = new FileOutputStream("SH3.txt", true);
                PrintStream prs = new PrintStream(fos);
                prs.println(sc.nextLine());
            }

            FileInputStream fis2 = new FileInputStream("Sh2.txt");
            Scanner sc2 = new Scanner(fis2);
            int b;
            while((b = fis2.read()) != -1) {
                FileOutputStream fos2 = new FileOutputStream("SH3.txt", true);
                PrintStream prs2 = new PrintStream(fos2);
                prs2.println(sc2.nextLine());
            }

            fis.close();
            fis2.close();
           
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
