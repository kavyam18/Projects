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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int Size;
	private int r=-1;
	private int f=0;
	

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Queue Data Structure");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setBounds(124, 11, 164, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Queue Size :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setBounds(29, 52, 124, 18);
		contentPane.add(lblNewLabel_1);
		
		size = new JTextField();
		size.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		size.setBounds(160, 43, 184, 29);
		contentPane.add(size);
		size.setColumns(10);
		
		JButton create = new JButton("Create Queue");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for create Queue
		    int len = Integer.valueOf(size.getText());
		    q = new int[len];
		    Size=q.length;
		    
		    String message = "Queue of size Created";
		    JOptionPane.showMessageDialog(contentPane,message);
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 15));
		create.setForeground(new Color(199, 21, 133));
		create.setBounds(128, 87, 129, 27);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("Enter an element :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setBounds(10, 127, 122, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(138, 125, 186, 26);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Insert element
				int elem;
				if( r == Size-1)
				{
					
					JOptionPane.showMessageDialog(contentPane,"Insert not Possible");
				}
				else
				{
					 elem = Integer.valueOf(element.getText());
					 ++r;
					q[r] = elem;
					
					JOptionPane.showMessageDialog(contentPane,"Insert Successfull ");
					element.setText("");
				}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 15));
		insert.setForeground(new Color(199, 21, 133));
		insert.setBounds(334, 125, 77, 27);
		contentPane.add(insert);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete element
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane,"Delete not Possible");
				}
				else
				{
					String message = "Element deleted is :"+" "+q[f];
					JOptionPane.showMessageDialog(contentPane,message);
					f++;
				}
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 15));
		delete.setForeground(new Color(199, 21, 133));
		delete.setBounds(160, 166, 79, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display element
				String msg ="";
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not Possible");
				}
				else
				{
					for(int i=f;i<=r;i++)
					{
						msg = msg +" "+q[i];
						
					}	
				}
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Times New Roman", Font.BOLD, 15));
		display.setForeground(new Color(199, 21, 133));
		display.setBounds(10, 206, 81, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(101, 204, 243, 33);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
