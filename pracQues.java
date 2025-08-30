public class pracQues {
    public static void number(int num){
        if(num == 1){
          
        }
        number(num-1);
        System.out.println(num);
        // return 9;
    }
    public static void main(String[] args){
int num = 1;
number(num);

    }
}
