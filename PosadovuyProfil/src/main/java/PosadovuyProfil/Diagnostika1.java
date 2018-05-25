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

public class Diagnostika1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_6;
	private Choice choice_6;
	private Choice choice_7;
	private Choice choice_8;
	private Choice choice_9;
	private Choice choice_10;
	private JLabel l_8;
	private JLabel l_9;
	private JLabel l_10;
	private JLabel l_7;

	private JLabel l_putanna1;

	private JButton button_1;
	private JButton button_2;
	private JLabel label;

	private JLabel l_fon;

	public Diagnostika1(final int i_RikNarodgenna, final int i_Stat, final int i_Temperament,
			final int i_Cimya, final int i_Profesia) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_6 = new JLabel("Який 11 місяць року ?");
		l_6.setForeground(new Color(255, 0, 255));
		l_6.setHorizontalAlignment(SwingConstants.CENTER);
		l_6.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_6.setBounds(12, 86, 372, 36);
		getContentPane().add(l_6);

		choice_6 = new Choice();
		choice_6.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_6.setBounds(390, 89, 146, 22);
		getContentPane().add(choice_6);
		choice_6.add("жовтень");
		choice_6.add("грудень");
		choice_6.add("листопад");
		choice_6.add("січень");

		l_7 = new JLabel("Який антонім до слова \"суворий\" ? ");
		l_7.setForeground(new Color(255, 0, 255));
		l_7.setHorizontalAlignment(SwingConstants.CENTER);
		l_7.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_7.setBounds(14, 135, 370, 36);
		getContentPane().add(l_7);

		choice_7 = new Choice();
		choice_7.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_7.setBounds(390, 138, 146, 22);
		getContentPane().add(choice_7);
		choice_7.add("різкий");
		choice_7.add("жорстокий");
		choice_7.add("м'який");
		choice_7.add("непомітний");

		l_8 = new JLabel("Що зайве ?");
		l_8.setForeground(new Color(255, 0, 255));
		l_8.setHorizontalAlignment(SwingConstants.CENTER);
		l_8.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_8.setBounds(14, 194, 370, 36);
		getContentPane().add(l_8);

		choice_8 = new Choice();
		choice_8.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_8.setBounds(390, 194, 146, 22);
		getContentPane().add(choice_8);

		choice_8.add("упевнений");
		choice_8.add("вірний");
		choice_8.add("сором'язливий");
		choice_8.add("чесний");

		l_9 = new JLabel("Що означає скорочення \"н. е.\" ?");
		l_9.setForeground(new Color(255, 0, 255));
		l_9.setHorizontalAlignment(SwingConstants.CENTER);
		l_9.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_9.setBounds(14, 255, 370, 36);
		getContentPane().add(l_9);

		choice_9 = new Choice();
		choice_9.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_9.setBounds(390, 255, 146, 22);
		getContentPane().add(choice_9);
		choice_9.add("нової ери");
		choice_9.add("нашої ери");
		choice_9.add("нової епохи");
		choice_9.add("нашої епохи");

		l_10 = new JLabel("Слова \"стук\" та \"сток\" є");
		l_10.setForeground(new Color(255, 0, 255));
		l_10.setHorizontalAlignment(SwingConstants.CENTER);
		l_10.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_10.setBounds(14, 319, 370, 36);
		getContentPane().add(l_10);

		choice_10 = new Choice();
		choice_10.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_10.setBounds(390, 319, 146, 22);
		getContentPane().add(choice_10);
		choice_10.add("подібними");
		choice_10.add("протилежними");
		choice_10.add("жодний варіант");

		l_putanna1 = new JLabel("6-10/25");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_putanna1.setBounds(31, 441, 93, 49);
		getContentPane().add(l_putanna1);

		button_1 = new JButton("Перейти до інших запитань");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s_choice_6 = choice_6.getSelectedItem();
				String s_choice_7 = choice_7.getSelectedItem();
				String s_choice_8 = choice_8.getSelectedItem();
				String s_choice_9 = choice_9.getSelectedItem();
				String s_choice_10 = choice_10.getSelectedItem();

				int i_choice_6 = 0;
				int i_choice_7 = 0;
				int i_choice_8 = 0;
				int i_choice_9 = 0;
				int i_choice_10 = 0;
				
				switch (s_choice_6) {
				case "жовтень": {
					i_choice_6 = 0;
				}
					break;
				case "грудень": {
					i_choice_6 = 1;
				}
					break;
				case "листопад": {
					i_choice_6 = 2;
				}
					break;
				case "січень": {
					i_choice_6 = 3;
				}
					break;
				}

				switch (s_choice_7) {
				case "різкий": {
					i_choice_7 = 0;
				}
					break;
				case "жорстокий": {
					i_choice_7 = 1;
				}
					break;
				case "м'який": {
					i_choice_7 = 2;
				}
					break;
				case "непомітний": {
					i_choice_7 = 3;
				}
					break;
				}
				
				switch (s_choice_8) {
				case "упевнений": {
					i_choice_8 = 0;
				}
					break;
				case "вірний": {
					i_choice_8 = 1;
				}
					break;
				case "сором'язливий": {
					i_choice_8 = 2;
				}
					break;
				case "чесний": {
					i_choice_8 = 3;
				}
					break;
				}
				
				switch (s_choice_9) {
				case "нової ери": {
					i_choice_9 = 0;
				}
					break;
				case "нашої ери": {
					i_choice_9 = 1;
				}
					break;
				case "нової епохи": {
					i_choice_9 = 2;
				}
					break;
				case "нашої епохи": {
					i_choice_9 = 2;
				}
					break;
				}
				
				switch (s_choice_10) {
				case "подібними": {
					i_choice_10 = 0;
				}
					break;
				case "протилежними": {
					i_choice_10 = 1;
				}
					break;
				case "жодний варіант": {
					i_choice_10 = 2;
				}
					break;
				}

				new Diagnostika2(i_RikNarodgenna, i_Stat, i_Temperament, i_Cimya, i_Profesia, i_choice_6, i_choice_7,
						i_choice_8, i_choice_9, i_choice_10);
				setVisible(false);
			}
		});
		button_1.setForeground(new Color(255, 140, 0));
		button_1.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		button_1.setBounds(160, 406, 386, 49);
		getContentPane().add(button_1);

		button_2 = new JButton("Меню");
		button_2.addActionListener(new ActionListener() {
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
		button_2.setForeground(new Color(255, 140, 0));
		button_2.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		button_2.setBounds(160, 468, 386, 49);
		getContentPane().add(button_2);

		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("res/Diagnostika/chef.png"));
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
