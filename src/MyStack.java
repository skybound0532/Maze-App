import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyStack<T> implements StackADT<T>
{
    ArrayList<T> stack;
    
    public MyStack<>()
    {
        stack = new ArrayList<>();
    }

    /**
     * Add an item onto the stack
     * @param item the data item to add (of type T)
     */
    public void push(T item)
    {
        stack.add(item);
    }

    /**
     * Remove the top item from the stack
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T pop() 
    {
        if (stack.size() == 0)
        {
            throw new NoSuchElementException();
        }
        else 
        {
            return stack.remove(stack.size());
        }
    }

    /**
     * Display the top item from the stack without removing it
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T top() 
    {
        if (stack.size() == 0)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return stack.get(stack.size());
        }
    /**
     * Find how many items are in the stack
     * @return the number of items in the stack
     */
    public int size()
    {
        /*
        int count = 0;
        for (int i; i<= stack.size(); i++)
        {
            count++;
        }
        */
        return stack.size();
    }

    /**
     * Determine if the stack is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    /**
     * Clear out the data structure
     */
    public void clear()
    {
        stack = new ArrayList<>();
    }
}
