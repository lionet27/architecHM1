package src.ModelElements;
import java.awt.Color;
import javafx.geometry.Point3D;


public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public Color Color;
    public Float Power;

    
    public Flash(src.ModelElements.Point3D location, Angle3D angle, java.awt.Color color, Float power) {
        Location = location;
        Angle = angle;
        Color = color;
        Power = power;
    }

    public void Rotate(Angle3D angle){

    }
    
    public void Move(Point3D point){
        
    }
}
