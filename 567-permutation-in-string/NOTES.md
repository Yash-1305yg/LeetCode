for(int j=0 ; j<=s2.length()-s1.length();j++)
{
int[] arr2 = new int[26];
for(int k =0;k<s1.length();k++)
{
arr2[s2.charAt(j+k) -'a']++;
}
isme pehla wala outer loop mien s2-s1 length isie dali hai taki wo choti wali string ki length ke barabar s2 ko compare kar sake or andar wala loop out of bound na jae index out na jae islie