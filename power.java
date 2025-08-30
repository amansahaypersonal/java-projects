public class power {
    public static int calcPower(int x, int n)
    {
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 1;
        }

        int x_ = calcPower(x, n-1);
        int xn = x * x_;
        return xn;
    }
    public static void main(String[] args){

        int x = 2, n = 5;
       int ans =  calcPower(x, n);
        

System.out.println(ans);
    }
    
    
}
