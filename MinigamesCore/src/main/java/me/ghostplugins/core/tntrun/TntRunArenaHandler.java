public class TntRunArenaHandler extends ArenaHandler {
  public void createArenas(int amount){
    for(int i = 0; i < amount; i++){
      this.getArenas().add(new TntRunArena());
    }
  }
}