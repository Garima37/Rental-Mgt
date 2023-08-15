import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FindRental extends JFrame {

	private JPanel contentPane;
	private JTable table;
	String data[][];
	int r,c;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FindRental frame = new FindRental();
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
	
	public FindRental(Customer c) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\img for app\\building.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(32, 412, 774, 188);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Apartment Type");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(23, 11, 211, 34);
		panel.add(lblNewLabel);
		
		JComboBox atype = new JComboBox();
		atype.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "1 BHK", "2 BHK", "3 BHK"}));
		atype.setFont(new Font("Tahoma", Font.BOLD, 18));
		atype.setBounds(259, 11, 130, 34);
		panel.add(atype);
		
		JLabel lblSelectRentalType = new JLabel("Select Rental Type");
		lblSelectRentalType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSelectRentalType.setBounds(23, 81, 211, 34);
		panel.add(lblSelectRentalType);
		
		JComboBox rtype = new JComboBox();
		rtype.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "Monthly", "Half-Yearly", "Quaterly", "Yearly"}));
		rtype.setFont(new Font("Tahoma", Font.BOLD, 18));
		rtype.setBounds(259, 81, 130, 34);
		panel.add(rtype);
		
		JLabel lblMinimumRent = new JLabel("Minimum Rent");
		lblMinimumRent.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMinimumRent.setBounds(425, 11, 159, 34);
		panel.add(lblMinimumRent);
		
		JLabel lblMaximumRent = new JLabel("Maximum Rent");
		lblMaximumRent.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMaximumRent.setBounds(425, 81, 159, 34);
		panel.add(lblMaximumRent);
		
		JTextField min = new JTextField();
		min.setBackground(new Color(245, 245, 245));
		min.setFont(new Font("Tahoma", Font.BOLD, 18));
		min.setBounds(594, 11, 130, 34);
		panel.add(min);
		
		JTextField max = new JTextField();
		max.setBackground(new Color(245, 245, 245));
		max.setFont(new Font("Tahoma", Font.BOLD, 18));
		max.setBounds(594, 81, 130, 34);
		panel.add(max);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(32, 11, 774, 376);
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel_1.add(scrollPane);
		
		String headings[]= {"Property Id ","Location ","Apartment Type","Rental Type","Amenities","Furnish","Owner Name","Owner Phone","Security Deposit","Rent"};
		data= new String[10][10];
		table = new JTable(data,headings);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		for(int i=1;i<10;i++)
			table.getColumnModel().getColumn(i).setPreferredWidth(140);
		table.setBackground(new Color(245, 245, 245));
		table.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		//table.setEnabled(false);
		table.setRowHeight(40);
		table.getTableHeader().setFont(new Font("SansSerif",Font.BOLD,12));
		scrollPane.setViewportView(table);
		JButton btnNewButton = new JButton("Find Rental Options");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//get values
				String aptype=String.valueOf(atype.getSelectedItem());
				String rntype=String.valueOf(rtype.getSelectedItem());
				
				Float minrent=Float.parseFloat(min.getText());
				Float maxrent=Float.parseFloat(max.getText());
				
				CustomerDao cdao= new CustomerDao();
				 String data1[][]=cdao.getRecords(aptype,rntype,minrent,maxrent);
				 for(int r=0;r<data.length;r++) {
					 for(int c=0;c<data[r].length;c++) {
						 data[r][c]=data1[r][c];
					 }
					
				 }
				table.updateUI();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(273, 143, 289, 34);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				CustomerProfile cp= new CustomerProfile(c);
				cp.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\img for app\\back button.gif"));
		btnNewButton_2.setBounds(684, 143, 54, 34);
		panel.add(btnNewButton_2);
		
		
	}
}
