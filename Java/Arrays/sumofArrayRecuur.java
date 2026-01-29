public class sumofArrayRecuur {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(sumarr(arr,0));
    }
    static int sumarr(int[] arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        return sumarr(arr, index+1)+arr[index];
    }
}
