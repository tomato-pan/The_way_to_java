public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}
    //适用于单线程环境
    public static Singleton getInstance(){
        if (null==instance){
            instance=new Singleton();
        }
        return instance;
    }
    //适用多线程一般不用
    public static synchronized Singleton getInstanceA(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    //双重检测加锁
    public static Singleton getInstanceB(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
//    静态内存式
//    private static class SingletonHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//    private Singleton (){}
//    public static final Singleton getInstance() {
//        return SingletonHolder.INSTANCE;
//    }
}
