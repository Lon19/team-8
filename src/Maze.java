import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Maze extends JFrame implements ActionListener{

    private JFrame game;
    private JPanel map;
    private JPanel controls;
    public Square[][] squares;


    public Maze(){
        game = new JFrame();
        map = new JPanel();
        controls = new JPanel();
        squares = new Square[5][5];
        setFrame();
        //setSquares();
        setControls();

        squarestomap();
        game.pack();
        game.setVisible(true);
    }

    private void squarestomap() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                map.add(squares[i][j]);
            }
        }
    }

    private void setControls(){
        JButton up = new JButton("Up");
        up.addActionListener(this);
        JButton down = new JButton("Down");
        down.addActionListener(this);
        JButton left = new JButton("Left");
        left.addActionListener(this);
        JButton right = new JButton("Right");
        right.addActionListener(this);

        controls.setLayout(new GridLayout(4, 1));
        controls.add(up);
        controls.add(down);
        controls.add(left);
        controls.add(right);
        game.add(controls);
    }

    private void setSquares(){
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
        game.setTitle("Amaze!");
        game.setLayout(new FlowLayout());
        //game.setSize(1000,1000);
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        map.setLayout(new GridLayout(5, 5));
        setSquares();
        game.add(map);
        //game.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //boolean complete = false;

        if(e.getActionCommand().equals("Up")) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (squares[i][j].hasPlayer() && squares[i - 1][j].kind.equals("path")) {
                        squares[i][j] = new Square("path", false, false);
                        squares[i - 1][j] = new Square("path", false, true);
                        break;
                    }
                }
            }
            map.removeAll();
            squarestomap();
            game.pack();
        }
        if(e.getActionCommand().equals("Down")){
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (squares[i][j].hasPlayer() && squares[i + 1][j].kind.equals("path")) {
                        squares[i][j] = new Square("path", false, false);
                        squares[i + 1][j] = new Square("path", false, true);
                        break;
                    }
                }
            }
            map.removeAll();
            squarestomap();
            game.pack();
        }
        if(e.getActionCommand().equals("Left")){
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (squares[i][j].hasPlayer() && squares[i][j-1].kind.equals("path")) {
                        squares[i][j] = new Square("path", false, false);
                        squares[i][j-1] = new Square("path", false, true);
                        break;
                    }
                }
            }
            map.removeAll();
            squarestomap();
            game.pack();
        }
        if(e.getActionCommand().equals("Right")){
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (squares[i][j].hasPlayer() && squares[i][j+1].kind.equals("path")) {
                        squares[i][j] = new Square("path", false, false);
                        squares[i][j+1] = new Square("path", false, true);
                        break;
                    }
                }
            }
            map.removeAll();
            squarestomap();
            game.pack();
        }
    }
}