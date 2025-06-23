//  Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// marks >=90 -> print “This is Good”
// 89 >= marks >= 60 -> print “This is also Good”
// 59 >= marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.

import java.util.*;

class menuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        
        int num;
        do {
            System.out.println("Enter the marks b/w 0-100");
            int marks = sc.nextInt();

             if (marks >= 90) {
                System.out.println("this is good");
            } else if (89 >= marks || marks >= 60) {
                System.out.println("This is good as well");
            } else if (59 >= marks || marks>= 0) {
                System.out.println("This is Good as well");
            }
            System.out.println("type 1 for enter marks or 0 to stop");
            num = sc.nextInt();

           
        } while (num == 1);
        sc.close();
    }
}
