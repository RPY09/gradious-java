import java.util.ArrayList;
import java.util.List;

public class recurssion {
    public static void main(String[] args) {
        List<Integer> brr=new ArrayList<>();
        // numbersBacktrack(9);
        // backTrackNumbers(1,9);
        // System.out.println(sumOfNaturalNum(5));
        // System.out.println(backtrackSumOfNatural(0,9));
        // System.out.println(reverseOfNumbers(123,0));
        // System.out.println(factorial(9));
        // System.out.println(backtrackFactorial(1,5));
        int [] arr={1,2,3};
        // int res[]=reverseArray(arr,0,arr.length-1);
        // for(int num:res){
        //     System.out.println(num+" ");
        // }
        String str="abc";
        // System.out.println(isPalindrome(str,0,str.length()));
        // System.out.println(countChar(str,'p'));
        // System.out.println(removeOccurence(str,'a',""));
        // System.out.println(replaceChar(str,'a','A',""));
        // subSequence(str,0,"");
        // subString(str,0,str.length()-1);
        // System.out.println(fibanocci(9));
        // subSequenceArray(0,brr,arr);
        targetInArray(0,arr,brr,0,3);
        // System.out.println(subArrayOddSum(0,0,arr,brr));
        // int[] res = mergesort(arr,0,arr.length-1);
        // for(int num:res){
        //     System.out.println(num+" ");
        // };
        // denomination(arr,0,7,brr);
    }

    //call the function and decrese the i to traverse upto the condition and return then start printing the numbers in backtrack and the input is given as a largest number upto we want to print;

    static void numbersBacktrack(int i){
        if(i<1){
            return;
        }
        numbersBacktrack(i-1);
        System.out.println(i);
    }

    //call the function and traverse upto the condition and return then start printing the elements in the reverse order this is backtracking;

    static void backTrackNumbers(int i,int n){
        if(i>n){
            return ;
        }
        backTrackNumbers(i+1, n);
        System.out.println(i);
    }

    //call the function and reduce the number till the 0 then return with adding the numbers from the 1-n;

    static int sumOfNaturalNum(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfNaturalNum(n-1);
    }

    //call the function and increse the number till the wanted number and add the numbers from the n-1;

    static int backtrackSumOfNatural(int i,int n){
        if(i==n){
            return n;
        }
        return i+backtrackSumOfNatural(i+1, n);
    }

    //

    static int reverseOfNumbers(int n,int rev){
        if(n<=0){
            return rev;
        }
        int digit=n%10;
        rev=rev*10+digit;
        return reverseOfNumbers(n/10,rev);
    }

    //call the function and reduce the number till 1 and multiply the number from 1-n;

    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    //call the function and add the number till n and multiply the number from n-1;

    static int backtrackFactorial(int i,int n){
        if(i>=n){
            return n;
        }
        return i*backtrackFactorial(i+1, n);
    }

    //call the funcion and then swap the elements and then when the i and n cross or meet at point then return the arr;

    static int[] reverseArray(int[] arr,int i, int n){
        if(i>=n){
            return arr;
        }
        swap(arr,i,n);
        return reverseArray(arr, i+1, n-1);
    }
    
    //swap the elements of the arr;

    static void swap(int[] arr,int i,int n){
        int t=arr[i];
        arr[i]=arr[n];
        arr[n]=t;
    }
    
    //call the function and then check that first and last index are the same if not return the false or if i cross or meet the n then return true;

