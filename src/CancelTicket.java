import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CancelTicket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelTicket frame = new CancelTicket();
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
	public CancelTicket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 770, 82);
		panel.setBackground(new Color(0, 51, 102));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cancellation");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(311, 21, 149, 37);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Homepage hg=new Homepage();
				hg.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\back img.png"));
		lblNewLabel_1.setBounds(0, 0, 46, 37);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 82, 770, 391);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(146, 11, 484, 369);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("*ENTER VALID SEAT NO'");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setBounds(224, 108, 179, 14);
		lblNewLabel_8.setVisible(false);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Ticket No.:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(90, 82, 124, 25);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Registered EMail ID");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(90, 141, 137, 25);
		panel_2.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(224, 81, 123, 28);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(224, 138, 123, 28);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("*Enter Valid Email ID");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setBounds(230, 166, 117, 14);
		panel_2.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Cancel Ticket");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals(""))  
				{
					Database db = new Database();
					db.getBookingDetails(Integer.parseInt(textField.getText()));
					System.out.println(db.EMAIL);
					if(textField_1.getText().equals(db.EMAIL))
					{
						db.cancelTiket(Integer.parseInt(textField.getText()));						
					}else
					{
						lblNewLabel_5.setVisible(true);
					}
				}else {
					lblNewLabel_8.setVisible(true);
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(166, 217, 137, 34);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Cancel Tickets");
		lblNewLabel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(166, 0, 160, 34);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel_6.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\bgbus.jpg"));
		lblNewLabel_6.setBounds(0, 0, 484, 369);
		panel_2.add(lblNewLabel_6);
		
		JLabel label = new JLabel("New label");
		label.setBounds(357, 88, 46, 14);
		panel_2.add(label);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\bgbus.jpg"));
		lblNewLabel_7.setBounds(0, 0, 770, 391);
		panel_1.add(lblNewLabel_7);
	}
}
