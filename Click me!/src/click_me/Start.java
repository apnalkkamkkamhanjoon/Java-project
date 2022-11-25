package click_me;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Start extends JFrame{
	Graphics screenGraphics;
    Image homeImage;
    Image homeBackground;
	Start(){
		this.setUndecorated(true);
		home();
		
		Container c = getContentPane();
		c.requestFocus();
        c.setFocusable(true);

        c.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
            @Override
            public void keyPressed(KeyEvent e) {
                    int key = e.getKeyCode();
                    if(key == KeyEvent.VK_ENTER){
                        new game();
                    }
                    if(key == KeyEvent.VK_SHIFT) {
                    	new explain();
                    }
                    if (key == KeyEvent.VK_ESCAPE) {
    					JOptionPane.showMessageDialog(null, "다음에 또 봐요 ^3^");
    					System.exit(0);
    				}
            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
	}
	public void home() {
        homeBackground= new ImageIcon(Start.class.getResource("../image/gugee.png")).getImage();
        setTitle("GSM 키우기");
		setVisible(true); // 창을 눈에 보이도록 함
		setSize(800, 960);
		setResizable(false); // 사이즈 재조정 불가능
		setLocationRelativeTo(null); // 창이 가운데에 뜨도록 함
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 창을 끄면 프로그램을 종료
    }
	
	public void paint(Graphics g) {
      g.drawImage(homeBackground, 0, 0, null);

  }

  public void draw(Graphics g) {
      g.drawImage(homeBackground, 0, 0, null);
      this.repaint();
  }
}
