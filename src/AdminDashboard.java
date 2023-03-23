import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminDashboard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard frame = new AdminDashboard();
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
	public AdminDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 561);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(141, 151, 555, 371);
		panel.setBackground(new Color(135, 206, 235));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Add Buses");
		lblNewLabel_4.setBounds(197, 0, 161, 32);
		lblNewLabel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 27));
		

		JLabel lblNewLabel_9 = new JLabel("No. of Seats");
		lblNewLabel_9.setBounds(10, 214, 86, 14);
		panel.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_2 = new JTextField();
		textField_2.setBounds(90, 212, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("*Enter Numbers only");
		lblNewLabel_10.setBounds(85, 231, 124, 20);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_10.setForeground(Color.RED);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_3 = new JLabel("Time");
		lblNewLabel_3.setBounds(313, 76, 46, 23);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		textField_1 = new JTextField();
		textField_1.setBounds(369, 78, 106, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("*Enter valid time");
		lblNewLabel_8.setBounds(369, 97, 106, 24);
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("*Enter correct date ");
		lblNewLabel_7.setBounds(369, 159, 131, 14);
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(369, 132, 106, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setBounds(315, 130, 46, 23);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel_6 = new JLabel("*select correct destination");
		lblNewLabel_6.setBounds(71, 159, 154, 20);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(71, 133, 86, 22);
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Akkalkoat", "Satara", "Latur", "Sangli", "Kolhapur"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setForeground(Color.BLACK);
		
		JLabel lblNewLabel_1 = new JLabel("To");
		lblNewLabel_1.setBounds(10, 137, 46, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
		
		JLabel lblNewLabel_5 = new JLabel("*select correct source");
		lblNewLabel_5.setBounds(71, 102, 138, 14);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(71, 78, 86, 22);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Akkalkoat", "Satara", "Latur", "Sangli", "Kolhapur"}));
		comboBox.setToolTipText("");
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.BLACK);
		
		JLabel lblNewLabel = new JLabel("From");
		lblNewLabel.setBounds(10, 74, 66, 30);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setVisible(false);
		lblNewLabel_6.setVisible(false);
		lblNewLabel_7.setVisible(false);
		lblNewLabel_8.setVisible(false);
		lblNewLabel_10.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 799, 88);
		panel_1.setBackground(new Color(0, 51, 102));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("Logout");
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Homepage g=new Homepage();
				g.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(735, 11, 54, 17);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Homepage g=new Homepage();
				g.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_13.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\back img.png"));
		lblNewLabel_13.setBounds(735, 39, 46, 27);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Hey Admin!!");
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(0, 0, 76, 14);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_18 = new JLabel("Manage Bus Booking System");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_18.setForeground(Color.WHITE);
		lblNewLabel_18.setBounds(362, 31, 256, 35);
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_15 = new JLabel("*Enter correct price");
		lblNewLabel_15.setForeground(Color.RED);
		lblNewLabel_15.setBounds(369, 243, 131, 14);
		panel.add(lblNewLabel_15);
		lblNewLabel_15.setVisible(false);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(221, 307, 121, 38);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 51, 102));
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList al=new ArrayList();
				int a= 0;
				if(!(comboBox.getSelectedItem()==comboBox_1.getSelectedItem()))
				{
				if(comboBox.getSelectedIndex()==0)
				{
					lblNewLabel_5.setVisible(true);
					a=1;
				}
				else {
					al.add(comboBox.getSelectedItem());
				}
				if(comboBox_1.getSelectedIndex()==0){
					lblNewLabel_6.setVisible(true);
					a=1;
				}
				else {
					al.add(comboBox_1.getSelectedItem());
				}
				if(Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$").matcher(textField.getText()).matches() )
				{
					al.add(textField.getText());
				}
				else {
					lblNewLabel_7.setVisible(true);
					a=1;
				}
				if(Pattern.compile("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$").matcher(textField_1.getText()).matches() )
				{
					al.add(textField_1.getText());
				}
				else {
					lblNewLabel_8.setVisible(true);
					a=1;
				}
				if(Pattern.compile("^[0-9]{2}$").matcher(textField_2.getText()).matches() )
				{
					al.add(textField_2.getText());
				}
				else {
					lblNewLabel_10.setVisible(true);
					a=1;
				}
				if(!textField_3.getText().equals(""))
				{
					al.add(textField_3.getText());
				}else {
					lblNewLabel_15.setVisible(true);
					a=1;
				}
				
				if(a==0){
					Database db = new Database();
					int c=0;
				c=	db.addBuses(al);
				if(c==1) {
					JOptionPane.showMessageDialog(null,"Successfully Added");
				}else
				{
					JOptionPane.showMessageDialog(null,"UnSuccessfully to Add");
				}
				}
				}else
				{
					JOptionPane.showMessageDialog(null, "Select Coreect source & Destinantion");
				}
		 }
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblNewLabel_19 = new JLabel("Price");
		lblNewLabel_19.setBounds(313, 214, 46, 14);
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblNewLabel_19);
		
		textField_3 = new JTextField();
		textField_3.setBounds(369, 212, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 152, 140);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("Remove Buses");
		lblNewLabel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RemoveBus rb = new RemoveBus();
				rb.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_17.setBounds(10, 106, 101, 21);
		panel_2.add(lblNewLabel_17);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(0, 99, 789, 433);
		lblNewLabel_11.setBackground(Color.WHITE);
		lblNewLabel_11.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\bgbus.jpg"));
		contentPane.add(lblNewLabel_11);
		
		
		
		
	}
}
