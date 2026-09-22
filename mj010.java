public class mj010 {
    private String accountName;
    private String passWordHash;
    private String status;

    public mj010(String accountName,String rawpassWord){
        this.accountName = accountName;
        this.newPassWord(rawpassWord);
        this.status = "active";
    }
    public String getAccountName(){
        return this.accountName;
    }
    public void newPassWord(String rawpassWord){
        this.passWordHash = method(rawpassWord);
    }
    public boolean isLoginAllowed(){
        return "blocked".equals(this.status);
    }
    public void setStatus(String status){
        this.status = status;
    }
    private String method(String raw){
        return "SECRET"+raw;
    }
    public static void main(String[] args) {
        mj010 userAccount = new mj010("hzh010", "123456");
        System.out.println("账号名称：" + userAccount.getAccountName());
        System.out.println("是否允许登录：" + userAccount.isLoginAllowed());
        userAccount.newPassWord("654321");
        System.out.println("密码更新完成");
    }
    
}
