import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
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
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class RegisterOwner extends JFrame {

	private JPanel contentPane;
	private JTextField oid;
	private JPasswordField opass;
	private JTextField oname;
	private JTextField ophone;
	private JTextField sdeposit;
	private JTextField rent;
	private JTextField locality;
	private JList list;
	private JComboBox rlist;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterOwner frame = new RegisterOwner();
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
	public RegisterOwner() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\img for app\\building.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 850);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOwnerRegisterationPage = new JLabel("ADD AVAILABLE RENTALS");
		lblOwnerRegisterationPage.setBounds(122, 31, 498, 34);
		lblOwnerRegisterationPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblOwnerRegisterationPage.setFont(new Font("Times New Roman", Font.BOLD, 29));
		contentPane.add(lblOwnerRegisterationPage);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\img for app\\house.png"));
		lblNewLabel.setBounds(50, 11, 84, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter User Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(50, 99, 143, 38);
		contentPane.add(lblNewLabel_1);
		
		oid = new JTextField();
		oid.setHorizontalAlignment(SwingConstants.CENTER);
		oid.setFont(new Font("Times New Roman", Font.BOLD, 18));
		oid.setColumns(10);
		oid.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		oid.setBounds(280, 99, 286, 40);
		contentPane.add(oid);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(50, 155, 162, 38);
		contentPane.add(lblNewLabel_1_1);
		
		opass = new JPasswordField();
		opass.setHorizontalAlignment(SwingConstants.CENTER);
		opass.setFont(new Font("Times New Roman", Font.BOLD, 18));
		opass.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		opass.setBounds(280, 150, 286, 40);
		contentPane.add(opass);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter Name");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(50, 204, 143, 38);
		contentPane.add(lblNewLabel_1_2);
		
		oname = new JTextField();
		oname.setHorizontalAlignment(SwingConstants.CENTER);
		oname.setFont(new Font("Times New Roman", Font.BOLD, 18));
		oname.setColumns(10);
		oname.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		oname.setBounds(280, 201, 286, 40);
		contentPane.add(oname);
		
		JLabel lblNewLabel_1_3 = new JLabel("Enter Phone No.");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(50, 253, 162, 38);
		contentPane.add(lblNewLabel_1_3);
		
		ophone = new JTextField();
		ophone.setHorizontalAlignment(SwingConstants.CENTER);
		ophone.setFont(new Font("Times New Roman", Font.BOLD, 18));
		ophone.setColumns(10);
		ophone.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		ophone.setBounds(280, 251, 286, 40);
		contentPane.add(ophone);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Locality");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(50, 302, 118, 38);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("City");
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_2.setBounds(50, 351, 143, 38);
		contentPane.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("State");
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_3.setBounds(415, 351, 118, 38);
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
		city.setBounds(216, 353, 123, 34);
		contentPane.add(city);
		AutoCompleteDecorator.decorate(city);
		
		
		
		JComboBox state = new JComboBox(ob.state);
		state.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		state.setBounds(543, 351, 123, 34);
		contentPane.add(state);
		AutoCompleteDecorator.decorate(state); 
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Select Apartment Type");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(50, 400, 237, 38);
		contentPane.add(lblNewLabel_1_3_1);
		
		JCheckBox onebhk = new JCheckBox("1BHK");
		onebhk.setOpaque(false);
		onebhk.setFont(new Font("Tahoma", Font.BOLD, 14));
		onebhk.setBounds(313, 404, 77, 34);
		contentPane.add(onebhk);
		
		JCheckBox twobhk = new JCheckBox("2BHK");
		twobhk.setOpaque(false);
		twobhk.setFont(new Font("Tahoma", Font.BOLD, 14));
		twobhk.setBounds(425, 400, 77, 42);
		contentPane.add(twobhk);
		
		JCheckBox threebhk = new JCheckBox("3BHK");
		threebhk.setOpaque(false);
		threebhk.setFont(new Font("Tahoma", Font.BOLD, 14));
		threebhk.setBounds(543, 400, 77, 38);
		contentPane.add(threebhk);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("Amenities");
		lblNewLabel_1_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_2_1.setBounds(50, 460, 118, 38);
		contentPane.add(lblNewLabel_1_2_1_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(187, 451, 186, 80);
		contentPane.add(scrollPane);
		
		JList alist = new JList();
		alist.setFont(new Font("Tahoma", Font.BOLD, 14));
		alist.setModel(new AbstractListModel() {
			String[] values = new String[] {"SwimmingPool", "Gym", "Library", "Still Parking", "Building Signage"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		alist.setToolTipText("Hold CTRL key to select multiple items");
		scrollPane.setViewportView(alist);
		
		JLabel furnished = new JLabel("Furnished");
		furnished.setFont(new Font("Tahoma", Font.BOLD, 20));
		furnished.setBounds(403, 480, 118, 38);
		contentPane.add(furnished);
		
		JRadioButton Fully = new JRadioButton("Fully");
		buttonGroup.add(Fully);
		Fully.setOpaque(false);
		Fully.setFont(new Font("Tahoma", Font.BOLD, 14));
		Fully.setBounds(527, 490, 70, 23);
		contentPane.add(Fully);
		
		JRadioButton Semi = new JRadioButton("Semi");
		buttonGroup_1.add(Semi);
		Semi.setOpaque(false);
		Semi.setFont(new Font("Tahoma", Font.BOLD, 14));
		Semi.setBounds(623, 490, 70, 23);
		contentPane.add(Semi);
		
		JLabel lblNewLabel_1_2_1_2_1_2 = new JLabel("Security Deposit");
		lblNewLabel_1_2_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_2_1_2.setBounds(50, 604, 187, 38);
		contentPane.add(lblNewLabel_1_2_1_2_1_2);
		
		sdeposit = new JTextField();
		sdeposit.setHorizontalAlignment(SwingConstants.CENTER);
		sdeposit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		sdeposit.setColumns(10);
		sdeposit.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		sdeposit.setBounds(236, 606, 176, 40);
		contentPane.add(sdeposit);
		
		JLabel lblNewLabel_1_2_1_2_1_3 = new JLabel("Rent");
		lblNewLabel_1_2_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1_2_1_3.setBounds(435, 604, 95, 38);
		contentPane.add(lblNewLabel_1_2_1_2_1_3);
		
		rent = new JTextField();
		rent.setHorizontalAlignment(SwingConstants.CENTER);
		rent.setFont(new Font("Times New Roman", Font.BOLD, 18));
		rent.setColumns(10);
		rent.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		rent.setBounds(533, 606, 176, 40);
		contentPane.add(rent);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			

			

			

			public void actionPerformed(ActionEvent e)
			{
				Landlord l = new Landlord();
				l.setLid(Integer.parseInt(oid.getText()));
				l.setName(oid.getText());
				l.setPassword(new String(opass.getPassword()));
				l.setPhone(Long.parseLong(ophone.getText()));
				String adr=locality.getText()+","+city.getSelectedItem()+","+state.getSelectedItem();
				l.setAddress(adr);
				l.setAptype(onebhk.isSelected()?"1 BHK ":" "+(twobhk.isSelected()?"2 BHK ":" ")+ (threebhk.isSelected()?"3 BHK ":" "));
				l.setAmenities(alist.getSelectedValuesList().toString());
				l.setFurnished(Fully.isSelected()?"Fully":"Semi");
				l.setRtype(rlist.getSelectedItem().toString());
				l.setSdeposit(Float.parseFloat(sdeposit.getText()));
				l.setRent(Float.parseFloat(rent.getText()));
				
				LandlordDao ldao= new LandlordDao();
				int saveRecord=ldao.saveRecord(l);
				
				if(saveRecord==1) {
					 JOptionPane.showMessageDialog(getParent(), "Registered sucessfully !");
				}
				else {
					 JOptionPane.showMessageDialog(getParent(), "Unable to Register !");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.setBounds(236, 666, 137, 38);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Cancel");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				HomePage hp=new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnReset.setToolTipText("Hold CTRL key to select multiple items");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnReset.setBounds(460, 666, 137, 38);
		contentPane.add(btnReset);
		
		locality = new JTextField();
		locality.setHorizontalAlignment(SwingConstants.CENTER);
		locality.setFont(new Font("Times New Roman", Font.BOLD, 18));
		locality.setColumns(10);
		locality.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		locality.setBounds(280, 300, 286, 40);
		contentPane.add(locality);
		
		JLabel rtype = new JLabel("Rental Type");
		rtype.setFont(new Font("Tahoma", Font.BOLD, 20));
		rtype.setBounds(50, 542, 131, 38);
		contentPane.add(rtype);
		
		rlist = new JComboBox(new Object[]{});
		rlist.setFont(new Font("Tahoma", Font.BOLD, 14));
		rlist.setModel(new DefaultComboBoxModel(new String[] {"--select--", "Monthly", "Half-Yearly", "Quaterly", "Yearly"}));
		rlist.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		rlist.setBounds(236, 546, 123, 34);
		contentPane.add(rlist);
	}
}
