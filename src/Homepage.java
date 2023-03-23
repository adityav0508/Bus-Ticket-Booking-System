import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
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
	public Homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 494);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 782, 89);
		panel.setBackground(new Color(0, 51, 102));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Online Bus Ticket System");
		lblNewLabel.setBounds(205, 0, 334, 50);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Admin Login");
		lblNewLabel_2.setBounds(679, 0, 103, 24);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AdminLogin ad=new AdminLogin();
				ad.setVisible(true);
				setVisible(false);
				
			}
		});
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("The Safest Journey");
		lblNewLabel_6.setBounds(10, 11, 146, 25);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("in the World..");
		lblNewLabel_8.setBounds(0, 36, 118, 25);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("Assured seat of your choice");
		lblNewLabel_4.setBounds(286, 65, 164, 24);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JLabel lblNewLabel_1 = new JLabel("Aditya's Bus Booking Site");
		lblNewLabel_1.setBounds(258, 37, 218, 24);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\bus.jpg"));
		lblNewLabel_9.setBounds(523, 0, 146, 89);
		panel.add(lblNewLabel_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(33, 113, 356, 331);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(0, 0, 356, 331);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\sumit\\Desktop\\aditya\\images\\images\\Bus-Wallpaper.jpg"));
		lblNewLabel_3.setBackground(Color.CYAN);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(393, 113, 356, 331);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("View buses");
		btnNewButton.setBounds(113, 71, 114, 34);
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowBuses s=new ShowBuses();
				s.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setForeground(Color.WHITE);
		
		JButton btnNewButton_2 = new JButton("Cancel Ticket");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelTicket ct=new CancelTicket();
				ct.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(113, 163, 114, 34);
		btnNewButton_2.setForeground(Color.WHITE);
		panel_2.add(btnNewButton_2);
		btnNewButton_2.setBackground(new Color(0, 51, 102));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(0, 0, 356, 331);
		lblNewLabel_7.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\bgbus.jpg"));
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Desktop\\\\aditya\\\\images\\\\images\\\\bgbus.jpg"));
		lblNewLabel_5.setBounds(0, 88, 782, 367);
		contentPane.add(lblNewLabel_5);
	}
}
