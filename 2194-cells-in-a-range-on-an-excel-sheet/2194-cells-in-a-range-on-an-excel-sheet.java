class Solution {
    public List<String> cellsInRange(String s) {
        // String[] ch = s.split(":");
        ArrayList<String> list = new ArrayList<>();
        int char1= (int)s.charAt(0);
        int char2 =(int)s.charAt(3);
        int  num1 =(int)s.charAt(1);
        int num2=(int)s.charAt(4);
        
        
        for(int i = char1 ; i <=char2 ; i++)
        {
            for(int j = num1 ; j<=num2;j++)
            {String str = "";
                str= str + (char)i+(char)j;
             list.add(str);
            }
            
        }
        return list;
        
    }
}