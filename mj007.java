public class mj007 {
    public static void main(String[]args){
        String userName = "hzhshishuaige";
        String passWord = "1234567";
        int days = 100;

        String validateResult = validateAccountInformation(userName,passWord,days);
        if(!validateResult.equals("校验成功")){
            System.out.println("账号信息错误");
            return;
        }
        System.out.println("账号信息校验通过");

        String encryptPassword = encryptPassword("123456");
        System.out.println("加密后的密码："+encryptPassword);

        boolean isSaved = saveAccountInformation(userName,encryptPassword);
        if(!isSaved){
            System.out.println("账号信息保存失败");
            return;
        }
        System.out.println("账号保存成功");

        String welcomeWorld = buildeWelcomeMessage(userName);
        System.out.println(welcomeWorld);
    }
    public static String validateAccountInformation(String userName,String passWord,int days){
        if(userName.isBlank()){
            return "账号名不能为空";
        }
        if(passWord.isBlank()){
            return "密码不符合要求";
        }
        if(days<0){
            return "登录天数格式错误";
        }
        return"校验成功";
    }
    public static String encryptPassword(String originalPassword){
        String encrypted = "SECRET" + originalPassword;
        return encrypted;
    }
    public static boolean saveAccountInformation(String userName,String encryptPassword) {
        System.out.println("名为" + userName +"密码为" + encryptPassword + "的账号保存成功");
        return true;
    }
    public static String buildeWelcomeMessage(String userName){
        return "Hello World!欢迎用户" + userName ;
    }
    }

