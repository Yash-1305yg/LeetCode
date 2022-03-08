// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        int n = arr.size();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        func(0 ,arr, list,list2 ,n);
        return list2;
    }
    static void func(int i ,ArrayList<Integer> arr, ArrayList<Integer> list,ArrayList<Integer> list2,int n)
    {
        if(i>=n)
        {
            int sum=0;
            for(int kk: list)
            {
                sum = sum+kk;
            }
            list2.add(sum);
            return;
        }

        // to pick condition
        list.add(arr.get(i));
        func(i+1,arr,list,list2,n);
        list.remove(new Integer(arr.get(i))); // we used this because it was giving out of bound error , arraylist has 2 method to remove so we used object
        //to not pick ocndition
        func(i+1,arr,list,list2,n);

//        func(i+1,arr,list,n);  // to print in reverse order
//        list.add(arr[i]);
//        func(i+1,arr,list,n);
//        list.remove(new Integer(arr[i]));
    }
    
}