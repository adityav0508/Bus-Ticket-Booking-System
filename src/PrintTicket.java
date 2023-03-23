import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrintTicket extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintTicket frame = new PrintTicket(10);
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
	public PrintTicket(int id) {
		Database db = new Database();
		db.getBookingDetails(id);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 781, 457);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Homepage p = new Homepage();
				p.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\sumit\\Desktop\\aditya\\images\\images\\back img.png"));
		lblNewLabel_13.setBounds(10, 392, 46, 34);
		panel.add(lblNewLabel_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(89, 35, 589, 357);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tiket No");
		lblNewLabel.setBounds(49, 75, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(49, 112, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Source - Destination");
		lblNewLabel_2.setBounds(49, 146, 97, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date");
		lblNewLabel_3.setBounds(49, 183, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(""+id);
		lblNewLabel_4.setBounds(173, 75, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(db.NAME);
		lblNewLabel_5.setBounds(173, 112, 78, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(db.Booked_SOUR+" - "+db.Booked_DEST);
		lblNewLabel_6.setBounds(173, 146, 141, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(db.Booked_DATE);
		lblNewLabel_7.setBounds(173, 183, 78, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Time\r\n");
		lblNewLabel_8.setBounds(49, 224, 46, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Bill");
		lblNewLabel_9.setBounds(49, 260, 46, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(db.Booked_TIME);
		lblNewLabel_10.setBounds(173, 224, 63, 22);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel(db.price);
		lblNewLabel_11.setBounds(173, 260, 46, 14);
		panel_1.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.setBounds(304, 403, 107, 43);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  PrinterJob pjob = PrinterJob.getPrinterJob();
				  PageFormat preformat = pjob.defaultPage();
				  preformat.setOrientation(PageFormat.LANDSCAPE);
				  PageFormat postformat = pjob.pageDialog(preformat);
				  //If user does not hit cancel then print.
				  if (preformat != postformat) {
				      //Set print component
					  JFrame a =  new PrintTicket(id);
				      pjob.setPrintable(new Printer(panel_1) , postformat);
				      if (pjob.printDialog()) {
				          
				              try {
								pjob.print();
							} catch (PrinterException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
				         
				      }
				  }
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 0, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\sumit\\Desktop\\aditya\\images\\images\\bgbus.jpg"));
		lblNewLabel_12.setBounds(0, -22, 781, 468);
		panel.add(lblNewLabel_12);
	}
}
