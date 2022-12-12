import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.Node;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField elemetf;
	private JTextField rearE;
	private JTextField disp;
	class Node{
	 int data;
	 Node link;}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSinglyLinkedList = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblSinglyLinkedList.setForeground(new Color(0, 128, 255));
		lblSinglyLinkedList.setFont(new Font("Algerian", Font.BOLD, 20));
		lblSinglyLinkedList.setBackground(new Color(255, 0, 0));
		lblSinglyLinkedList.setBounds(135, 10, 374, 27);
		contentPane.add(lblSinglyLinkedList);
		
		JLabel lblEnterElementIn = new JLabel("ENTER ELEMENT IN FRONT :");
		lblEnterElementIn.setForeground(new Color(128, 0, 0));
		lblEnterElementIn.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterElementIn.setBounds(32, 59, 222, 20);
		contentPane.add(lblEnterElementIn);
		
		JLabel lblEnterElementIn_2 = new JLabel("ENTER ELEMENT IN REAR   :");
		lblEnterElementIn_2.setForeground(new Color(128, 0, 0));
		lblEnterElementIn_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterElementIn_2.setBounds(32, 147, 222, 20);
		contentPane.add(lblEnterElementIn_2);
		
		elemetf = new JTextField();
		elemetf.setFont(new Font("Consolas", Font.BOLD, 17));
		elemetf.setColumns(10);
		elemetf.setBounds(264, 56, 142, 25);
		contentPane.add(elemetf);
		
		rearE = new JTextField();
		rearE.setFont(new Font("Consolas", Font.BOLD, 17));
		rearE.setColumns(10);
		rearE.setBounds(264, 144, 142, 25);
		contentPane.add(rearE);
		
		JButton frontinsert = new JButton("FRONT INSERT");
		frontinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR FRONT INSERT
				int elem = Integer.valueOf(elemetf.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if(first ==null) {
					first = newnode;
				}
				else {
					newnode.link = first;
					first =  newnode;
					
				}
				elemetf.setText("");
				JOptionPane.showMessageDialog(contentPane, "Element Inserted at FRONT " + elem);
			}
		});
		frontinsert.setForeground(new Color(0, 128, 128));
		frontinsert.setFont(new Font("Constantia", Font.BOLD, 14));
		frontinsert.setBounds(427, 56, 147, 27);
		contentPane.add(frontinsert);
		
		JButton rearinsert = new JButton("REAR INSERT");
		rearinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR REAR INSERT
				Node temp;
				int elem = Integer.valueOf(rearE.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if(first ==null) {
					first = newnode;
				}
				else {
					temp = first;
					while(temp.link != null) {
						temp = temp.link;
					}
					temp.link = newnode;
				}
				rearE.setText("");
				JOptionPane.showMessageDialog(contentPane, "Element Inserted at REAR  " + elem);
				
			}
		});
		rearinsert.setForeground(new Color(255, 128, 64));
		rearinsert.setFont(new Font("Constantia", Font.BOLD, 14));
		rearinsert.setBounds(427, 144, 147, 27);
		contentPane.add(rearinsert);
		
		JButton frontdelete = new JButton("FRONT DELETE");
		frontdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR FRONT DELETE
				if(first == null) {
					JOptionPane.showMessageDialog(contentPane, "Nothing To Delete ");
				}
				else if(first.link==null){
					JOptionPane.showMessageDialog(contentPane, "Element Deleted at FRONT is " + first.data);
					first=null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted at FRONT is " + first.data);
					first = first.link;
				}
			}
		});
		frontdelete.setForeground(new Color(0, 128, 128));
		frontdelete.setFont(new Font("Constantia", Font.BOLD, 14));
		frontdelete.setBounds(264, 96, 142, 27);
		contentPane.add(frontdelete);
		
		JButton reardelete = new JButton("REAR DELETE");
		reardelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR REAR DELETE
				Node temp;
				if(first == null) {
					JOptionPane.showMessageDialog(contentPane, "Nothing To Delete ");
				}
				else if(first.link==null){
					JOptionPane.showMessageDialog(contentPane, "Element Deleted at REAR is " + first.data);
					first=null;
				}
				else {
					temp=first;
					while(temp.link.link != null) {
						temp = temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Element Deleted at REAR is " + temp.link.link);
					temp.link = null;
				}
			}
		});
		reardelete.setForeground(new Color(255, 128, 64));
		reardelete.setFont(new Font("Constantia", Font.BOLD, 14));
		reardelete.setBounds(264, 179, 142, 27);
		contentPane.add(reardelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DISPLAY
				Node temp;
				String msg ="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "NOTHING TO DELETE");
				}
				else if(first.link==null) {
					msg =msg+first.data;
				}
				else {
					temp = first;
					while(temp != null) {
						msg = msg + " "+ temp.data;
						temp = temp.link;
					}
				}
				disp.setText(msg);
			}
		});
		btnDisplay.setForeground(Color.BLUE);
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(272, 229, 122, 34);
		contentPane.add(btnDisplay);
		
		disp = new JTextField();
		disp.setForeground(Color.BLACK);
		disp.setFont(new Font("Consolas", Font.BOLD, 18));
		disp.setColumns(10);
		disp.setBackground(new Color(128, 255, 128));
		disp.setBounds(89, 273, 485, 27);
		contentPane.add(disp);
	}
}
