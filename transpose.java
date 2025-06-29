import java.util.*;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int trans[][] = new int[row][col];

        // Input
        // Row
        for (int i = 0; i < row; i++) {
            // Column
            for (int j = 0; j < col; j++) {
                trans[i][j] = sc.nextInt();

            }
        }
        System.out.println("The Transpose is :   ");
        // Output
        // Column
        for (int j = 0; j < col; j++) {
            // Row
            for (int i = 0; i < row; i++) {
                System.out.print(trans[i][j] + " ");

            }
            System.out.println();
        }
        sc.close();
    }
}
