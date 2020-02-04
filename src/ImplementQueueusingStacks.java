public class ImplementQueueusingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        while (!s2.isEmpty())
        s1.push(s2.pop());
      
        s1.push(x);
    }

    public int pop() {
        if(!s2.isEmpty()) {
            return s2.pop();
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
    }

    public int peek() {
        if(!s2.isEmpty()) return s2.peek();
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }

    public boolean empty() {

        return s1.isEmpty() && s2.isEmpty();
    }
}
