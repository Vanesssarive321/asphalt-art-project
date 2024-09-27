import org.code.neighborhood.*;

// Creates a subclass of MuaralPainter
public class DuckPainter extends MuralPainter {

  // Order in which my painters will paint
  public void paintDuck (String mainColor,String secondColor, String thirdColor) {
    startPosition();
    paintTop(mainColor);
    resetPosition();
    PaintPeak(secondColor);
    resetPosition();
    PaintEye(thirdColor);
    resetPosition();
    PaintWing(thirdColor);
    
  }

  //This codes for where my painters start off
  public void startPosition() {
    move();
    move();
    move();
    move();
    turnRight();
    turnLeft();
   }

  // This code makes the the top part of my duck. It navigates through the blocks and paints certain
  //- ones my my mainColor, or yellow, in the shape of a duck.
  public void paintTop(String mainColor) {
    paintLine(mainColor,4);
    turnRight();
    move();
    turnRight();
    paintLine(mainColor,6);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(mainColor,6);
    turnRight();
    move();
    turnRight();
    move();
    paintLine(mainColor,8);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine(mainColor,6);
    move();
    move();
    move();
    turnRight();
    move();
    turnRight();
    paintLine(mainColor,1);
    move();
    paintLine(mainColor,3);
    move();
    paintLine(mainColor,3);
    move();
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(mainColor,10);
  
    turnRight();
    move();
    turnRight();
    paintLine(mainColor,11);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(mainColor,11);
    turnRight();
    move();
    turnRight();
    paintLine(mainColor,11);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine(mainColor,9);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paintLine(mainColor,7); 
  }

  //This code paints the peak of my duck, the SecondColor, or Orange
  public void PaintPeak(String secondColor) { 
    move();
    move();
    move();
    turnRight();
    move();
    move();
    paintLine(secondColor,3);
    turnRight();
    move();
    turnRight();
    move();
    paintLine(secondColor,2);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(secondColor, 1);
    turnLeft();
    move();
    turnRight();
    move();
    move();
    move();
    turnRight();
    move();
    move();
}
   //This code paints the eye of my duck, the thirdColor, or black
  public void PaintEye(String thirdColor) { 
   move();
    move();
   move();
   move();
   move();
   turnRight();
   move();
   move();
   paintLine(thirdColor,1);
  
}

      //This code paints the wing of my duck, the fourthColor, or black
    public void PaintWing(String thirdColor) {
      move();
      move();
      move();
      move();
      move();
      turnRight();
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      paintLine(thirdColor, 1);
      turnLeft();
      move();
      paintLine(thirdColor,3);
      turnLeft();
      move();
      paintLine(thirdColor, 1);
      turnRight();
      move();
      paintLine(thirdColor, 1);
      
}

}
    