package learn;

public class distinctSub {
	
	public static int countDistinctSubsequences(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; 

        int[] last = new int[256]; 
        for (int i = 0; i < last.length; i++) {
            last[i] = -1; 
        }

        for (int i = 1; i <= n; i++) {
            dp[i] = 2 * dp[i - 1]; 
            char ch = s.charAt(i - 1);
            if (last[ch] != -1) {
                dp[i] -= dp[last[ch]]; 
            }
            last[ch] = i - 1; 
        }

        return dp[n] - 1; 
    }

    public static void main(String[] args) {
        String input = "var";
        int distinctCount = countDistinctSubsequences(input);
        System.out.println("Count of distinct subsequences: " + distinctCount);
    }
	}

