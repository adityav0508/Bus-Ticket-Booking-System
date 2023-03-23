import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;

public class BookTicket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookTicket frame = new BookTicket(0,"","","","",0);
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
	public BookTicket(int id ,String s,String d, String date, String time,int price) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 498);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 792, 459);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(143, 115, 478, 308);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 71, 86, 30);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel = new JLabel("Book Tickets");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(179, 0, 125, 30);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblNewLabel_4 = new JLabel("EMail");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(40, 191, 80, 18);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel_3 = new JLabel("No. of seats");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(40, 112, 86, 32);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		textField_3 = new JTextField();
		textField_3.setBounds(221, 186, 125, 30);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(221, 133, 125, 30);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(221, 72, 125, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("*Enter your name");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(356, 78, 112, 17);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setVisible(false);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(319, 115, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("*Enter no. of seats");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(359, 136, 139, 22);
		panel_1.add(lblNewLabel_7);
		lblNewLabel_7.setVisible(false);
		
		JLabel lblNewLabel_8 = new JLabel("*Enter valid Email");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(356, 193, 112, 14);
		panel_1.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setBounds(164, 263, 114, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList al=new ArrayList();
				int a= 0;
				if(textField.getText().equals(""))
				{
					lblNewLabel_5.setVisible(true);
					a=1;
				}
				else {
					
					al.add(textField.getText());
					al.add(s);
					al.add(d);
				}
			
				if(Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$").matcher(textField_3.getText()).matches()) {
					al.add(textField_3.getText());
					al.add(date);
					al.add(time);
				}else {
					lblNewLabel_8.setVisible(true);
					a=1;
				}
				if(Pattern.compile("^[0-9]|{1,2}$").matcher(textField_2.getText()).matches() ) {
					lblNewLabel_7.setVisible(true);
					a=1;
				}else {
					al.add(textField_2.getText());
					al.add(Integer.parseInt(textField_2.getText())*price);
					
				}
				if(a==0) {
					Database b=new Database();
					int c = b.book(al);
					if(c==0)
					{
						JOptionPane.showMessageDialog(null, "Unsucessfull to book");
					}else {
						JOptionPane.showMessageDialog(null, "Sucessfully booked");
					   b.getDetails(s, d);
					   System.out.println(textField_2.getText());
						b.decBus(id, Integer.parseInt(textField_2.getText()));
						b.getId(textField.getText());
						PrintTicket s = new PrintTicket(Integer.parseInt(b.Booked_id));
						s.setVisible(true);
						setVisible(false);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("You want to Book");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(42, 137, 140, 20);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel_16.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\bgbus.jpg"));
		lblNewLabel_16.setBounds(0, 0, 478, 308);
		panel_1.add(lblNewLabel_16);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 102));
		panel_2.setBounds(0, 0, 792, 90);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("You can Travel");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(69, 35, 109, 14);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("with us Happily..");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(69, 51, 109, 28);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowBuses b1=new ShowBuses();
				b1.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_12.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\back img.png"));
		lblNewLabel_12.setBounds(0, 0, 46, 28);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Reserve Your Bus seats..");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Sitka Small", Font.BOLD, 22));
		lblNewLabel_13.setBounds(256, 11, 296, 44);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("We like to give you a Comfortable Journey..");
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(279, 56, 248, 21);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Happy Journey!!");
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_15.setBounds(662, 37, 102, 18);
		panel_2.add(lblNewLabel_15);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 89, 792, 370);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(0, 0, 792, 370);
		panel_3.add(lblNewLabel_9);
		lblNewLabel_9.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\bgbus.jpg"));
	}
}
