package jvasorting;

public class Selectionsort {
    

    public static void main(String[] args) {
        int arr[] = {9 , 3, 5 ,2 , 5, 7 ,1 , 1};
        for( int i = 0 ; i< arr.length ; i ++){
            int smallest = i;
            for(int  j = i+1 ; i <arr.length ; j ++){
                if(arr[smallest >arr[j]]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;


        }
            Print(arr);

    }
}
