public class mj006 {
    public static void main(String[]args){
        boolean isValid = validateAccount("admin","123456");
        System.out.println("账号是否合法："+isValid);
        String encryptPassword = encryptPassword("123456");
        System.out.println("加密后的密码："+encryptPassword);
        String finalMessage = buildWelcomeMessage("hzh001");
        System.out.println(finalMessage);
    }
    public static boolean validateAccount(String username, String password){
        if(username == null || password == null){
            return false;
        }
        return true;
    }
    public static String encryptPassword(String originalPassword){
        String encrypted = "SECRET" + originalPassword;
        return encrypted;
    }
    public static String buildWelcomeMessage (String account){
        return "Hello World!账号"+ account + "诞生了";
    }
}
