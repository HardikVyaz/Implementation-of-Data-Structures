import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setBackground(new Color(128, 64, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 328);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 64, 64));
		contentPane.setForeground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose A DataStructure ");
		lblNewLabel.setForeground(new Color(216, 207, 188));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(173, 10, 234, 23);
		contentPane.add(lblNewLabel);
		
		JButton Array = new JButton("ARRAY");
		Array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE ARRAY WINDOW OPENING CODE HERE
				//Array a = new Array();
				//a.setVisible(true);
				new Array().setVisible(true);
				
			}
		});
		Array.setForeground(new Color(128, 64, 64));
		Array.setFont(new Font("Constantia", Font.BOLD, 17));
		Array.setBounds(230, 55, 103, 30);
		contentPane.add(Array);
		
		JButton Stack = new JButton("STACK");
		Stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE STACK WINDOW OPENING CODE HERE
				new Stack().setVisible(true);
			}
		});
		Stack.setForeground(new Color(128, 64, 64));
		Stack.setFont(new Font("Constantia", Font.BOLD, 17));
		Stack.setBounds(129, 95, 103, 30);
		contentPane.add(Stack);
		
		JButton Queue = new JButton("QUEUE");
		Queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE QUEUE WINDOW OPENING CODE HERE
				new Queue().setVisible(true);
			}
		});
		Queue.setForeground(new Color(128, 64, 64));
		Queue.setFont(new Font("Constantia", Font.BOLD, 17));
		Queue.setBounds(340, 93, 103, 30);
		contentPane.add(Queue);
		
		JButton CircularQueue = new JButton("CIRCULAR QUEUE");
		CircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE CIRCULAR QUEUE WINDOW OPENING CODE HERE
				new CircularQueue().setVisible(true);
			}
		});
		CircularQueue.setForeground(new Color(128, 64, 64));
		CircularQueue.setFont(new Font("Constantia", Font.BOLD, 17));
		CircularQueue.setBounds(10, 148, 225, 30);
		contentPane.add(CircularQueue);
		
		JButton SinglyLinkedList = new JButton("SINGLY LINKED LIST");
		SinglyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE Singly Linked List WINDOW OPENING CODE HERE
				new SinglyLinkedList().setVisible(true);
			}
		});
		SinglyLinkedList.setForeground(new Color(128, 64, 64));
		SinglyLinkedList.setFont(new Font("Constantia", Font.BOLD, 17));
		SinglyLinkedList.setBounds(340, 148, 225, 30);
		contentPane.add(SinglyLinkedList);
		
		JButton Doublylinkedlist = new JButton("DOUBLY LINKED LIST");
		Doublylinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE DOUBLYLINKED LIST WINDOW OPENING CODE HERE
				new DoublyLinedList().setVisible(true);
			}
		});
		Doublylinkedlist.setForeground(new Color(128, 64, 64));
		Doublylinkedlist.setFont(new Font("Constantia", Font.BOLD, 17));
		Doublylinkedlist.setBounds(173, 200, 225, 30);
		contentPane.add(Doublylinkedlist);
	}
}
