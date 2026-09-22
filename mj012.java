public class mj012 {
    public static void main(String[] args){
        String accountName = "    cqx001   ";
        String nickName = "cqx001退款";
        String passWord = "cqx001";
        accountName = accountName.trim();
        System.out.println(accountName);

if (accountName == null || accountName.trim().isEmpty()) {
    System.out.println("账号名不能为空");
    return;
}   
if(passWord.contains(accountName)){
    System.out.println("密码包含账号名,有风险");
}else{
    System.out.println("密码安全性正常");
}
    String diaplayName = nickName.replace("退款","***");
    System.out.println("最终账号名为：" + accountName);
    System.out.println("Hello World! 欢迎" + diaplayName);
}
}

