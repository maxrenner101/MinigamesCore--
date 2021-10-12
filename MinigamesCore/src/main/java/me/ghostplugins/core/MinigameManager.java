import java.util.ArrayList;
import lombok.Getter;

public class MinigamesManager {

  @Getter
  private static ArrayList<Minigame> minigames= new ArrayList<>();;

  public MinigamesManager(){
    // register all minigames
    minigames.add(new TntRun());
  }
}