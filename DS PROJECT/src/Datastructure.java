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

public class Datastructure extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datastructure frame = new Datastructure();
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
	public Datastructure() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data Structure");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setBounds(149, 11, 129, 22);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("Array");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place array window opening code
			//Array a = new Array();
		//	a.setVisible(true);
				new Array().setVisible(true);
			}
			
		});
		array.setFont(new Font("Times New Roman", Font.BOLD, 15));
		array.setBounds(64, 61, 102, 27);
		contentPane.add(array);
		
		JButton stack = new JButton("Stack");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				////Place stack window opening code
			}
		});
		stack.setFont(new Font("Times New Roman", Font.BOLD, 15));
		stack.setBounds(238, 61, 83, 27);
		contentPane.add(stack);
		
		JButton queue = new JButton("Queue");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place queue window opening code
				new Queue().setVisible(true);
			}
		});
		queue.setFont(new Font("Times New Roman", Font.BOLD, 15));
		queue.setBounds(53, 129, 121, 27);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("Circular Queue");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				////Place circular queue window opening code
			}
		});
		cqueue.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cqueue.setBounds(238, 129, 159, 27);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("Singly Linked List");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				////Place singly linked list window opening code
			}
		});
		sll.setFont(new Font("Times New Roman", Font.BOLD, 15));
		sll.setBounds(10, 204, 196, 27);
		contentPane.add(sll);
		
		JButton dll = new JButton("Doubly Linked List");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place doubly linked list window opening code
			}
		});
		dll.setFont(new Font("Times New Roman", Font.BOLD, 15));
		dll.setBounds(238, 204, 186, 27);
		contentPane.add(dll);
	}
}
