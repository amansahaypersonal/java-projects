public class sorted {
     public static boolean checkSort(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }

        if(arr[index] < arr[index+1]){
           return checkSort(arr, index+1);
        }else{
            return false;
        }
    
     }

    public static void main(String[] args ){
        int arr[] =  {1,3,9,7};
        System.out.println(checkSort(arr, 0));


    }
}
