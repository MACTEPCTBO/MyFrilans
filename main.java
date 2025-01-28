import Window.UI.BaseFrame;
import Window.UI.BasePanel;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {

        BasePanel panel = new BasePanel(new Color(100,100,100));
        BasePanel panel2 = new BasePanel(new Color(200,0,0));
        BaseFrame mainFrame = new BaseFrame(1000,500);


        panel.setFrame(mainFrame);
        panel2.setFrame(mainFrame);

        mainFrame.setFocusPanel(panel);
        mainFrame.setFocusPanel(panel2);

        mainFrame.pack();

        System.out.println(1_000_00 / 60);

        while (true){
            try {
                mainFrame.repaint();
                panel2.repaint();
                panel.repaint();


                Thread.sleep(1_000_00 / 60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
