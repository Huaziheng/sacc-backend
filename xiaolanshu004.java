import java.util.Scanner;
public class xiaolanshu004 {
    public static int calculateScore(int likes, int saves){
        int score = likes * 2 + saves * 3;
        return score;
    }
    public static void main(String[] args){
        Scanner xy = new Scanner(System.in);
        int likes = xy.nextInt();
        int saves = xy.nextInt();
        int result = calculateScore(likes,saves);
    System.out.println(result);
    }
    
}
