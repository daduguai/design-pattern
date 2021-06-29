package SingleTon;

import java.util.concurrent.atomic.AtomicLong;
//懒汉模式
public class IdGenerator_Lazy {
    private static IdGenerator_Lazy instance;
    private AtomicLong id = new AtomicLong(0);
    private IdGenerator_Lazy(){}

    synchronized public static IdGenerator_Lazy getInstance(){
        if(instance==null){
            instance=new IdGenerator_Lazy();
        }
        return instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
