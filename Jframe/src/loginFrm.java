import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class loginFrm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginFrm frame = new loginFrm();
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
	public loginFrm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel 用户名 = new JLabel("\u7528\u6237\u540D\uFF1A\r\n\r\n");
		用户名.setBounds(71, 85, 54, 15);
		contentPane.add(用户名);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A\r\n");
		lblNewLabel_1.setBounds(71, 141, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(135, 82, 125, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 141, 125, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u767B\u5165\u804A\u5929\u5BA4");
		lblNewLabel.setBounds(163, 30, 71, 21);
		contentPane.add(lblNewLabel);
	}
}
