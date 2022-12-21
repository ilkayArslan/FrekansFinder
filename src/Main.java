

public class Main {
    static boolean isFind(int[] arr,int value){
        for(int a:arr){
            if (a==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

       int [] arr = {10, 20, 20, 10, 10, 20, 5, 20,5,5,2};
       int[] newarr = new int[arr.length];
       int indis = 0;
       for(int a=0;a<arr.length;a++){
           for(int i = 0 ; i<arr.length;i++){
               if(arr[a]==arr[i]&&a!=i){
                   if (!isFind(newarr,arr[a])){
                       newarr[indis++]=arr[a];
                   }

               }
           }
       }
       for(int b : newarr){
           int sayi =0;
           if (b != 0 ){
               for(int c:arr){
                   if( b==c){
                       sayi++;

                   }
               }
               System.out.println(b + " Sayısından " +sayi + " tane vardır." );

           }

       }

    }
}