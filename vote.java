import java.util.*;
class vote{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        myVote(age);
        sc.close();

    }
    public static int myVote(int age){
         if(age>= 18){
            System.out.println("you are eligible for voting");
        }
        else{
              System.out.println("you are not eligible for voting");
        }
        return age;
    }

}
