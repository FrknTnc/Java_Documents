package swing;

import javax.swing.JFrame;

public class MAin {

    public static void main(String[] args) {
	// write your code here

        JFrame jf = new JFrame();
        jf.setTitle("İlk Pencerem");
        jf.setSize(500,600);
        jf.setLocation(100,200);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
