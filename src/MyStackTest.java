

public class MyStackTest {

    public static void main(String[] args)
    {
        MyStack<String> stack = new MyStack<>();
        stack.push("bob");
        stack.push("joe");
        stack.push("billy");
        stack.push("smith");
        stack.push("bob");
        stack.push("bobbette");

        System.out.println(stack.top());
        System.out.println(stack.size());
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}
