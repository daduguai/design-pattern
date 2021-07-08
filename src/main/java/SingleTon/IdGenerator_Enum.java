package SingleTon;

import java.util.concurrent.atomic.AtomicLong;

public enum IdGenerator_Enum {
    INSTANCE;
    private AtomicLong id=new AtomicLong();

    public long getId(){
        return id.incrementAndGet();
    }
}
