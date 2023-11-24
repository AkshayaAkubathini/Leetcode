class Solution
{
    public void nextPermutation(int[] nums) 
    {
        int n = nums.length;
        int i;
        for (i = n - 2; i >= 0; --i)
        {
            if (nums[i] < nums[i + 1])
            {
                break;
            }
        }
        if (i >= 0)
        {
            for (int j = n - 1; j > i; --j)
            {
                if (nums[j] > nums[i]) 
                {
                    int temp = nums[i];
                     nums[i] = nums[j];
                     nums[j] = temp;
                    break;
                }
            }
        }
        reverse(nums, i + 1, n - 1);
     }
     public void reverse(int[] nums, int l, int r) 
     {
            while (l < r)
            {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l+=1;
                r-=1;
            }   
     }

  
}