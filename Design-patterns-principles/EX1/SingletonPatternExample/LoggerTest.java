package SingletonPatternExample;

public class LoggerTest{
    public static void main(String[]args){
        Logger logger1=Logger.getInstance();
        logger1.log("First msg-6429486");
        Logger logger2=Logger.getInstance();
        logger2.log("Second msg-Akshaya V");
        if(logger1==logger2){
            System.out.println("Singleton verified(Both logger instances are the same).");
        }else{
            System.out.println("Singleton failed(Different logger instances exist)");
        }
    }
}
