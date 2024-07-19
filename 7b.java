class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Step 1: Sort the points based on their Euclidean distance from the origin
        Arrays.sort(points, new Comparator<int[]>() {
            
            public int compare(int[] a, int[] b) {
                return Integer.compare(distance(a), distance(b));
            }
            
            private int distance(int[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        });

        // Step 2: Return the first k points from the sorted list
        return Arrays.copyOfRange(points, 0, k);
    }
}
