public class matchABC {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "ACCAABBC";
        System.out.println(match(s));

    }

    public static String match(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(stack.isEmpty()) {
                stack.push(ch);
            }else if(stack.peek() == ch) {
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
