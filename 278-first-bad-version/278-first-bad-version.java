/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i=1 , j=n;
        int res=0;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(isBadVersion(mid) == false)
            {
                i=mid+1;
            }
            else if(isBadVersion(mid) == true)
            {
                res = mid;
                j=mid-1;
            }
        }
        return res;
    }
}