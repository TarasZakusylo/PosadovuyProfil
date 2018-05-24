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

public class Diagnostika3 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_16;
	private Choice choice_16;
	private Choice choice_17;
	private Choice choice_18;
	private Choice choice_19;
	private Choice choice_20;
	private JLabel l_18;
	private JLabel l_19;
	private JLabel l_20;
	private JLabel l_17;

	private JLabel l_putanna3;
	private JButton button;
	private JButton button_1;

	private JLabel l_fon;

	public Diagnostika3(final int i_RikNarodgenna, final int i_Stat, final int i_Zrist, final int i_Vaga,
			final int i_Profesia, final int i_choice_6, final int i_choice_7, final int i_choice_8,
			final int i_choice_9, final int i_choice_10, final int i_choice_11, final int i_choice_12,
			final int i_choice_13, final int i_choice_14, final int i_choice_15) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_16 = new JLabel("Встигаєте поснідати ?");
		l_16.setForeground(new Color(255, 105, 180));
		l_16.setHorizontalAlignment(SwingConstants.CENTER);
		l_16.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_16.setBounds(-1, 92, 349, 36);
		getContentPane().add(l_16);

		choice_16 = new Choice();
		choice_16.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_16.setBounds(359, 97, 204, 31);
		getContentPane().add(choice_16);
		choice_16.add("Завжди снідаю");
		choice_16.add("Іноді");
		choice_16.add("Ніколи");

		l_17 = new JLabel("Чи вживаєте Ви молочні продукти ?");
		l_17.setForeground(new Color(255, 105, 180));
		l_17.setHorizontalAlignment(SwingConstants.CENTER);
		l_17.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_17.setBounds(1, 141, 347, 36);
		getContentPane().add(l_17);

		choice_17 = new Choice();
		choice_17.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_17.setBounds(359, 146, 204, 31);
		getContentPane().add(choice_17);
		choice_17.add("Регулярно");
		choice_17.add("Іноді");
		choice_17.add("Ніколи не вживаю");

		l_18 = new JLabel("Ваше харчування різноманітне ?");
		l_18.setForeground(new Color(255, 105, 180));
		l_18.setHorizontalAlignment(SwingConstants.CENTER);
		l_18.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_18.setBounds(1, 200, 347, 36);
		getContentPane().add(l_18);

		choice_18 = new Choice();
		choice_18.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_18.setBounds(359, 202, 204, 31);
		getContentPane().add(choice_18);
		choice_18.add("Постійно, мені це цікаво");
		choice_18.add("Якщо є час");
		choice_18.add("Ніколи");

		l_19 = new JLabel("Як часто Ви вживаєте алкоголь ?");
		l_19.setForeground(new Color(255, 105, 180));
		l_19.setHorizontalAlignment(SwingConstants.CENTER);
		l_19.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_19.setBounds(1, 261, 347, 36);
		getContentPane().add(l_19);

		choice_19 = new Choice();
		choice_19.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_19.setBounds(359, 263, 204, 31);
		getContentPane().add(choice_19);
		choice_19.add("Ніколи");
		choice_19.add("Раз на 3 місяці");
		choice_19.add("Раз на місять");
		choice_19.add("Частіше ніж раз на тиждень");

		l_20 = new JLabel("Як часто Ви вживаєте жирну їжу ?");
		l_20.setForeground(new Color(255, 105, 180));
		l_20.setHorizontalAlignment(SwingConstants.CENTER);
		l_20.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_20.setBounds(1, 325, 347, 36);
		getContentPane().add(l_20);

		choice_20 = new Choice();
		choice_20.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_20.setBounds(359, 327, 204, 31);
		getContentPane().add(choice_20);
		choice_20.add("Дуже рідко");
		choice_20.add("Раз на тиждень");
		choice_20.add("Не уявляю свого життя без неї");

		l_putanna3 = new JLabel("16-20/25");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_putanna3.setBounds(12, 434, 120, 49);
		getContentPane().add(l_putanna3);

		button = new JButton("Перейти до інших запитань");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_choice_16 = choice_16.getSelectedItem();
				String s_choice_17 = choice_17.getSelectedItem();
				String s_choice_18 = choice_18.getSelectedItem();
				String s_choice_19 = choice_19.getSelectedItem();
				String s_choice_20 = choice_20.getSelectedItem();

				int i_choice_16 = 0;
				int i_choice_17 = 0;
				int i_choice_18 = 0;
				int i_choice_19 = 0;
				int i_choice_20 = 0;

				switch (s_choice_16) {
				case "Завжди снідаю": {
					i_choice_16 = 0;
				}
					break;
				case "Іноді": {
					i_choice_16 = 1;
				}
					break;
				case "Ніколи": {
					i_choice_16 = 2;
				}
					break;
				}

				switch (s_choice_17) {
				case "Регулярно": {
					i_choice_17 = 0;
				}
					break;
				case "Іноді": {
					i_choice_17 = 1;
				}
					break;
				case "Ніколи не вживаю": {
					i_choice_17 = 2;
				}
					break;
				}

				switch (s_choice_18) {
				case "Постійно, мені це цікаво": {
					i_choice_18 = 0;
				}
					break;
				case "Якщо є час": {
					i_choice_18 = 1;
				}
					break;
				case "Ніколи": {
					i_choice_18 = 2;
				}
					break;
				}

				switch (s_choice_19) {
				case "Ніколи": {
					i_choice_19 = 0;
				}
					break;
				case "Раз на 3 місяці": {
					i_choice_19 = 1;
				}
					break;
				case "Раз на місять": {
					i_choice_19 = 2;
				}
					break;
				case "Частіше ніж раз на тиждень": {
					i_choice_19 = 3;
				}
					break;
				}

				switch (s_choice_20) {
				case "Дуже рідко": {
					i_choice_20 = 0;
				}
					break;
				case "Раз на тиждень": {
					i_choice_20 = 1;
				}
					break;
				case "Не уявляю свого життя без неї": {
					i_choice_20 = 2;
				}
					break;
				}

				new Diagnostika4(i_RikNarodgenna, i_Stat, i_Zrist, i_Vaga, i_Profesia, i_choice_6, i_choice_7,
						i_choice_8, i_choice_9, i_choice_10, i_choice_11, i_choice_12, i_choice_13, i_choice_14,
						i_choice_15, i_choice_16, i_choice_17, i_choice_18, i_choice_19, i_choice_20);
				setVisible(false);
			}
		});
		button.setForeground(new Color(255, 140, 0));
		button.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		button.setBounds(144, 404, 386, 49);
		getContentPane().add(button);

		button_1 = new JButton("Меню");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "Так, перейти", "Ні, залишитись" };
				int i_menu = JOptionPane.showOptionDialog(null, "Бажаєте перейти в меню ? Введені дані не збережуться.",
						"Попередження", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
						null);
				if (i_menu == 0) {
					new Menu("Дієтолог");
					setVisible(false);
				}
			}
		});
		button_1.setForeground(new Color(255, 140, 0));
		button_1.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		button_1.setBounds(144, 466, 386, 49);
		getContentPane().add(button_1);

		JLabel label = new JLabel("");
		label.setBounds(569, 0, 425, 565);
		label.setIcon(new ImageIcon("res/Diagnostika3.jpg"));
		getContentPane().add(label);

		l_fon = new JLabel("");
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/Reestracia.png"));
		l_fon.setBounds(-1, 0, 995, 572);
		getContentPane().add(l_fon);

		setVisible(true);

	}
}
