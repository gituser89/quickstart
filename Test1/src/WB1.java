import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class WB1 {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB1 window = new WB1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WB1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 739, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     UserName :");
		lblNewLabel.setBounds(146, 77, 121, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(216, 226, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(277, 142, 180, 22);
		frame.getContentPane().add(passwordField);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(174, 145, 121, 16);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(279, 88, 180, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBounds(398, 226, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
	}
}
