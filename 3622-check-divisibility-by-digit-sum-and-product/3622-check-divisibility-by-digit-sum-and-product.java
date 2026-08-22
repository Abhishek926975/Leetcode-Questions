class Solution {
    public boolean checkDivisibility(int n) {
      
        // by using simple modular method

        // int sum=0;
        // int temp=n;
        // int product=1;

        

        //     while(temp>0){
        //         int digit=temp%10;

        //         sum+=digit;
        //         product*=digit;


        //         temp/=10;
        //     }

        // int divisor=sum+product 

        // if(divisor==0) return false;

        // return n%divisor ==0;


        int sum=0, product=1;
        int original=n;

        while(n!=0){
            int digit=n%10;

            sum+=digit;
            product*=digit;


            n/=10;
        }

        int add=sum+product;


        if(original % add ==0){
            return true;
        }

        else{
            return false;
        }


        




    }
}