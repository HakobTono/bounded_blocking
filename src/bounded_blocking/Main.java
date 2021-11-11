package bounded_blocking;

public class Main {
   private static BoundedBlockingBuffer <String >boundedBlockingBuffer = new BoundedBlockingBuffer<>();

    public static void main(String[] args) {
        ThreadPut threadPut = new ThreadPut(boundedBlockingBuffer);
        ThreadTake threadTake = new ThreadTake(boundedBlockingBuffer);

        Thread thread = new Thread(threadPut);
        thread.start();
        Thread thread1 = new Thread(threadTake);
        thread1.start();
    }
}
