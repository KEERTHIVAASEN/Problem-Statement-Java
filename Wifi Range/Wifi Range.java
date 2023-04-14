class Solution {
    boolean wifiRange(int N, String S, int X) 
{     
    boolean[] wifiCoverage = new boolean[N];
     for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                for (int j = Math.max(0, i - X); j <= Math.min(N - 1, i + X); j++) {
                    wifiCoverage[j] = true;
                }
  }
        }
              for (int i = 0; i < N; i++) {
                    if (!wifiCoverage[i]) {
                return false;
                          }
        	}
        return true;
    }