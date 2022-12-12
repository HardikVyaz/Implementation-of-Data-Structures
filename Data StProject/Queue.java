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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField queuesize;
	private JTextField element;
	private JTextField disp;
	private int q[];
	private int size;
	private int r = -1;
	private int f =0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 306);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQueueDataStructure = new JLabel("QUEUE DATA STRUCTURE ");
		lblQueueDataStructure.setBackground(new Color(255, 128, 192));
		lblQueueDataStructure.setForeground(new Color(0, 0, 0));
		lblQueueDataStructure.setFont(new Font("Algerian", Font.BOLD, 20));
		lblQueueDataStructure.setBounds(152, 10, 278, 25);
		contentPane.add(lblQueueDataStructure);
		
		JLabel lblNewLabel = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel.setBounds(22, 68, 160, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterAnElement = new JLabel("ENETR AN ELEMENT :");
		lblEnterAnElement.setForeground(new Color(128, 0, 0));
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterAnElement.setBounds(13, 112, 169, 20);
		contentPane.add(lblEnterAnElement);
		
		queuesize = new JTextField();
		queuesize.setFont(new Font("Consolas", Font.BOLD, 17));
		queuesize.setBounds(201, 65, 122, 25);
		contentPane.add(queuesize);
		queuesize.setColumns(10);
		
		element = new JTextField();
		element.setFont(new Font("Consolas", Font.BOLD, 17));
		element.setColumns(10);
		element.setBounds(201, 109, 122, 25);
		contentPane.add(element);
		
		disp = new JTextField();
		disp.setBackground(new Color(128, 255, 128));
		disp.setForeground(new Color(0, 0, 0));
		disp.setFont(new Font("Consolas", Font.BOLD, 18));
		disp.setBounds(33, 213, 461, 27);
		contentPane.add(disp);
		disp.setColumns(10);
		
		JButton queue = new JButton("CREATE QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE TO TAKE QUEUE SIZE
				size = Integer.valueOf(queuesize.getText());
				q = new int[size];
				String message = "QUEUE OF SIZE " + size +" CREATED";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		queue.setForeground(new Color(0, 128, 128));
		queue.setFont(new Font("Constantia", Font.BOLD, 14));
		queue.setBounds(345, 65, 149, 27);
		contentPane.add(queue);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE TO ENTER ELEMENTS
				int elem;
				if(r == size-1) {
					JOptionPane.showMessageDialog(contentPane, "Inserstion Not Possible");
					element.setText("");
				}
				else {
					elem = Integer.valueOf(element.getText());
					++r;
					q[r] =elem;
					JOptionPane.showMessageDialog(contentPane, "Element "+ elem + " Inserted" );
					element.setText("");
					}
			}
		});
		insert.setForeground(new Color(0, 128, 128));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(355, 109, 111, 27);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DELETION OF ELEMNTS 
				if(r==-1||f>r) {
					JOptionPane.showMessageDialog(contentPane, "Delection Not Possible");
					element.setText("");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Delection Not Possible"+ q[f]);
					++f;
					element.setText("");
				}
			}
		});
		delete.setForeground(new Color(255, 0, 0));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(355, 146, 111, 27);
		contentPane.add(delete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE TO DISPLAY 
				String msg ="";
				if(r==-1||f>r) {
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				}
				else { 
					for(int i =f;i<=r;i++) {
						msg = msg+ " "+ q[i];
					}}
				disp.setText(msg);
			}
		});
		btnDisplay.setForeground(new Color(0, 0, 255));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(201, 159, 122, 34);
		contentPane.add(btnDisplay);
	}
}
