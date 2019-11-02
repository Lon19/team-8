import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Square extends JPanel {

    private int i;
    private int j;
    private boolean isKey;
    private boolean isPlayer;
    private Maze map;

    // Square Constructor containing the location of the square, the piece and the action listener
    public Square(String kind, boolean isKey, boolean isPlayer){
        this.isKey = isKey;
        this.isPlayer = isPlayer;
        try {
            setBackground(kind);
        }
        catch (IOException e){
            System.out.print(e);
        }
       this.repaint();
    }

    public boolean hasKey(){
        return isKey;
    }

    private void setBackground(String type) throws IOException {
        if(type.equals("wall")){
            this.setBackground(Color.black);
        }
        else if(isKey){
            //change the path below to something more general
            Icon image= new ImageIcon("C:\\Users\\Miru\\Desktop\\Projects\\code4good\\resources\\img\\key.jpg");
            JLabel label = new JLabel(image);
            this.add(label);
            this.setVisible(true);
            System.out.print("blah");

        }
        else if(type.equals("path")){
            this.setBackground(Color.orange);
        }
        else {
            System.out.print("blah");
        }
    }
}