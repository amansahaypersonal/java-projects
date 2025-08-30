public class towerOfHanoi {
    public static void tower(int n , String src,  String help, String dest){
        if(n == 1){ 
            System.out.print("plates directly transfer from "+ src + "to" + dest);
        }
        tower((n-1), src, dest, help);

        tower(n, help, src, dest);
        System.out.println(n+ help+src+ dest);
    }
    public static void main(String[] args){
        int n =3; 
        tower(n, "s", "h", "d");
    }
}
