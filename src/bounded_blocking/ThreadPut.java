package bounded_blocking;

public class ThreadPut implements Runnable {
private  final BoundedBlockingBuffer <String> boundedBlockingBuffer;

        public ThreadPut(BoundedBlockingBuffer<String> boundedBlockingBuffer) {
                this.boundedBlockingBuffer = boundedBlockingBuffer;
        }

        @Override
        public void run() {
                try {
                        boundedBlockingBuffer.put("Hakob");
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}
