import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 505);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(206, 121, 382, 318);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(51, 77, 97, 26);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(51, 136, 81, 26);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(188, 79, 132, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 137, 132, 29);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(132, 199, 89, 32);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setBounds(133, 0, 106, 34);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		
		JLabel lblNewLabel_3 = new JLabel("Back");
		lblNewLabel_3.setBounds(326, 279, 46, 28);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\back img.png"));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Homepage h=new Homepage();
				h.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(0, 0, 382, 318);
		lblNewLabel_7.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel_7.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\bgbus.jpg"));
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 0, 799, 93);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Homepage h=new Homepage();
				h.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\back img.png"));
		lblNewLabel_5.setBounds(0, 0, 46, 32);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("The Peace Journey");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(59, 11, 118, 25);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("in the BUS");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5_1.setBounds(69, 34, 98, 25);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6 = new JLabel("The Safest Journey");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(643, 11, 146, 25);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("in the World..");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(653, 34, 118, 25);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Bus Management");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Stencil", Font.BOLD, 18));
		lblNewLabel_9.setBounds(293, 27, 206, 41);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Only Admins are allowed..!!");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(329, 68, 151, 25);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\bgbus.jpg"));
		lblNewLabel_4.setBounds(0, 93, 799, 373);
		contentPane.add(lblNewLabel_4);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("Aditya@05") && passwordField.getText().equals("0508"))
				{
					AdminDashboard b=new AdminDashboard();
					b.setVisible(true);
					setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter Correct UserId And Pass ");
				}
					
			}
		});
		
		
		
		
	}
}
