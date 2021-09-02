import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Second extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second frame = new Second();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Second() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 284);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("關於");
		
		JLabel lblNewLabel_1 = new JLabel("開發者：陸紀豪 經濟一");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(28, 20, 130, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("版本：2.0");
		lblNewLabel_1_1.setForeground(Color.PINK);
		lblNewLabel_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(28, 160, 130, 36);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("學號：B08303113");
		lblNewLabel_1_1_1.setForeground(Color.PINK);
		lblNewLabel_1_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(28, 47, 130, 36);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("此程式供老師及學生進行快速地調式查詢");
		lblNewLabel_1_1_1_1.setForeground(Color.PINK);
		lblNewLabel_1_1_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(28, 114, 216, 36);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("補齊其餘調式，新增藍調與五聲音階");
		lblNewLabel_1_1_2.setForeground(Color.PINK);
		lblNewLabel_1_1_2.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(28, 184, 216, 36);
		contentPane.add(lblNewLabel_1_1_2);
	}
}
