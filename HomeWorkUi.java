package com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
//import javax.management.modelmbean.ModelMBean;
import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeWorkUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField hotpot1;
	private JTextField hotpot2;
	private JTextField hotpot3;
	private JTextField name;
	private JTextField num;
	String name1;
	int num1;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel model;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeWorkUi frame = new HomeWorkUi();
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
		
		public HomeWorkUi() {
		setTitle("三鍋臭媽媽");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(35, 10, 205, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("       三鍋臭媽媽");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 22));
		lblNewLabel.setBounds(0, 0, 205, 49);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 128));
		panel_1.setBounds(10, 69, 264, 222);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("大腸臭臭鍋");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 22, 86, 23);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("海鮮豆腐鍋");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 69, 86, 23);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("泡菜鍋");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 112, 86, 23);
		panel_1.add(lblNewLabel_1_2);
		
		hotpot1 = new JTextField();
		hotpot1.setBounds(106, 23, 96, 21);
		panel_1.add(hotpot1);
		hotpot1.setColumns(10);
		
		hotpot2 = new JTextField();
		hotpot2.setBounds(106, 70, 96, 21);
		panel_1.add(hotpot2);
		hotpot2.setColumns(10);
		
		hotpot3 = new JTextField();
		hotpot3.setBounds(106, 113, 96, 21);
		panel_1.add(hotpot3);
		hotpot3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("150元");
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_2.setBounds(208, 26, 46, 15);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("160元");
		lblNewLabel_2_1.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(208, 77, 46, 15);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("170元");
		lblNewLabel_2_2.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(208, 116, 46, 15);
		panel_1.add(lblNewLabel_2_2);
		
//		JPanel panel_2 = new JPanel();
//		panel_2.setBackground(new Color(255, 128, 128));
//		panel_2.setBounds(10, 301, 264, 127);
//		contentPane.add(panel_2);
//		panel_2.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);  
	//	scrollPane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
		JTextArea output = new JTextArea(5,15);
		output.setBounds(10, 309, 205, 150);
//		contentPane.add(output);
		
		scrollPane.setBounds(10, 301, 265, 100);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setViewportView(output);
		
		contentPane.add(scrollPane);
//		ScrollPane scrollPane = new ScrollPane(output,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		scrollPane.setBounds(10, 301, 450, 150);
//		
//		contentPane.add(scrollPane);
	
		
		
//		JScrollPane sp=new JScrollPane(output,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		contentPane.add(sp);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 128));
		panel_3.setBounds(299, 69, 159, 222);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("會員姓名");
		lblNewLabel_4.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 59, 69, 15);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("會員電話");
		lblNewLabel_4_1.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(10, 126, 69, 15);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("       加入會員");
		lblNewLabel_5.setBounds(0, 0, 159, 49);
		panel_3.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("新細明體", Font.BOLD, 22));
		
		
		JLabel lblNewLabel_3 = new JLabel("              會員可享九折優惠");
		lblNewLabel_3.setBounds(10, 175, 244, 37);
		panel_1.add(lblNewLabel_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(309, 308, 149, 94);
		contentPane.add(scrollPane_1);
		
		name = new JTextField();
		name.setBounds(32, 84, 96, 21);
		panel_3.add(name);
		name.setColumns(10);
		
		num = new JTextField();
		num.setBounds(32, 151, 96, 21);
		panel_3.add(num);
		num.setColumns(10);
		
		table_1 = new JTable();
//		table_1.setBackground(getForeground());
		model=new DefaultTableModel();
		Object[] column = {"會員姓名","會員電話"};
		Object[] row = new Object[2];
		model.setColumnIdentifiers(column);
		table_1.setModel(model);
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton_1 = new JButton("加入");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				row[0]=name.getText();
				row[1]=num.getText();
				model.addRow(row);
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				
				String Name=name.getText();
				System.out.println(name.getText());
				String Num=num.getText();
				Integer N=new Integer(Num);
				HomeWork h1=new HomeWork(Name,N);
				name1=Name;
				num1=N;
//				Name=name.getText();
//				 Num=num.getText();
//				 N=new Integer(Num);
//				output2.setText("會員姓名:"+h1.getName()+
//								"\n會員電話"+h1.getNum());	
//				Object[0]=
				
//				row[0]=name1;
//				row[1]=num1;
//			
//				model.addRow(row);
				
				name.setText("");
				num.setText("");
			}
		});
		
		btnNewButton_1.setFont(new Font("新細明體", Font.BOLD, 12));
		btnNewButton_1.setBounds(41, 189, 87, 23);
		panel_3.add(btnNewButton_1);
		
