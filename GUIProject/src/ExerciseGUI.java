import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.print.attribute.IntegerSyntax;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExerciseGUI {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExerciseGUI window = new ExerciseGUI();
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
	public ExerciseGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(28, 47, 270, 36);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(308, 47, 270, 36);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid NUmber");
				}
			}
		});
		btnNewButton.setBounds(81, 116, 170, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid NUmber");
				}
			}
		});
		btnNewButton_1.setBounds(371, 116, 170, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD, 16));
		lblNewLabel.setBounds(112, 295, 151, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(308, 289, 270, 36);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 * num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid NUmber");
				}
			}
		});
		btnNewButton_2.setBounds(81, 186, 170, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 / num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch(Exception e3) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid NUmber");
				}
			}
		});
		btnNewButton_3.setBounds(371, 186, 170, 50);
		frame.getContentPane().add(btnNewButton_3);
	}
}
