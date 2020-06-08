/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Algorithm {

    public static void main(String[] args) throws IOException {
        int [] array = getRandomNumbersList();
        int c = 0;
        for(int j = 1; j < 17; j++){
            System.out.println("Білет №" + j + ": " + "питання №1: " + array[j - 1 + c] + "  " + "питання №2: " + array [j + c]);
            c = c + 1;
        }
            
    }
    
    
public static int[] getRandomNumbersList(){
        int array[] = new int[32];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            boolean found = false;
            int r = 0;
            do {
                found = false;
                r = random.nextInt(32) + 1;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == r) {
                        found = true;
                        break;
                    }
                }
            } while (found);

            array[i] = r;
        }
        return array;
    } 
  
}