
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\img for app\\building.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(119, 136, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rental Management System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(45, 11, 529, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOG IN AS");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(198, 82, 233, 34);
		contentPane.add(lblNewLabel_1);
		
		JButton btnPropertyOwner = new JButton("PROPERTY OWNER LOGIN");
		btnPropertyOwner.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(72, 209, 204), new Color(72, 209, 204)));
		btnPropertyOwner.setBackground(new Color(255, 255, 255));
		btnPropertyOwner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				PropertyOwnerLogin pol= new PropertyOwnerLogin();
				pol.setVisible(true);
				setVisible(false);
			}
		});
		btnPropertyOwner.setForeground(Color.BLACK);
		btnPropertyOwner.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPropertyOwner.setBounds(104, 280, 245, 48);
		contentPane.add(btnPropertyOwner);
		
		JButton btnCustomer = new JButton("CUSTOMER LOGIN");
		btnCustomer.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(72, 209, 204), new Color(72, 209, 204)));
		btnCustomer.setBackground(new Color(255, 255, 255));
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				CustomerLogin cl= new CustomerLogin();
				cl.setVisible(true);
				setVisible(false);
				
			}
		});
		btnCustomer.setForeground(Color.BLACK);
		btnCustomer.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCustomer.setBounds(102, 159, 247, 48);
		contentPane.add(btnCustomer);
		
		JButton btnNewButton = new JButton("sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
               RegisterCustomer rc= new RegisterCustomer();
               rc.setVisible(true);
               setVisible(false);
			}
		});
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 206, 209)));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(424, 166, 125, 41);
		contentPane.add(btnNewButton);
		
		JButton btnOwnerSignup = new JButton("Sign up");
		btnOwnerSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				PropertyOwnerSignup pos= new PropertyOwnerSignup();
				pos.setVisible(true);
				setVisible(false);
			}
		});
		btnOwnerSignup.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnOwnerSignup.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 206, 209)));
		btnOwnerSignup.setBounds(424, 280, 125, 43);
		contentPane.add(btnOwnerSignup);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\img for app\\My project.jpg"));
		lblNewLabel_2.setBounds(0, 0, 634, 461);
		contentPane.add(lblNewLabel_2);
	}
}
