package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author salitha Kaweendra
 */
public class sentence {
    static String[] SENTENCE; 

   public static void main(String []args) throws Exception{

       Scanner sentence = new Scanner(new File("qs.txt")); //file name
       ArrayList<String> sentenceList = new ArrayList<String>();

       while (sentence.hasNextLine())
       {
           sentenceList.add(sentence.nextLine());
       }

       sentence.close();

       String[] sentenceArray = sentenceList.toArray(new String[sentenceList.size()]);

       for (int r=0;r<sentenceArray.length;r++)
       {
           SENTENCE = sentenceArray[r].split("(?<=[.!?])\\s*");
           for (int i=0;i<SENTENCE.length;i++)
           {
               System.out.println( SENTENCE[i]);
           }

       }
   }
}
