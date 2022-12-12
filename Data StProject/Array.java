import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deletepos;
	private JTextField Insertposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(131, 10, 256, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENETR ARRAY LENGTH :");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 53, 188, 20);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(217, 47, 96, 27);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR CREATING ARRAY
				//String len = length.getText();
				//int l = Integer.valueOf(len);
				int len = Integer.valueOf(length.getText());
				arr = new int [len];
				String message = "Array of length " +len + " has been Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setForeground(new Color(0, 128, 128));
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(323, 47, 154, 27);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTEGER :");
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 102, 162, 20);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setFont(new Font("Constantia", Font.BOLD, 14));
		element.setBounds(179, 99, 96, 27);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton Insert = new JButton("INSERT ");
		Insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR ELEMENTS AND POSITION OF ARRAY FOR INSERSTION
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(Insertposition.getText());
				arr[pos] = elem;
				String message = "Element " + elem + " Inserted @ Position " + pos;
				JOptionPane.showMessageDialog(Insert, message);
				element.setText("");
				Insertposition.setText("");
			}
		});
		Insert.setForeground(new Color(0, 128, 128));
		Insert.setFont(new Font("Constantia", Font.BOLD, 16));
		Insert.setBounds(478, 98, 108, 29);
		contentPane.add(Insert);
		
		JLabel lblNewLabel_3 = new JLabel("DELETE POSITION :");
		lblNewLabel_3.setForeground(new Color(128, 0, 0));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 141, 154, 20);
		contentPane.add(lblNewLabel_3);
		
		deletepos = new JTextField();
		deletepos.setFont(new Font("Constantia", Font.BOLD, 14));
		deletepos.setColumns(10);
		deletepos.setBounds(179, 136, 96, 27);
		contentPane.add(deletepos);
		
		Insertposition = new JTextField();
		Insertposition.setFont(new Font("Constantia", Font.BOLD, 14));
		Insertposition.setColumns(10);
		Insertposition.setBounds(385, 99, 76, 27);
		contentPane.add(Insertposition);
		
		JLabel lblNewLabel_2_1 = new JLabel("POSITION :");
		lblNewLabel_2_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(285, 102, 90, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JButton Delete = new JButton("DELETE");
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DELETE THE ARRAY
				int pos = Integer.valueOf(deletepos.getText());
				arr[pos] = 0;
				String Message = "Elemented Deleted @ Position" + pos;
				JOptionPane.showMessageDialog(contentPane, Message);
				deletepos.setText("");
				
			}
		});
		Delete.setForeground(new Color(255, 0, 0));
		Delete.setFont(new Font("Constantia", Font.BOLD, 16));
		Delete.setBounds(291, 139, 96, 29);
		contentPane.add(Delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DISPLAY OF ARRAY
				String msg = "";
				for(int i =0; i<= arr.length-1;i++) {
					msg =  msg + " "+ arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(0, 0, 255));
		display.setFont(new Font("Constantia", Font.BOLD, 15));
		display.setBounds(212, 190, 101, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Consolas", Font.BOLD, 17));
		displaybox.setBackground(new Color(148, 239, 135));
		displaybox.setBounds(63, 227, 414, 27);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
