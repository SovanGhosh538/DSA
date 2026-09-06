class Solution {
public:
    bool checkDivisibility(int n) {
        int sum=0,mul=1,copy=n;
        while(n>0){
            sum=sum+(n%10);
            mul=mul*(n%10);
            n=n/10;
        }
        if(copy%(sum+mul)==0)
            return true;
        else
            return false;
    }
};