class Solution {
    public int fib(int n) {
         if(n==1)
        {
            return 1;
        }
        if(n==0)
        {
          return 0;
        }
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        int fib=fib1+fib2;
        return fib;
    }
}