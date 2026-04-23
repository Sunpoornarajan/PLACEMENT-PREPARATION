class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int n : nums)
            set.add(n);

        int max = 0;

        for (int num : set) {   
            if (!set.contains(num - 1)) {

                int curr = num;
                int currLength = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    currLength++;
                }

                max = Math.max(max, currLength);
            }
        }

        return max;
    }
}