public class PlayerModel implements Model {
    int health;
    boolean hasOKsword;
    boolean hasShield;
    boolean hasExcelSword;

    public PlayerModel(){
        health = 10;
        hasExcelSword = false;
        hasOKsword = false;
        hasShield = false;
    }
    //getters
    public int getHealth() {
        return health;
    }
    public boolean getHasOKsword(){
        return hasOKsword;
    }
    public boolean getHasShield(){
        return hasShield;
    }
    public boolean getHasExcelSword(){
        return hasExcelSword;
    }
    //setters
    public void setHasExcelSword(boolean hasExcelSword) {
        this.hasExcelSword = hasExcelSword;
    }
    public void setHasOKsword(boolean hasOKsword) {
        this.hasOKsword = hasOKsword;
    }
    public void setHasShield(boolean hasShield) {
        this.hasShield = hasShield;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}