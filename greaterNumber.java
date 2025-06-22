import java.util.*;
public class greaterNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       

        System.out.print("Enter two numbers: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        
        if(firstNumber > secondNumber){
            System.out.println(firstNumber + "   is greater than  " + secondNumber);
        }
        else{
            System.out.println(secondNumber + "  is greater than  " + firstNumber);
        }
        sc.close();
        
    }
}
