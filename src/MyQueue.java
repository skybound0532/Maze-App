import java.util.NoSuchElementException;

public class MyQueue<T> implements QueueADT<T>
{
    Node first;
    Node last;
    int size;
    
    public MyQueue()
    {
        first = null;
        last = null;
        size = 0;
    }

    /**
     * Add an item to the queue
     * @param item the data item to add (of type T)
     */
    public void enqueue(T item)
    {
        Node element = new Node();
        element.data = item;
        
        if(first == null)
        {
            first = element;
            last = element;
        }
        else
        {
            last.next = element;
            last = element;
        }

        size++;
    }

    /**
     * Remove the front item from the queue
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T dequeue()
    {
        if(first == null)
        {
            throw new NoSuchElementException();
        }
        
        Node element = first;
        first = first.next;

        size--;

        return element.data;
    }

    /**
     * Return the front item in the queue without removing it
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T front()
    {
        if(first == null)
        {
            throw new NoSuchElementException();
        }

        return first.data;
    }

    /**
     * Find how many items are in the queue
     * @return the number of items in the queue
     */
    public int size()
    {
        return size;
    }

    /**
     * Determine if the queue is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty()
    {
        return size == 0;
    }

    /**
     * Clear out the data structure
     */
    public void clear()
    {
        first = null;
        last = null;
    }

    private class Node
    {
        public T data;
        public Node next;
    }
}
 