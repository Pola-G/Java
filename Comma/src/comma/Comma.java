
package comma;

import java.util.Scanner;


public class Comma {

   
    public static void main(String[] args) {
       String str;             //initialize string object.
       Scanner sc = new Scanner(System.in);    //make scanner object.
       
       while(true){     //infinite loop.
       System.out.println("Enter string : ");
       str = sc.nextLine();
       String newStr = str.replace(",","");   //remove ',' from string and put it in new string.
        System.out.println(newStr);
      }
    }
    
}
