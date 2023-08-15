import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class PropertyOwnerLogin extends JFrame {

	private JPanel contentPane;
	private JTextField uid;
	private JPasswordField upass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PropertyOwnerLogin frame = new PropertyOwnerLogin();
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
	public PropertyOwnerLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\img for app\\building.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PROPERTY OWNER LOGIN PAGE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel.setBounds(53, 79, 541, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\img for app\\house2.png"));
		lblNewLabel_1.setBounds(279, 11, 73, 69);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter User Id");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(121, 164, 131, 38);
		contentPane.add(lblNewLabel_1_1);
		
		uid = new JTextField();
		uid.setHorizontalAlignment(SwingConstants.CENTER);
		uid.setFont(new Font("Times New Roman", Font.BOLD, 18));
		uid.setColumns(10);
		uid.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		uid.setBounds(319, 164, 200, 40);
		contentPane.add(uid);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(121, 251, 143, 38);
		contentPane.add(lblNewLabel_1_1_1);
		
		upass = new JPasswordField();
		upass.setHorizontalAlignment(SwingConstants.CENTER);
		upass.setFont(new Font("Times New Roman", Font.BOLD, 18));
		upass.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		upass.setBounds(319, 251, 198, 40);
		contentPane.add(upass);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//get values
				String id= uid.getText();
				String password= new String(upass.getPassword());
				System.out.println(id+" "+password);
				
				LandlordDao ldao= new LandlordDao();
				Landlord l=ldao.checkLogin(Integer.parseInt(id), password);
				
//				if(id.equals("1") && password.equals("12345")) {
				if(l!=null) {
					JOptionPane.showMessageDialog(getParent(),"Login Sucessfull !!");
					LandlordProfile lp= new LandlordProfile(l);
					lp.setVisible(true);
					setVisible(false); 
				}
				else {
					JOptionPane.showMessageDialog(getParent(),"Either id or password is incorrect !!");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(163, 318, 131, 32);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				uid.setText("");
				upass.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnReset.setBounds(341, 318, 131, 32);
		contentPane.add(btnReset);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				HomePage hp= new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\img for app\\back button.gif"));
		btnNewButton_2.setBounds(292, 373, 54, 38);
		contentPane.add(btnNewButton_2);
	}

}
