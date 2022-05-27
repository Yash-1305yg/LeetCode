// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    
		    //appending result to a String
		    for(int i=0; i<res.size(); i++){
		        str.append(res.get(i)+" ");
		    }
		    
		    //printing the String
		    System.out.println(str);
		}
		
	}
}
// } Driver Code Ends


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        // ArrayList<Integer> res = new ArrayList<>();
        // int max_right = arr[n-1];
        // res.add(arr[n-1]);
        // for(int i = n-2 ; i>=0 ;i--){
        //     if(max_right < arr[i]){
        //         max_right = arr[i];
        //         res.add(arr[i]);
        //     }
        // }
        // Collections.reverse(res);
        // return res;
         ArrayList <Integer> ans = new ArrayList<>();
       if(n==0) return ans;
       ans.add(arr[n-1]);
       int max = arr[n-1];
       for(int i=n-2;i>=0;i--){
           if(max<=arr[i]){
               max = arr[i];
               ans.add(arr[i]);
           }
       }
       Collections.reverse(ans);
       return ans;
    }
}
