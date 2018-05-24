package PosadovuyProfil;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Avtor extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel Label_NazvaEmblema;
	private JLabel label_Login;
	private JTextField textField_Login;
	private JLabel label_Password;
	private JPasswordField passwordField_Password;
	private JButton b_Yvijtu;
	private JButton b_Reestracia;

	private JLabel l_fon;

	public Avtor(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		Label_NazvaEmblema = new JLabel("ПОСАДОВИЙ");
		Label_NazvaEmblema.setForeground(Color.RED);
		Label_NazvaEmblema.setFont(new Font("Monotype Corsiva", Font.BOLD, 55));
		Label_NazvaEmblema.setHorizontalAlignment(SwingConstants.CENTER);
		Label_NazvaEmblema.setBounds(296, 13, 686, 63);
		getContentPane().add(Label_NazvaEmblema);

		JLabel label = new JLabel("ПРОФІЛЬ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("Monotype Corsiva", Font.BOLD, 55));
		label.setBounds(296, 77, 686, 63);
		getContentPane().add(label);

		label_Login = new JLabel("Логін");
		label_Login.setForeground(new Color(0, 0, 205));
		label_Login.setHorizontalAlignment(SwingConstants.CENTER);
		label_Login.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		label_Login.setBounds(533, 153, 231, 29);
		getContentPane().add(label_Login);

		textField_Login = new JTextField();
		textField_Login.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		textField_Login.setToolTipText("");
		textField_Login.setText("1");
		textField_Login.setBounds(533, 205, 231, 36);
		getContentPane().add(textField_Login);
		textField_Login.setColumns(10);

		label_Password = new JLabel("Пароль");
		label_Password.setForeground(new Color(0, 0, 205));
		label_Password.setHorizontalAlignment(SwingConstants.CENTER);
		label_Password.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		label_Password.setBounds(533, 270, 231, 29);
		getContentPane().add(label_Password);

		passwordField_Password = new JPasswordField();
		passwordField_Password.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		passwordField_Password.setToolTipText("");
		passwordField_Password.setText("1");
		passwordField_Password.setBounds(531, 312, 231, 36);
		getContentPane().add(passwordField_Password);

		b_Yvijtu = new JButton("Увійти");
		b_Yvijtu.setForeground(Color.BLACK);
		b_Yvijtu.addActionListener(new ActionListener() {
			
			private String s_Login;
			private String s_Password;

			private Scanner scanner_Avtoruzacia;
			private String s_Avtoruzacia;

			String[][] Reading = new String[1][4];
			private String Reading_Password;
			private String Reading_Name;
			private String Reading_Prizvusko;
			private Formatter formatter_RobocuyProfil;

			@SuppressWarnings("deprecation")

			public void actionPerformed(ActionEvent arg0) {
				s_Login = textField_Login.getText();
				s_Password = passwordField_Password.getText();

				try {
					scanner_Avtoruzacia = new Scanner(new File("res/Avtoruzacia/" + s_Login + ".txt"));

					while (scanner_Avtoruzacia.hasNext()) {
						for (int row = 0; row < Reading.length; row++) {
							Reading_Password = " ";
							Reading_Name = " ";
							Reading_Prizvusko = " ";
							for (int col = 0; col < Reading[row].length; col++) {
								Reading[row][col] = scanner_Avtoruzacia.next();
								if (col == 0) {
									Reading_Password = Reading[row][col];
								}
								if (col == 1) {
									Reading_Name = Reading[row][col];
								}
								if (col == 2) {
									Reading_Prizvusko = Reading[row][col];
								}
							}
						}
					}
					s_Avtoruzacia = Reading_Password;
					scanner_Avtoruzacia.close();

					if (s_Password.equals(s_Avtoruzacia)) {
						JOptionPane.showMessageDialog(null, "Вітаю, Ви в системі");

						String s_Korustuvac = Reading_Name + " " + Reading_Prizvusko;

						try {
							formatter_RobocuyProfil = new Formatter("res/TumcasoviFaylu/Korustuvac.txt");
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "System Error");
						}
						formatter_RobocuyProfil.format(s_Korustuvac);
						formatter_RobocuyProfil.close();

						new Menu("Посадовий профіль");
						setVisible(false);
					} else {
						JOptionPane.showMessageDialog(null, "Помилка введення");
						passwordField_Password.setText("");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Помилка введення");
				}
			}
		});
		b_Yvijtu.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Yvijtu.setBounds(531, 391, 231, 36);
		getContentPane().add(b_Yvijtu);

		b_Reestracia = new JButton("Реєстрація");
		b_Reestracia.setForeground(Color.BLACK);
		b_Reestracia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Reestrasia("Посадовий профіль");
				setVisible(false);
			}
		});
		b_Reestracia.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Reestracia.setBounds(531, 457, 231, 36);
		getContentPane().add(b_Reestracia);

		l_fon = new JLabel("");
		l_fon.setForeground(new Color(0, 0, 205));
//		l_fon.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\avtoruzacia (зменшена).jpg"));
		l_fon.setIcon(new ImageIcon("res/fon/avtoruzacia (зменшена).jpg"));
		l_fon.setBounds(-1, 0, 995, 565);
		getContentPane().add(l_fon);

		setVisible(true);
	}
}
