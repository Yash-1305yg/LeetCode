class Solution {
    public String interpret(String co) {
        char[] c= co.toCharArray();
        String s = "";
        
        for(int i = 0 ;i < c.length ; i++)
        {
            if(c[i] == 'G')
                s= s + "G";
            else if(c[i] == '(' && c[i+1] != 'a')
                s= s + "o";
            else if(c[i] == '(' && c[i+1] == 'a')
                s= s + "al";
        }
        return s;
    }
}