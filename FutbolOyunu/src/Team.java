import java.util.ArrayList;
import java.util.Random;
public class Team {
Random random=new Random();
private int score=0;
private String team_name="";
private ArrayList<String> goalkeeper=new ArrayList<>();
private ArrayList<String> stopper=new ArrayList<>();
private ArrayList<String> santrafor=new ArrayList<>();
public Team(String nameOfTeam){
    switch(nameOfTeam){
        case "Galatasaray":
                  this.goalkeeper.add("Fernando Muslera");
                  this.stopper.add("Marcao");
                  this.stopper.add("Luyindama");
                  this.stopper.add("Ahmet Çalık");
                  this.santrafor.add("Falcao");
                  this.santrafor.add("Florin Andone");
                  break;
        case "Fenerbahçe":
                  this.goalkeeper.add("Harun Tekin");
                  this.stopper.add("Serdar Aziz");
                  this.stopper.add("Zanka");
                  this.santrafor.add("Vedat Muriqi");
                  this.santrafor.add("Mevlüt Erdinç");
                  break;
        case "Real Madrid":
                  this.goalkeeper.add("Courtois");
                  this.stopper.add("Varane");
                  this.stopper.add("Ramos");
                  this.santrafor.add("Benzema");
                  this.santrafor.add("Jovic");
                  break;
        case "Barcelona":
                  this.goalkeeper.add("ter Stegen");
                  this.stopper.add("Lenglet");
                  this.stopper.add("Pique");
                  this.santrafor.add("Suarez");
                  this.santrafor.add("Griezmann");
                  break;
        case "Juventus":
                  this.goalkeeper.add("Szczesny");
                  this.stopper.add("de Ligt");
                  this.stopper.add("Bonucci");
                  this.santrafor.add("Higuain");
                  this.santrafor.add("Mandzukic");
                  break;
    }
        this.team_name=nameOfTeam;
        this.score=0;
}
public String getGoalKeeper(){
    return this.goalkeeper.get(random.nextInt(this.goalkeeper.size()));
}
public String getStopper(){
    return this.stopper.get(random.nextInt(this.stopper.size()));
}
public String getSantrafor(){
    return this.santrafor.get(random.nextInt(this.santrafor.size()));
}
public String getTeam(){
    return this.team_name;
}
public void scoreUp(){
    this.score++;
}
}
