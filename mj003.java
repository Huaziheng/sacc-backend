public class mj003{
    public static void main(String[] args) {
        String accountName = "xingyu";
        String nickName = "max";
        String password = "hzhshishuaige";
        int days = 100;
        boolean isNewUser = true;
        System.out.println("=========  账号信息卡  ========");
        System.out.println("账号名:"+ accountName);
        System.out.println("昵称:" + nickName);
        System.out.println("登录天数:" + days);
        System.out.println("新用户状态:"+ (isNewUser ? "是" : "否"));
        System.out.println("===============================");

        int[] weeklyLoginCounts = {10, 23, 66, 102, 204, 409, 812};
        int mondayLoginCount = weeklyLoginCounts[0];
        int sundayLoginCount = weeklyLoginCounts[6];
        int dayCount = weeklyLoginCounts.length;
        System.out.println(mondayLoginCount);
        System.out.println(sundayLoginCount);
        System.out.println(dayCount);

        weeklyLoginCounts[2]= 55;
        System.out.println("修改后第3天的数据为:" + weeklyLoginCounts[2]);

    };
}