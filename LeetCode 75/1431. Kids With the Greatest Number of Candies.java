import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        for (int n : candies) {
            if (n > max) {
                max = n;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int n : candies) {
            result.add(n + extraCandies >= max);
        }

        return result;
    }
}
