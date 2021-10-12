import lombok.Getter;

public abstract class ArenaHandler {
  @Getter
  private ArrayList<Arena> arenas;

  public Arena getArena(int id){
    return arenas.get(id);
  }

  public abstract void createArenas(int amount);
}