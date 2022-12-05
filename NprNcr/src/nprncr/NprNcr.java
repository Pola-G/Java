
import java.util.Scanner;

class NprNcr {                  //make class for calculating factorial.
    double fact(double n) {     //function to calculate factorial.
        double fact = 1;     
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String arg[]) {
        NprNcr obj = new NprNcr();           //make object form class NprNcr.
        Scanner sc = new Scanner(System.in); //make object from class scanner.

        while (true) {         //infinite loop.

            System.out.println("Enter value of n : ");         //get value of n.
            int n = sc.nextInt();
            System.out.println("Enter value of r : r <= n  ");  //get value of r.
            int r = sc.nextInt();
            if (n >= r) {                        //check validation of values n,r.
                double ncr = obj.fact(n) / (obj.fact(n - r) * obj.fact(r));   //calculate ncr using object method.
                double npr = obj.fact(n) / obj.fact(n - r);             //calculate npr.
                System.out.println("The value " + n + "p" + r + " is : " + npr);    //print the result.
                System.out.println("The value " + n + "c" + r + " is : " + ncr);
            } else {
                System.out.println("Enter n>=r ");              //error message if n<r.
            }

            System.out.println("\n");
        }
    }
}
