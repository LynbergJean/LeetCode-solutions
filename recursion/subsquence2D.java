
import java.util.ArrayList;
import java.util.List;

class subsquence2D{
    public static void main(String[] args) {
        List<String> val = perm("ABC");
    }

    static List<String> perm(String s)
    {
        List<String> r = new ArrayList<>();

        if(s.isEmpty())
        {
            r.add("");
            return r;
        }

        char c = s.charAt(0);
        
        List<String> k = perm(s.substring(1));

        for(String d : k)
        {
            r.add(c + d);
            r.add(d);
        }

        return r;
    }
}