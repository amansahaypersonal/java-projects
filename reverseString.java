public class reverseString {

    public static void reverse(String word, int index){
        if(index == 0){
              System.out.print(word.charAt(index));
              return;
        }

        System.out.print(word.charAt(index));
        reverse(word, index-1);
    }
    public static void main(String[] args){
     String word = "abcd";
     reverse(word, word.length()-1);
    
}
}