class validId{
    static boolean consecutive(int num){
        int c=0, d1, d2;
        while(num!=0){
            d1=num%10;
            num=num/10;
            d2=num%10;

            if(d1==d2)
                ++c;
        }
        if(c>0)
            return false;
        return true;
    }

    static boolean sum(int num){
        int sm=0, c=0;
        while(num!=0){
            sm += num%10;
            num /= 10;
        }

        if(sm == 7 || sm == 11 || sm == 13)
            return false;
        return true;
    }

    public static void main(String[] args){
        int c=0;
        for(int i = 100000; i < 1000000; i++){
            if(consecutive(i) && sum(i))
                ++c;
        }
        System.out.println("Total valid identifier = "+ c);
    }
}