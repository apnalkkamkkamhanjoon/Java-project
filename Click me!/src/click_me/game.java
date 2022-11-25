package click_me;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class game extends JFrame {
	int money;
	int cnt = (int) ((Math.random() * (10 - 0)) + 0);
	int notebookmoney = 5000;
	int memberhave;
	int notebookhave;
	int bookhave;
	int cophave;
	int codmaster;
	int nowmoney;
	int masterrand = (int) ((Math.random() * (10 - 0)) + 0);

	String message = "money : " + money;
	String cods = "코딩 실력 : " + codmaster;
	String having = "파트너 수 : " + memberhave + " 노트북 소유 : " + notebookhave + " 코딩 책 소유 : " + bookhave + " 취업 횟수 : "
			+ cophave;
	String nowmon = "현재 초당 money : " + nowmoney;

	JPanel mainpan = new JPanel();
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	JPanel pan4 = new JPanel();
	JPanel pan5 = new JPanel();

	JLabel lab = new JLabel();
	JLabel have = new JLabel();
	JLabel pointup = new JLabel();
	JLabel memberbuy = new JLabel();
	JLabel membersell = new JLabel();
	JLabel mynotebook = new JLabel();
	JLabel notebooksell = new JLabel();
	JLabel exit = new JLabel();
	JLabel book = new JLabel();
	JLabel booksell = new JLabel();
	JLabel cop = new JLabel();
	JLabel copsell = new JLabel();
	JLabel cod = new JLabel();
	JLabel master = new JLabel();
	JLabel now = new JLabel();

	Font font = new Font("궁서체", Font.BOLD, 13);

	public game() {
		this.setUndecorated(true);
		homeframe();
		Container c = getContentPane();

		mainpan = new JPanel();
		pan1 = new JPanel();
		pan2 = new JPanel();
		pan3 = new JPanel();
		pan4 = new JPanel();
		pan5 = new JPanel();

		lab = new JLabel(message);
		cod = new JLabel(cods);
		have = new JLabel(having);
		now = new JLabel(nowmon);
		pointup = new JLabel("돈 벌기!(+10원, space)");
		memberbuy = new JLabel("프로젝트 파트너 구하기(-50원, 1번)");
		membersell = new JLabel("파트너 팔기(+20원, 2번)");
		mynotebook = new JLabel("내 노트북 마련(-5000원, 3번)");
		notebooksell = new JLabel("노트북 팔기(+4500원, 4번)");
		book = new JLabel("코딩 책 사기(-1000원, 5번)");
		booksell = new JLabel("코딩 책 팔기(+500원, 6번)");
		cop = new JLabel("취업하기(-10만원, 7번)");
		copsell = new JLabel("퇴사하기(15만원, 8번)");
		master = new JLabel("이 세계 용사되기(코딩실력 500, 9번)");
		exit = new JLabel("게임 종료(esc) 메인화면으로 돌아가기(Backspace)");

		pointup.setForeground(Color.RED);
		lab.setForeground(Color.BLUE);
		have.setForeground(Color.GREEN);
		cod.setForeground(Color.BLUE);
		now.setForeground(Color.BLUE);

		lab.setFont(font);
		cod.setFont(font);
		have.setFont(font);
		pointup.setFont(font);
		memberbuy.setFont(font);
		membersell.setFont(font);
		mynotebook.setFont(font);
		notebooksell.setFont(font);
		book.setFont(font);
		booksell.setFont(font);
		cop.setFont(font);
		copsell.setFont(font);
		master.setFont(font);
		now.setFont(font);
		exit.setFont(font);

		add(mainpan);

		mainpan.add(pan1);
		mainpan.add(pan2);
		mainpan.add(pan3);
		mainpan.add(pan4);
		mainpan.add(pan5);

		pan1.add(memberbuy);
		pan1.add(membersell);
		pan1.add(mynotebook);
		pan1.add(notebooksell);

		pan2.add(book);
		pan2.add(booksell);
		pan2.add(cop);
		pan2.add(copsell);

		pan3.add(master);
		pan3.add(exit);

		pan4.add(cod);
		pan4.add(lab);
		pan4.add(have);

		pan5.add(pointup);
		pan5.add(now);

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
				if (key == KeyEvent.VK_SPACE) {
					money += 10;
					lab.setText("money : " + money);
				}
				if (key == KeyEvent.VK_1) {
					if (money >= 50) {
						money = money - 50;
						lab.setText("money : " + money);
						if (cnt > 0) {
							--cnt;
							JOptionPane.showMessageDialog(null, "팀원이 구해지지 않았다! 몇번 더 남음 : " + cnt);
						} else if (cnt == 0) {
							money = money - 50;
							JOptionPane.showMessageDialog(null, "팀원이 구해졌다!, 드디어 나도 프로젝트를..?!");
							JOptionPane.showMessageDialog(null, "코딩 실력이 1 늘어났어!!");
							nowmoney += 1;
							memberhave++;
							codmaster++;
							cod.setText("코딩 실력 : " + codmaster);
							now.setText("현재 초당 money : " + nowmoney);
							have.setText("파트너 수 : " + memberhave + " 노트북 소유 : " + notebookhave + " 코딩 책 소유 : "
									+ bookhave + " 취업 횟수 : " + cophave);
							cnt = (int) ((Math.random() * (10 - 0)) + 0);
							TimerTask task = new TimerTask() {
								@Override
								public void run() {
									money = money + 1;
									homeframe();
								}
							};
							lab.setText("money : " + money);

							new Timer().scheduleAtFixedRate(task, 01, 1000);
						}
					} else if (money < 50) {
						JOptionPane.showMessageDialog(null, "돈이 없다! 더 벌어서 오도록!!");
					}

				}

				if (key == KeyEvent.VK_2) {
					if (memberhave > 0) {
						memberhave--;
						money += 20;
						lab.setText("money : " + money);
						JOptionPane.showMessageDialog(null, "힘이 빠진 팀원은 아무도 안 찾아..");
						have.setText("파트너 수 : " + memberhave + " 노트북 소유 : " + notebookhave + " 코딩 책 소유 : " + bookhave
								+ " 취업 횟수 : " + cophave);
						now.setText("현재 초당 money : " + nowmoney);
					} else if (memberhave <= 0) {
						JOptionPane.showMessageDialog(null, "팔 팀원이 없어 ㅠ_ㅜ");
					}
				}

				if (key == KeyEvent.VK_3) {
					if (money >= 5000) {
						money = money - 5000;
						lab.setText("money : " + money);
						JOptionPane.showMessageDialog(null, "드디어 내 노트북이...!");
						JOptionPane.showMessageDialog(null, "코딩 실력이 1 늘어났어!!");
						nowmoney += 10;
						notebookhave++;
						codmaster++;
						cod.setText("코딩 실력 : " + codmaster);
						now.setText("현재 초당 money : " + nowmoney);
						have.setText("파트너 수 : " + memberhave + " 노트북 소유 : " + notebookhave + " 코딩 책 소유 : " + bookhave
								+ " 취업 횟수 : " + cophave);
						TimerTask task = new TimerTask() {
							@Override
							public void run() {
								money = money + 10;
								homeframe();
							}
						};
						lab.setText("money : " + money);

						new Timer().scheduleAtFixedRate(task, 01, 1000);
					}

					else if (money < 5000) {
						JOptionPane.showMessageDialog(null, "아직 노트북 살 정도는 아닌거 같아..");
					}
				}

				if (key == KeyEvent.VK_4) {
					if (notebookhave > 0) {
						money += 4500;
						lab.setText("money : " + money);
						JOptionPane.showMessageDialog(null, "사용된 노트북은 가격이 낮아..");
						notebookhave--;
						have.setText("파트너 수 : " + memberhave + " 노트북 소유 : " + notebookhave + " 코딩 책 소유 : " + bookhave
								+ " 취업 횟수 : " + cophave);
						now.setText("현재 초당 money : " + nowmoney);
					} else if (notebookhave <= 0) {
						JOptionPane.showMessageDialog(null, "팔 노트북이 없네..ㅜㅅㅠ");
					}
				}

				if (key == KeyEvent.VK_5) {
					if (money >= 1000) {
						nowmoney += 5;
						bookhave++;
						codmaster += 5;
						cod.setText("코딩 실력 : " + codmaster);
						money = money - 1000;
						lab.setText("money : " + money);
						JOptionPane.showMessageDialog(null, "무슨 책을 살까?");
						int carnum = (int) ((Math.random() * (3)) + 1);
						if (carnum == 1) {
							JOptionPane.showMessageDialog(null, "내 책은 안드로이드!");
						}
						if (carnum == 2) {
							JOptionPane.showMessageDialog(null, "내 책은 HTML!");
						}
						if (carnum == 3) {
							JOptionPane.showMessageDialog(null, "내 책은 C!");
						}
						JOptionPane.showMessageDialog(null, "코딩 실력이 5 늘어났어!!");
						have.setText("파트너 수 : " + memberhave + " 노트북 소유 : " + notebookhave + " 코딩 책 소유 : " + bookhave
								+ " 취업 횟수 : " + cophave);
						now.setText("현재 초당 money : " + nowmoney);
						TimerTask task = new TimerTask() {
							@Override
							public void run() {
								money = money + 5;
								homeframe();
							}
						};
						lab.setText("money : " + money);

						new Timer().scheduleAtFixedRate(task, 01, 1000);
					}

					else if (money < 1000) {
						JOptionPane.showMessageDialog(null, "내 실력에 무슨 책이야..");
					}
				}

				if (key == KeyEvent.VK_6) {
					if (bookhave > 0) {
						money += 500;
						lab.setText("money : " + money);
						JOptionPane.showMessageDialog(null, "사용된 책은 좀 싸..");
						bookhave--;
						have.setText("파트너 수 : " + memberhave + " 노트북 소유 : " + notebookhave + " 코딩 책 소유 : " + bookhave
								+ " 취업 횟수 : " + cophave);
						now.setText("현재 초당 money : " + nowmoney);
					} else if (bookhave <= 0) {
						JOptionPane.showMessageDialog(null, "팔 책이 없네..ㅜ3ㅠ");
					}
				}

				if (key == KeyEvent.VK_7) {
					if (money >= 100000) {
						money = money - 100000;
						lab.setText("money : " + money);
						JOptionPane.showMessageDialog(null, "드디어 나도 취업자?");
						JOptionPane.showMessageDialog(null, "코딩 실력이 1 늘어났어!!");
						now.setText("현재 초당 money : " + nowmoney);
						cophave++;
						nowmoney += 100;
						codmaster++;
						cod.setText("코딩 실력 : " + codmaster);
						have.setText("파트너 수 : " + memberhave + " 노트북 소유 : " + notebookhave + " 코딩 책 소유 : " + bookhave
								+ " 취업 횟수 : " + cophave);
						now.setText("현재 초당 money : " + nowmoney);
						TimerTask task = new TimerTask() {
							@Override
							public void run() {
								money = money + 100;
								homeframe();
							}
						};
						lab.setText("money : " + money);

						new Timer().scheduleAtFixedRate(task, 01, 1000);
					}

					else if (money < 5000) {
						JOptionPane.showMessageDialog(null, "내 처지에 무슨 회사를..");
					}
				}

				if (key == KeyEvent.VK_8) {
					if (cophave > 0) {
						money += 150000;
						lab.setText("money : " + money);
						JOptionPane.showMessageDialog(null, "퇴사는 즐거워~~");
						cophave--;
						have.setText("파트너 수 : " + memberhave + " 노트북 소유 : " + notebookhave + " 코딩 책 소유 : " + bookhave
								+ " 취업 횟수 : " + cophave);
						now.setText("현재 초당 money : " + nowmoney);
					} else if (cophave <= 0) {
						JOptionPane.showMessageDialog(null, "취업도 안했는데 뭔 퇴사 ㅠ3ㅠ");
					}
				}

				if (key == KeyEvent.VK_9) {
					if (codmaster >= 500) {
						codmaster -= 500;
						nowmoney += 10000;
						lab.setText("money : " + money);
						JOptionPane.showMessageDialog(null, "이 세계 용사가 됬어!!");
						cod.setText("코딩 실력 : " + codmaster);
						have.setText("파트너 수 : " + memberhave + " 노트북 소유 : " + notebookhave + " 코딩 책 소유 : " + bookhave
								+ " 회사 소유 : " + cophave);
						now.setText("현재 초당 money : " + nowmoney);
						TimerTask task = new TimerTask() {
							@Override
							public void run() {
								money = money + 10000;
								homeframe();
							}
						};
						lab.setText("money : " + money);

						new Timer().scheduleAtFixedRate(task, 01, 1000);
					}

					else if (codmaster < 500) {
						JOptionPane.showMessageDialog(null, "트럭에 치여도 이 세계를 갈 수 있어..");
					}
				}
				if (key == KeyEvent.VK_ESCAPE) {
					JOptionPane.showMessageDialog(null, "다음에 또 봐요 ^3^");
					System.exit(0);
				}
				if (key == KeyEvent.VK_BACK_SPACE) {
					new Start();
					dispose();
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
