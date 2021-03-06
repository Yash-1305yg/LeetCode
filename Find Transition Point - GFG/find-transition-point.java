// { Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        int lo =0;
        int hi = n;
        if(arr[0]==1){
        return 0;
    }
    
    if(arr[n-1]==0){
        return -1;
    }
      
        while(lo <=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == 1 && arr[mid-1]==0)
            {
                
                    return mid;
            }
            else if(arr[mid]==0 && arr[mid+1]==1){
                return mid+1;
            }
            else{
                if(arr[mid]==1)
                    hi=mid-1;
                else
                    lo = mid+1;
            }
        }
        return -1;
    }
}