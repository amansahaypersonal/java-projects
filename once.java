public class once {

    public static boolean arr[] = new boolean[26];

    public static void atOnce(String word, String newString, int index ){
        if(index == word.length()){
            System.out.println(newString);
            return;
        }


        char currchar = word.charAt(index);
        if(arr[currchar - 'a'] == true){
            atOnce(word, newString, index+1);

        }else{
            newString += currchar;
            arr[currchar - 'a'] = true;
            atOnce(word, newString, index+1);


        }
        // atOnce(word, newString, index+1);
    }
    public static void main(String[] args){
        String word = "abbcddffgh";
        atOnce(word, "", 0);
    }
}
