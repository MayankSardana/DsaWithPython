class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String str = countAndSay(n - 1);
        StringBuilder s = new StringBuilder("");
        char prev = str.charAt(0);
        int cn = 1;
        for(int i = 1;i<str.length();i++)
        {
            char curr_ch = str.charAt(i);
            if(curr_ch==prev){
                cn++;
            }else{
                s.append(cn);
                s.append(prev);
                prev = curr_ch;
                cn = 1;
            }
        }
        s.append(cn);
        s.append(prev);
        System.out.println("s " + s);
        return s.toString();
    }
}
