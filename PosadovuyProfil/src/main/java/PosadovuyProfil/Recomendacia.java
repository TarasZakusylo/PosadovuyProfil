package PosadovuyProfil;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class Recomendacia extends JFrame {

	private static final long serialVersionUID = 1L;

	public Recomendacia(String s_posulanna) {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(990, 605);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 990, 570);
		getContentPane().add(scrollPane);
		
		JLabel label = new JLabel("");
		scrollPane.setViewportView(label);
		label.setIcon(new ImageIcon("res/Rekomendacii/"+s_posulanna+".PNG"));
		
		setVisible(true);
	}
}
