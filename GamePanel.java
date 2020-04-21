package src;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GamePanel implements ActionListener {

        int numClicks = 0;
        String str = Integer.toString(numClicks);
        JButton button ;

        public static void main(String[] args) {
                GamePanel panel = new GamePanel();
                JFrame frame = new JFrame();
                frame.setBounds(500, 200, 500, 500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
               
                frame.add(panel.button);
                 frame.setVisible(true);
        }

        public GamePanel() {
                button = new JButton(str);
        button.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
                numClicks++;
                button.setText("click number:"+numClicks);
        }

}