package Window.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class BasePanel extends JPanel {
    JButton button;
    BaseFrame mainFrame;

    public BasePanel(Color color){
        this.setBackground(color);
        this.setSize(new Dimension(1000,500));

        button = new JButton();
        button.setPreferredSize(new Dimension(100,100));
        button.addActionListener(this::actions);
        this.add(button);


    }

    public void setFrame(BaseFrame frame){
        mainFrame = frame;
        mainFrame.add(this);
    }

    private void actions(ActionEvent actionEvent){
        mainFrame.removePanel();


        //mainFrame.get(0).removePanel();
    }
}
