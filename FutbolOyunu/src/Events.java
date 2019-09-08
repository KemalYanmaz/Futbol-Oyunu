import java.util.Random;
public class Events {
Random random=new Random();
private String event1;
private String event2;
private String event3;
private String event4;
private boolean isGoal=false;
private String Santrafor;
private int scale=100;//More scale less Events

public Events(int i,Team team1,Team team2){
   if(random.nextBoolean()){
       if(random.nextBoolean()){
           switch(random.nextInt(this.scale)){
               //Penalties
               case 1:this.event1=team1.getTeam()+" Penalty!!";
                      this.Santrafor=team1.getSantrafor();
                      this.event2=this.Santrafor+"coming to use penalty";
                      this.event3=team2.getGoalKeeper()+"knowing the corner ball came.";
                      break;
               case 2:this.event1=team2.getTeam()+" Penalty!!";
                      this.Santrafor=team2.getSantrafor();
                      this.event2=this.Santrafor+"coming to use penalty";
                      this.event3=team1.getGoalKeeper()+"knowing the corner ball came.";
                      break;
               case 3:this.event1=team1.getTeam()+" Penalty!!";
                      this.Santrafor=team1.getSantrafor();
                      this.event2=this.Santrafor+" coming to use penalty";
                      this.event3=this.Santrafor+" is hunting the "+team2.getGoalKeeper()+" Gooal!";
                      team1.scoreUp();
                      this.isGoal=true;
                      break;
               case 4:this.event1=team2.getTeam()+" Penalty!!";
                      this.Santrafor=team2.getSantrafor();
                      this.event2=this.Santrafor+" coming to use penalty";
                      this.event3=this.Santrafor+" is hunting the "+team1.getGoalKeeper()+". Gooal!";
                      team2.scoreUp();
                      this.isGoal=true;
                      break;
               ///Corners
               case 5:this.event1=team1.getTeam()+" Corner";
                      this.event2=team1.getStopper()+" is crossing the ball into the penalty area";
                      this.event3=team1.getSantrafor()+" using his head. Gooal";
                      team1.scoreUp();
                      this.isGoal=true;
                      break;
               case 6:this.event1=team2.getTeam()+" Corner";
                      this.event2=team2.getStopper()+" is crossing the ball into the penalty area";
                      this.event3=team2.getSantrafor()+" using his head. Gooal";
                      team2.scoreUp();
                      this.isGoal=true;
                      break;
               case 7:this.event1=team2.getTeam()+" Corner";
                      this.event2=team2.getStopper()+" do the worst thing ";
                      this.event3="Chance of Counterattack for "+team1.getTeam();
                      this.event4=team2.getGoalKeeper()+" dont let";
                      break;
               case 8:this.event1=team1.getTeam()+" Corner";
                      this.event2=team1.getStopper()+" do the worst thing ";
                      this.event3="Change of Counterattack for "+team2.getTeam();
                      this.event4=team1.getGoalKeeper()+" dont let";
                      break;
                             


               
           }
       }
   }
}



    
}
