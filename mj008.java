public class mj008 {
    public static void main(String[] args){
        Account myAccount = new Account("hzh001","xingyuu","123456","normal","2026年9月1日");
        System.out.println("===========   账号信息卡  ===========");
        System.out.println("账号名为：" + myAccount.accountName);
        System.out.println("昵称为：" + myAccount.nickName);
        String safeHash = "nq93ey7ht4hctykct8t7h4";
        System.out.println("密码摘要为：" + safeHash);
        System.out.println("账号状态为：" + myAccount.accountStatus);
        System.out.println("创建时间为：" + myAccount.createTime);
        System.out.println("=====================================");
    }
}
class Account {
    String accountName;
    String nickName;
    String passWordHash;
    String accountStatus;
    String createTime;

    public Account (String accountName,String nickName,String passWordHash,String accountStatus,String createTime){
        this.accountName = accountName;
        this.nickName = nickName;
        this.passWordHash = passWordHash;
        this.accountStatus = accountStatus;
        this.createTime = createTime;
    }
}
