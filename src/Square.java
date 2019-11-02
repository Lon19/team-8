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
    public String kind;

    // Square Constructor containing the location of the square, the piece and the action listener
    public Square(String kind, boolean isKey, boolean isPlayer){
        this.isKey = isKey;
        this.isPlayer = isPlayer;
        this.kind = kind;
        try {
            setBackground(kind);
        }
        catch (IOException e){
            System.out.print(e);
        }
        this.setSize(100,100);
    }

    public boolean hasKey(){
        return isKey;
    }

    public boolean hasPlayer(){
        return isPlayer;
    }

    public void setPlayer(boolean newValue){
        isPlayer = newValue;
    }

    private void setBackground(String type) throws IOException {
        if(type.equals("wall")){
            this.setBackground(Color.black);
        }
        else if(isKey){
            //change the path below to something more general
            BufferedImage keyImage = ImageIO.read(new File("C:\\Users\\Miru\\Desktop\\Projects\\code4good\\resources\\img\\key.jpg"));
            Image tmp = keyImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon myImg = new ImageIcon(tmp);

            JLabel label = new JLabel(myImg);
            this.add(label);
            this.setVisible(true);
        }
        else if(type.equals("path")){
            this.setBackground(Color.lightGray);
        }
        else {
            //System.out.print("blah");
        }

        if(isPlayer){
            BufferedImage playerImage = ImageIO.read(new File("C:\\Users\\Miru\\Desktop\\Projects\\code4good\\resources\\img\\player.png"));
            Image tmp = playerImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon myImg = new ImageIcon(tmp);

            JLabel label = new JLabel(myImg);
            this.add(label);
            this.setVisible(true);
        }
    }
}