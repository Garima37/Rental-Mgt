import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField uid;
	private JPasswordField upass;
	private JTextField uname;
	private JTextField houseno;
	private JTextField locality;
	private JTextField uphone;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private final ButtonGroup buttonGroup_8 = new ButtonGroup();
	private final ButtonGroup buttonGroup_9 = new ButtonGroup();
	private final ButtonGroup buttonGroup_10 = new ButtonGroup();
	private final ButtonGroup buttonGroup_11 = new ButtonGroup();
	private final ButtonGroup buttonGroup_12 = new ButtonGroup();
	private final ButtonGroup buttonGroup_13 = new ButtonGroup();
	private final ButtonGroup buttonGroup_14 = new ButtonGroup();
	private final ButtonGroup buttonGroup_15 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterCustomer frame = new RegisterCustomer();
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
	public RegisterCustomer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\img for app\\building.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 850);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerRegisterationPage = new JLabel("CUSTOMER REGISTERATION PAGE");
		lblCustomerRegisterationPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerRegisterationPage.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblCustomerRegisterationPage.setBounds(103, 28, 573, 49);
		contentPane.add(lblCustomerRegisterationPage);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\img for app\\icons8-registration-50.png"));
		lblNewLabel.setBounds(44, 19, 62, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter User Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(19, 101, 143, 38);
		contentPane.add(lblNewLabel_1);
		
		uid = new JTextField();
		uid.setHorizontalAlignment(SwingConstants.CENTER);
		uid.setFont(new Font("Times New Roman", Font.BOLD, 18));
		uid.setColumns(10);
		uid.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		uid.setBounds(262, 99, 286, 40);
		contentPane.add(uid);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(19, 162, 162, 38);
		contentPane.add(lblNewLabel_1_1);
		
		upass = new JPasswordField();
		upass.setHorizontalAlignment(SwingConstants.CENTER);
		upass.setFont(new Font("Times New Roman", Font.BOLD, 18));
		upass.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		upass.setBounds(262, 162, 286, 40);
		contentPane.add(upass);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter Name");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(19, 230, 143, 38);
		contentPane.add(lblNewLabel_1_2);
		
		uname = new JTextField();
		uname.setHorizontalAlignment(SwingConstants.CENTER);
		uname.setFont(new Font("Times New Roman", Font.BOLD, 18));
		uname.setColumns(10);
		uname.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		uname.setBounds(262, 230, 286, 40);
		contentPane.add(uname);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("House No.");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(19, 357, 143, 38);
		contentPane.add(lblNewLabel_1_2_1);
		
		houseno = new JTextField();
		houseno.setHorizontalAlignment(SwingConstants.CENTER);
		houseno.setFont(new Font("Times New Roman", Font.BOLD, 18));
		houseno.setColumns(10);
		houseno.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		houseno.setBounds(202, 359, 123, 40);
		contentPane.add(houseno);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Locality");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(366, 357, 118, 38);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		locality = new JTextField();
		locality.setHorizontalAlignment(SwingConstants.CENTER);
		locality.setFont(new Font("Times New Roman", Font.BOLD, 18));
		locality.setColumns(10);
		locality.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		locality.setBounds(505, 359, 123, 40);
		contentPane.add(locality);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("City");
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_2.setBounds(19, 422, 143, 38);
		contentPane.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("State");
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_3.setBounds(366, 428, 118, 38);
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
		city.setBounds(202, 428, 123, 34);
		contentPane.add(city);
		AutoCompleteDecorator.decorate(city);
		
		JComboBox state = new JComboBox(ob.state);
		state.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		state.setBounds(505, 428, 123, 34);
		contentPane.add(state);
		AutoCompleteDecorator.decorate(state); 
		
		JLabel lblNewLabel_1_3 = new JLabel("Enter Phone No.");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(19, 296, 162, 38);
		contentPane.add(lblNewLabel_1_3);
		
		uphone = new JTextField();
		uphone.setHorizontalAlignment(SwingConstants.CENTER);
		uphone.setFont(new Font("Times New Roman", Font.BOLD, 18));
		uphone.setColumns(10);
		uphone.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		uphone.setBounds(262, 294, 286, 40);
		contentPane.add(uphone);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("Gender");
		lblNewLabel_1_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_2_1.setBounds(19, 471, 143, 38);
		contentPane.add(lblNewLabel_1_2_1_2_1);
		
		JRadioButton male = new JRadioButton("Male");
		buttonGroup_14.add(male);
		male.setOpaque(false);
		male.setFont(new Font("Tahoma", Font.BOLD, 14));
		male.setBounds(202, 478, 77, 38);
		contentPane.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		buttonGroup_15.add(female);
		female.setOpaque(false);
		female.setFont(new Font("Tahoma", Font.BOLD, 14));
		female.setBounds(393, 481, 87, 35);
		contentPane.add(female);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Select Apartment Type");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(19, 528, 237, 38);
		contentPane.add(lblNewLabel_1_3_1);
		
		JCheckBox one_bhk = new JCheckBox("1BHK");
		one_bhk.setOpaque(false);
		one_bhk.setFont(new Font("Tahoma", Font.BOLD, 14));
		one_bhk.setBounds(273, 527, 77, 34);
		contentPane.add(one_bhk);
		
		JCheckBox two_bhk = new JCheckBox("2BHK");
		two_bhk.setOpaque(false);
		two_bhk.setFont(new Font("Tahoma", Font.BOLD, 14));
		two_bhk.setBounds(379, 519, 77, 42);
		contentPane.add(two_bhk);
		
		JCheckBox three_bhk = new JCheckBox("3BHK");
		three_bhk.setOpaque(false);
		three_bhk.setFont(new Font("Tahoma", Font.BOLD, 14));
		three_bhk.setBounds(500, 523, 77, 38);
		contentPane.add(three_bhk);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Select Rental Type");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3_2.setBounds(19, 577, 237, 38);
		contentPane.add(lblNewLabel_1_3_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(278, 577, 148, 78);
		contentPane.add(scrollPane);
		
		JList rtype = new JList();
		rtype.setFont(new Font("Tahoma", Font.BOLD, 12));
		rtype.setToolTipText("Hold CTRL key to select multiple items");
		rtype.setModel(new AbstractListModel() {
			String[] values = new String[] {"Weekly", "Monthly", "Quaterly", "Half-yearly", "Yearly"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(rtype);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 //get all the values
				Customer c= new Customer();
				c.setCid(Integer.parseInt(uid.getText()));
				c.setName(uname.getText());
				c.setPass(new String(upass.getPassword()));
				String addr=houseno.getText()+", "+ locality.getText()+", "+city.getSelectedItem()+", "+state.getSelectedItem();
				c.setAddress(addr);
				c.setPhone(Long.parseLong(uphone.getText()));
				c.setGender(male.isSelected()?"Male":"Female");
				  
				c.setAptype(one_bhk.isSelected()?"1 BHK ":" "+(two_bhk.isSelected()?"2 BHK ":" ")+ (three_bhk.isSelected()?"3 BHK ":" "));
				c.setRtype(rtype.getSelectedValuesList().toString());
				
				
				CustomerDao cdao= new CustomerDao();
				int saveRecord = cdao.saveRecord(c);
				
				if(saveRecord==1) {
					 JOptionPane.showMessageDialog(getParent(), "Registered sucessfully !");
					 CustomerProfile cp= new CustomerProfile(c);
					 cp.setVisible(true);
					 setVisible(false);
					 
				}
				else {
					 JOptionPane.showMessageDialog(getParent(), "Unable to Register !");
				}
				
			}
		});
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(188, 666, 137, 38);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Cancel");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				HomePage hp = new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		
		btnReset.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnReset.setToolTipText("Hold CTRL key to select multiple items");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(366, 666, 137, 38);
		contentPane.add(btnReset);
	
	}
}

