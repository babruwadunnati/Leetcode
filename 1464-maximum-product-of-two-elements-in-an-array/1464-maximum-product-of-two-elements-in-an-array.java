import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
//         int max = 0;
//         int secmax = 0;
//         for(int i=0;i<nums.length;i++){
//             if (nums[i]>=max){
//                 secmax = max;
//                 max = nums[i];
//             }

            
//         }
//         System.out.println(secmax+" "+(max));
//         System.out.println((secmax-1)*(max-1));
//         return (secmax-1)*(max-1);
        
        //Insert in a max heap
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b) -> b-a);
        for (int num: nums){
            maxheap.offer(num);
        }
        int num1 =  maxheap.poll();
        int num2 = maxheap.poll();
        return ((num1-1)*(num2-1));
        
    }
}