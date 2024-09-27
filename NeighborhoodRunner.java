  import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

     // Instantiates my MuralPainter, and paints the background lightblue
  MuralPainter mp = new DuckPainter();   
      mp.paintBackground("LightBlue",12);
      
     //  Instantiates my DuckPainter and paints the duck
  DuckPainter dp = new DuckPainter();
     dp.paintDuck("yellow","orange", "black");
  }
}