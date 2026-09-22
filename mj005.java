public class mj005 {
    public static void main(String[]args){
        String[] names = {"hzh001","hzh002","","risk_user","hzh004"};
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            String currentName = names[i];
        if(currentName.isEmpty()){
            System.out.println("空白账户已跳过");
            continue;}
        if(currentName.equals("risk_user")){
            break;}
        System.out.println("正在创建账号：" + currentName );
        count++;}
    System.out.println("成功处理了"+count+"个账号");
    }
}
