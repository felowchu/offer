package offer;

public class RegularExpersion2 {
	public boolean isMatch(String s, String p) {
        if((s == null || s.length() == 0) && (p == null || p.length() == 0)) return true;
        if(p == null || p.length() == 0) return false;
        boolean[][] dp= new boolean[s.length()+1][p.length() + 1];
        dp[0][0] = true;
        for(int i = 1; i <= p.length(); i++)
        {
            if(i > 1 && (p.charAt(i-1) == '*' && dp[0][i-2]))
                dp[0][i] = true;
        }
        
        for(int si = 1; si <= s.length(); si++)
        {
            for(int pi = 1; pi <= p.length(); pi++)
            {
                if(p.charAt(pi-1) == s.charAt(si-1) || p.charAt(pi-1) =='.')
                    dp[si][pi] = dp[si-1][pi-1];
                else if(p.charAt(pi-1) =='*')
                {
                    if(p.charAt(pi-2) != s.charAt(si-1) && p.charAt(pi-2) != '.')
                        dp[si][pi] = dp[si][pi-2];
                    else
                        dp[si][pi] =  dp[si][pi-2] || dp[si][pi-1] || dp[si-1][pi];
                }
                else
                    dp[si][pi] = false;
                
            }
        }
        return dp[s.length()][p.length()];
    }
}
