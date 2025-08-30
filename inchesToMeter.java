import java.util.Scanner;

class inchesToMeter{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the degree in  freheinheit: ");
        float inch = sc.nextFloat();
        converter(inch);
        sc.close();
    }
    public static void converter(float inch){
        double meter = (inch * 0.0254);
        System.out.println(meter);
    
    }}

