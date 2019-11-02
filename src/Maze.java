import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Maze extends JFrame{

    private JFrame map;

    public Maze(){
        map = new JFrame();
        setFrame();
        Square[][] squares = new Square[5][5];
        setSquares(squares);

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                map.add(squares[i][j]);
                map.repaint();
            }
        }
        map.setVisible(true);
       // squares.repaint();
    }

    private void setSquares(Square[][] squares){
        squares[0][0] = new Square("wall", false, false);
        squares[0][1] = new Square("path", false, false);
        squares[0][2] = new Square("wall", false, false);
        squares[0][3] = new Square("wall", false, false);
        squares[0][4] = new Square("wall", false, false);
        squares[1][0] = new Square("wall", false, false);
        squares[1][1] = new Square("path", false, false);
        squares[1][2] = new Square("wall", false, false);
        squares[1][3] = new Square("wall", false, false);
        squares[1][4] = new Square("wall", false, false);
        squares[2][0] = new Square("wall", false, false);
        squares[2][1] = new Square("path", false, false);
        squares[2][2] = new Square("path", true, false);
        squares[2][3] = new Square("path", false, false);
        squares[2][4] = new Square("wall", false, false);
        squares[3][0] = new Square("wall", false, false);
        squares[3][1] = new Square("wall", false, false);
        squares[3][2] = new Square("wall", false, false);
        squares[3][3] = new Square("path", false, false);
        squares[3][4] = new Square("wall", false, false);
        squares[4][0] = new Square("wall", false, false);
        squares[4][1] = new Square("wall", false, false);
        squares[4][2] = new Square("wall", false, false);
        squares[4][3] = new Square("path", false, true);
        squares[4][4] = new Square("wall", false, false);
    }

    private void setFrame(){
        map.setTitle("Amaze!");
        map.setLayout(new GridLayout(5, 5));
        map.setSize(1000,1000);
       // map.setResizable(false);
        map.setVisible(true);
        map.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
