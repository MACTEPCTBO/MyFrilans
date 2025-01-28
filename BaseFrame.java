package Window.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class BaseFrame extends JFrame {
    int WIDTH, HEIGHT;

    ArrayList<BasePanel> focusPanel = new ArrayList<>();

    public BaseFrame(int WIDTH, int HEIGHT){
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;

        this.setVisible(true);
        this.setEnabled(true);
        this.setBackground(new Color(200,60,60));
        this.setFocusable(true);
        this.setMinimumSize(new Dimension(this.WIDTH, this.HEIGHT));


        this.pack();
    }

    public void setFocusPanel(BasePanel panel){
        focusPanel.add(panel);
    }


    public void removePanel() {
        this.remove(focusPanel.get(0));
        focusPanel.remove(0);
        repaint();
    }

}
