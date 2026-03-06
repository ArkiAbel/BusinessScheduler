import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AppWindow extends JPanel implements Runnable {

    public AppWindow(int XX, int YY) {

        JFrame frame = new JFrame("Business Scheduler Main Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(XX,YY);
        frame.add(this);
        frame.setVisible(true);

        new Thread(this).start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,0,getWidth(),getHeight()); //egesz kepernyo frissitese
        //g.setColor(Color.GREEN);
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            try {Thread.sleep(16);}
            catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        int XX = 1080;
        int YY = 720;

        new AppWindow(XX, YY);
    }
}
