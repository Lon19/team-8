import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Maze {

    private JFrame map;

    public Maze(){
        map = new JFrame();
        setFrame();
        setMaze();
        Square[][] squares = new Square[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                Square square = new Square(this,i,j,false,false);
                if(i == 0) square.setIcon("wall");
                else square.setIcon("path");
                map.add(square);
            }
        }
    }

    private void setFrame(){
        map.setTitle("Amaze!");
        map.setLayout(new GridLayout(5, 5));
        map.setSize(1000,800);
        map.setResizable(false);
        map.setVisible(true);
    }

    private void setMaze() {
        JPanel panel = new JPanel();
    }
}
