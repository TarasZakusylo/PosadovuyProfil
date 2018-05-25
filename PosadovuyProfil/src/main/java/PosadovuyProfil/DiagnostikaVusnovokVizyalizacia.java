package PosadovuyProfil;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DiagnostikaVusnovokVizyalizacia extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_fon;
	boolean d_Ocinka = false;
	boolean d_Error = false;
	String s_Error = "";
	private JLabel l_analiz_danuh;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;

	public DiagnostikaVusnovokVizyalizacia(final String s_IMT, final String s_RekomendaciiZagalni,
			final String s_RekomendaciiPerconalni, int i_Vegeterianstvo, final int i_Ocinka, final int i_Error,
			final String s_Dunamika) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton b_Menu = new JButton("Меню");
		b_Menu.setForeground(Color.MAGENTA);
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Menu("Посадовий профіль");
				setVisible(false);
			}
		});
		b_Menu.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Menu.setBounds(596, 503, 386, 49);
		getContentPane().add(b_Menu);

		JLabel l_Kartunka = new JLabel("");
		l_Kartunka.setIcon(new ImageIcon("res/DiagnostukaRezultatu.jpg"));
		l_Kartunka.setIcon(new ImageIcon("res/DiagnostukaRezultatu (зменшенна).png"));
		l_Kartunka.setBounds(608, 69, 386, 386);
		getContentPane().add(l_Kartunka);

		l_analiz_danuh = new JLabel("Здатність  аналізувати  дані:  " + rand() + " %");
		l_analiz_danuh.setHorizontalAlignment(SwingConstants.CENTER);
		l_analiz_danuh.setFont(new Font("Times New Roman", Font.ITALIC, 27));
		l_analiz_danuh.setForeground(Color.ORANGE);
		l_analiz_danuh.setBounds(24, 96, 551, 49);
		getContentPane().add(l_analiz_danuh);

		label_1 = new JLabel("Гнучкість  думок:  " + rand() + " %");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.ITALIC, 27));
		label_1.setForeground(Color.ORANGE);
		label_1.setBounds(24, 261, 551, 49);
		getContentPane().add(label_1);

		label_2 = new JLabel("Концентрація  думок:  " + rand() + " %");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.ITALIC, 27));
		label_2.setForeground(Color.ORANGE);
		label_2.setBounds(24, 340, 551, 49);
		getContentPane().add(label_2);

		label_3 = new JLabel("Загальний  стан  здоров'я:  " + rand() + " %");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Times New Roman", Font.ITALIC, 27));
		label_3.setForeground(Color.ORANGE);
		label_3.setBounds(24, 423, 551, 49);
		getContentPane().add(label_3);

		label = new JLabel("Емоційна  стійкість:  " + rand() + " %");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.ITALIC, 27));
		label.setForeground(Color.ORANGE);
		label.setBounds(24, 177, 551, 49);
		getContentPane().add(label);

		l_fon = new JLabel("");
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/Reestracia.png"));
		l_fon.setBounds(-1, 0, 995, 572);
		getContentPane().add(l_fon);

		setVisible(true);

	}

	int rand() {
		int rand = 0;
		while (rand < 30) {
			// while (rand > 90) {
			if (rand > 90) {
				rand = rand - 30;
			} else {
				rand = 10 + (int) (Math.random() * 80);
			}
			// }
		}
		return rand;
	}

}
