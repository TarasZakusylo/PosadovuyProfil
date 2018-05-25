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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Diagnostika extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextField t_RikNarodgenna;
	private Choice choice_Stat;
	private JLabel l_putanna;
	private Choice choice_Profesia;
	private JLabel l_Vvedit;
	private JLabel l_Stat;
	private JLabel l_Zrist;
	private JLabel l_RikNarodgenna;
	private JLabel l_Profesia;
	private JLabel l_Vaga;
	private JButton btnNewButton;
	private Choice choice_cimya;
	private Choice choice_temperament;

	private JLabel l_fon;

	public Diagnostika(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Vvedit = new JLabel("Введіть персональні дані:");
		l_Vvedit.setHorizontalAlignment(SwingConstants.CENTER);
		l_Vvedit.setForeground(new Color(255, 0, 255));
		l_Vvedit.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Vvedit.setBounds(12, 24, 515, 36);
		getContentPane().add(l_Vvedit);

		l_Stat = new JLabel("Стать");
		l_Stat.setHorizontalAlignment(SwingConstants.CENTER);
		l_Stat.setForeground(new Color(255, 0, 255));
		l_Stat.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Stat.setBounds(10, 136, 316, 36);
		getContentPane().add(l_Stat);

		l_RikNarodgenna = new JLabel("Рік народження");
		l_RikNarodgenna.setHorizontalAlignment(SwingConstants.CENTER);
		l_RikNarodgenna.setForeground(new Color(255, 0, 255));
		l_RikNarodgenna.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_RikNarodgenna.setBounds(12, 87, 314, 36);
		getContentPane().add(l_RikNarodgenna);

		l_Zrist = new JLabel("Темперамент");
		l_Zrist.setHorizontalAlignment(SwingConstants.CENTER);
		l_Zrist.setForeground(new Color(255, 0, 255));
		l_Zrist.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Zrist.setBounds(10, 195, 316, 36);
		getContentPane().add(l_Zrist);

		l_Vaga = new JLabel("Сімейний стан");
		l_Vaga.setHorizontalAlignment(SwingConstants.CENTER);
		l_Vaga.setForeground(new Color(255, 0, 255));
		l_Vaga.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Vaga.setBounds(10, 256, 316, 36);
		getContentPane().add(l_Vaga);

		l_Profesia = new JLabel("Професію");
		l_Profesia.setHorizontalAlignment(SwingConstants.CENTER);
		l_Profesia.setForeground(new Color(255, 0, 255));
		l_Profesia.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Profesia.setBounds(10, 320, 316, 36);
		getContentPane().add(l_Profesia);

		t_RikNarodgenna = new JTextField();
		t_RikNarodgenna.setBounds(338, 98, 189, 24);
		getContentPane().add(t_RikNarodgenna);
		t_RikNarodgenna.setColumns(10);

		choice_cimya = new Choice();
		choice_cimya.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_cimya.setBounds(336, 268, 191, 24);
		getContentPane().add(choice_cimya);
		choice_cimya.add("неодружений(а)");
		choice_cimya.add("одружений(а)");
		choice_cimya.add("в активному пошуку");

		choice_temperament = new Choice();
		choice_temperament.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_temperament.setBounds(336, 207, 191, 24);
		getContentPane().add(choice_temperament);
		choice_temperament.add("сангвінік");
		choice_temperament.add("флегматик");
		choice_temperament.add("меланхолік");
		choice_temperament.add("холерик");

		choice_Profesia = new Choice();
		choice_Profesia.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_Profesia.setBounds(336, 334, 191, 24);
		getContentPane().add(choice_Profesia);
		choice_Profesia.add("студент");
		choice_Profesia.add("фізична робота");
		choice_Profesia.add("інтелектуальна робота");

		choice_Stat = new Choice();
		choice_Stat.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_Stat.setBounds(336, 150, 191, 24);
		getContentPane().add(choice_Stat);
		choice_Stat.add("чоловіча");
		choice_Stat.add("жіноча");

		l_putanna = new JLabel("1-5/25");
		l_putanna.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_putanna.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna.setBounds(12, 440, 84, 49);
		getContentPane().add(l_putanna);

		JButton b_Menu = new JButton("Меню");
		b_Menu.setForeground(new Color(255, 140, 0));
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		b_Menu.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Menu.setBounds(115, 470, 386, 49);
		getContentPane().add(b_Menu);

		btnNewButton = new JButton("Перейти до інших запитань");
		btnNewButton.setForeground(new Color(255, 140, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		btnNewButton.addActionListener(new ActionListener() {

			private String s_RikNarodgenna;
			private int i_RikNarodgenna;

			public void actionPerformed(ActionEvent arg0) {

				s_RikNarodgenna = t_RikNarodgenna.getText();

				if (s_RikNarodgenna.equals("") || s_RikNarodgenna.equals(" ") || s_RikNarodgenna.equals("  ")
						|| s_RikNarodgenna.equals("   ")) {
					JOptionPane.showMessageDialog(null, "Введіть рік народження");
				} else {

					try {
						i_RikNarodgenna = Integer.parseInt(s_RikNarodgenna);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Перевірте введення");
					}
					if (i_RikNarodgenna > 1900 && i_RikNarodgenna <= 2017) {

						String s_Stat = choice_Stat.getSelectedItem();
						String s_Profesia = choice_Profesia.getSelectedItem();
						String s_choice_temperament = choice_temperament.getSelectedItem();
						String s_choice_cimya = choice_cimya.getSelectedItem();

						int i_Stat = 0;
						int i_Profesia = 0;
						int i_choice_temperament = 0;
						int i_choice_cimya = 0;

						switch (s_Stat) {
						case "чоловіча": {
							i_Stat = 0;
						}
							break;
						case "жіноча": {
							i_Stat = 1;
						}
							break;
						}

						switch (s_choice_temperament) {
						case "холерик": {
							i_Stat = 0;
						}
							break;
						case "флегматик": {
							i_Stat = 1;
						}
							break;
						case "меланхолік": {
							i_Stat = 2;
						}
							break;
						case "сангвінік": {
							i_Stat = 3;
						}
							break;
						}

						switch (s_choice_cimya) {
						case "неодружений(а)": {
							i_Profesia = 0;
						}
						case "одружений(а)": {
							i_Profesia = 1;
						}
						case "в активному пошуку": {
							i_Profesia = 2;
						}
							break;
						}

						switch (s_Profesia) {
						case "студент": {
							i_Profesia = 0;
						}
						case "фізична робота": {
							i_Profesia = 1;
						}
						case "інтелектуальна робота": {
							i_Profesia = 2;
						}
							break;
						}

						new Diagnostika1(i_RikNarodgenna, i_Stat, i_choice_temperament, i_choice_cimya, i_Profesia);
						setVisible(false);

					} else {
						JOptionPane.showMessageDialog(null, "Помилковий рік народження");
					}
				}
			}
		});
		btnNewButton.setBounds(115, 408, 386, 49);
		getContentPane().add(btnNewButton);

		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("res/Diagnostika/builder.png"));
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
