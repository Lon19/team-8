import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;

public class TitlePage{

    private JButton start;
    private ImageIcon sButton;

    public TitlePage implements ActionListener()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setContentPane(panel);

        start = new JButton();
        sButton = new ImageIcon("startButton.png");
        start.setIcon(sButton);
        start.setSize(100,75);

        panel.add(start);

        start.addActionListener(this);

        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == start.getJButton()){
            CreateAvatar player1 = new CreateAvatar();
        }
    }

    public static void main(String[] args){
        TitlePage title = new TitlePage();
    }

}