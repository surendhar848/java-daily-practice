import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            // Check if intervals overlap
            if (current[1] >= intervals[i][0]) {
                // Merge intervals by updating the end
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // No overlap, add current interval to list
                merged.add(current);
                current = intervals[i];
            }
        }

        // Add the last interval
        merged.add(current);

        // Convert List to array
        return merged.toArray(new int[merged.size()][]);
    }

    // Test
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
