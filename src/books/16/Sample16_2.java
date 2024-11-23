import java.awt.*;
import java.awt.event.*;

public class Sample16_2 extends Frame {
    private Label lb;

    public static void main(String[] args) {
        Sample16_2 sm = new Sample16_2();
    }

    public Sample16_2() {
        super("サンプル");
        lb = new Label("ようこそ");
        add(lb);
        lb.setForeground(Color.blue);
        lb.setFont(new Font("serif", Font.BOLD, 24));

        addWindowListener(new SampleWindowListener());

        setSize(250, 200);
        setVisible(true);
    }
    class SampleWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
