package com;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;

import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;

public class ProductUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pay;
	private Integer Sum,Msum;
	private Integer change=0;
	private JTable t;
	private JTextField addName;
	private JTextField addPrice;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductUi frame = new ProductUi();
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
	public ProductUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("家具行");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel.setBounds(65, 10, 106, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("沙發");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 48, 58, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("書桌");
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 107, 46, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("雙人床");
		lblNewLabel_3.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_3.setBounds(0, 159, 58, 22);
		contentPane.add(lblNewLabel_3);
		
		pay = new JTextField();
		pay.setBounds(229, 15, 96, 21);
		contentPane.add(pay);
		pay.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("結帳金額");
		lblNewLabel_4.setBounds(161, 18, 58, 15);
		contentPane.add(lblNewLabel_4);
		
		JSpinner sofa = new JSpinner();
		sofa.setBounds(65, 48, 65, 22);
		contentPane.add(sofa);
		
		JSpinner desk = new JSpinner();
		desk.setBounds(65, 107, 65, 22);
		contentPane.add(desk);
		
		JSpinner bed = new JSpinner();
		bed.setBounds(65, 161, 65, 22);
		contentPane.add(bed);
		

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(161, 48, 263, 58);
		contentPane.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
		addName = new JTextField();
		addName.setBounds(460, 109, 96, 21);
		contentPane.add(addName);
		addName.setColumns(10);
		
		addPrice = new JTextField();
		addPrice.setBounds(569, 109, 96, 21);
		contentPane.add(addPrice);
		addPrice.setColumns(10);
//		System.out.println(t.getName());
//		System.out.println(t.getValueAt(0, 1));
//		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(161, 116, 263, 63);
		contentPane.add(scrollPane_1);
		
		JTextArea output2 = new JTextArea();
		scrollPane_1.setViewportView(output2);
		
		JCheckBox member = new JCheckBox("會員");
		member.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(member.isSelected())
				{
					Integer s=(Integer) sofa.getValue();
					Integer d=(Integer) desk.getValue();
					Integer b=(Integer) bed.getValue();
					
					Product p=new Product(s,d,b);
					Sum=p.getSum();
					Msum=(int) Math.round(p.getMsum());
					output.setText
					(
							"訂單細目:"+
							"\n沙發:"+p.getSofa()+
							"\n書桌:"+p.getDesk()+
							"\n雙人床:"+p.getBed()+
							"\n總金額:"+Math.round(p.getMsum())
					);
				}
			}
		});
		member.setBounds(97, 189, 58, 18);
		contentPane.add(member);		
		
		JButton btnNewButton = new JButton("結帳");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer s=(Integer) sofa.getValue();
				Integer d=(Integer) desk.getValue();
				Integer b=(Integer) bed.getValue();
				
				Product p=new Product(s,d,b);
				Sum=p.getSum();
				Msum=(int) Math.round(p.getMsum());
				
				if(member.isSelected())
				{
					output.setText
					(
							"訂單細目:"+
							"\n------------------------------"+
							"\n沙發:"+p.getSofa()+"*4999元"+
							"\n書桌:"+p.getDesk()+"*3000元"+
							"\n雙人床:"+p.getBed()+"*9999元"+
							"\n總金額:"+Math.round(p.getMsum())+"元"
					);
				}
				else
				{
					output.setText
					(
							"訂單細目:"+
							"\n------------------------------"+
							"\n沙發:"+p.getSofa()+"*4999元"+
							"\n書桌:"+p.getDesk()+"*3000元"+
							"\n雙人床:"+p.getBed()+"*9999元"+
							"\n總金額:"+p.getMsum()+"元"
					);
					
				}
				
	
			}
		});
		btnNewButton.setBounds(34, 213, 87, 23);
		contentPane.add(btnNewButton);
		
		JButton close = new JButton("離開");
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		close.setBounds(337, 213, 87, 23);
		contentPane.add(close);
		
		
		
		JButton btnNewButton_1 = new JButton("列印");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					output.print();
				}
				catch(PrinterException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(144, 213, 87, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("找零");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer Pay= Integer.parseInt(pay.getText());
				
				if(member.isSelected())
				{	
					change=Pay-Msum;
					if(Pay<Msum)
					{
						output2.setText("請重新填寫");
					}
					else
					{
						output2.setText
							(
								"找零細項:"+
								"\n千元鈔票:"+change/1000+
								"\n百元鈔票:"+change%1000/100+
								"\n十元硬幣:"+change%1000%100/10+
								"\n五元硬幣:"+change%1000%100%10/5+
								"\n一元硬幣:"+change%1000%100%10%5/1
							);
					}
				}
				else if(Pay<Sum)
				{
					output2.setText("請重新填寫");
				}
				else
				{	change=Pay-Sum;
					output2.setText
						(
							"找零細項:"+
							"\n千元鈔票:"+change/1000+
							"\n百元鈔票:"+change%1000/100+
							"\n十元硬幣:"+change%1000%100/10+
							"\n五元硬幣:"+change%1000%100%10/5+
							"\n一元硬幣:"+change%1000%100%10%5/1
						);
				}
			}
		});
		btnNewButton_2.setBounds(337, 14, 87, 23);
		contentPane.add(btnNewButton_2);
		
		JButton logout = new JButton("登出");
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginUI l=new LoginUI();
				l.setVisible(true);
				dispose();
			}
		});
		logout.setBounds(241, 213, 87, 23);
		contentPane.add(logout);
		
		t = new JTable();
		
		t.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"\u6703\u54E1\u7B49\u7D1A", "\u6298\u6263"
			}
		));
		t.setBounds(460, 22, 205, 63);
		contentPane.add(t);
		
		JButton addin = new JButton("加入");
		addin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(addName.getText().equals("")||addPrice.getText().equals(""))
				{
					JOptionPane.showMessageDialog(addin,"請輸入正確資料");
				}
				else
				{
					String data[] = {addName.getText(),addPrice.getText()};
					
					DefaultTableModel tm= (DefaultTableModel)t.getModel();
					
					tm.addRow(data);
				}
				
			}
		});
		addin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		addin.setBounds(513, 158, 87, 23);
		contentPane.add(addin);
		t.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel tm= (DefaultTableModel)t.getModel();
				
				String AddName =tm.getValueAt(t.getSelectedRow(),0).toString();
				String AddPrice =tm.getValueAt(t.getSelectedRow(),1).toString();
//				String AddAmount =tm.getValueAt(t.getSelectedRow(),2).toString();
				
				addName.setText(AddName);
				addPrice.setText(AddPrice);
				
			}
		});	
	}
}
