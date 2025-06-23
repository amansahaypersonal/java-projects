import java.util.*;
class even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        sc.close();
        for(int i = 0; i <= number; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
            
        }
    
    }
}
