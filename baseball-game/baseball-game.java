class Solution {
    public int calPoints(String[] ops) {
        Stack<String> stack = new Stack<>();

        for(String op : ops) {
            if("+".equals(op)) {
                String lastFirst = stack.pop();
                String lastSecond = stack.pop();
                String plus = Integer.toString(Integer.parseInt(lastFirst) + Integer.parseInt(lastSecond));
                stack.push(lastSecond);
                stack.push(lastFirst);
                stack.push(plus);
            } else if("D".equals(op)) {
                String previous = stack.peek();
                stack.push(Integer.toString(Integer.parseInt(previous) * 2));
            } else if("C".equals(op)) {
                stack.pop();
            } else {
                stack.push(op);
            }
        }

        int sum = stack.stream().mapToInt(value -> Integer.parseInt(value)).sum();
        
        return sum;
    }
}