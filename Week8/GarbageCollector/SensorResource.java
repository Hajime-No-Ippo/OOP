package GarbageCollector;
import java.lang.ref.Cleaner;
import java.util.concurrent.atomic.AtomicBoolean;

class SensorResource implements AutoCloseable {
    private static final Cleaner CLEANER = Cleaner.create();
    private final AtomicBoolean closed = new AtomicBoolean(false);
    private final Cleaner.Cleanable cleanable;

    public static final class State implements Runnable {
        private final AtomicBoolean closed;

        State(AtomicBoolean closed) {
            this.closed = closed;
        }

        @Override
        public void run(){
            if (closed.compareAndSet(false, true)) {
                System.out.println("Resource");
            }
        }
    }

    SensorResource() {
        State state = new State(closed);
        this.cleanable = CLEANER.register(this, state);
    }

    @Override
    public void close() {
        // Trigger cleanup immediately; Cleaner ensures idempotency.
        cleanable.clean();
    }
}
