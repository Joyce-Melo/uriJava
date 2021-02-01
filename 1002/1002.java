package pkg1002;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
       
        double n = 3.14159;
        double raio = num.nextDouble();
        double area = n * raio * raio;
        
        System.out.printf("A = %.4f\n", area);
                
        
    }
    
}