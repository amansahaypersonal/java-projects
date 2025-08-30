import java.util.*;
public class recursion {


    public static int calcFactorial(int n){
        if(n == 1|| n == 0){
            return 1;
        }
        int calc1 = calcFactorial(n - 1);
        int calc2 = n * calc1;
        return calc2;
    }
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(calcFactorial(n));
    }
}
