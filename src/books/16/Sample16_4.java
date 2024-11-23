import java.awt.*;
import java.awt.event.*;

public class Sample16_4 extends Frame {
    private Button bt;

    public static void main(String[] args) {
        Sample16_4 sm = new Sample16_4();
    }
    public Sample16_4() {
        super("サンプル");

        bt = new Button("ようこそ");
        add(bt);

        addWindowListener(new SampleWindowListener());
        bt.addMouseListener(new SampleMouseListener());

        setSize(250, 200);
        setVisible(true);
    }
    class SampleWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    class SampleMouseListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {
            bt.setLabel("いらっしゃいませ");
        }
        public void mouseExited(MouseEvent e) {
            bt.setLabel("ようこそ");
        }
    }
}
