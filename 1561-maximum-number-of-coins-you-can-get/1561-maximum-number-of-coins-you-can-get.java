class Solution {
    public int maxCoins(int[] piles) 
    {
        Arrays.sort(piles);
        int j=piles.length-2;
        int sum=0;
        for(int i=0;i<piles.length/3;i++)
        {
            sum+=piles[j];
            j-=2;
        }
        return sum;
    }
}