public class PrintAtLast {

    public static void PrintLast(String word, int count ,int index,  String newString){
        if(index == word.length()){
            for(int i = 0; i < count; i++ ){
                newString  += 's';
            }
            System.out.println(newString);
            return ;
        }

        
        char currchar = word.charAt(index);
        if(currchar == 's'){
            count++;
        }else{

            newString += currchar;
        }
          PrintLast(word, count, index+1,  newString);

    }
    public static void main(String[] args){
        String word = "asdfsdssdfj";
        PrintLast(word, 2,0,"");

    }
    
}
