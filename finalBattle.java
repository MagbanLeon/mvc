import java.util.Scanner;

public class finalBattle implements GameView{
    public String roomTrial(int currentHealth){
        System.out.println("Current health is " + currentHealth + "HP. Fight boss?");

        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();

        if(s1 == s1){
            System.out.println("Fighting the boss!");
        }else{
            System.out.println("Left boss.");
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
        if(hasEverything){
            System.out.println("You won!");
            return true;
        }else{
            System.out.println("You lost!");
            return true;
        }
    }
}