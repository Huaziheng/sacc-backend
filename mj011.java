import java.util.ArrayList;
import java.util.List;
class Account{
    private final String username;
    private final String passwordHash;
    public Account(String username, String passwordHash){
        this.username = username;
        this.passwordHash = passwordHash;
}
public String getUsername(){
    return username;
}
public String getPasswordHash(){
    return passwordHash;
}
}
class PasswordEncryptor{
    public String encrypt(String rawPassword){
        return "secret" + rawPassword;
    }
}
class AccountRepository {
    private final List<Account> storage = new ArrayList<>();
    public void save(Account account) {
        storage.add(account);
        System.out.println("[仓库层] 账号 " + account.getUsername() + " 已保存");
    }
}
class WelcomeNotifier {
    public void notify(String username) {
        System.out.println("Hello World!");
        System.out.println("[通知] 欢迎你，" + username);
    }
}
public class mj011 {
    public static void main(String[] args) {
        PasswordEncryptor encryptor = new PasswordEncryptor();
        AccountRepository repository = new AccountRepository();
        WelcomeNotifier notifier = new WelcomeNotifier();
        String username = "cqx";
        String rawPassword = "123456";
        String passwordHash = encryptor.encrypt(rawPassword);
        Account newAccount = new Account(username, passwordHash);
        repository.save(newAccount);
        notifier.notify(username);
    }
}

    

