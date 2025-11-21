import java.util.Scanner;

public class Woods implements GameView{
    public int roomTrial(int currentHealth){
        System.out.println("Current health is " + currentHealth + "HP. The Woods, take OK sword? [1 - yes, 0 - no]");

        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();
        
        if(s1 == s1){
            System.out.println("Took OK sword!");
        }else{
            System.out.println("Left sword, injured for 10 HP");
        }
        return s1;
    }
    public int nextplace(){
        System.out.println("Where to next?");
        System.out.println("1 - Wood | 2 - Pond | 3 - Rock | 4 - Final Battle");
        Scanner s = new Scanner(System.in);
        int s2 = s.nextInt();
        return s2;
    }
    public boolean fight(boolean hasEverything){
        return true;
    }
}
