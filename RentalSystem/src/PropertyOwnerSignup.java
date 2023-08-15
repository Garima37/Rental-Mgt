import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PropertyOwnerSignup extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JPasswordField pass;
	private JTextField name;
	private JTextField phnno;
	private JTextField hno;
	private JTextField locality;
	private JComboBox city;
	private JComboBox state;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PropertyOwnerSignup frame = new PropertyOwnerSignup();
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
	public PropertyOwnerSignup() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\img for app\\building.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPropertyOwnerSignup = new JLabel("PROPERTY OWNER SIGNUP");
		lblPropertyOwnerSignup.setHorizontalAlignment(SwingConstants.CENTER);
		lblPropertyOwnerSignup.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblPropertyOwnerSignup.setBounds(95, 11, 573, 49);
		contentPane.add(lblPropertyOwnerSignup);
		
		JLabel lblNewLabel_1 = new JLabel("Enter User Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(48, 95, 143, 38);
		contentPane.add(lblNewLabel_1);
		
		id = new JTextField();
		id.setHorizontalAlignment(SwingConstants.CENTER);
		id.setFont(new Font("Times New Roman", Font.BOLD, 18));
		id.setColumns(10);
		id.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		id.setBounds(314, 95, 286, 40);
		contentPane.add(id);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(48, 167, 162, 38);
		contentPane.add(lblNewLabel_1_1);
		
		pass = new JPasswordField();
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setFont(new Font("Times New Roman", Font.BOLD, 18));
		pass.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pass.setBounds(314, 169, 286, 40);
		contentPane.add(pass);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter Name");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(48, 242, 143, 38);
		contentPane.add(lblNewLabel_1_2);
		
		name = new JTextField();
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("Times New Roman", Font.BOLD, 18));
		name.setColumns(10);
		name.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		name.setBounds(314, 242, 286, 40);
		contentPane.add(name);
		
		JLabel lblNewLabel_1_3 = new JLabel("Enter Phone No.");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(48, 318, 162, 38);
		contentPane.add(lblNewLabel_1_3);
		
		phnno = new JTextField();
		phnno.setHorizontalAlignment(SwingConstants.CENTER);
		phnno.setFont(new Font("Times New Roman", Font.BOLD, 18));
		phnno.setColumns(10);
		phnno.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		phnno.setBounds(314, 320, 286, 40);
		contentPane.add(phnno);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("House No.");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(48, 386, 143, 38);
		contentPane.add(lblNewLabel_1_2_1);
		
		hno = new JTextField();
		hno.setHorizontalAlignment(SwingConstants.CENTER);
		hno.setFont(new Font("Times New Roman", Font.BOLD, 18));
		hno.setColumns(10);
		hno.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		hno.setBounds(235, 388, 123, 40);
		contentPane.add(hno);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Locality");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(447, 386, 118, 38);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		locality = new JTextField();
		locality.setHorizontalAlignment(SwingConstants.CENTER);
		locality.setFont(new Font("Times New Roman", Font.BOLD, 18));
		locality.setColumns(10);
		locality.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		locality.setBounds(575, 388, 123, 36);
		contentPane.add(locality);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("City");
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_2.setBounds(48, 446, 143, 38);
		contentPane.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("State");
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_3.setBounds(447, 446, 118, 38);
		contentPane.add(lblNewLabel_1_2_1_3);

		Data ob= new Data();
        //get total number of cities
		
		int count=0;
		for(int r=0;r<ob.citystate.length;r++)
			for(int c=0;c<ob.citystate[r].length;c++)
				count++;
		
		System.out.println(count);
		
		String cities[]= new String[count];
		int i=0;
		for(int r=0;r<ob.citystate.length;r++)
			for(int c=0;c<ob.citystate[r].length;c++,i++) 
			{
				cities[i]=ob.citystate[r][c];
			}
		
		
		JComboBox city = new JComboBox(cities);
		city.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		city.setBounds(235, 439, 123, 34);
		contentPane.add(city);
		AutoCompleteDecorator.decorate(city);
		
		JComboBox state = new JComboBox(ob.state);
		state.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		state.setBounds(575, 450, 123, 34);
		contentPane.add(state);
		AutoCompleteDecorator.decorate(state);
	
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			

			private Landlord ll;

			public void actionPerformed(ActionEvent e)
			{
				Property p = new Property();
				p.setPid(Integer.parseInt(id.getText()));
				p.setName(name.getText());
				p.setPassword(new String(pass.getPassword()));
				p.setPhone(Long.parseLong(phnno.getText()));
				String adr = hno.getText()+ ","+locality.getText()+","+city.getSelectedItem()+"," +state.getSelectedItem();
				p.setAddress(adr);
				
				
				PropertyDao pdao= new PropertyDao();
				int savePropRecord=pdao.savePropRecord(p);
				
				if(savePropRecord==1) {
					 JOptionPane.showMessageDialog(getParent(), "Registered sucessfully !");
					 RegisterOwner ro= new RegisterOwner();
					 ro.setVisible(true);
					 setVisible(false);
					 
				}
				else {
					 JOptionPane.showMessageDialog(getParent(), "Unable to Register !");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.setBounds(251, 512, 267, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\img for app\\icons8-registration-50.png"));
		lblNewLabel.setBounds(58, 11, 63, 58);
		contentPane.add(lblNewLabel);
		
	}
}
