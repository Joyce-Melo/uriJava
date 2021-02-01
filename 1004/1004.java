package pkg1004;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        
        int a = num.nextInt();
        int b = num.nextInt();
        int prod = a * b;
        
        System.out.println("PROD = " + prod);
    }
    
}