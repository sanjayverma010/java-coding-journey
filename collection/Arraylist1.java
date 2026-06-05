import java.util.ArrayList;

class Arraylist1 
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        System.out.println(al);
        al.add("sanjay");
        al.add('v');
        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add(10);
        al2.add("aaa");
        al2.add("dssff");
        al2.add("bdmnsdf");
       

        al.addAll(al2);
        
        System.out.println(al2);
        System.out.println(al);

        System.out.println(al2.contains("aaa"));

        System.out.println(al.isEmpty());
        al.removeAll(al2);

        System.out.println(al);

        al.clear();
        System.out.println(al);
    }
} 
