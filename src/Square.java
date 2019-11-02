import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Square extends JPanel {

    private int i;
    private int j;
    private boolean isKey;
    private boolean isPlayer;
    private Maze map;

    // Square Constructor containing the location of the square, the piece and the action listener
    public Square(Maze map, int i, int j, boolean isKey, boolean isPlayer){
        this.i = i;
        this.j = j;
        this.map = map;
        this.isKey = isKey;
        this.isPlayer = isPlayer;
    }

    public boolean hasKey(){
        return isKey;
    }

    public void setIcon(String type){
        if(type.equals("wall")){
            this.setBackground(Color.orange);
        }
        else if(type.equals("path")){
            this.setBackground(Color.magenta);
        }
        else if(type.equals("key")){
            this.setBackground(Color.lightGray);
        }
    }

}