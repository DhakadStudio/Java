
enum Level{
  LOW(-1),MEDIUM(0),HIGH(1);

  final int levelNum;

  Level(int levelNum){
    this.levelNum = levelNum;
  }


  int getLevelNum(){
    return levelNum;
  }
}

public class LevelClass{

  public static void main(String[] args){
    Level level = Level.HIGH;

    System.out.println(level.getLevelNum());
  }
}