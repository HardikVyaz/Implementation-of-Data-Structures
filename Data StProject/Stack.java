import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField fieldSize;
	private JTextField element;
	private int[] s;
	private int size;
	private int top = -1;
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SIZE OF STACK :");
		lblNewLabel_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(95, 56, 125, 20);
		contentPane.add(lblNewLabel_1);
		
		fieldSize = new JTextField();
		fieldSize.setFont(new Font("Constantia", Font.BOLD, 14));
		fieldSize.setBounds(241, 53, 96, 27);
		contentPane.add(fieldSize);
		fieldSize.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Stack Creation CODE
				size = Integer.valueOf(fieldSize.getText());
				s = new int[size];
				String message = "STACK OF SIZE " + size +" CREATED";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		stack.setFont(new Font("Constantia", Font.BOLD, 14));
		stack.setForeground(new Color(0, 128, 128));
		stack.setBounds(383, 53, 168, 27);
		contentPane.add(stack);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_1_1.setForeground(new Color(128, 64, 64));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(46, 106, 174, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblStackDataStructure = new JLabel("STACK DATA STRUCTURE ");
		lblStackDataStructure.setForeground(new Color(0, 128, 255));
		lblStackDataStructure.setFont(new Font("Algerian", Font.BOLD, 20));
		lblStackDataStructure.setBounds(163, 10, 256, 27);
		contentPane.add(lblStackDataStructure);
		
		element = new JTextField();
		element.setFont(new Font("Constantia", Font.BOLD, 14));
		element.setBounds(241, 103, 96, 27);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PUSH CODE HERE
				int elem;
				if(top == size-1) {
					JOptionPane.showMessageDialog(contentPane, "Push Not Possible");
				}
				else {
					elem = Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successfull");
					element.setText("");
				}
				
			}
		});
		push.setForeground(new Color(0, 128, 128));
		push.setFont(new Font("Constantia", Font.BOLD, 14));
		push.setBounds(383, 98, 89, 27);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//POP CODE HERE
				if(top == -1) {
					JOptionPane.showMessageDialog(contentPane, "POP Not Possible");
				}
				else {
					String mesg = " ELement Deleted is : " + s[top];
					JOptionPane.showMessageDialog(contentPane,mesg);
					--top;
				}
			}
		});
		pop.setForeground(new Color(255, 0, 0));
		pop.setFont(new Font("Constantia", Font.BOLD, 14));
		pop.setBounds(251, 140, 76, 27);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY CODE HERE
				String msg ="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane,"Display Not Possible");
				}
				else {
					for(int i =top; i>=0;i--) {
						msg = msg+ " " + s[i];
					}
						} displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(0, 0, 255));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(244, 187, 96, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Consolas", Font.BOLD, 17));
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(148, 239, 135));
		displaybox.setBounds(68, 237, 463, 27);
		contentPane.add(displaybox);
	}
}
