import java.util.*;

public class circumfrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        Double radii = sc.nextDouble();

        circumfrenceOfCircle(radii);

        sc.close();

    }

    public static void circumfrenceOfCircle(Double radii) {
        Double circum = 2 * 3.14 * radii;
        System.out.println(circum);
    }
}
