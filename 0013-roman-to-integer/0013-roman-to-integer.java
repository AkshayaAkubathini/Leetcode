class Solution {
    public int romanToInt(String s) 
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(i<s.length()-1 && ch=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X'))
            {
                sum-=1;
            }
            else if(i<s.length()-1 && ch=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C'))
            {
                sum-=10;
            }
            else if(i<s.length()-1 && ch=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M'))
            {
                sum-=100;
            }
            else if(ch=='I')
            {
                sum+=1;
            }
            else if(ch=='V')
            {
                sum+=5;
            }
            else if(ch=='X')
            {
                sum+=10;
            }
            else if(ch=='L')
            {
                sum+=50;
            }
            else if(ch=='C')
            {
                sum+=100;
            }
             else if(ch=='D')
            {
                sum+=500;
            }
            else if(ch=='M')
            {
                sum+=1000;
            }
        }
        return sum;
    }
}