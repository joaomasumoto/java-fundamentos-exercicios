import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> thereIsTwice = new HashSet<>();

        for (int num : nums) {
            if (thereIsTwice.contains(num)) {
                return true;
            }
            thereIsTwice.add(num);
        }

        return false;
    }
}
