import java.util.*;

class HashMapeuse {
    public static void main(String[] args)
    {
        String s = "s,dsloe;ri9shhanbetw348uerf n.sdkzufso";

        HashMap<Character, Integer> hs = new HashMap<>();

        char[] c = s.toCharArray();

        for(char ch : c)
        {
            if(hs.containsKey(ch))
            {
                hs.put(ch, hs.get(ch) + 1);
            }
            else{
                hs.put(ch, 1);
            }
        }

        int maxcount = 0;
        char maxchar = ' ';

        for(Map.Entry<Character, Integer> me : hs.entrySet())
        {
            if(maxcount < me.getValue())
            {
                maxcount = me.getValue();
                maxchar = me.getKey();
            }
        }

        System.out.println(maxchar);
    }
}