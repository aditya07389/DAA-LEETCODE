class Solution {
    public int minPartitions(String n) {
        int max = 0;
        char charr[] = n.toCharArray();
        for(int i=0; i<charr.length; i++){
            if(max < charr[i]-'0')  max = charr[i]-'0';
        }
        return max;
    }
}
