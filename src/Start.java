import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JLabel;

public class Start extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		main();
	}
	
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		JRadioButton rdbtnNewRadioButton;
		JRadioButton rdbtnNewRadioButton_1;
		JRadioButton rdbtnNewRadioButton_2;
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(700, 400, 401, 220);
		setTitle("Create Sudoku");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdbtnNewRadioButton = new JRadioButton("easy");
		rdbtnNewRadioButton_2 = new JRadioButton("hard");
		rdbtnNewRadioButton_1 = new JRadioButton("medium");
		
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_2.isSelected()) {
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton.setSelected(false);
				}
			}
		});
		
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_1.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.setForeground(Color.BLACK);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setBounds(16, 92, 109, 39);
		contentPane.add(rdbtnNewRadioButton_1);
		
		
		rdbtnNewRadioButton_2.setForeground(Color.BLACK);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_2.setBounds(16, 134, 109, 39);
		contentPane.add(rdbtnNewRadioButton_2);
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(16, 51, 109, 39);
		
		contentPane.add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("create");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(258, 130, 117, 39);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {				
				if (rdbtnNewRadioButton.isSelected()) {
					System.out.println("easy");
					SudokuJFrame.mainJFrame(50);
					dispose();
				}
				if (rdbtnNewRadioButton_1.isSelected()) {
					System.out.println("medium");
					SudokuJFrame.mainJFrame(40);
					dispose();
				}
				if (rdbtnNewRadioButton_2.isSelected()) {
					System.out.println("hard");
					SudokuJFrame.mainJFrame(30);
					dispose();
				}
			}
			
		});

		JLabel lblNewLabel = new JLabel("Choose the level:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(6, 11, 254, 23);
		contentPane.add(lblNewLabel);
	}
}
