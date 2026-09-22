public class mj004{
    public static void main(String[]args){
    String name = "hzh001";
    String passWord = "123456";
    String state = "normal";
    int loginDays = 2;

    if(name.isEmpty()){
        System.out.println("账号名不能为空");
        return;
    }
    if(passWord.length()<6){
        System.out.println("密码长度不足");
        return;
    }
    if(state.equals("blocked")){
        System.out.println("账号风险拦截");
        return;
    }
    if(loginDays < 0){
        System.out.println("登陆天数格式错误");
        return;
    } 
        System.out.println("账号验证通过");
    
    }
}
   