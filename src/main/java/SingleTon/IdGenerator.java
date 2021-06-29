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
//单例模式主要考虑点：
//1.是否支持延迟加载
//2.构造函数位private
//3.线程安全
//4.性能
