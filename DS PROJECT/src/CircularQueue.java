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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField insert;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int f=0;
	private int r=-1;
	private int count=0;

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
		setBounds(100, 100, 531, 368);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CircularQueue DataStructure");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setBounds(111, 11, 264, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter queue size");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(44, 77, 98, 20);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(168, 74, 169, 24);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("Create Array");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//create array
				int len=Integer.valueOf(length.getText());
				cq=new int[len];
				size=cq.length;
				String msg="Array of length"+len+"Created";
		       JOptionPane.showMessageDialog(contentPane,msg);
				
			}
		});
		create.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		create.setForeground(new Color(0, 255, 255));
		create.setBounds(125, 108, 147, 31);
		contentPane.add(create);
		
		JLabel lblNewLabel_1_1 = new JLabel("Insert element is");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1_1.setBackground(Color.RED);
		lblNewLabel_1_1.setBounds(44, 161, 98, 20);
		contentPane.add(lblNewLabel_1_1);
		
		insert = new JTextField();
		insert.setColumns(10);
		insert.setBounds(168, 161, 104, 27);
		contentPane.add(insert);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(85, 294, 320, 24);
		contentPane.add(displaybox);
		
		JButton inserted = new JButton("INSERT");
		inserted.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert code
				int ele;
				if(count==size){
					JOptionPane.showMessageDialog(contentPane,"Insert is not possible");
					
				}
				else{
					ele=Integer.valueOf(insert.getText());
					r=(r+1)%size;
					cq[r]=ele;
					++count;
					JOptionPane.showMessageDialog(contentPane,"Insert successfull");
					insert.setText("");
				}
			}
		});
		inserted.setFont(new Font("Tahoma", Font.PLAIN, 18));
		inserted.setForeground(new Color(0, 0, 255));
		inserted.setBounds(314, 161, 93, 31);
		contentPane.add(inserted);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete code
				if(count==0){
					JOptionPane.showMessageDialog(contentPane,"Delete is not possible");
				}
				else{
					//System.out.println("deleted element is"+cq[f]);
					String msg="Deleted element is"+cq[f];
					JOptionPane.showMessageDialog(contentPane,msg);
				    f=(f+1)%size;
				    --count;
					
				}
			}
		});
		delete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delete.setForeground(new Color(255, 0, 0));
		delete.setBounds(237, 203, 95, 31);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display code
				int f1=f;
				String msg="";
				if(count==0){
					JOptionPane.showMessageDialog(contentPane,"Display is not possible");
				}
				else{
					for(int i=1;i<=count;i++){
						//System.out.println(cq[f1]+" ");
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					
				}
				displaybox.setText(msg);
			}
			
		});
		display.setFont(new Font("Tahoma", Font.PLAIN, 18));
		display.setForeground(new Color(0, 128, 0));
		display.setBounds(131, 245, 113, 31);
		contentPane.add(display);
	}
}
