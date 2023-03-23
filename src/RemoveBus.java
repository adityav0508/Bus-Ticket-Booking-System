import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RemoveBus extends JFrame {

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
					RemoveBus frame = new RemoveBus();
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
	public RemoveBus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 792, 80);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminDashboard db=new AdminDashboard();
				db.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\sumit\\Desktop\\aditya\\images\\images\\back img.png"));
		lblNewLabel_4.setBounds(0, 0, 46, 40);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Manage Bus Booking System");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_5.setBounds(277, 25, 331, 29);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(53, 91, 678, 377);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Remove Buses");
		lblNewLabel.setBounds(244, 0, 175, 30);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Bus ID");
		lblNewLabel_1.setBounds(86, 52, 108, 22);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(231, 55, 108, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("*Enter correct bus id");
		lblNewLabel_2.setBounds(349, 58, 152, 14);
		lblNewLabel_2.setForeground(new Color(204, 0, 0));
		lblNewLabel_2.setVisible(false);
		panel_1.add(lblNewLabel_2);
		
		
		Jtable jt = new Jtable();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(104, 85, 456, 241);
		panel_1.add(scrollPane);
		table = new JTable();
		scrollPane.setViewportView(table);
		jt.ShowDataInJtable("select *  from buses", table);
		
		JButton btnNewButton = new JButton("Remove bus");
		btnNewButton.setBounds(284, 337, 135, 29);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pattern.compile("^[0-9]{3}$").matcher(textField.getText()).matches())
				{
					Database db=new Database();
					db.removeBuses(Integer.parseInt(textField.getText()));
					
				}else {
					lblNewLabel_2.setVisible(true);
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 51, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\sumit\\Desktop\\aditya\\images\\images\\bgbus.jpg"));
		lblNewLabel_3.setBounds(0, 0, 678, 377);
		panel_1.add(lblNewLabel_3);
		
		
	}
}