    static boolean isPalindrome(String s,int i,int n){
        if(i>=n){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return isPalindrome(s, i+1, n);
    }

    //counts the letter and reduce the string with one character from start to form a new string until string length beacomes 0;

    static int countChar(String str,Character target){
        if(str.length()==0){
            return 0;
        }
        int count=str.charAt(0)==target?1:0;
        return count+countChar(str.substring(1), target);
    }

    //removes the target character from the string and returns a new string without that target character;

    static String removeOccurence(String str,char target,String result){
        if(str.length()==0){
            return result;
        }
        char ch=str.charAt(0);
        if(ch!=target){result+=ch;}
        return removeOccurence(str.substring(1), target, result);
    }

    //when the character matched it replace the character with new character and returns the new result;

    static String replaceChar(String str,char target,char change,String result){
        if(str.length()==0){
            return result;
        }
        char ch=str.charAt(0)==target?change:str.charAt(0);
        result+=ch;
        return replaceChar(str.substring(1), target, change, result);
    }

    //return the subsequnce of the string and to know the how many are there use 2**n formula and n is the length of the string

    static void subSequence(String str,int i,String result){
      
        if(i==str.length()){
            System.out.println(result);
            return;
        }
        
        subSequence(str, i+1, result+str.charAt(i));
       
        subSequence(str, i+1, result);
    }

    //

    static void subString(String str,int start, int end) {
    // base case
    if (start == str.length()) {
        return;
    }

    // when end reaches beyond string, move to next start
    if (end > str.length()) {
        subString(str, start + 1, start + 1);
        return;
    }

    // print current substring
    System.out.println(str.substring(start, end));

    // move end forward
    subString(str, start, end + 1);
    }

    //

    static int fibanocci(int n){
        if(n<=1){
            return n;
        }
        return fibanocci(n-1)+fibanocci(n-2);
    }

    //call the function and when the i is grater than or equal the length of the array then the values print here the first element is 3 it add in the list and then call function till i reach the i greater than or equal to length then prints then returns then remove the last element and call the function and then prints the remaining elements. Note the last element removed but the i is still the same but brr elements are changed so it prints the remaining elements in the brr;

    static void subSequenceArray(int i,List<Integer> brr,int[] arr){
        if(i>=arr.length){
            System.out.println(brr);
            return;
        }
        brr.add(arr[i]);//add the value to the array
        subSequenceArray(i+1,brr,arr);//take the value 
        brr.remove(brr.size()-1);//remove the last element in the array after return
        subSequenceArray(i+1,brr,arr);//not take the value, means last value will not print;
    }

    //this is same like subsequence recurrsion just here we are adding the sum and target element and comparing them to check the sum target reach if yes then print the subarray ;

    static void targetInArray(int i,int[] arr,List<Integer> brr,int sum,int target){
        if(i>=arr.length){
            if(sum==target){            
                System.out.println(brr);
            }return;
        }
        brr.add(arr[i]);
        sum+=arr[i];
        targetInArray(i+1, arr, brr, sum, target);
        brr.remove(brr.size()-1);
        sum-=arr[i];
        targetInArray(i+1, arr, brr, sum, target);
    }

    // Finds all contiguous subarrays (elements next to each other) that sum up to the target.
    static void targetInSubArray(int[] arr, int target) {
        // 1. Pick a starting point for the subarray.
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            // 2. Explore all possible subarrays starting from index 'i'.
            for (int j = i; j < arr.length; j++) {
                // 3. Add the next element to the current subarray's sum.
                currentSum += arr[j];
                
                // 4. If the sum matches the target, we found a valid subarray.
                if (currentSum == target) {
                    // Create a list and print the found subarray (from i to j).
                    List<Integer> subarray = new ArrayList<>();
                    for (int k = i; k <= j; k++) {
                        subarray.add(arr[k]);
                    }
                    System.out.println(subarray);
                }
            }
        }
    }

    // An optimized O(n) method using the "Sliding Window" technique.
    // NOTE: This method only works for arrays containing NON-NEGATIVE numbers.
    static void targetInSubArraySlidingWindow(int[] arr, int target) {
        int start = 0;
        long currentSum = 0; // Use long to avoid potential overflow if numbers are large
        
        // 'end' pointer expands the window by moving to the right
        for (int end = 0; end < arr.length; end++) {
            // Add the current element to the window's sum
            currentSum += arr[end];
            
            // While sum is greater than target, shrink the window from the left
            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            
            // If the window's sum equals the target, we've found a subarray
            if (currentSum == target) {
                List<Integer> subarray = new ArrayList<>();
                for (int k = start; k <= end; k++) {
                    subarray.add(arr[k]);
                }
                System.out.println(subarray);
            }
        }
    }

    //this returns the count of odd sum in the array and the substring of the array while checking the sum is odd or not 
    static int subArrayOddSum(int i,int sum,int[] arr,List<Integer> brr){
        if(i>=arr.length){
            if(sum%2!=0){
                
                System.out.println(brr);
                return 1;
            }
            return 0;
        }
        brr.add(arr[i]);
        sum+=arr[i];
        int l=subArrayOddSum(i+1, sum, arr, brr);
        brr.remove(brr.size()-1);
        sum-=arr[i];
        int r=subArrayOddSum(i+1, sum, arr, brr);
        return l+r;
    }

    //calls the function and then divide the index into half and then calls again and again until the index is 1 then calls the merge function to sort the elements then return the array;

    static int[] mergesort(int[] arr,int low,int high){
        if(low>=high){
            return null;
        }
        int mid=low+(high-low)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        return merge(arr,low,mid,high);
    }
    static int[] merge(int[] arr,int low,int mid,int high){
        List <Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right<=high) {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
        return arr;
    }

    //here the function call with the same index until the target is mismatched if the target becomes zero then it prints and get the all the demination of it. if the target is mismatched then then the index will be incresed by one and removes the last value form the list;

    static void denomination(int[] arr,int i,int target,List<Integer>brr){
        if(i>=arr.length){
            if(target==0){
                System.out.println(brr);
            }return;
        }
        if(arr[i]<=target){
          brr.add(arr[i]);
            // target-=arr[i];`
            denomination(arr, i, target-arr[i], brr);
            brr.remove(brr.size()-1);
        }
        denomination(arr, i+1, target, brr);
    }
}
