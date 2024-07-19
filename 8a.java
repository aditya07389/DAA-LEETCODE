public class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        int[] pos = new int[n];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                pos[count++] = i;
            }
        }
        
        long swap = 0;
        int targetPos = n - count;
        
        for (int i = 0; i < count; i++) {
            swap += (targetPos + i - pos[i]);
        }
        
        return swap;
    }
}
