class Solution {
    public boolean checkDivisibility(int n) {
        //isme we have to find the sum and product of the two numbers
        int sum=0;
        int m=n;
        while(m>0){
            sum=sum+(m%10);
            m=m/10;
        }
        int prod=1;
        int o=n;
        while(o>0){
            prod=prod*(o%10);
            o=o/10;
        }
        //ab aa gyi hai hamare paas sum aurr product ki value 
        if(n%(sum+prod)==0){
            return true;
        }
        return false;

    }
}