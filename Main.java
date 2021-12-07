public class Main {
   private Account account;
   private Object monitor;
   private Customer maier; 
   private Customer huber;
   
   public Main(){
     account = new Account(1000);
     monitor = new Object();
     maier = new Customer("Maier", account, monitor);
     huber = new Customer("Huber",account, monitor);
     maier.start();
     huber.start();
   }
   
}
