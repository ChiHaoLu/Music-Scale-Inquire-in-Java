import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Scale extends JFrame{

    
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scale frame = new Scale();
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
	public Scale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 244);
		setTitle("調式查詢v.2");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("說明");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("關於");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Second newwindow = new Second();
				newwindow.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.DARK_GRAY);
		comboBox.setForeground(Color.PINK);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBox.setBounds(37, 27, 145, 33);
		contentPane.add(comboBox);
		comboBox.addItem("選擇調式");
		comboBox.addItem("Major Scale");
		comboBox.addItem("Dorian");
		comboBox.addItem("Phrygian");
		comboBox.addItem("Lydian");
		comboBox.addItem("Mixolydian ");
		comboBox.addItem("minor Scale");
		comboBox.addItem("Locrian");
		comboBox.addItem("Blues Scale");
		comboBox.addItem("Pantatonic Scale");

		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.DARK_GRAY);
		comboBox_1.setForeground(Color.PINK);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox_1.setBounds(192, 27, 145, 33);
		contentPane.add(comboBox_1);
		comboBox_1.addItem("選擇調性");
		comboBox_1.addItem("A");
		comboBox_1.addItem("A#");
		comboBox_1.addItem("B");
		comboBox_1.addItem("C");
		comboBox_1.addItem("C#");
		comboBox_1.addItem("D");
		comboBox_1.addItem("D#");
		comboBox_1.addItem("E");
		comboBox_1.addItem("F");
		comboBox_1.addItem("F#");
		comboBox_1.addItem("G");
		comboBox_1.addItem("G#");
		
		JButton btnNewButton = new JButton("查看");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String comboBox1 = (String) comboBox_1.getSelectedItem();
				 String comboBox0 = (String) comboBox.getSelectedItem();

				ScaleData.count(comboBox0, comboBox1);
				textField.setText(ScaleData.show(comboBox0, comboBox1));
				textField_1.setText(ScaleData.show1(comboBox0, comboBox1));
				System.out.println(ScaleData.show(comboBox0, comboBox1));
			}
		});
		btnNewButton.setBounds(360, 27, 85, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("組成音：");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setBounds(37, 81, 64, 33);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(110, 81, 303, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("順階和弦：");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setBounds(37, 124, 64, 33);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(110, 124, 303, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	}
