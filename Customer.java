public class Customer extends Thread{
    private String name;
    private Account account;
    private Object monitor;
    
    public Customer(String name, Account account, Object monitor){
        this.name = name;
        this.account = account;
        this.monitor = monitor;
    }    
    
    public void transfer(){
        synchronized(monitor){
           double value = account.read();
           value += 50;
           System.out.println(name + " überweist: 50 €");
           account.write(value);
        }
    }
    
    @Override
    public void run(){
        for(int i = 0; i < 5; i++)
          transfer();
    }
}


