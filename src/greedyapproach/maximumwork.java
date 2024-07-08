package greedyapproach;

public class maximumwork {
    public static int selectMaxActivities(int[] start, int[] end) {
        int n = start.length;
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }
        int count = 1;
        int lastSelectedEnd = activities[0][1];
        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastSelectedEnd) {
                count++;
                lastSelectedEnd = activities[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        System.out.println(selectMaxActivities(start, end));
    }
}
