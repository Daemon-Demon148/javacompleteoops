package javalabexp;
//used argumnement as stringbuffer 
public class exp8que2 {
    static String LowerToUpper(StringBuffer s) {
        String result = ("");
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            
            //check valid alphabet and it is in lowercase
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                ch = (char)(s.charAt(i) - 32);
            }
            //else keep the same alphabet or any character
            else {
                ch = (char)(s.charAt(i));
            }
            // this + concatenation sign can't be used with stringBuffer unlike in Strings
            result =result + ch; // concatenation, append c to result
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(LowerToUpper(new StringBuffer("IncludeHelp.com")));
        System.out.println(LowerToUpper(new StringBuffer("www.example.com")));
        System.out.println(LowerToUpper(new StringBuffer("123abcd@9081")));
        System.out.println(LowerToUpper(new StringBuffer("OKAY@123")));       
    }
}


