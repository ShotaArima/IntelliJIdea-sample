import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.RunnableFuture;

public class Sample16_7 extends Frame implements Runnable {
    int num;

    public static void main(String[] args) {
        Sample16_7 sm = new Sample16_7();
    }
    public Sample16_7() {
        super("サンプル");

        addWindowListener(new SampleWindowListener());
        Thread th;
        th = new Thread(this);
        th.start();

        setSize(250, 200);
        setVisible(true);
    }
    public void run() {
        try {
            for(int i=0; i<10; i++) {
                num = i;
                repaint();
                Thread.sleep(1000);
            }
        }catch(InterruptedException e) {}
    }

    public void paint(Graphics g) {
        String str = num+"です。";
        g.drawString(str, 100, 100);
    }
    class SampleWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
