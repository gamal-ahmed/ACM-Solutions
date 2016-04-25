 import java.util.Scanner;  

 public class Parking {  
      static int testCases, stores;  
      static int min, max, val;  
      static Scanner scanner;  
      public static void main(String[] args) {  
           scanner = new Scanner(System.in);  
           testCases = scanner.nextint();  
           while((testCases--) != 0) {  
                stores = scanner.nextint();  
                min = 10000;  
                max = -1;  
                while((stores--) != 0) {  
                     val = scanner.nextint();  
                     if(val > max) max = val;  
                     if(val < min) min = val;  
                }  
                System.out.println((max - min) * 2);  
           }  
      }  
 }  