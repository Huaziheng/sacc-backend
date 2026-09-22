import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class mj013 {
    public static void main(String[] args) {
        String accountName = "hzh013";
        String nickName = "xingyu";
        String passWordHash = "123456";
        String creatresult = "成功";

        saveDraft("slowfoot_accounts.txt",accountName,nickName,passWordHash,creatresult);
        String draft = readDraft("slowfoot_accounts.txt");
        System.out.println("账号信息保存成功");
        System.out.println(draft);

    }
    public static void saveDraft(String filePath,String accountName,String nickName,String passWordHash,String creatresult) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("账号名:" + accountName);
            writer.newLine();
            writer.write("昵称：" + nickName);
            writer.newLine();
            writer.write("密码摘要:" + passWordHash);
            writer.newLine();
            writer.write("创建结果:" + creatresult);
        } catch (IOException e) {
            System.out.println("保存失败，出现异常!可能原因：无编辑权限");
        }
    }
        
    public static String readDraft(String filePath) {
        StringBuilder builder = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line = reader.readLine();
                while (line != null) {
                builder.append(line).append("\n");
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("账号保存失败！可能原因：文件不存在或文件无法访问");
        }
        return builder.toString();
    }

}

