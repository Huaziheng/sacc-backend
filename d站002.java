public class d站002 {
    public static void main(String[]args){
        int[] playCounts = {120,300,450,200,150,500,280};
        int total = 0;
        for(int i = 0;i < playCounts.length; i++){
            total +=playCounts[i];
        }
        System.out.println("累计播放量：" + total);
    } 
    
}
