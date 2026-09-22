public class mj009 {
    public static void main(String[] args) {
        Account account1 = new Account("hzh001", "normal");
        Account account2 = new Account("hzh002", "risk");
        Account account3 = new Account("hzh003", "breaked");
        Account[] accounts = {account1, account2, account3};

        accounts[1].accountStatus = "active";

        System.out.println("============ 账号列表 ============");
        for (Account acc : accounts) {
            System.out.println("账号名：" + acc.accountName + "，状态：" + acc.accountStatus);
        }
        System.out.println("==================================");
    }
}
class Account {
    String accountName;   
    String accountStatus; 
    
    public Account(String accountName, String accountStatus) {
        this.accountName = accountName;
        this.accountStatus = accountStatus;
    }
}