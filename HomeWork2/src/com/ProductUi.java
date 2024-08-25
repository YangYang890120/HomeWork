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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
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
import javax.swing.SwingConstants;

public class ProductUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pay;
	private Integer Sum;
	private Integer change=0;
	private JTable t;
	private JTextField addName;
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
		setBounds(100, 100, 728, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("家具行");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel.setBounds(43, 10, 106, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("沙發");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1.setBounds(20, 48, 58, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("書桌");
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_2.setBounds(20, 108, 46, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("雙人床");
		lblNewLabel_3.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 168, 58, 22);
		contentPane.add(lblNewLabel_3);
		
		pay = new JTextField();
		pay.setBounds(232, 126, 96, 21);
		contentPane.add(pay);
		pay.setColumns(10);
		
		JSpinner sofa = new JSpinner();
		sofa.setBounds(75, 48, 65, 22);
		contentPane.add(sofa);
		
		JSpinner desk = new JSpinner();
		desk.setBounds(75, 108, 65, 22);
		contentPane.add(desk);
		
		JSpinner bed = new JSpinner();
		bed.setBounds(75, 168, 65, 22);
		contentPane.add(bed);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(161, 11, 263, 99);
		contentPane.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
		JLabel lblNewLabel_6 = new JLabel("明細");
		lblNewLabel_6.setFont(new Font("新細明體", Font.PLAIN, 18));
		scrollPane.setRowHeaderView(lblNewLabel_6);
		
		addName = new JTextField();
		addName.setBounds(531, 231, 96, 21);
		contentPane.add(addName);
		addName.setColumns(10);
		addName.setVisible(false);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(161, 157, 263, 96);
		contentPane.add(scrollPane_1);
		
		JTextArea output2 = new JTextArea();
		scrollPane_1.setViewportView(output2);
		
		JLabel lblNewLabel_4 = new JLabel("找零");
		lblNewLabel_4.setFont(new Font("新細明體", Font.PLAIN, 18));
		scrollPane_1.setRowHeaderView(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("結帳");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer s=(Integer) sofa.getValue();
				Integer d=(Integer) desk.getValue();
				Integer b=(Integer) bed.getValue();
				
				Product p=new Product(s,d,b);
				Sum=p.getSum();

				switch(addName.getText())
				{
					case "VIP會員":
						if(p.getBed()<0||p.getDesk()<0||p.getSofa()<0)
						{
							output.setText("購買數量不可為負");
						}else {
							output.setText
							(
							"尊貴的VIP會員"	+
							"\n訂單細項:"+
							"\n------------------------------"+
							"\n沙發:"+p.getSofa()+"*4999元"+
							"\n書桌:"+p.getDesk()+"*3000元"+
							"\n雙人床:"+p.getBed()+"*9999元"+
							"\n總金額:"+Math.round(p.getSum()*0.8)+"元"
							);}
						break;
					case "白金會員":
						if(p.getBed()<0||p.getDesk()<0||p.getSofa()<0)
						{
							output.setText("購買數量不可為負");
						}else {
							output.setText
							(
							"尊貴的白金會員"	+
							"\n訂單細項:"+
							"\n------------------------------"+
							"\n沙發:"+p.getSofa()+"*4999元"+
							"\n書桌:"+p.getDesk()+"*3000元"+
							"\n雙人床:"+p.getBed()+"*9999元"+
							"\n總金額:"+Math.round(p.getSum()*0.85)+"元"
						);}
						break;
					case "黃金會員":
						if(p.getBed()<0||p.getDesk()<0||p.getSofa()<0)
						{
							output.setText("購買數量不可為負");
						}else {
							output.setText
							(
							"尊貴的黃金會員"	+
							"\n訂單細項:"+
							"\n------------------------------"+
							"\n沙發:"+p.getSofa()+"*4999元"+
							"\n書桌:"+p.getDesk()+"*3000元"+
							"\n雙人床:"+p.getBed()+"*9999元"+
							"\n總金額:"+(int)(p.getSum()*0.9)+"元"
							);}
						break;
					case "白銀會員":
						if(p.getBed()<0||p.getDesk()<0||p.getSofa()<0)
						{
							output.setText("購買數量不可為負");
						}else {
							System.out.println((int)(p.getSum()*0.95));
						output.setText
							(
							"尊貴的白銀會員"	+
							"\n訂單細項:"+
							"\n------------------------------"+
							"\n沙發:"+p.getSofa()+"*4999元"+
							"\n書桌:"+p.getDesk()+"*3000元"+
							"\n雙人床:"+p.getBed()+"*9999元"+
							"\n總金額:"+(int)(p.getSum()*0.95)+"元"
							);}
						break;
					case "":
						if(p.getBed()<0||p.getDesk()<0||p.getSofa()<0)
						{
							output.setText("購買數量不可為負");
						}else {
						output.setText
							(
							"訂單細目:"+
							"\n------------------------------"+
							"\n沙發:"+p.getSofa()+"*4999元"+
							"\n書桌:"+p.getDesk()+"*3000元"+
							"\n雙人床:"+p.getBed()+"*9999元"+
							"\n總金額:"+p.getSum()+"元"
							);}
						break;
				}
			}
		});
		btnNewButton.setBounds(53, 230, 87, 23);
		contentPane.add(btnNewButton);
		
		JButton close = new JButton("離開");
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		close.setBounds(610, 230, 87, 23);
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
		btnNewButton_1.setBounds(434, 230, 87, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("找零");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer Pay= Integer.parseInt(pay.getText());
				
				switch(addName.getText())
				{
					case "VIP會員":
						
						change=(int)(Pay-Math.round(Sum*0.8));
						if(Pay<Sum*0.8)
						{
							output2.setText("錢是不是給太少~~");
						}else {					
							output2.setText
							(
							"找零細項:"+
							"\n千元鈔票:"+change/1000+
							"\n百元鈔票:"+change%1000/100+
							"\n十元硬幣:"+change%1000%100/10+
							"\n五元硬幣:"+change%1000%100%10/5+
							"\n一元硬幣:"+change%1000%100%10%5/1
							);}
						break;
					case "白金會員":
						change=(int)(Pay-Math.round(Sum*0.85));
						if(Pay<Sum*0.85)
						{
							output2.setText("錢是不是給太少~~");
						}else {	
							output2.setText
							(
							"找零細項:"+
							"\n千元鈔票:"+change/1000+
							"\n百元鈔票:"+change%1000/100+
							"\n十元硬幣:"+change%1000%100/10+
							"\n五元硬幣:"+change%1000%100%10/5+
							"\n一元硬幣:"+change%1000%100%10%5/1
							);}
						break;
					case "黃金會員":
						change=(int) (Pay-Math.round(Sum*0.9));
						if(Pay<Sum*0.9)
						{
							output2.setText("錢是不是給太少~~");
						}else {	
							System.out.println((int)(Sum*0.90));
							output2.setText
							(
							"找零細項:"+
							"\n千元鈔票:"+change/1000+
							"\n百元鈔票:"+change%1000/100+
							"\n十元硬幣:"+change%1000%100/10+
							"\n五元硬幣:"+change%1000%100%10/5+
							"\n一元硬幣:"+change%1000%100%10%5/1
							);}
						break;
					case "白銀會員":
						change=(int) (Pay-Math.round(Sum*0.95));
						if(Pay<Sum*0.95)
						{
							output2.setText("錢是不是給太少~~");
						}else {	
							output2.setText
							(
							"找零細項:"+
							"\n千元鈔票:"+change/1000+
							"\n百元鈔票:"+change%1000/100+
							"\n十元硬幣:"+change%1000%100/10+
							"\n五元硬幣:"+change%1000%100%10/5+
							"\n一元硬幣:"+change%1000%100%10%5/1
							);}
						break;
					case "":
						change=Pay-Sum;
						if(Pay<Sum)
						{
							output2.setText("錢是不是給太少~~");
						}else {	
							output2.setText
							(
							"找零細項:"+
							"\n千元鈔票:"+change/1000+
							"\n百元鈔票:"+change%1000/100+
							"\n十元硬幣:"+change%1000%100/10+
							"\n五元硬幣:"+change%1000%100%10/5+
							"\n一元硬幣:"+change%1000%100%10%5/1
							);}
						break;
				}
			}
		});
		btnNewButton_2.setBounds(338, 124, 87, 23);
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
		logout.setBounds(610, 10, 87, 23);
		contentPane.add(logout);
		
		
		
		Object[][] data={
			{"VIP會員",0.8},
			{"白金會員",0.85},
			{"黃金會員",0.9},
			{"白銀會員",0.95}};
		String[] columns = {"會員等級", "會員折扣"};
		
		DefaultTableModel model=new DefaultTableModel(data,columns);
		model.setColumnIdentifiers(columns);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		
		scrollPane_2.setBounds(434, 46, 263, 131);
		contentPane.add(scrollPane_2);
		t = new JTable();
		scrollPane_2.setViewportView(t);
        JTableHeader th = t.getTableHeader();  
        TableColumnModel tcm = th.getColumnModel();
        TableColumn column = null;
        th.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		t.setFont(new Font(null));
		t.setFont(new Font("新細明體", Font.PLAIN, 18));
		t.setRowHeight(25);
		t.setModel(model);
		t.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel tm= (DefaultTableModel)t.getModel();
				
				String AddName =tm.getValueAt(t.getSelectedRow(),0).toString();
				String AddPrice =tm.getValueAt(t.getSelectedRow(),1).toString();
				
				addName.setText(AddName);
				//addPrice.setText(AddPrice);		
			}
		});	
		JLabel lblNewLabel_5 = new JLabel("會員等級");
		lblNewLabel_5.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_5.setBounds(513, 10, 170, 28);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("付款金額");
		lblNewLabel_7.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(158, 123, 80, 25);
		contentPane.add(lblNewLabel_7);
	}
}
