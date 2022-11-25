package click_me;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class explain extends JFrame {

	Font font = new Font("궁서체", Font.BOLD, 13);
	Font font2 = new Font("궁서체", Font.BOLD, 11);

	JPanel pan = new JPanel();
	JPanel mainpan = new JPanel();
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();

	JLabel exp1 = new JLabel();
	JLabel exp2 = new JLabel();
	JLabel exp3 = new JLabel();
	JLabel exp4 = new JLabel();

	explain() {
		this.setUndecorated(true);
		homeframe();

		exp1 = new JLabel("모든 창은 esc로 종료 가능합니다");
		exp2 = new JLabel(
				"{파트너 구매 효과 - 초당 1원, 코딩 실력 +1}  {노트북 구매 효과 - 초당 10원, 코딩 실력 +1}  {코딩 구매 책 효과 - 초당 15원, 코딩 실력 +1}");
		exp3 = new JLabel("{회사 구매 효과 - 초당 100원, 코딩 실력 +1} {용사 전직 효과 - 초당 10000원, 코딩 실력 -500}");
		exp4 = new JLabel("Backspace를 눌러 메뉴로 갈 수 있습니다.");

		exp1.setForeground(Color.RED);
		exp4.setForeground(Color.RED);

		exp1.setFont(font);
		exp2.setFont(font2);
		exp3.setFont(font2);
		exp4.setFont(font);

		add(mainpan);

		mainpan.add(pan);
		mainpan.add(pan1);
		mainpan.add(pan2);
		mainpan.add(pan3);

		pan.add(exp1);

		pan1.add(exp2);

		pan2.add(exp3);

		pan3.add(exp4);

		Container c = getContentPane();
		c.requestFocus();
		c.setFocusable(true);

		c.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_BACK_SPACE) {
					new Start();
					dispose();
				}
				if (key == KeyEvent.VK_ESCAPE) {
					JOptionPane.showMessageDialog(null, "다음에 또 봐요 ^3^");
					System.exit(0);
				}
			}
		});
	}

	public void homeframe() {
		setTitle("GSM 키우기");
		setVisible(true); // 창을 눈에 보이도록 함
		setSize(800, 250);
		setResizable(false); // 사이즈 재조정 불가능
		setLocationRelativeTo(null); // 창이 가운데에 뜨도록 함
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 창을 끄면 프로그램을 종료
	}
}
