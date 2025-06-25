//Find the maximum & minimum number in an array of integers. 

public class minMaxArray {
    public static void main(String[] args) {
        int number[] = {1, 6, 3, 2, 9, 7, 5};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            } else if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }

}
