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

public class SingleLinkedList extends JFrame {
	
	class Node{
		int data;
		Node link;
	}
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingleLinkedList frame = new SingleLinkedList();
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
	public SingleLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(143, 10, 173, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT:");
		lblEnterTheElement.setForeground(Color.WHITE);
		lblEnterTheElement.setFont(new Font("Arial", Font.BOLD, 14));
		lblEnterTheElement.setBackground(new Color(0, 0, 0));
		lblEnterTheElement.setBounds(10, 52, 160, 17);
		contentPane.add(lblEnterTheElement);
		
		txt1 = new JTextField();
		txt1.setBounds(180, 52, 96, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblEnterTheElement_1 = new JLabel("ENTER THE ELEMENT:");
		lblEnterTheElement_1.setForeground(Color.WHITE);
		lblEnterTheElement_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblEnterTheElement_1.setBackground(Color.BLACK);
		lblEnterTheElement_1.setBounds(10, 89, 160, 17);
		contentPane.add(lblEnterTheElement_1);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(180, 89, 96, 19);
		contentPane.add(txt2);
		
		JButton btninsertr = new JButton("INSERT REAR");
		btninsertr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Node temp;
				int elem = Integer.valueOf(txt1.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if(first == null)
				{
					first = newnode;
				}
				else
				{
					temp = first;
					while(temp.link != null)
					{
						temp = temp.link;
					}
					temp.link = newnode;
				}
				String msg = "Element "+elem+" inserted at rear";
				JOptionPane.showMessageDialog(contentPane, msg);
				txt1.setText("");
			}
		});
		btninsertr.setBounds(300, 51, 95, 21);
		contentPane.add(btninsertr);
		
		JButton btninsertf = new JButton("INSERT FRONT");
		btninsertf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int elem = Integer.valueOf(txt2.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if(first == null)
				{
					first = newnode;
				}
				else
				{
					newnode.link = first;
					first = newnode;
				}
				String msg = "Element "+elem+" inserted at front";
				JOptionPane.showMessageDialog(contentPane, msg);
				txt2.setText("");
			}
		});
		btninsertf.setBounds(300, 88, 103, 21);
		contentPane.add(btninsertf);
		
		JButton btndeleter = new JButton("DELETE REAR");
		btndeleter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Node temp;
				if(first == null)
				{
					String msg = "List is empty";
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				if(first.link == null)
				{
					String msg = "Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first = null;
				}
				else
				{
					temp = first;
					while(temp.link.link != null)
					{
						temp = temp.link;
					}
					String msg = "Element deleted is "+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					temp.link = null;
				}
			}
		});
		btndeleter.setBounds(173, 129, 103, 21);
		contentPane.add(btndeleter);
		
		JButton btndeletef = new JButton("DELETE FRONT");
		btndeletef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(first == null)
				{
					String msg = "List is empty";
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				if(first.link == null)
				{
					String msg = "Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first = null;
				}
				else
				{
					String msg = "Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first = first.link;
				}
			}
		});
		btndeletef.setBounds(173, 167, 103, 21);
		contentPane.add(btndeletef);
		
		JButton btndisplay = new JButton("DISPLAY");
		btndisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Node temp;
				String msg="";
				if(first == null)
				{
					msg = msg+" List is empty";
				}
				if(first.link == null)
				{
					msg = msg+" "+first.data;
				}
				else
				{
					temp=first;
					while(temp != null)
					{
						msg = msg+" "+temp.data;
						temp=temp.link;
						txt3.setText(msg);
					}
				}
			}
		});
		btndisplay.setBounds(173, 198, 103, 21);
		contentPane.add(btndisplay);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(97, 229, 292, 24);
		contentPane.add(txt3);
	}

}
