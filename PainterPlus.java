import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // Turns the painter to the right 
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  // Choice A: Takes all paint from a paint bucket
  public void takeAllpaint() {
    while (isOnBucket()) {
    takePaint();
    }
  }
  
  // Choice B: Moves forward whilr a Painter object can move
  public void moveFast(){
    while (canMove()) {
      move();
    }
  }

  //Choice C: Paints and moves while the Painter object has paint 
  public void paintToEmpty(String color) {
    while (hasPaint()) {
     paint(color); 
     move();
    }
  }

  // Choice D: Moves,turns,and paints in a dount shape
  public void paintDount(String color) {
    while (hasPaint()) {
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
   }
 }

}
