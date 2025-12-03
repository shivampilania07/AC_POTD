public class P_1 {
  class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
      int n = nums1.length;
      int m = nums2.length;
      int o = nums3.length;

      Set<Integer> set = new HashSet<>();
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (nums1[i] == nums2[j]) {
            set.add(nums1[i]);
          }
        }
      }

      for (int i = 0; i < m; i++) {
        for (int j = 0; j < o; j++) {
          if (nums2[i] == nums3[j]) {
            set.add(nums2[i]);
          }
        }
      }

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < o; j++) {
          if (nums1[i] == nums3[j]) {
            set.add(nums1[i]);
          }
        }
      }

      return new ArrayList<>(set);

    }
  }
}
