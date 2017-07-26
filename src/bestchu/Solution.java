package bestchu;

public class Solution {
    public boolean isMatch(String s, String p) {
        if(s == null || p == null){
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = p.toCharArray();
        return match(a,b,0,0);
    }
    
    public static boolean match(char[] s,char[] p, int sLen, int pLen){
        if(sLen == s.length && pLen == p.length){
            return true;
        }
        if(sLen != s.length && pLen == p.length){
            return false;
        }
        if(p.length > 1 && p[pLen+1] == '*'){
            if(s[sLen] == p[pLen] || (p[pLen]) == '.' && sLen != s.length){
                return match(s,p,++sLen,pLen=pLen+2) || match(s,p,++sLen,pLen) || match(s,p,sLen,pLen=pLen+2);
            }else{
                return match(s,p,++sLen,pLen=pLen+2);
            }
        }
        if(s[sLen] == p[pLen] || (p[pLen] == '.' && sLen != s.length))
            return match(s,p,++sLen,++pLen);
        return false;
    }
}
