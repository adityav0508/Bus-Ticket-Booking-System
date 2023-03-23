import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.JSeparator;

public class ShowBuses extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowBuses frame = new ShowBuses();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param dest 
	 */
	
	
	public ShowBuses() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Jtable jt = new Jtable();
		ArrayList al = new ArrayList();
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 535);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(56, 114, 687, 412);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SHOW BUS TICKETS IN MAHARASHTRA");
		lblNewLabel.setBounds(164, 0, 367, 33);
		panel_2.add(lblNewLabel);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setBounds(24, 64, 46, 20);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(80, 64, 130, 22);
		panel_2.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Akkalkoat", "Satara", "Latur", "Sangli", "Kolhapur"}));
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setBounds(236, 60, 86, 29);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(321, 64, 130, 22);
		panel_2.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Akkalkoat", "Satara", "Latur", "Sangli", "Kolhapur"}));
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setBounds(481, 67, 46, 14);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		textField = new JTextField();
		textField.setBounds(522, 65, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Available Buses Of Your Journey");
		lblNewLabel_7.setBounds(197, 129, 221, 33);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_2.add(lblNewLabel_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(197, 138, 221, -29);
		panel_2.add(separator);
		JButton btnNewButton = new JButton("VIEW");
		btnNewButton.setBounds(276, 97, 89, 33);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(50, 205, 50));
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tableModel = (DefaultTableModel) table. getModel();
				String s;
				s="select * from buses WHERE  b_FROM = '"+ comboBox.getSelectedItem()+"' AND  b_to ='"+comboBox_1.getSelectedItem()+"' AND date= '"+textField.getText() +"'";
				jt.ShowDataInJtable(s, table);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(114, 154, 440, 236);
		panel_2.add(scrollPane);
		
		
		table = new JTable();
		table.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground(new Color(32,136,203));
		table.getTableHeader().setForeground(new Color(255,255,255));
		table.setRowHeight(35);

		
		scrollPane.setViewportView(table);
		table.getSelectionModel().addListSelectionListener((ListSelectionListener) new ListSelectionListener(){
			@Override
			 public void valueChanged(ListSelectionEvent event) {
				String s,d = null,ti = null,da = null;
				int i=0;
				int price=0;
				
				i=Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
				s= table.getValueAt(table.getSelectedRow(), 1).toString();
				d=table.getValueAt(table.getSelectedRow(),2).toString();
				da=table.getValueAt(table.getSelectedRow(), 3).toString();
				ti=table.getValueAt(table.getSelectedRow(),4).toString();
				price=Integer.parseInt(table.getValueAt(table.getSelectedRow(),6).toString());
				
				BookTicket bt = new BookTicket(i,s,d,da,ti,price);
				setVisible(false);
				bt.setVisible(true);
				
			}
			});
		jt.ShowDataInJtable("select *  from buses", table);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(0, 0, 687, 401);
		lblNewLabel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_10.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\bgbus.jpg"));
		panel_2.add(lblNewLabel_10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 0, 784, 93);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Homepage h=new Homepage();
				h.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\sumit\\Desktop\\aditya\\images\\images\\back img.png"));
		lblNewLabel_12.setBounds(0, 0, 39, 31);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_4 = new JLabel("The Peace Journey");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(52, 18, 118, 25);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("in the BUS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(72, 40, 98, 25);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("The Safest Journey");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(628, 18, 146, 25);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("in the World..");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(628, 40, 118, 25);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("Bus Reservation ");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Segoe UI Black", Font.BOLD, 21));
		lblNewLabel_11.setBounds(247, 25, 262, 46);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\sumit\\Desktop\\aditya\\images\\images\\bgbus.jpg"));
		lblNewLabel_9.setBounds(0, 93, 784, 431);
		panel.add(lblNewLabel_9);
	}
}
