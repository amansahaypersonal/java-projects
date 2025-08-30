import java.util.*;

public class AverageNumber {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number of values you want to Enter:");
        int size = in.nextInt();
        int arr[] = new int[size];
        in.close();
      

        for(int i = 0; i <= size ;i++){
            arr[i] = in.nextInt();
            

        }

    }
}
