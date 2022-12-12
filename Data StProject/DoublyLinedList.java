import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinedList extends JFrame {

	private JPanel contentPane;
	private JTextField frontE;
	private JTextField rearE;
	private JTextField disp;
	class Node{
		Node pevlink;
		int data;
		Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinedList frame = new DoublyLinedList();
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
	public DoublyLinedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoublyLinkedList = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblDoublyLinkedList.setForeground(new Color(0, 128, 255));
		lblDoublyLinkedList.setFont(new Font("Algerian", Font.BOLD, 20));
		lblDoublyLinkedList.setBackground(Color.RED);
		lblDoublyLinkedList.setBounds(74, 10, 381, 27);
		contentPane.add(lblDoublyLinkedList);
		
		JLabel lblEnterElementIn = new JLabel("ENTER ELEMENT IN FRONT :");
		lblEnterElementIn.setForeground(new Color(128, 0, 0));
		lblEnterElementIn.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterElementIn.setBounds(10, 47, 222, 20);
		contentPane.add(lblEnterElementIn);
		
		frontE = new JTextField();
		frontE.setFont(new Font("Consolas", Font.BOLD, 17));
		frontE.setColumns(10);
		frontE.setBounds(242, 44, 142, 25);
		contentPane.add(frontE);
		
		JButton frontinsert = new JButton("FRONT INSERT");
		frontinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR FRONT INSERT
				int elem = Integer.valueOf(frontE.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.pevlink =null;
				newnode.nextlink =null;
				if(first !=null) {
					first = newnode;
				}
				else {
					newnode.nextlink=first;
					first.pevlink= newnode;
					first = newnode;
					
				}
				frontE.setText("");
				JOptionPane.showMessageDialog(contentPane, "Element Inserted @ FRONT");
			}
		});
		frontinsert.setForeground(new Color(0, 128, 128));
		frontinsert.setFont(new Font("Constantia", Font.BOLD, 14));
		frontinsert.setBounds(394, 45, 147, 27);
		contentPane.add(frontinsert);
		
		JButton frontdelete = new JButton("FRONT DELETE");
		frontdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FRONT DELETE
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Nothing to Delete");
				}
				else if(first.nextlink == null) {
					JOptionPane.showMessageDialog(contentPane, "Element Inserted @ REAR " + first.data);
					first = null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element Inserted @ REAR "+ first.data);
					first = first.nextlink;
					first.pevlink = null;
				}
			}
		});
		frontdelete.setForeground(new Color(0, 128, 128));
		frontdelete.setFont(new Font("Constantia", Font.BOLD, 14));
		frontdelete.setBounds(242, 79, 142, 27);
		contentPane.add(frontdelete);
		
		JLabel lblEnterElementIn_2 = new JLabel("ENTER ELEMENT IN REAR   :");
		lblEnterElementIn_2.setForeground(new Color(128, 0, 0));
		lblEnterElementIn_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterElementIn_2.setBounds(10, 125, 222, 20);
		contentPane.add(lblEnterElementIn_2);
		
		rearE = new JTextField();
		rearE.setFont(new Font("Consolas", Font.BOLD, 17));
		rearE.setColumns(10);
		rearE.setBounds(242, 122, 142, 25);
		contentPane.add(rearE);
		
		JButton rearinsert = new JButton("REAR INSERT");
		rearinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR REAR INSERT
				Node temp;
				int elem = Integer.valueOf(rearE.getText());
				Node newnode = new Node();
				newnode.data =elem;
				newnode.pevlink = null;
				newnode.nextlink = null;
				if(first == null) {
					first = newnode;
				}
				else {
					temp = first;
					while(temp.nextlink == null) {
						temp=temp.nextlink;
						
					}
					temp.nextlink = newnode;
					newnode.pevlink = temp;
				}
				rearE.setText("");
				JOptionPane.showMessageDialog(contentPane, "Element Inserted @ REAR ");
			}
		});
		rearinsert.setForeground(new Color(255, 128, 64));
		rearinsert.setFont(new Font("Constantia", Font.BOLD, 14));
		rearinsert.setBounds(397, 123, 147, 27);
		contentPane.add(rearinsert);
		
		JButton reardelete = new JButton("REAR DELETE");
		reardelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR REAR DELETE
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Nothing To Delete");
				}
				else if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted @ REAR is " + first.data);
					first =null;
				}
				else {
					temp=first;
					while(temp.nextlink.nextlink != null) {
						temp = temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Element Deleted @ REAR is " + temp.nextlink.data );
					temp.nextlink=null;
				}
			}
		});
		reardelete.setForeground(new Color(255, 128, 64));
		reardelete.setFont(new Font("Constantia", Font.BOLD, 14));
		reardelete.setBounds(242, 157, 142, 27);
		contentPane.add(reardelete);
		
		JButton displayFront = new JButton("FORWARD DISPLAY");
		displayFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR FORWORD DISPLAY
				Node temp;
				String msg ="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Nothing To DISPLAY");
				}
				else if(first.nextlink==null) {
					msg=msg + first.data;
				}
				else {
					temp = first;
					while(temp!=null) {
						msg = msg +" "+ temp.data;
						temp = temp.nextlink;
					}
				}
				disp.setText(msg);
			}
		});
		displayFront.setForeground(new Color(0, 128, 0));
		displayFront.setFont(new Font("Constantia", Font.BOLD, 14));
		displayFront.setBounds(74, 200, 173, 27);
		contentPane.add(displayFront);
		
		JButton displayRear = new JButton("REVERES DISPLAY");
		displayRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY FROM BACK
				Node temp;
				String msg ="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Nothing To DISPLAY");
				}
				else if(first.nextlink==null) {
					msg=msg + first.data;
				}
				else {
					temp = first;
					while(temp!=null) {
						msg = msg +" "+ temp.data;
						temp = temp.nextlink;
					}
					while(temp !=null) {
						msg = msg+" "+ temp.data;
						temp = temp.pevlink;
					}
				}
				disp.setText(msg);	
			}
		});
		displayRear.setForeground(new Color(255, 128, 64));
		displayRear.setFont(new Font("Constantia", Font.BOLD, 14));
		displayRear.setBounds(394, 200, 161, 27);
		contentPane.add(displayRear);
		
		disp = new JTextField();
		disp.setForeground(Color.BLACK);
		disp.setFont(new Font("Consolas", Font.BOLD, 18));
		disp.setColumns(10);
		disp.setBackground(new Color(128, 255, 128));
		disp.setBounds(72, 237, 469, 27);
		contentPane.add(disp);
	}
}
