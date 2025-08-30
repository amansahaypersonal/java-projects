import java.util.*;
class binaryConverter{
    public static void main(String[] args){
        int decimal , quot = 1, i = 1, j ;
        System.out.print("Enter the  decimal number: ");
        Scanner sc = new Scanner(System.in);
         decimal = sc.nextInt();
         int remNum[] = new int[100];
        sc.close();
        quot = decimal;

         while(quot != 0){
            remNum[i++] = quot % 2;
            quot = quot/2; 

         }

         System.out.print("the Binary of "  + decimal + " is : ");
        for(j = i-1; j > 0; j--){
            
            System.out.print(remNum[j]);
        }System.out.println("\n");
        
        System.out.println(System.getProperty("java.version"));
        
    }
}