import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

public class CustomerProfile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CustomerProfile frame = new CustomerProfile();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public CustomerProfile(Customer cus) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\img for app\\building.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 650, 500);
		contentPane = new JPanel();
		contentPane.setToolTipText("click to write the feedback");
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome "+cus.getName());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel.setBounds(83, 41, 494, 56);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("LogOut");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				CustomerLogin cl= new CustomerLogin();
				
				cl.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(499, 403, 125, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Send the feedback");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FeedbackCustomer fc= new FeedbackCustomer(cus.getCid());
				fc.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setForeground(new Color(47, 79, 79));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton_1.setBounds(339, 179, 285, 120);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Find Rentals");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				FindRental fr= new FindRental(cus);
				fr.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1_1.setForeground(new Color(47, 79, 79));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1_1.setBounds(10, 179, 330, 120);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 634, 461);
		contentPane.add(lblNewLabel_1);
	}
}
