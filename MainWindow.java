import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	//DOMINIC'S CODE
	private static final long serialVersionUID = -6172792314391695505L;
	private JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_3;
	private static JTextArea  textArea_1;
	private static JTextField textField_2;
	private static JTextField textField_4;
	private static JTextField textField_5;

	/**
	 * Launch the application.
	 */
	
	public static void calc()
	   {      
	   // Variable declarations
	   // Hint: All variables need to be declared as integers
	  
	   // Calculate the ending time   
	   
	   int hours = Integer.valueOf(textField.getText()) * 60;//hours times 60
	   int hrsmin = hours + Integer.valueOf(textField_3.getText());// hours plus minutes
	   int durmin = hrsmin + Integer.valueOf(textField_1.getText());//time in minutes plus duration
	   int X = durmin / 60;//total time divided by 60
	   int extra = durmin % 60;// finds extra time
	   
	   int STand1 = X;//Military Time converter
	   int STand = ((X + 11) % 12) + 1;//Standard Time converter
	   
	   // Display the output
	   if (STand1 <12){
		    if  (extra < 10) {
			   textField_2.setText(STand + ":0" + extra + " AM");
			   }
			   else{
				   textField_2.setText(STand + ":" + extra + " AM");
			   }
	   }
	   else if (STand1 >= 12){
		    if  (extra < 10) {
			   textField_5.setText(STand + ":0" + extra + " PM");
			   }
			   else{
				   textField_5.setText(STand + ":" + extra + " PM");
			   }
	   }
	   
	   //DOMINIC'S CODE
	   if  (extra < 10) {
	   textField_2.setText(STand1 + ":0" + extra);
	   }
	   else{
		   textField_2.setText(STand1 + ":" + extra);
	   }
	   
	   if  (STand1 < 10) {
		   textField_2.setText("0" + STand1 + ":" + extra);
		   }
		   else{
			   textField_2.setText(STand1 + ":" + extra);
		   }
	   
	   }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setTitle("Made by Dominic Cogan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 400, 505, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0,0,0,0));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		
		JLabel lblStart = new JLabel("Start");
		lblStart.setForeground(Color.WHITE);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setForeground(Color.WHITE);
		
		JLabel lblEndTime1 = new JLabel("End Standared Time");
		lblEndTime1.setForeground(Color.WHITE);
		
		
		JLabel lblEndTime = new JLabel("End Military Time");
		lblEndTime.setForeground(Color.WHITE);
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBackground(Color.BLUE);
		btnCalculate.setForeground(Color.WHITE);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textField_3.setForeground(Color.WHITE);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setColumns(10);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setForeground(Color.WHITE);
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setForeground(Color.WHITE);
		
		JLabel lblMinuets = new JLabel("Minutes");
		lblMinuets.setForeground(Color.WHITE);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textField_5.setForeground(Color.WHITE);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setColumns(10);


		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("moon.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblHours, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addComponent(lblEndTime, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
				.addComponent(lblEndTime1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDuration, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(154)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addGap(201))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(186)
					.addComponent(btnCalculate, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addGap(210))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(154)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addGap(201))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblMinutes, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
				.addComponent(lblStart, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(154)
					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
					.addGap(168))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(154)
					.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
					.addGap(168))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(154)
					.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addGap(201))
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 489, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(lblMinuets, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(54)
					.addComponent(lblHours)
					.addGap(218)
					.addComponent(lblEndTime))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(317)
					.addComponent(lblEndTime1))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(179)
					.addComponent(lblDuration))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(205)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(249)
					.addComponent(btnCalculate))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(48)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(102)
					.addComponent(lblMinutes, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(25)
					.addComponent(lblStart, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(283)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(314)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(96)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 360, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(211)
					.addComponent(lblMinuets))
		);
		panel.setLayout(gl_panel);
		


	}
}
