package SingleTon;

//解决单例无法进行有参数的构造函数，因为单例的构造函数都是private,对象的实例化只能在类内
public class Singleton {
    private static Singleton instance=null;
    private final int paramA;
    private final int paramB;
    private Singleton(int paramA,int paramB){
        this.paramA=paramA;
        this.paramB=paramB;
    }
    public static Singleton getInstance(){
        if(instance==null){
            throw new RuntimeException("Run init() first");
        }
        return instance;
    }

    public synchronized static Singleton init(int paramA,int paramB){
        if(instance!=null){
            throw new RuntimeException("Singleton has been created!");
        }
        instance=new Singleton(paramA,paramB);
        return instance;
    }
}
