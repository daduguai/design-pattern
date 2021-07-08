package SingleTon;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator_StaticInnerClass {
    private AtomicLong id=new AtomicLong(0);
    private IdGenerator_StaticInnerClass(){}
    private static class SingletonHolder{
        private static final IdGenerator_StaticInnerClass instance=new IdGenerator_StaticInnerClass();
    }
    private static IdGenerator_StaticInnerClass getInstance(){
        return SingletonHolder.instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}

//instance的唯一性、创建过程的线程安全性，都由JVM保证