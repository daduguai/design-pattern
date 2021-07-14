package SingleTon;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

//线程内单例
public class IdGenerator_Thread {
    private AtomicLong id=new AtomicLong(0);

    private static final ConcurrentHashMap<Long,IdGenerator_Thread>instance=new ConcurrentHashMap<Long,IdGenerator_Thread>();

    private IdGenerator_Thread(){}

    public static IdGenerator_Thread getInstance(){
        Long currentThreadId=Thread.currentThread().getId();
        instance.putIfAbsent(currentThreadId,new IdGenerator_Thread());
        return instance.get(currentThreadId);
    }

    public long getId(){
        return id.incrementAndGet();
    }
}

