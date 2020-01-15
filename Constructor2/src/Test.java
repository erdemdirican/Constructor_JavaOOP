
public class Test {
    public static void main(String[] args) {
        
        /*Account account1 = new Account();
        
        System.out.println(account1.getBakiye());*/
        
        Account account2 = new Account("Erdem Dirican", "example@gmail.com", 5879624);
        
        System.out.println(account2.getEmail());
        System.out.println(account2.getBakiye());
    }
    
}
