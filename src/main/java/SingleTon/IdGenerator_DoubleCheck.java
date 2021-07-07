package SingleTon;

public class IdGenerator_DoubleCheck {
    private static IdGenerator_DoubleCheck instance;
    private IdGenerator_DoubleCheck(){}
    public IdGenerator_DoubleCheck getInstance(){
        if(instance==null){
            synchronized (IdGenerator_DoubleCheck.class){
                if(instance==null){
                    instance=new IdGenerator_DoubleCheck();
                }
            }
        }
        return instance;
    }

}
//双重检查，没有用volatile，因为高版本的java已经将new变成原子操作