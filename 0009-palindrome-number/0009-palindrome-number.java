class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int rev = 0;
        if(x==0)
            return true;
        if(x<0 || x%10==0) //The two examples given. Number is negative and number is a multiple of 10 . Then it is not a palindorme
            return false;
        else{
            //Do the reversing
            while(x!=0){
                rev = rev*10 + x %10;
                x = x/10;
                
                
            }
            
        }
        if (rev==num)
            return true;
        else{
            return false;
        }
            
        
    }
}