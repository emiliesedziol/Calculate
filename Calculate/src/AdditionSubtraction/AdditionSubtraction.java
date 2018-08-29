package AdditionSubtraction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;

public class AdditionSubtraction {

	private JFrame frame;
	private JTextField int1;
	private JTextField int2;
	private JTextField result;
	private JTextField description;
	private JLabel lblFirstNumber;
	private JLabel lblSecondnumber;
	private JLabel lblTotal;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdditionSubtraction window = new AdditionSubtraction();
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
	public AdditionSubtraction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		int1 = new JTextField();
		int1.setHorizontalAlignment(SwingConstants.CENTER);
		int1.setBounds(567, 42, 107, 54);
		frame.getContentPane().add(int1);
		int1.setColumns(10);
		
		int2 = new JTextField();
		int2.setHorizontalAlignment(SwingConstants.CENTER);
		int2.setBounds(567, 121, 107, 54);
		frame.getContentPane().add(int2);
		int2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int number1;
				int number2;
				int total;
				
				try
				{
					number1 = Integer.parseInt(int1.getText());
					number2 = Integer.parseInt(int2.getText());
					
					total = number1 + number2;
					result.setText(Integer.toString(total));
					description.setText(Integer.toString(number1)+ " + " + Integer.toString(number2) + " = " + Integer.toString(total));
					
				}
				catch(Exception eAdd) {
					JOptionPane.showMessageDialog(null, "Enter an Integer in first box");
					
				}
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBounds(26, 21, 147, 48);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1;
				int number2;
				int total;
				
				try
				{
					number1 = Integer.parseInt(int1.getText());
					number2 = Integer.parseInt(int2.getText());
					
					total = number1 - number2;
					result.setText(Integer.toString(total));
					description.setText(Integer.toString(number1)+ " + " + Integer.toString(number2) + " = " + Integer.toString(total));
					
				}
				catch(Exception eSub) {
					JOptionPane.showMessageDialog(null, "Enter an Integer in second box");
				}
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtract.setBounds(26, 80, 147, 56);
		frame.getContentPane().add(btnSubtract);
		
		btnMultiply = new JButton("Multiply");
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number1;
				int number2;
				int total;
				
				try
				{
					number1 = Integer.parseInt(int1.getText());
					number2 = Integer.parseInt(int2.getText());
					
					total = number1 * number2;
					result.setText(Integer.toString(total));
					description.setText(Integer.toString(number1)+ " * " + Integer.toString(number2) + " = " + Integer.toString(total));
					
				}
				catch(Exception eMult) {
					JOptionPane.showMessageDialog(null, "Enter an Integer in second box");
				}
			}
			
		});
		
		btnDivide = new JButton("Divide");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1;
				int number2;
				int total;
				
				try
				{
					number1 = Integer.parseInt(int1.getText());
					number2 = Integer.parseInt(int2.getText());
					
					total = number1 / number2;
					result.setText(Integer.toString(total));
					description.setText(Integer.toString(number1)+ " / " + Integer.toString(number2) + " = " + Integer.toString(total));
					
				}
				catch(Exception eMult) {
					JOptionPane.showMessageDialog(null, "Enter an Integer in second box");
				}
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(26, 217, 147, 54);
		frame.getContentPane().add(btnDivide);
		
		btnMultiply.setBounds(26, 147, 147, 59);
		frame.getContentPane().add(btnMultiply);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int1.setText("");
				int2.setText("");
				result.setText("");
				description.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(26, 282, 147, 46);
		frame.getContentPane().add(btnClear);
		result = new JTextField();
		result.setBackground(Color.WHITE);
		result.setEditable(false);
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(557, 202, 117, 54);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		description = new JTextField();
		description.setBackground(Color.WHITE);
		description.setEditable(false);
		description.setFont(new Font("Courier New", Font.BOLD, 20));
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setBounds(359, 282, 315, 57);
		frame.getContentPane().add(description);
		description.setColumns(10);
		
		lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstNumber.setBounds(407, 42, 117, 54);
		frame.getContentPane().add(lblFirstNumber);
		
		lblSecondnumber = new JLabel("Second Number");
		lblSecondnumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSecondnumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondnumber.setBounds(407, 121, 145, 54);
		frame.getContentPane().add(lblSecondnumber);
		
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setBounds(407, 202, 117, 54);
		frame.getContentPane().add(lblTotal);

	}
}
