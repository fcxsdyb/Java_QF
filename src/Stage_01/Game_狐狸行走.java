package Stage_01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game_�������� {
	// TODO:�������������ڴ�

	int x = 500;
	int y = 500;
	int position = 0;
	int move = 0;

	int a = 0;
	int b = 0;

	���� ck = null;
	��ʱ�� ds1 = null;

	Game_��������() {
		// TODO:�����ʼ���ڴ�

		ck = new ����();
		// ���� ��+2*�����, ��+2*�����+������
		ck.setSize(5 * 2 + 1000, 700 + 2 * 5 + 25);
		// �趨���ڿɼ���setVisible true/false
		ck.setVisible(true);
		// ��ʱ�ĺ���
		ds1 = new ��ʱ��(50);
	}

	class ���� extends JFrame {
		�˵� cd = null;
		��� mb = null;
		���ڼ����� exit = null;
		���̼����� jp = null;

		����() {
			jp = new ���̼�����();
			this.addKeyListener(jp);

			cd = new �˵�();
			this.setJMenuBar(cd);

			mb = new ���();
			this.add(mb);

			exit = new ���ڼ�����();
			this.addWindowListener(exit);

			this.repaint();
		}

		class �˵� extends JMenuBar {
			JMenu dan; // �˵�
			JMenuItem xiang1; // �˵���

			�˵������� cdjtq;

			�˵�() {
				dan = new JMenu("��Ϸ"); // �˵�
				xiang1 = new JMenuItem("����"); // �˵���

				this.add(dan);
				dan.add(xiang1);

				cdjtq = new �˵�������();
				xiang1.addActionListener(cdjtq);
			}

			class �˵������� implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					// TODO:�˵��¼�����
					if (e.getSource() == xiang1) {

					}
				}
			}
		}

		class ���ڼ����� extends WindowAdapter {
			public void windowClosing(WindowEvent e) {
				ds1.xc.stop();
				System.exit(0);
			}
		}

		class ���̼����� implements KeyListener {
			// TODO:���̴����ɼ���KeyEvent.VK_XXX
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:// ��
					position = 2;
					break;
				case KeyEvent.VK_RIGHT:// ��
					position = 0;
					break;
				case KeyEvent.VK_UP:// ��
					position = 1;
					break;
				case KeyEvent.VK_DOWN:// ��
					position = 3;
					break;
				}
				repaint();

			}

			public void keyReleased(KeyEvent e) {
			}

			public void keyTyped(KeyEvent e) {
			}
		}

		class ��� extends JPanel {
			�������� sb = null;

			���() {
				sb = new ��������();
				this.addMouseListener(sb);
				this.addMouseMotionListener(sb);
			}

			class �������� extends MouseAdapter implements MouseMotionListener {
				public void mousePressed(MouseEvent e) {
				}

				public void mouseDragged(MouseEvent e) {
				}

				public void mouseMoved(MouseEvent e) {
				}

				public void mouseReleased(MouseEvent e) {
				}

				public void mouseClicked(MouseEvent e)// ��굥��
				{
					// mx my����λ��
					int mx = e.getX();
					int my = e.getY();
					// ������ BUTTON1���Ҽ�BUTTON3
					if (e.getButton() == MouseEvent.BUTTON1) {
						// TODO:����������

					}

					repaint();
				}
			}

			public void paint(Graphics g) {
				// g.setColor(Color.BLUE); //�趨��ɫ��RED GREEN BLUE ORANGE WHITE GRAY BLACK PINK
				// g.drawRect(��,��,��,��); //����
				// g.fillRect(��,��,��,��); //ʵ�ľ���
				// g.drawOval(��,��,��,��); //��Բ
				// g.fillOval(��,��,��,��); //ʵ����Բ

				// Image tu=(new ImageIcon( ·�� )).getImage(); //·����ͼƬ-�Ҽ�-����-·��src/
				// g.drawImage(tu,x,y,null);

				// TODO:��ͼ�ڴ�

				Image tu = (new ImageIcon("src/Stage_01/fox_game/5.png")).getImage();
				g.drawImage(tu, a, b, null);

				Image action = (new ImageIcon("src/Stage_01/fox_game/" + position + "-" + move + ".png")).getImage();
				g.drawImage(action, x, y, null);

			}
		}
	}

	class ��ʱ�� implements Runnable// ʵ��Runnable�ӿ�
	{
		Thread xc = null;
		long jianGe;

		��ʱ��(long jianGe) {
			this.jianGe = jianGe;
			xc = new Thread(this);
			xc.start();
		}

		public void run() {
			while (true) {
				try {
					xc.sleep(jianGe);

					if (this == ds1) {
						// TODO:��ʱ����

						if (position == 0) {
							if (x < 900) {
								x += 20;
							} else {
								if (a <= -2200) {

								} else {
									a -= 20;
								}
							}
						} else if (position == 1) {
							if (y > 0) {
								y -= 20;
							} else {
								if (b < 0) {
									b += 20;
								}
							}
						} else if (position == 2) {
							if (x > 0) {
								x -= 20;
							} else {
								if (a < 0) {
									a += 20;
								}
							}
						} else if (position == 3) {
							if (y < 550) {
								y += 20;
							} else {
								if (b <= 0) {
									
								} else {
									b -= 20;
								}
							}
						}

						if (move >= 3) {
							move = 0;
						} else {
							move++;
						}

						ck.repaint();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// main������ ������ġ���ڷ�����
	public static void main(String[] args) {
		new Game_��������();
	}
}
