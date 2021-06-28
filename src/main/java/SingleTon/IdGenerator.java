package SingleTon;

import java.util.concurrent.atomic.AtomicLong;

//饿汉模式ID生成器
public class IdGenerator {
    private static final IdGenerator instance=new IdGenerator();//加上final的目的是啥
    private AtomicLong id=new AtomicLong(0);
    private IdGenerator(){
    }
    public static IdGenerator getInstance(){
        return instance;
    }
    public long getId(){
        return id.incrementAndGet();
    }
}
