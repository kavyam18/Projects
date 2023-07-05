import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {
	class Node
	{
		int data;
		Node nxtlink,prelink;
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
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(119, 10, 194, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT:");
		lblEnterTheElement.setForeground(Color.WHITE);
		lblEnterTheElement.setFont(new Font("Arial", Font.BOLD, 14));
		lblEnterTheElement.setBackground(Color.BLACK);
		lblEnterTheElement.setBounds(20, 39, 160, 17);
		contentPane.add(lblEnterTheElement);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setBounds(190, 36, 96, 19);
		contentPane.add(txt1);
		
		JButton btninsertr = new JButton("INSERT REAR");
		btninsertr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Node temp;
				String msg = "";
				int elem = Integer.valueOf(txt1.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.nxtlink = null;
				newnode.prelink = null;
				if(first == null)
				{
					first = newnode;
				}
				else
				{
					temp = first;
					while(temp.nxtlink != null)
					{
						temp = temp.nxtlink;
					}
					temp.nxtlink = newnode;
					newnode.prelink = temp;
				}
				msg = msg+elem+" is inserted at rear";
				JOptionPane.showMessageDialog(contentPane, msg);
				txt1.setText("");
			}
		});
		btninsertr.setBounds(310, 35, 95, 21);
		contentPane.add(btninsertr);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(190, 73, 96, 19);
		contentPane.add(txt2);
		
		JButton btninsertf = new JButton("INSERT FRONT");
		btninsertf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String msg ="";
				int elem = Integer.valueOf(txt2.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.nxtlink=null;
				newnode.prelink=null;
				if(first == null)
				{
					first = newnode;
				}
				else
				{
					newnode.nxtlink = first;
					first.prelink = newnode;
					first = newnode;
				}
				msg = msg+elem+"is insreted at front";
				JOptionPane.showMessageDialog(contentPane, msg);
				txt2.setText("");
			}
		});
		btninsertf.setBounds(310, 72, 103, 21);
		contentPane.add(btninsertf);
		
		JLabel lblEnterTheElement_1 = new JLabel("ENTER THE ELEMENT:");
		lblEnterTheElement_1.setForeground(Color.WHITE);
		lblEnterTheElement_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblEnterTheElement_1.setBackground(Color.BLACK);
		lblEnterTheElement_1.setBounds(20, 73, 160, 17);
		contentPane.add(lblEnterTheElement_1);
		
		JButton btndeleter = new JButton("DELETE REAR");
		btndeleter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Node temp;
				String msg="";
				if(first == null)
				{
					msg = msg+"List is empty";
				}
				if(first.nxtlink == null)
				{
					msg = msg+first.data+" is deleted at rear";
				}
				else
				{
					temp = first;
					while(temp.nxtlink.nxtlink != null)
					{
						temp = temp.nxtlink;
					}
					msg = msg+temp.nxtlink.data+" is deleted at rear";
					temp.nxtlink = null;
				}
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btndeleter.setBounds(189, 102, 103, 21);
		contentPane.add(btndeleter);
		
		JButton btndeletef = new JButton("DELETE FRONT");
		btndeletef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String msg="";
				if(first == null)
				{
					msg = msg+" List is empty";
				}
				if(first.nxtlink == null)
				{
					msg = msg+first.data+" is deleted at front";
				}
				else
				{
					msg = msg+first.data+" is deleted at front";
					first = first.nxtlink;
					first.prelink = null;
				}
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btndeletef.setBounds(189, 140, 103, 21);
		contentPane.add(btndeletef);
		
		JButton btnDisplay = new JButton("DISPLAY ");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Node temp;
				String msg = "";
				if(first == null)
				{
					msg = msg+"List is empty";
					txt3.setText(msg);
				}
				if(first.nxtlink == null)
				{
					msg = msg+" "+first.data;
					txt3.setText(msg);
				}
				else
				{
					temp = first;
					while(temp != null)
					{
						msg = msg + " "+temp.data;
						txt3.setText(msg);
						temp = temp.nxtlink;
					}
				}
				//txt3.setText(msg);
			}
		});
		btnDisplay.setBounds(189, 171, 103, 21);
		contentPane.add(btnDisplay);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(59, 229, 333, 24);
		contentPane.add(txt3);
		
		JButton btnDisplayReverse = new JButton("DISPLAY REVERSE");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Node temp;
				String msg = "";
				if(first == null)
				{
					msg = msg+"List is empty";
					txt3.setText(msg);
				}
				if(first.nxtlink == null)
				{
					msg = msg+" "+first.data;
					txt3.setText(msg);
				}
				else
				{
					temp = first;
					while(temp.nxtlink != null)
					{
						temp = temp.nxtlink;
					}
					while(temp != null)
					{
						msg = msg + " "+temp.data;
						txt3.setText(msg);
						temp = temp.prelink;
					}
				}
				//txt3.setText(msg);
			}
		});
		btnDisplayReverse.setBounds(189, 202, 117, 21);
		contentPane.add(btnDisplayReverse);
	}
}
