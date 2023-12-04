class Solution {
    public String largestGoodInteger(String num) 
    {
        String res="";
        for(int i=9;i>=0;i--)
        {
            String s = String.valueOf(i);
            s+=String.valueOf(i);
            s+=String.valueOf(i);
            if(num.contains(s))
            {
                return s;
            }
        }
        return res;
    }
}