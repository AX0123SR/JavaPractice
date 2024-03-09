package com.java.Random;
import java.io.*;
import java.util.*;
public class EndOfFile {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int count = 1;

            while(scan.hasNext())
            {
                String s = scan.nextLine();
                if(s.contains("end-of-file"))
                {
                    break;

                }
                System.out.println(count + " " +s);
                count++;
            }
            scan.close();
        }

    }


