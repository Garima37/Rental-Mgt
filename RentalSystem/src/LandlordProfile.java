import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class LandlordProfile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LandlordProfile frame = new LandlordProfile();
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
	public LandlordProfile(Landlord ll) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\img for app\\building.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome "+ll.getName());
		lblNewLabel.setBounds(165, 37, 305, 40);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 34));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("LogOut");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				PropertyOwnerLogin pol=new PropertyOwnerLogin();
				pol.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(499, 404, 125, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("ADD RENTALS");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				RegisterOwner ro = new RegisterOwner();
				ro.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1_1.setForeground(new Color(47, 79, 79));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1_1.setBounds(172, 158, 330, 120);
		contentPane.add(btnNewButton_1_1);
	}

}
