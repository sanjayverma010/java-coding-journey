import java.util.*;
class itrDemo
{
    public static void main(String[] args) {
        
        List l = new ArrayList();
        l.add(10);
        l.add("sanjay");
        l.add(300);

        System.out.println(l);

        Iterator itr = l.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}