

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class CustomerLogin extends JFrame {

	private JPanel contentPane;
	private JTextField uid;
	private JPasswordField upass;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnReset;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLogin frame = new CustomerLogin();
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
	public CustomerLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\img for app\\building.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER LOGIN PAGE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(46, 87, 541, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter User Id");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(104, 177, 131, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(104, 252, 143, 38);
		contentPane.add(lblNewLabel_1_1);
		
		uid = new JTextField();
		uid.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		uid.setFont(new Font("Times New Roman", Font.BOLD, 18));
		uid.setHorizontalAlignment(SwingConstants.CENTER);
		uid.setBounds(329, 179, 200, 40);
		contentPane.add(uid);
		uid.setColumns(10);
		
		upass = new JPasswordField();
		upass.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		upass.setFont(new Font("Times New Roman", Font.BOLD, 18));
		upass.setHorizontalAlignment(SwingConstants.CENTER);
		upass.setBounds(331, 254, 198, 40);
		contentPane.add(upass);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\img for app\\customer.png"));
		lblNewLabel_2.setBounds(276, 11, 82, 65);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//get values
				String id= uid.getText();
				String password= new String(upass.getPassword());
				System.out.println(id+" "+password);
				
				CustomerDao cdao= new CustomerDao();
				Customer c=cdao.checkLogin(Integer.parseInt(id), password);
				
				//if(id.equals("1") && password.equals("12345")) {
				
				    if(c!=null) { 
					JOptionPane.showMessageDialog(getParent(),"Login Sucessfull !!");
					CustomerProfile cp= new CustomerProfile(c);
					cp.setVisible(true);
					setVisible(false);  
				}
				else {
					JOptionPane.showMessageDialog(getParent(),"Either id or password is incorrect !!");
				}
			}
		});
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(160, 325, 131, 32);
		contentPane.add(btnNewButton);
		
		btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				uid.setText("");
				upass.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnReset.setBounds(357, 325, 131, 32);
		contentPane.add(btnReset);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				HomePage hp= new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\img for app\\back button.gif"));
		btnNewButton_2.setBounds(304, 381, 54, 38);
		contentPane.add(btnNewButton_2);
	}
}
