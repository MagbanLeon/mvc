import java.util.Scanner;

public class Pond implements GameView{
    public int roomTrial(int currentHealth){
        System.out.println("Current health is " + currentHealth + "HP. The Pond, take shield? [1 - yes, 0 - no]");

        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();

        if(s1 == 1){
            System.out.println("Took shield!");
        }else{
            System.out.println("Left shield, injured for 10 HP");
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