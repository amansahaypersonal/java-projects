import java.util.*;
class fraheinheitToCelcius{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the degree in  freheinheit: ");
        float fraheinheit = sc.nextFloat();
        converter(fraheinheit);
        sc.close();
    }
    public static void converter(float fraheinheit){
        float convert = (fraheinheit - 32)*5/9;
        System.out.println(convert);
    
    }
}
