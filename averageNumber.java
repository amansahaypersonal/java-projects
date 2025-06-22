//Enter 3 numbers from the user & make a function to print their average.


import java.util.*;  //import scanner

public class averageNumber {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the Third number");
        int c = sc.nextInt();
        averageNum(a, b, c);    //calling function
        
    }
    public static void averageNum(int a ,int b ,int c){    
        int avg = (a + b + c)/3;        //  (sum of all numbers)/total number
        System.out.println(avg);
        return;

    }
}
