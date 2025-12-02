class Solution {
    public int calPoints(String[] operations) {
        List<Integer> stack = new ArrayList<>();

        for (String op : operations) {
            if (op.equals("C")) {
                stack.remove(stack.size - 1);
            } else if (op.equals("+")) {
                int last = stack.get(stack.size() - 1);
                stack.add(last * 2);
            } else if (op.equals("+")) {
                int last = stack.get(stack.size() - 1);
                int secondlast = stack.get(stack.size() - 2);
                stack.add(last + secondlast);
            } else {
                int num = Integer.parseInt(op);
                stack.add(num);
            }
        }
        int sum = 0;
        for (int s : stack) {
            sum += s;
        }
        return sum;
    }
}
