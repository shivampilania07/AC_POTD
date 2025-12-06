public class P_1 {
    class Solution {
    public int GCD(int a,int b){
        int temp=0;
        while(b!=0){
             temp = b;
            b = a %b;
            a = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int n:nums){
             smallest = Math.min(smallest,n);
             largest = Math.max(largest,n);
        }

        return GCD(largest,smallest); 
        
         
/* 
         Arrays.sort(nums);
        int x = nums[0];
        int y = nums[nums.length-1];

       return GCD(x,y);  */
       
        
        
    }
}
}
