import java.util.HashSet;

public class subsequance {
    public static void subsequances(String word, int index, String newString, HashSet<String> set){
        if(word.length() == index){
            if(set.contains(newString)){
                
                // System.out.println(newString);
                return;
            }else{
            System.out.println(newString);
            set.add(newString);
            return;}
        }
        char currchar = word.charAt(index);
       subsequances(word, index+1, newString+currchar, set);



        subsequances(word,index+1,newString, set);

        
    }
    public static void main(String[] args){
        String word = "aaa";
        HashSet<String> set  = new HashSet<>();
        subsequances(word, 0, "", set);

    }
}
