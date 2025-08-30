public class occurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String word , int index, char element){
        // char element = 'a';
        
        if(index == word.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        char currchar = word.charAt(index);
        if(currchar == element){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }

        findOccurance(word, index+1, element);
    }
    public static void main(String[] args){
        String word = "faroaaaage";
        findOccurance(word, 0, 'a');
    }
}
