import java.util.Scanner;
public class xiaolanshu003 {
    public static void main(String[] args){
        Scanner xy = new Scanner(System.in);
        int n = xy.nextInt();
        int count = 0;
        for(int i = 0;i < n;i++){
            int length = xy.nextInt();
            if(length > 20){
                count = count + 1;
            }
        }
    System.out.println(count);
    }
    
    
}
