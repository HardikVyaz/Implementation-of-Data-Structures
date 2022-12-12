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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField QField;
	private JTextField element;
	private JTextField disp;
	private int cq[];
	private int size;
	private int r = -1;
	private int f = 0;
	private int count =0;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 336);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCircularQueueData = new JLabel("CIRCULAR QUEUE DATA STRUCTURE ");
		lblCircularQueueData.setBackground(new Color(192, 192, 192));
		lblCircularQueueData.setForeground(new Color(255, 255, 255));
		lblCircularQueueData.setFont(new Font("Algerian", Font.BOLD, 20));
		lblCircularQueueData.setBounds(88, 10, 354, 27);
		contentPane.add(lblCircularQueueData);
		
		JLabel lblNewLabel = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel.setForeground(new Color(255, 128, 128));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel.setBounds(20, 64, 160, 20);
		contentPane.add(lblNewLabel);
		
		QField = new JTextField();
		QField.setFont(new Font("Consolas", Font.BOLD, 17));
		QField.setColumns(10);
		QField.setBounds(192, 61, 142, 25);
		contentPane.add(QField);
		
		JButton queue = new JButton("CREATE QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CIRULAR QUEUE CODE
				size = Integer.valueOf(QField.getText());
				cq = new int[size];
				String message = "CIRCULAR QUEUE OF SIZE " + size +" CREATED";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		queue.setForeground(new Color(0, 128, 128));
		queue.setFont(new Font("Constantia", Font.BOLD, 14));
		queue.setBounds(361, 61, 149, 27);
		contentPane.add(queue);
		
		JLabel lblEnterAnElement = new JLabel("ENETR AN ELEMENT :");
		lblEnterAnElement.setForeground(new Color(255, 128, 128));
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterAnElement.setBounds(10, 111, 169, 20);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setFont(new Font("Consolas", Font.BOLD, 17));
		element.setColumns(10);
		element.setBounds(192, 108, 142, 25);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR INSERT 
				if(count==size) {
					JOptionPane.showMessageDialog(contentPane, "INSERTION NOT POSSIBLE ");
				}
				else {
					int elem = Integer.valueOf(element.getText());
					r = (r+1)%size;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Element " + elem + " INSERTED");
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(0, 128, 128));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(361, 108, 111, 27);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETION CODE HERE
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "DELETION NOT POSSIBLE ");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is " + cq[f]);
					f = (f+1)%size;
					count--;
				}
				
			}
		});
		delete.setForeground(Color.RED);
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(361, 145, 111, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY CODE IS HERE
				int f1 =f;
				String msg = "";
				if(count==0) {
					
						JOptionPane.showMessageDialog(contentPane, "NOTHING TO DISPLAY" );
				}
				else {
						for(int i =0; i<=count;i++) {
							msg = msg +" "+ cq[i];
						}
						disp.setText(msg);
				}
			}
		});
		display.setForeground(Color.BLUE);
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(200, 157, 122, 34);
		contentPane.add(display);
		
		disp = new JTextField();
		disp.setForeground(new Color(0, 0, 0));
		disp.setFont(new Font("Consolas", Font.BOLD, 18));
		disp.setColumns(10);
		disp.setBackground(new Color(128, 255, 128));
		disp.setBounds(55, 219, 450, 27);
		contentPane.add(disp);
	}
}
