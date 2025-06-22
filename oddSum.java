//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

class oddSum {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
      int sum = 0;

        System.out.println("Enter any number");
        int number = sc.nextInt();

        for(int i = 0; i <= number; i++){
            if(i%2 != 0){
                sum = sum +i;
               
            }
      
        }
       System.out.println(sum);
       sc.close();

    }
}
