

class returnArray{
    public static void main(String[] args) {
        String res = skip("", "baccab");
        System.out.println(res);

        String res1 = skip( "bccb");
        System.out.println(res1);

    }
    static String skip (String p, String up)
    {
        //up has the actuall string and p has what we need to print
        //base worst that could have happen emtpy string
        if(up.isEmpty())
        {
            return p;
        }
        //its not empty what to do
        //check if char is a if it is skip it else add it to the string p
        char ch = up.charAt(0);
            //skip current character and return the next one up to null
        if(ch == 'a')
        {
            return skip(p,up.substring(1));
        }else{
            return skip(p + ch, up.substring(1));
        }
    }

    static String skip(String up)
    {
        if(up.isEmpty())
            return "";

        char ch = up.charAt(0);

        if(ch == 'a')
        {
            return "" ;
        }else{
            

            return ch + skip(up.substring(1));
        }
        
    }
}