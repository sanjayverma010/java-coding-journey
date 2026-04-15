public class HandalAbnormalTermination {
    public static void main(String[] args) {
        try{
        HandalAbnormalTermination ht = new HandalAbnormalTermination();
        
        ht.divide();
        }
        catch(Exception e)
        {
            
        }
    }
    void divide (){
        int a =100,b=0,c;
        c = a/b;
        System.out.println(c);

    }
}
