public class Problem1266 {
    public int minTimeToVisitAllPoints(int[][] points) {

        int seconds = 0;
        for (int i = 1; i < points.length; i++) {
            int x1 = points[i - 1][0];
            int y1 = points[i - 1][1];

            int x2 = points[i][0];
            int y2 = points[i][1];

            int dx = Math.abs(x1 - x2);
            int dy = Math.abs(y1 - y2);

            seconds += Math.max(dx, dy);
        }
        return seconds;
    }
}
