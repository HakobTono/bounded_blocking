package bounded_blocking;

public class BoundedBlockingBuffer<T> {
    private T data;

    public synchronized void put(T data) throws InterruptedException {
        while (this.data != null) {
            wait();
        }
        this.data = data;
        notify();
    }

    public synchronized T take() throws InterruptedException {
        while (this.data == null) {
            wait();
        }T element = data;
        data=null;
        notify();
        return element;
    }
}