//		table_1.setModel(new DefaultTableModel(
//			new Object[][] {
//				{null, null},
//			},
//			new String[] {
//				"\u6703\u54E1\u59D3\u540D", "\u6703\u54E1\u96FB\u8A71"
//			}
//		));
//		scrollPane_1.setViewportView(table_1);
//		


		
	

		
//		JPanel panel_4 = new JPanel();
//		panel_4.setBackground(new Color(255, 128, 128));
//		panel_4.setBounds(299, 299, 159, 127);
//		contentPane.add(panel_4);
//		panel_4.setLayout(null);
//		
//		JTextArea output2 = new JTextArea();
//		output2.setBounds(10, 10, 139, 107);
//		panel_4.add(output2);
		
		
		
		JCheckBox member = new JCheckBox("會員");
		member.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(member.isSelected())
				{
//					MemberUi m=new MemberUi();
//					m.setVisible(true);
////					m.dispose();
//				//m.setVisible(false);
//					
				}
			}
		});
		member.setFont(new Font("新細明體", Font.BOLD, 14));
		member.setBounds(197, 145, 61, 23);
		panel_1.add(member);
//		String Name=name.getText();
//		String Num=num.getText();
//		Integer N=new Integer(Num);
//		HomeWork h=new HomeWork(Name,N);
//		int cheak=0;
		
		name1="尚未加入會員";
//		Object[] row = new Object[4];
		
		
		
		
		JButton btnNewButton = new JButton("結帳");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Hotpot1=hotpot1.getText();
				String Hotpot2=hotpot2.getText();
				String Hotpot3=hotpot3.getText();
				Integer H1=new Integer(Hotpot1);
				Integer H2=new Integer(Hotpot2);
				Integer H3=new Integer(Hotpot3);
//				String Name=name.getText();
//				String Num=num.getText();
//				Integer N=new Integer(Num);
				HomeWork h=new HomeWork(H1,H2,H3);
				
		
//				HomeWork h=new HomeWork(Name,N);
				
				
				if(member.isSelected())
				{
					
					if(name1=="尚未加入會員")
					{
						output.setText("尚未加入會員,請加入會員");
					}else 
					{
						
						
						output.setText("會員姓名:"+name1+
									"\n會員電話"+num1);
						output.setText("會員姓名:"+name1+
								"\n會員電話"+num1+
								"\n訂單細目:"+
								"\n大腸臭臭鍋:"+h.getHotpot1()+
								"\n海鮮豆腐鍋:"+h.getHotpot2()+
								"\n泡菜鍋:"+h.getHotpot3()+
								"\n金額:"+h.getSum()*0.9);
					}
				}
				else 
				{
					output.setText("訂單細目:"+
							"\n大腸臭臭鍋:"+h.getHotpot1()+
							"\n海鮮豆腐鍋:"+h.getHotpot2()+
							"\n泡菜鍋:"+h.getHotpot3()+
							"\n金額:"+h.getSum());
				}
				
				
			}
		});
		
		JButton clean = new JButton("清除資料");
		clean.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hotpot1.setText("");
				hotpot2.setText("");
				hotpot3.setText("");
				output.setText("");
				name1="尚未加入會員";
				
//				output2.setText("");
			}
		});
		
		
		clean.setFont(new Font("新細明體", Font.BOLD, 12));
		clean.setBounds(106, 145, 87, 23);
		panel_1.add(clean);
		
		btnNewButton.setFont(new Font("新細明體", Font.BOLD, 12));
		btnNewButton.setBounds(10, 145, 87, 23);
		panel_1.add(btnNewButton);
		
	
		
		
	
	
	
	
		
	
		
	}
}
