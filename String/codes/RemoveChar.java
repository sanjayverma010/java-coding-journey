public class RemoveChar {
    public static void main(String[] args)
    {
        String s = "s,dsloe;ri9shhanbetw348uerf n.sdkzufso";
        char ch = 's';

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray())
        {
            if(c != ch)
            {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
