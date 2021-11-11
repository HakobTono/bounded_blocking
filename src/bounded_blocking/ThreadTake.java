package bounded_blocking;

public class ThreadTake implements Runnable{
private final BoundedBlockingBuffer <String> boundedBlockingBuffer;

    public ThreadTake(BoundedBlockingBuffer<String> boundedBlockingBuffer) {
        this.boundedBlockingBuffer = boundedBlockingBuffer;
    }

    @Override
    public void run() {
        try {
            System.out.println(boundedBlockingBuffer.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
