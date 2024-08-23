package com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class LoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField pas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("登入畫面");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 26));
		lblNewLabel.setBounds(147, 32, 131, 34);
		contentPane.add(lblNewLabel);

		JLabel error1 = new JLabel("");
		error1.setBounds(156, 127, 153, 21);
		contentPane.add(error1);

		JLabel error2 = new JLabel("");
		error2.setBounds(156, 187, 153, 15);
		contentPane.add(error2);

		name = new JTextField();
		name.setBounds(156, 101, 96, 21);
		contentPane.add(name);
		name.setColumns(10);

		pas = new JTextField();
		pas.setBounds(156, 158, 96, 21);
		contentPane.add(pas);
		pas.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(64, 99, 64, 23);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("密碼");
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_2.setBounds(64, 150, 71, 34);
		contentPane.add(lblNewLabel_2);

		JButton login = new JButton("登入");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				error1.setText("");
				error2.setText("");
				String Name = name.getText();
				String Pas = pas.getText();
				Login l1 = new Login("admin", "123");
				Login l2 = new Login(Name, Pas);

				if (l1.getName().equals(l2.getName())) {// 帳號正確換確認密碼

					if (l1.getPas().equals(l2.getPas())) {// 輸入正確登入 產品畫面彈出
						ProductUi p = new ProductUi();
						p.setVisible(true);
						dispose();
					} else {// 密碼輸入錯誤
						error2.setText("輸入錯誤,請輸入'123'");
					}
				} else {// 帳號輸入錯誤
					error1.setText("輸入錯誤,請輸入'admin'");
				}
			}
		});
		login.setBounds(165, 212, 87, 23);
		contentPane.add(login);

		JButton close = new JButton("離開");
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		close.setBounds(305, 212, 87, 23);
		contentPane.add(close);

	}
}
