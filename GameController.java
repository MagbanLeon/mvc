public class GameController{
    PlayerModel player;
    MapModel map;
    GameView currentView;
    String currentRoom;
    boolean win;

    public GameController(){
        player = new PlayerModel();
        map = new MapModel();
        currentView = new Woods();
        currentRoom = "woods";
        win = false;
    }
    //getters
    public int getPlayerHealth(){
        return player.getHealth();
    }
    public boolean getOKsword(){
        return player.getHasOKsword();
    }
    public boolean getExcelSword(){
        return player.getHasExcelSword();
    }
    public boolean getPlayerShield(){
        return player.getHasShield();
    }
    public void interaction(){
        do{
            int otherDecision = currentView.roomTrial(getPlayerHealth());
            update(otherDecision);
            if((currentRoom == "fb")&&(otherDecision == otherDecision)){
                win = currentView.fight((getPlayerShield())&&(getExcelSword()));
            }
            int decision = currentView.nextplace();
            if(decision == 1){
                currentView = new Woods();
                currentRoom = "woods";
            }else if(decision == 2){
                currentView = new Pond();
                currentRoom = "pond";
            }else if(decision == 3){
                currentView = new Rock();
                currentRoom = "rock";
            }else{
                if(map.theWoods && map.thePond && map.theRock){
                    currentView = new finalBattle();
                    currentRoom = "fb";
                }
            }
        }while(!win);
    }
    public void update(int decision){
        if(currentRoom == "woods"){
            if(decision == 1){player.setHasOKsword(true);}
            else{player.setHealth(getPlayerHealth() - 1);}
            map.theWoods = true;
        }else if(currentRoom == "pond"){
            if(decision == 1){player.setHasShield(true);}
            else{player.setHealth(getPlayerHealth() - 1);}
            map.thePond = true;
        }else if(currentRoom == "rock"){
            if(decision == 1){player.setHasExcelSword(true);}
            else{player.setHealth(getPlayerHealth() - 1);}
            map.theRock = true;
        }else{

        }
    }
}