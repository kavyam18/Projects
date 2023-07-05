import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.JobAttributes;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField lSize;
	private JTextField lElement;
	private JTextField tDisplay;
	private int st[];
	private int top=-1;
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 342);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("STACK DATA STRUCTURE");
		l1.setForeground(new Color(210, 105, 30));
		l1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		l1.setBounds(148, 10, 213, 25);
		contentPane.add(l1);
		
		JLabel lsize = new JLabel("ENTER THE SIZE STACK");
		lsize.setForeground(new Color(199, 21, 133));
		lsize.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lsize.setBounds(75, 48, 151, 20);
		contentPane.add(lsize);
		
		lSize = new JTextField();
		lSize.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lSize.setBounds(265, 45, 136, 26);
		contentPane.add(lSize);
		lSize.setColumns(10);
		
		JButton bInsert = new JButton("CREATE STACK");
		bInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len=Integer.valueOf(lSize.getText());
				st=new int[len];
				size=st.length;
				String msg="array length "+len+" created";
				JOptionPane.showMessageDialog(contentPane, msg);
			
			}
		});
		bInsert.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		bInsert.setForeground(new Color(46, 139, 87));
		bInsert.setBounds(176, 78, 142, 29);
		contentPane.add(bInsert);
		
		JLabel lelement = new JLabel("ENTER AN NUMBER");
		lelement.setForeground(new Color(199, 21, 133));
		lelement.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lelement.setBounds(75, 117, 131, 20);
		contentPane.add(lelement);
		
		lElement = new JTextField();
		lElement.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lElement.setColumns(10);
		lElement.setBounds(265, 117, 136, 26);
		contentPane.add(lElement);
		
		JButton bPush = new JButton("PUSH");
		bPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int element;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Stack is full");
				}
				else
				{
					element = Integer.valueOf(lElement.getText());
					++top;
					st[top]=element;
					JOptionPane.showMessageDialog(contentPane, "Push is successfull");
					lElement.setText("");
				}
			}
		});
		bPush.setForeground(new Color(46, 139, 87));
		bPush.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		bPush.setBounds(176, 147, 129, 29);
		contentPane.add(bPush);
		
		JButton bPop = new JButton("POP");
		bPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Stack is empty");
				}
				else
				{
					String Message = "deleted element is "+st[top];
					JOptionPane.showMessageDialog(contentPane, Message);
					--top;
				}
			}
		});
		bPop.setForeground(new Color(46, 139, 87));
		bPop.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		bPop.setBounds(176, 183, 129, 29);
		contentPane.add(bPop);
		
		JButton bDisplay = new JButton("DISPLAY");
		bDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String res ="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Stack is empty");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						res = res+" "+st[i];
					}
				}
				tDisplay.setText(res);
			}
		});
		bDisplay.setForeground(new Color(46, 139, 87));
		bDisplay.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		bDisplay.setBounds(176, 218, 129, 29);
		contentPane.add(bDisplay);
		
		tDisplay = new JTextField();
		tDisplay.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		tDisplay.setColumns(10);
		tDisplay.setBounds(109, 257, 269, 26);
		contentPane.add(tDisplay);
	}

}
