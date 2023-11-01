public class MyQueueTest
{
    public static void main(String[] args)
    {
        MyQueue<String> q = new MyQueue<>();
        q.enqueue("bob");
        q.enqueue("billy");
        q.enqueue("joe");
        q.enqueue("bob");
        q.enqueue("smith");
        q.enqueue("will");

        System.out.println(q.size());
        System.out.println(q.front());
        
        while(!q.isEmpty())
        {
            System.out.println(q.dequeue());
        }
    }
}
