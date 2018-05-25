package PosadovuyProfil;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Diagnostika2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_11;
	private Choice choice_11;
	private Choice choice_12;
	private Choice choice_13;
	private Choice choice_14;
	private Choice choice_15;
	private JLabel l_13;
	private JLabel l_14;
	private JLabel l_15;
	private JLabel l_12;

	private JLabel l_putanna2;
	private JButton button;
	private JButton button_1;
	private JLabel label;

	private JLabel l_fon;

	public Diagnostika2(final int i_RikNarodgenna, final int i_Stat, final int i_Zrist, final int i_Vaga,
			final int i_Profesia, final int i_choice_6, final int i_choice_7, final int i_choice_8,
			final int i_choice_9, final int i_choice_10) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_11 = new JLabel("Яке число найменше ?");
		l_11.setForeground(new Color(255, 0, 255));
		l_11.setHorizontalAlignment(SwingConstants.CENTER);
		l_11.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		l_11.setBounds(-2, 84, 428, 36);
		getContentPane().add(l_11);

		choice_11 = new Choice();
		choice_11.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_11.setBounds(444, 88, 93, 24);
		getContentPane().add(choice_11);
		choice_11.add("6");
		choice_11.add("0.7");
		choice_11.add("0.19");
		choice_11.add("0.10");

		l_12 = new JLabel("Продовжте послідовність 73 66 59 52 45 38 ..");
		l_12.setForeground(new Color(255, 0, 255));
		l_12.setHorizontalAlignment(SwingConstants.CENTER);
		l_12.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_12.setBounds(-2, 140, 428, 36);
		getContentPane().add(l_12);

		choice_12 = new Choice();
		choice_12.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_12.setBounds(442, 144, 95, 24);
		getContentPane().add(choice_12);
		choice_12.add("36");
		choice_12.add("34");
		choice_12.add("32");
		choice_12.add("30");

		l_13 = new JLabel("Виправіть помилку у рядку [4 8 8 4 8 8 4 8 6]");
		l_13.setForeground(new Color(255, 0, 255));
		l_13.setHorizontalAlignment(SwingConstants.CENTER);
		l_13.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_13.setBounds(-2, 263, 428, 36);
		getContentPane().add(l_13);

		choice_13 = new Choice();
		choice_13.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_13.setBounds(442, 264, 95, 24);
		getContentPane().add(choice_13);
		choice_13.add("2");
		choice_13.add("4");
		choice_13.add("6");
		choice_13.add("8");

		l_14 = new JLabel("У вересні тривалість дня такаж як і у ..");
		l_14.setForeground(new Color(255, 0, 255));
		l_14.setHorizontalAlignment(SwingConstants.CENTER);
		l_14.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_14.setBounds(-2, 201, 428, 36);
		getContentPane().add(l_14);

		choice_14 = new Choice();
		choice_14.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_14.setBounds(442, 202, 95, 24);
		getContentPane().add(choice_14);
		choice_14.add("травні");
		choice_14.add("квітні");
		choice_14.add("березні");
		choice_14.add("лютому");

		l_15 = new JLabel("А = В; В > C; A > D.                 C > D ?");
		l_15.setForeground(new Color(255, 0, 255));
		l_15.setHorizontalAlignment(SwingConstants.CENTER);
		l_15.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_15.setBounds(-2, 334, 428, 36);
		getContentPane().add(l_15);

		choice_15 = new Choice();
		choice_15.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_15.setBounds(442, 335, 95, 24);
		getContentPane().add(choice_15);
		choice_15.add("Так, більше");
		choice_15.add("Ні, менше");
		choice_15.add("Невідомо");

		l_putanna2 = new JLabel("11-15/25");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_putanna2.setBounds(12, 434, 125, 49);
		getContentPane().add(l_putanna2);
		
		button = new JButton("Перейти до інших запитань");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s_choice_11 = choice_11.getSelectedItem();
				String s_choice_12 = choice_12.getSelectedItem();
				String s_choice_13 = choice_13.getSelectedItem();
				String s_choice_14 = choice_14.getSelectedItem();
				String s_choice_15 = choice_15.getSelectedItem();

				int i_choice_11 = 0;
				int i_choice_12 = 0;
				int i_choice_13 = 0;
				int i_choice_14 = 0;
				int i_choice_15 = 0;

				switch (s_choice_11) {
				case "6": {
					i_choice_11 = 0;
				}
					break;
				case "0.7": {
					i_choice_11 = 1;
				}
					break;
				case "0.19": {
					i_choice_11 = 2;
				}
					break;
				case "0.10": {
					i_choice_11 = 2;
				}
					break;
				}

				switch (s_choice_12) {
				case "36": {
					i_choice_12 = 0;
				}
					break;
				case "34": {
					i_choice_12 = 1;
				}
					break;
				case "32": {
					i_choice_12 = 2;
				}
					break;
				case "30": {
					i_choice_12 = 2;
				}
					break;
				}
				
				switch (s_choice_13) {
				case "2": {
					i_choice_13 = 0;
				}
					break;
				case "4": {
					i_choice_13 = 1;
				}
					break;
				case "6": {
					i_choice_13 = 2;
				}
					break;
				case "8": {
					i_choice_13 = 3;
				}
					break;
				}
				
				switch (s_choice_14) {
				case "травні": {
					i_choice_14 = 0;
				}
					break;
				case "квітні": {
					i_choice_14 = 1;
				}
					break;
				case "березні": {
					i_choice_14 = 2;
				}
					break;
				case "лютому": {
					i_choice_14 = 3;
				}
					break;
				}
				
				switch (s_choice_15) {
				case "Так, більше": {
					i_choice_15 = 0;
				}
					break;
				case "Ні, менше": {
					i_choice_15 = 1;
				}
					break;
				case "Невідомо": {
					i_choice_15 = 2;
				}
					break;
				}

				new Diagnostika3(i_RikNarodgenna, i_Stat, i_Zrist, i_Vaga, i_Profesia, i_choice_6, i_choice_7,
						i_choice_8, i_choice_9, i_choice_10, i_choice_11, i_choice_12, i_choice_13, i_choice_14,
						i_choice_15);
				setVisible(false);
			}
		});
		button.setForeground(new Color(255, 140, 0));
		button.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		button.setBounds(151, 404, 386, 49);
		getContentPane().add(button);
		
		button_1 = new JButton("Меню");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "Так, перейти", "Ні, залишитись" };
				int i_menu = JOptionPane.showOptionDialog(null, "Бажаєте перейти в меню ? Введені дані не збережуться.",
						"Попередження", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
						null);
				if (i_menu == 0) {
					new Menu("Посадовий профіль");
					setVisible(false);
				}
			}
		});
		button_1.setForeground(new Color(255, 140, 0));
		button_1.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		button_1.setBounds(151, 466, 386, 49);
		getContentPane().add(button_1);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("res/Diagnostika/chemist.png"));		
		label.setBounds(558, 24, 436, 506);
		getContentPane().add(label);

		l_fon = new JLabel("");
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/Reestracia.png"));
		l_fon.setBounds(-1, 0, 995, 572);
		getContentPane().add(l_fon);
		
		setVisible(true);

	}
}
