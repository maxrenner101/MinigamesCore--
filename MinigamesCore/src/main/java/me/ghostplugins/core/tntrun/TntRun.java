public class TntRun extends Minigame {

  private ArenaHandler arenaHandler;

  public TntRun(){
    this.setArenaHandler(new TntRunArenaHandler());
    arenaHandler = this.getArenaHandler();

    arenaHandler.createArenas(Config.getArenaAmount(this));
  }

  public String toString(){
    return "tntrun";
  }
}