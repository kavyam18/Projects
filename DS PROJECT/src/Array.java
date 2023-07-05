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
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deletepos;
	private JTextField position;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Array Data Structure");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(106, 11, 203, 25);
		contentPane.add(lblNewLabel);
		
		length = new JTextField();
		length.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		length.setBounds(171, 63, 169, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("Create Array");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
				int len = Integer.valueOf(length.getText());
				arr =new int[len]; 
				String message ="Array of length"+" "+len+" "+"Created";
				JOptionPane.showMessageDialog(contentPane,message);
			}
		});
		create.setFont(new Font("Times New Roman", Font.BOLD, 15));
		create.setForeground(new Color(102, 51, 153));
		create.setBounds(130, 92, 119, 27);
		contentPane.add(create);
		
		JLabel lblNewLabel_1 = new JLabel("Insert an integer element");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 130, 167, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter array length");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(32, 63, 119, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(184, 130, 167, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(position.getText());
				arr[pos]=elem;
				String message = "Element"+" "+elem+" "+"Inserted @ Position"+" "+pos;
				JOptionPane.showMessageDialog(contentPane,message);
				element.setText("");
				position.setText("");
				
			}
		});
		insert.setFont(new Font("Times New Roman", Font.BOLD, 15));
		insert.setForeground(new Color(153, 0, 51));
		insert.setBounds(263, 155, 73, 27);
		contentPane.add(insert);
		
		JLabel lblNewLabel_3 = new JLabel("Delete Position");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(20, 195, 108, 18);
		contentPane.add(lblNewLabel_3);
		
		deletepos = new JTextField();
		deletepos.setBounds(141, 195, 86, 20);
		contentPane.add(deletepos);
		deletepos.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Position");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setBounds(33, 159, 118, 18);
		contentPane.add(lblNewLabel_4);
		
		position = new JTextField();
		position.setFont(new Font("Times New Roman", Font.BOLD, 15));
		position.setBounds(141, 159, 86, 20);
		contentPane.add(position);
		position.setColumns(10);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos = Integer.valueOf(deletepos.getText());
				arr[pos]=0;
				String message ="Element Deleted @ Position " + " "+pos; 
				JOptionPane.showMessageDialog(contentPane,message);
				deletepos.setText("");
			}
		});
		delete.setForeground(new Color(204, 0, 153));
		delete.setFont(new Font("Times New Roman", Font.BOLD, 15));
		delete.setBounds(251, 193, 77, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg = "";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg = msg +" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Times New Roman", Font.BOLD, 15));
		display.setForeground(new Color(0, 0, 51));
		display.setBounds(10, 227, 81, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 255, 204));
		displaybox.setBounds(106, 231, 303, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
