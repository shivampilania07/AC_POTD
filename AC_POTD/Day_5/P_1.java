package AC_POTD.Day_5;

public class P_1 {
    class Solution {
        public int countSymmetricIntegers(int low, int high) {
            int count = 0;
            for (int i = low; i <= high; i++) {
                String s = String.valueOf(i);
                int len = s.length();

                if (len % 2 != 0)
                    continue;

                int half = len / 2;

                int sum1 = 0;
                for (int j = 0; j < half; j++) {
                    sum1 += s.charAt(j) - '0';
                }

                int sum2 = 0;
                for (int j = half; j < len; j++) {
                    sum2 += s.charAt(j) - '0';
                }

                if (sum1 == sum2)
                    count++;
            }

            return count;
        }
    }
}
