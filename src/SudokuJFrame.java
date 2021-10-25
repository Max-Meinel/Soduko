import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JFormattedTextField;
import java.awt.Color;

import javax.swing.JButton;

public class SudokuJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void mainJFrame(int anzahl) {
		CallMain.Start(anzahl);	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SudokuJFrame frame = new SudokuJFrame();
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
	public SudokuJFrame() {
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		JFormattedTextField formattedTextField_4 = new JFormattedTextField();
		JFormattedTextField formattedTextField_5 = new JFormattedTextField();
		JFormattedTextField formattedTextField_6 = new JFormattedTextField();
		JFormattedTextField formattedTextField_7 = new JFormattedTextField();
		JFormattedTextField formattedTextField_8 = new JFormattedTextField();
		JFormattedTextField formattedTextField_9 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_11 = new JFormattedTextField();
		JFormattedTextField formattedTextField_12 = new JFormattedTextField();
		JFormattedTextField formattedTextField_13 = new JFormattedTextField();
		JFormattedTextField formattedTextField_14 = new JFormattedTextField();
		JFormattedTextField formattedTextField_15 = new JFormattedTextField();
		JFormattedTextField formattedTextField_16 = new JFormattedTextField();
		JFormattedTextField formattedTextField_17 = new JFormattedTextField();
		JFormattedTextField formattedTextField_18 = new JFormattedTextField();
		JFormattedTextField formattedTextField_19 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_21 = new JFormattedTextField();
		JFormattedTextField formattedTextField_22 = new JFormattedTextField();
		JFormattedTextField formattedTextField_23 = new JFormattedTextField();
		JFormattedTextField formattedTextField_24 = new JFormattedTextField();
		JFormattedTextField formattedTextField_25 = new JFormattedTextField();
		JFormattedTextField formattedTextField_26 = new JFormattedTextField();
		JFormattedTextField formattedTextField_27 = new JFormattedTextField();
		JFormattedTextField formattedTextField_28 = new JFormattedTextField();
		JFormattedTextField formattedTextField_29 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_31 = new JFormattedTextField();
		JFormattedTextField formattedTextField_32 = new JFormattedTextField();
		JFormattedTextField formattedTextField_33 = new JFormattedTextField();
		JFormattedTextField formattedTextField_34 = new JFormattedTextField();
		JFormattedTextField formattedTextField_35 = new JFormattedTextField();
		JFormattedTextField formattedTextField_36 = new JFormattedTextField();
		JFormattedTextField formattedTextField_37 = new JFormattedTextField();
		JFormattedTextField formattedTextField_38 = new JFormattedTextField();
		JFormattedTextField formattedTextField_39 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_41 = new JFormattedTextField();
		JFormattedTextField formattedTextField_42 = new JFormattedTextField();
		JFormattedTextField formattedTextField_43 = new JFormattedTextField();
		JFormattedTextField formattedTextField_44 = new JFormattedTextField();
		JFormattedTextField formattedTextField_45 = new JFormattedTextField();
		JFormattedTextField formattedTextField_46 = new JFormattedTextField();
		JFormattedTextField formattedTextField_47 = new JFormattedTextField();
		JFormattedTextField formattedTextField_48 = new JFormattedTextField();
		JFormattedTextField formattedTextField_49 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_51 = new JFormattedTextField();
		JFormattedTextField formattedTextField_52 = new JFormattedTextField();
		JFormattedTextField formattedTextField_53 = new JFormattedTextField();
		JFormattedTextField formattedTextField_54 = new JFormattedTextField();
		JFormattedTextField formattedTextField_55 = new JFormattedTextField();
		JFormattedTextField formattedTextField_56 = new JFormattedTextField();
		JFormattedTextField formattedTextField_57 = new JFormattedTextField();
		JFormattedTextField formattedTextField_58 = new JFormattedTextField();
		JFormattedTextField formattedTextField_59 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_61 = new JFormattedTextField();
		JFormattedTextField formattedTextField_62 = new JFormattedTextField();
		JFormattedTextField formattedTextField_63 = new JFormattedTextField();
		JFormattedTextField formattedTextField_64 = new JFormattedTextField();
		JFormattedTextField formattedTextField_65 = new JFormattedTextField();
		JFormattedTextField formattedTextField_66 = new JFormattedTextField();
		JFormattedTextField formattedTextField_67 = new JFormattedTextField();
		JFormattedTextField formattedTextField_68 = new JFormattedTextField();
		JFormattedTextField formattedTextField_69 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_71 = new JFormattedTextField();
		JFormattedTextField formattedTextField_72 = new JFormattedTextField();
		JFormattedTextField formattedTextField_73 = new JFormattedTextField();
		JFormattedTextField formattedTextField_74 = new JFormattedTextField();
		JFormattedTextField formattedTextField_75 = new JFormattedTextField();
		JFormattedTextField formattedTextField_76 = new JFormattedTextField();
		JFormattedTextField formattedTextField_77 = new JFormattedTextField();
		JFormattedTextField formattedTextField_78 = new JFormattedTextField();
		JFormattedTextField formattedTextField_79 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_81 = new JFormattedTextField();
		JFormattedTextField formattedTextField_82 = new JFormattedTextField();
		JFormattedTextField formattedTextField_83 = new JFormattedTextField();
		JFormattedTextField formattedTextField_84 = new JFormattedTextField();
		JFormattedTextField formattedTextField_85 = new JFormattedTextField();
		JFormattedTextField formattedTextField_86 = new JFormattedTextField();
		JFormattedTextField formattedTextField_87 = new JFormattedTextField();
		JFormattedTextField formattedTextField_88 = new JFormattedTextField();
		JFormattedTextField formattedTextField_89 = new JFormattedTextField();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 200, 850, 623);
		setTitle("Sudoku");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(191, 10, 18, 572);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(383, 10, 18, 572);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(-13, 189, 604, 18);
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(-13, 378, 604, 18);
		contentPane.add(panel_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(72, 0, 6, 580);
		contentPane.add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.BLACK);
		panel_3_1.setBounds(131, 0, 6, 580);
		contentPane.add(panel_3_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.BLACK);
		panel_2_2.setBounds(-44, 0, 636, 18);
		contentPane.add(panel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.BLACK);
		panel_2_3.setBounds(-44, 567, 636, 18);
		contentPane.add(panel_2_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(574, 10, 18, 572);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.BLACK);
		panel_1_2.setBounds(0, 10, 18, 572);
		contentPane.add(panel_1_2);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(Color.BLACK);
		panel_3_1_1.setBounds(262, 10, 6, 572);
		contentPane.add(panel_3_1_1);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBackground(Color.BLACK);
		panel_3_1_1_1.setBounds(322, 10, 6, 566);
		contentPane.add(panel_3_1_1_1);
		
		JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setBackground(Color.BLACK);
		panel_3_1_1_1_1.setBounds(455, 0, 6, 580);
		contentPane.add(panel_3_1_1_1_1);
		
		JPanel panel_3_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1.setBackground(Color.BLACK);
		panel_3_1_1_1_1_1.setBounds(515, 0, 6, 580);
		contentPane.add(panel_3_1_1_1_1_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.setBounds(-13, 71, 605, 6);
		contentPane.add(panel_4);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.BLACK);
		panel_4_1.setBounds(-13, 130, 605, 6);
		contentPane.add(panel_4_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBackground(Color.BLACK);
		panel_4_1_1.setBounds(-26, 260, 605, 6);
		contentPane.add(panel_4_1_1);
		
		JPanel panel_4_1_1_1 = new JPanel();
		panel_4_1_1_1.setBackground(Color.BLACK);
		panel_4_1_1_1.setBounds(-14, 319, 605, 6);
		contentPane.add(panel_4_1_1_1);
		
		JPanel panel_4_1_1_1_1 = new JPanel();
		panel_4_1_1_1_1.setBackground(Color.BLACK);
		panel_4_1_1_1_1.setBounds(-13, 449, 605, 6);
		contentPane.add(panel_4_1_1_1_1);
		
		JPanel panel_4_1_1_1_1_1 = new JPanel();
		panel_4_1_1_1_1_1.setBackground(Color.BLACK);
		panel_4_1_1_1_1_1.setBounds(-13, 508, 605, 6);
		contentPane.add(panel_4_1_1_1_1_1);
		
		JButton btnNewButton = new JButton("check");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(623, 508, 178, 62);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("new game");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start.main();
				dispose();
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(623, 15, 178, 62);
		contentPane.add(btnNewButton_1);
		btnNewButton.addActionListener((ActionListener) new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		    	formattedTextField_1.setBackground(Color.WHITE);
		    	formattedTextField_2.setBackground(Color.WHITE);
		    	formattedTextField_2.setBackground(Color.WHITE);
		    	formattedTextField_3.setBackground(Color.WHITE);
		    	formattedTextField_4.setBackground(Color.WHITE);
		    	formattedTextField_5.setBackground(Color.WHITE);
		    	formattedTextField_6.setBackground(Color.WHITE);
		    	formattedTextField_7.setBackground(Color.WHITE);
		    	formattedTextField_8.setBackground(Color.WHITE);
		    	formattedTextField_9.setBackground(Color.WHITE);
		    	
		    	formattedTextField_11.setBackground(Color.WHITE);
		    	formattedTextField_12.setBackground(Color.WHITE);
		    	formattedTextField_12.setBackground(Color.WHITE);
		    	formattedTextField_13.setBackground(Color.WHITE);
		    	formattedTextField_14.setBackground(Color.WHITE);
		    	formattedTextField_15.setBackground(Color.WHITE);
		    	formattedTextField_16.setBackground(Color.WHITE);
		    	formattedTextField_17.setBackground(Color.WHITE);
		    	formattedTextField_18.setBackground(Color.WHITE);
		    	formattedTextField_19.setBackground(Color.WHITE);
		    	
		    	formattedTextField_21.setBackground(Color.WHITE);
		    	formattedTextField_22.setBackground(Color.WHITE);
		    	formattedTextField_22.setBackground(Color.WHITE);
		    	formattedTextField_23.setBackground(Color.WHITE);
		    	formattedTextField_24.setBackground(Color.WHITE);
		    	formattedTextField_25.setBackground(Color.WHITE);
		    	formattedTextField_26.setBackground(Color.WHITE);
		    	formattedTextField_27.setBackground(Color.WHITE);
		    	formattedTextField_28.setBackground(Color.WHITE);
		    	formattedTextField_29.setBackground(Color.WHITE);
		    	
		    	formattedTextField_31.setBackground(Color.WHITE);
		    	formattedTextField_32.setBackground(Color.WHITE);
		    	formattedTextField_32.setBackground(Color.WHITE);
		    	formattedTextField_33.setBackground(Color.WHITE);
		    	formattedTextField_34.setBackground(Color.WHITE);
		    	formattedTextField_35.setBackground(Color.WHITE);
		    	formattedTextField_36.setBackground(Color.WHITE);
		    	formattedTextField_37.setBackground(Color.WHITE);
		    	formattedTextField_38.setBackground(Color.WHITE);
		    	formattedTextField_39.setBackground(Color.WHITE);
		    	
		    	formattedTextField_41.setBackground(Color.WHITE);
		    	formattedTextField_42.setBackground(Color.WHITE);
		    	formattedTextField_42.setBackground(Color.WHITE);
		    	formattedTextField_43.setBackground(Color.WHITE);
		    	formattedTextField_44.setBackground(Color.WHITE);
		    	formattedTextField_45.setBackground(Color.WHITE);
		    	formattedTextField_46.setBackground(Color.WHITE);
		    	formattedTextField_47.setBackground(Color.WHITE);
		    	formattedTextField_48.setBackground(Color.WHITE);
		    	formattedTextField_49.setBackground(Color.WHITE);
		    	
		    	formattedTextField_51.setBackground(Color.WHITE);
		    	formattedTextField_52.setBackground(Color.WHITE);
		    	formattedTextField_52.setBackground(Color.WHITE);
		    	formattedTextField_53.setBackground(Color.WHITE);
		    	formattedTextField_54.setBackground(Color.WHITE);
		    	formattedTextField_55.setBackground(Color.WHITE);
		    	formattedTextField_56.setBackground(Color.WHITE);
		    	formattedTextField_57.setBackground(Color.WHITE);
		    	formattedTextField_58.setBackground(Color.WHITE);
		    	formattedTextField_59.setBackground(Color.WHITE);
		    	
		    	formattedTextField_61.setBackground(Color.WHITE);
		    	formattedTextField_62.setBackground(Color.WHITE);
		    	formattedTextField_62.setBackground(Color.WHITE);
		    	formattedTextField_63.setBackground(Color.WHITE);
		    	formattedTextField_64.setBackground(Color.WHITE);
		    	formattedTextField_65.setBackground(Color.WHITE);
		    	formattedTextField_66.setBackground(Color.WHITE);
		    	formattedTextField_67.setBackground(Color.WHITE);
		    	formattedTextField_68.setBackground(Color.WHITE);
		    	formattedTextField_69.setBackground(Color.WHITE);
		    	
		    	formattedTextField_71.setBackground(Color.WHITE);
		    	formattedTextField_72.setBackground(Color.WHITE);
		    	formattedTextField_72.setBackground(Color.WHITE);
		    	formattedTextField_73.setBackground(Color.WHITE);
		    	formattedTextField_74.setBackground(Color.WHITE);
		    	formattedTextField_75.setBackground(Color.WHITE);
		    	formattedTextField_76.setBackground(Color.WHITE);
		    	formattedTextField_77.setBackground(Color.WHITE);
		    	formattedTextField_78.setBackground(Color.WHITE);
		    	formattedTextField_79.setBackground(Color.WHITE);
		    	
		    	formattedTextField_81.setBackground(Color.WHITE);
		    	formattedTextField_82.setBackground(Color.WHITE);
		    	formattedTextField_82.setBackground(Color.WHITE);
		    	formattedTextField_83.setBackground(Color.WHITE);
		    	formattedTextField_84.setBackground(Color.WHITE);
		    	formattedTextField_85.setBackground(Color.WHITE);
		    	formattedTextField_86.setBackground(Color.WHITE);
		    	formattedTextField_87.setBackground(Color.WHITE);
		    	formattedTextField_88.setBackground(Color.WHITE);
		    	formattedTextField_89.setBackground(Color.WHITE);
		    	
		    	if ((formattedTextField_1).getText().length() != 0) {
	    			if (Main.numbers[0][0] == Integer.valueOf((formattedTextField_1).getText())) {
						formattedTextField_1.setBackground(Color.GREEN);
						Main.numbersRemoved[0][0] = Integer.valueOf((formattedTextField_1).getText());
		        	}
					else {
						formattedTextField_1.setBackground(Color.RED);
					}	
		        }
		        
		        if ((formattedTextField_2).getText().length() != 0) {
					if (Main.numbers[1][0] == Integer.valueOf((formattedTextField_2).getText())) {
						formattedTextField_2.setBackground(Color.GREEN);
						Main.numbersRemoved[1][0] = Integer.valueOf((formattedTextField_2).getText());
		        	}
					else {
						formattedTextField_2.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_3).getText().length() != 0) {
					if (Main.numbers[2][0] == Integer.valueOf((formattedTextField_3).getText())) {
						formattedTextField_3.setBackground(Color.GREEN);
						Main.numbersRemoved[2][0] = Integer.valueOf((formattedTextField_3).getText());
		        	}
					else {
						formattedTextField_3.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_4).getText().length() != 0) {
					if (Main.numbers[3][0] == Integer.valueOf((formattedTextField_4).getText())) {
						formattedTextField_4.setBackground(Color.GREEN);
						Main.numbersRemoved[3][0] = Integer.valueOf((formattedTextField_4).getText());
		        	}
					else {
						formattedTextField_4.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_5).getText().length() != 0) {
					if (Main.numbers[4][0] == Integer.valueOf((formattedTextField_5).getText())) {
						formattedTextField_5.setBackground(Color.GREEN);
						Main.numbersRemoved[4][0] = Integer.valueOf((formattedTextField_5).getText());
		        	}
					else {
						formattedTextField_5.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_6).getText().length() != 0) {
					if (Main.numbers[5][0] == Integer.valueOf((formattedTextField_6).getText())) {
						formattedTextField_6.setBackground(Color.GREEN);
						Main.numbersRemoved[5][0] = Integer.valueOf((formattedTextField_6).getText());
		        	}
					else {
						formattedTextField_6.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_7).getText().length() != 0) {
					if (Main.numbers[6][0] == Integer.valueOf((formattedTextField_7).getText())) {
						formattedTextField_7.setBackground(Color.GREEN);
						Main.numbersRemoved[6][0] = Integer.valueOf((formattedTextField_7).getText());
		        	}
					else {
						formattedTextField_7.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_8).getText().length() != 0) {
					if (Main.numbers[7][0] == Integer.valueOf((formattedTextField_8).getText())) {
						formattedTextField_8.setBackground(Color.GREEN);
						Main.numbersRemoved[7][0] = Integer.valueOf((formattedTextField_8).getText());
		        	}
					else {
						formattedTextField_8.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_9).getText().length() != 0) {
					if (Main.numbers[8][0] == Integer.valueOf((formattedTextField_9).getText())) {
						formattedTextField_9.setBackground(Color.GREEN);
						Main.numbersRemoved[8][0] = Integer.valueOf((formattedTextField_9).getText());
		        	}
					else {
						formattedTextField_9.setBackground(Color.RED);
					}
		        }
		        
		        
		        
		        if ((formattedTextField_11).getText().length() != 0) {
					if (Main.numbers[0][1] == Integer.valueOf((formattedTextField_11).getText())) {
						formattedTextField_11.setBackground(Color.GREEN);
						Main.numbersRemoved[0][1] = Integer.valueOf((formattedTextField_11).getText());
		        	}
					else {
						formattedTextField_11.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_12).getText().length() != 0) {
					if (Main.numbers[1][1] == Integer.valueOf((formattedTextField_12).getText())) {
						formattedTextField_12.setBackground(Color.GREEN);
						Main.numbersRemoved[1][1] = Integer.valueOf((formattedTextField_12).getText());
		        	}
					else {
						formattedTextField_12.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_13).getText().length() != 0) {
					if (Main.numbers[2][1] == Integer.valueOf((formattedTextField_13).getText())) {
						formattedTextField_13.setBackground(Color.GREEN);
						Main.numbersRemoved[2][1] = Integer.valueOf((formattedTextField_13).getText());
		        	}
					else {
						formattedTextField_13.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_14).getText().length() != 0) {
					if (Main.numbers[3][1] == Integer.valueOf((formattedTextField_14).getText())) {
						formattedTextField_14.setBackground(Color.GREEN);
						Main.numbersRemoved[3][1] = Integer.valueOf((formattedTextField_14).getText());
		        	}
					else {
						formattedTextField_14.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_15).getText().length() != 0) {
					if (Main.numbers[4][1] == Integer.valueOf((formattedTextField_15).getText())) {
						formattedTextField_15.setBackground(Color.GREEN);
						Main.numbersRemoved[4][1] = Integer.valueOf((formattedTextField_15).getText());
		        	}
					else {
						formattedTextField_15.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_16).getText().length() != 0) {
					if (Main.numbers[5][1] == Integer.valueOf((formattedTextField_16).getText())) {
						formattedTextField_16.setBackground(Color.GREEN);
						Main.numbersRemoved[5][1] = Integer.valueOf((formattedTextField_16).getText());
		        	}
					else {
						formattedTextField_16.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_17).getText().length() != 0) {
					if (Main.numbers[6][1] == Integer.valueOf((formattedTextField_17).getText())) {
						formattedTextField_17.setBackground(Color.GREEN);
						Main.numbersRemoved[6][1] = Integer.valueOf((formattedTextField_17).getText());
		        	}
					else {
						formattedTextField_17.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_18).getText().length() != 0) {
					if (Main.numbers[7][1] == Integer.valueOf((formattedTextField_18).getText())) {
						formattedTextField_18.setBackground(Color.GREEN);
						Main.numbersRemoved[7][1] = Integer.valueOf((formattedTextField_18).getText());
		        	}
					else {
						formattedTextField_18.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_19).getText().length() != 0) {
					if (Main.numbers[8][1] == Integer.valueOf((formattedTextField_19).getText())) {
						formattedTextField_19.setBackground(Color.GREEN);
						Main.numbersRemoved[8][1] = Integer.valueOf((formattedTextField_19).getText());
		        	}
					else {
						formattedTextField_19.setBackground(Color.RED);
					}
		        }
		        
		        
		        
		        if ((formattedTextField_21).getText().length() != 0) {
					if (Main.numbers[0][2] == Integer.valueOf((formattedTextField_21).getText())) {
						formattedTextField_21.setBackground(Color.GREEN);
						Main.numbersRemoved[0][2] = Integer.valueOf((formattedTextField_21).getText());
		        	}
					else {
						formattedTextField_21.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_22).getText().length() != 0) {
					if (Main.numbers[1][2] == Integer.valueOf((formattedTextField_22).getText())) {
						formattedTextField_22.setBackground(Color.GREEN);
						Main.numbersRemoved[1][2] = Integer.valueOf((formattedTextField_22).getText());
		        	}
					else {
						formattedTextField_22.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_23).getText().length() != 0) {
					if (Main.numbers[2][2] == Integer.valueOf((formattedTextField_23).getText())) {
						formattedTextField_23.setBackground(Color.GREEN);
						Main.numbersRemoved[2][2] = Integer.valueOf((formattedTextField_23).getText());
		        	}
					else {
						formattedTextField_23.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_24).getText().length() != 0) {
					if (Main.numbers[3][2] == Integer.valueOf((formattedTextField_24).getText())) {
						formattedTextField_24.setBackground(Color.GREEN);
						Main.numbersRemoved[3][2] = Integer.valueOf((formattedTextField_24).getText());
		        	}
					else {
						formattedTextField_24.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_25).getText().length() != 0) {
					if (Main.numbers[4][2] == Integer.valueOf((formattedTextField_25).getText())) {
						formattedTextField_25.setBackground(Color.GREEN);
						Main.numbersRemoved[4][2] = Integer.valueOf((formattedTextField_25).getText());
		        	}
					else {
						formattedTextField_25.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_26).getText().length() != 0) {
					if (Main.numbers[5][2] == Integer.valueOf((formattedTextField_26).getText())) {
						formattedTextField_26.setBackground(Color.GREEN);
						Main.numbersRemoved[5][2] = Integer.valueOf((formattedTextField_26).getText());
		        	}
					else {
						formattedTextField_26.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_27).getText().length() != 0) {
					if (Main.numbers[6][2] == Integer.valueOf((formattedTextField_27).getText())) {
						formattedTextField_27.setBackground(Color.GREEN);
						Main.numbersRemoved[6][2] = Integer.valueOf((formattedTextField_27).getText());
		        	}
					else {
						formattedTextField_27.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_28).getText().length() != 0) {
					if (Main.numbers[7][2] == Integer.valueOf((formattedTextField_28).getText())) {
						formattedTextField_28.setBackground(Color.GREEN);
						Main.numbersRemoved[7][2] = Integer.valueOf((formattedTextField_28).getText());
		        	}
					else {
						formattedTextField_28.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_29).getText().length() != 0) {
					if (Main.numbers[8][2] == Integer.valueOf((formattedTextField_29).getText())) {
						formattedTextField_29.setBackground(Color.GREEN);
						Main.numbersRemoved[8][2] = Integer.valueOf((formattedTextField_29).getText());
		        	}
					else {
						formattedTextField_29.setBackground(Color.RED);
					}
		        }
		        
		        
		        
		        
		        if ((formattedTextField_31).getText().length() != 0) {
					if (Main.numbers[0][3] == Integer.valueOf((formattedTextField_31).getText())) {
						formattedTextField_31.setBackground(Color.GREEN);
						Main.numbersRemoved[0][3] = Integer.valueOf((formattedTextField_31).getText());
		        	}
					else {
						formattedTextField_31.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_32).getText().length() != 0) {
					if (Main.numbers[1][3] == Integer.valueOf((formattedTextField_32).getText())) {
						formattedTextField_32.setBackground(Color.GREEN);
						Main.numbersRemoved[1][3] = Integer.valueOf((formattedTextField_32).getText());
		        	}
					else {
						formattedTextField_32.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_33).getText().length() != 0) {
					if (Main.numbers[2][3] == Integer.valueOf((formattedTextField_33).getText())) {
						formattedTextField_33.setBackground(Color.GREEN);
						Main.numbersRemoved[2][3] = Integer.valueOf((formattedTextField_33).getText());
		        	}
					else {
						formattedTextField_33.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_34).getText().length() != 0) {
					if (Main.numbers[3][3] == Integer.valueOf((formattedTextField_34).getText())) {
						formattedTextField_34.setBackground(Color.GREEN);
						Main.numbersRemoved[3][3] = Integer.valueOf((formattedTextField_34).getText());
		        	}
					else {
						formattedTextField_34.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_35).getText().length() != 0) {
					if (Main.numbers[4][3] == Integer.valueOf((formattedTextField_35).getText())) {
						formattedTextField_35.setBackground(Color.GREEN);
						Main.numbersRemoved[4][3] = Integer.valueOf((formattedTextField_35).getText());
		        	}
					else {
						formattedTextField_35.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_36).getText().length() != 0) {
					if (Main.numbers[5][3] == Integer.valueOf((formattedTextField_36).getText())) {
						formattedTextField_36.setBackground(Color.GREEN);
						Main.numbersRemoved[5][3] = Integer.valueOf((formattedTextField_36).getText());
		        	}
					else {
						formattedTextField_36.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_37).getText().length() != 0) {
					if (Main.numbers[6][3] == Integer.valueOf((formattedTextField_37).getText())) {
						formattedTextField_37.setBackground(Color.GREEN);
						Main.numbersRemoved[6][3] = Integer.valueOf((formattedTextField_37).getText());
		        	}
					else {
						formattedTextField_37.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_38).getText().length() != 0) {
					if (Main.numbers[7][3] == Integer.valueOf((formattedTextField_38).getText())) {
						formattedTextField_38.setBackground(Color.GREEN);
						Main.numbersRemoved[7][3] = Integer.valueOf((formattedTextField_38).getText());
		        	}
					else {
						formattedTextField_38.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_39).getText().length() != 0) {
					if (Main.numbers[8][3] == Integer.valueOf((formattedTextField_39).getText())) {
						formattedTextField_39.setBackground(Color.GREEN);
						Main.numbersRemoved[8][3] = Integer.valueOf((formattedTextField_39).getText());
		        	}
					else {
						formattedTextField_39.setBackground(Color.RED);
					}
		        }
		        
		        
		        
		        if ((formattedTextField_41).getText().length() != 0) {
					if (Main.numbers[0][4] == Integer.valueOf((formattedTextField_41).getText())) {
						formattedTextField_41.setBackground(Color.GREEN);
						Main.numbersRemoved[0][4] = Integer.valueOf((formattedTextField_41).getText());
		        	}
					else {
						formattedTextField_41.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_42).getText().length() != 0) {
					if (Main.numbers[1][4] == Integer.valueOf((formattedTextField_42).getText())) {
						formattedTextField_42.setBackground(Color.GREEN);
						Main.numbersRemoved[1][4] = Integer.valueOf((formattedTextField_42).getText());
		        	}
					else {
						formattedTextField_42.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_43).getText().length() != 0) {
					if (Main.numbers[2][4] == Integer.valueOf((formattedTextField_43).getText())) {
						formattedTextField_43.setBackground(Color.GREEN);
						Main.numbersRemoved[2][4] = Integer.valueOf((formattedTextField_43).getText());
		        	}
					else {
						formattedTextField_43.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_44).getText().length() != 0) {
					if (Main.numbers[3][4] == Integer.valueOf((formattedTextField_44).getText())) {
						formattedTextField_44.setBackground(Color.GREEN);
						Main.numbersRemoved[3][4] = Integer.valueOf((formattedTextField_44).getText());
		        	}
					else {
						formattedTextField_44.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_45).getText().length() != 0) {
					if (Main.numbers[4][4] == Integer.valueOf((formattedTextField_45).getText())) {
						formattedTextField_45.setBackground(Color.GREEN);
						Main.numbersRemoved[4][4] = Integer.valueOf((formattedTextField_45).getText());
		        	}
					else {
						formattedTextField_45.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_46).getText().length() != 0) {
					if (Main.numbers[5][4] == Integer.valueOf((formattedTextField_46).getText())) {
						formattedTextField_46.setBackground(Color.GREEN);
						Main.numbersRemoved[5][4] = Integer.valueOf((formattedTextField_46).getText());
		        	}
					else {
						formattedTextField_46.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_47).getText().length() != 0) {
					if (Main.numbers[6][4] == Integer.valueOf((formattedTextField_47).getText())) {
						formattedTextField_47.setBackground(Color.GREEN);
						Main.numbersRemoved[6][4] = Integer.valueOf((formattedTextField_47).getText());
		        	}
					else {
						formattedTextField_47.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_48).getText().length() != 0) {
					if (Main.numbers[7][4] == Integer.valueOf((formattedTextField_48).getText())) {
						formattedTextField_48.setBackground(Color.GREEN);
						Main.numbersRemoved[7][4] = Integer.valueOf((formattedTextField_48).getText());
		        	}
					else {
						formattedTextField_48.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_49).getText().length() != 0) {
					if (Main.numbers[8][4] == Integer.valueOf((formattedTextField_49).getText())) {
						formattedTextField_49.setBackground(Color.GREEN);
						Main.numbersRemoved[8][4] = Integer.valueOf((formattedTextField_49).getText());
		        	}
					else {
						formattedTextField_49.setBackground(Color.RED);
					}
		        }
		        
		        
		        
		        if ((formattedTextField_51).getText().length() != 0) {
					if (Main.numbers[0][5] == Integer.valueOf((formattedTextField_51).getText())) {
						formattedTextField_51.setBackground(Color.GREEN);
						Main.numbersRemoved[0][5] = Integer.valueOf((formattedTextField_51).getText());
		        	}
					else {
						formattedTextField_51.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_52).getText().length() != 0) {
					if (Main.numbers[1][5] == Integer.valueOf((formattedTextField_52).getText())) {
						formattedTextField_52.setBackground(Color.GREEN);
						Main.numbersRemoved[1][5] = Integer.valueOf((formattedTextField_52).getText());
		        	}
					else {
						formattedTextField_52.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_53).getText().length() != 0) {
					if (Main.numbers[2][5] == Integer.valueOf((formattedTextField_53).getText())) {
						formattedTextField_53.setBackground(Color.GREEN);
						Main.numbersRemoved[2][5] = Integer.valueOf((formattedTextField_53).getText());
		        	}
					else {
						formattedTextField_53.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_54).getText().length() != 0) {
					if (Main.numbers[3][5] == Integer.valueOf((formattedTextField_54).getText())) {
						formattedTextField_54.setBackground(Color.GREEN);
						Main.numbersRemoved[3][5] = Integer.valueOf((formattedTextField_54).getText());
		        	}
					else {
						formattedTextField_54.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_55).getText().length() != 0) {
					if (Main.numbers[4][5] == Integer.valueOf((formattedTextField_55).getText())) {
						formattedTextField_55.setBackground(Color.GREEN);
						Main.numbersRemoved[4][5] = Integer.valueOf((formattedTextField_55).getText());
		        	}
					else {
						formattedTextField_55.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_56).getText().length() != 0) {
					if (Main.numbers[5][5] == Integer.valueOf((formattedTextField_56).getText())) {
						formattedTextField_56.setBackground(Color.GREEN);
						Main.numbersRemoved[5][5] = Integer.valueOf((formattedTextField_56).getText());
		        	}
					else {
						formattedTextField_56.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_57).getText().length() != 0) {
					if (Main.numbers[6][5] == Integer.valueOf((formattedTextField_57).getText())) {
						formattedTextField_57.setBackground(Color.GREEN);
						Main.numbersRemoved[6][5] = Integer.valueOf((formattedTextField_57).getText());
		        	}
					else {
						formattedTextField_57.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_58).getText().length() != 0) {
					if (Main.numbers[7][5] == Integer.valueOf((formattedTextField_58).getText())) {
						formattedTextField_58.setBackground(Color.GREEN);
						Main.numbersRemoved[7][5] = Integer.valueOf((formattedTextField_58).getText());
		        	}
					else {
						formattedTextField_58.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_59).getText().length() != 0) {
					if (Main.numbers[8][5] == Integer.valueOf((formattedTextField_59).getText())) {
						formattedTextField_59.setBackground(Color.GREEN);
						Main.numbersRemoved[8][5] = Integer.valueOf((formattedTextField_59).getText());
		        	}
					else {
						formattedTextField_59.setBackground(Color.RED);
					}
		        }
		        
		        
		        
		        if ((formattedTextField_61).getText().length() != 0) {
					if (Main.numbers[0][6] == Integer.valueOf((formattedTextField_61).getText())) {
						formattedTextField_61.setBackground(Color.GREEN);
						Main.numbersRemoved[0][6] = Integer.valueOf((formattedTextField_61).getText());
		        	}
					else {
						formattedTextField_61.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_62).getText().length() != 0) {
					if (Main.numbers[1][6] == Integer.valueOf((formattedTextField_62).getText())) {
						formattedTextField_62.setBackground(Color.GREEN);
						Main.numbersRemoved[1][6] = Integer.valueOf((formattedTextField_62).getText());
		        	}
					else {
						formattedTextField_62.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_63).getText().length() != 0) {
					if (Main.numbers[2][6] == Integer.valueOf((formattedTextField_63).getText())) {
						formattedTextField_63.setBackground(Color.GREEN);
						Main.numbersRemoved[2][6] = Integer.valueOf((formattedTextField_63).getText());
		        	}
					else {
						formattedTextField_63.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_64).getText().length() != 0) {
					if (Main.numbers[3][6] == Integer.valueOf((formattedTextField_64).getText())) {
						formattedTextField_64.setBackground(Color.GREEN);
						Main.numbersRemoved[3][6] = Integer.valueOf((formattedTextField_64).getText());
		        	}
					else {
						formattedTextField_64.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_65).getText().length() != 0) {
					if (Main.numbers[4][6] == Integer.valueOf((formattedTextField_65).getText())) {
						formattedTextField_65.setBackground(Color.GREEN);
						Main.numbersRemoved[4][6] = Integer.valueOf((formattedTextField_65).getText());
		        	}
					else {
						formattedTextField_65.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_66).getText().length() != 0) {
					if (Main.numbers[5][6] == Integer.valueOf((formattedTextField_66).getText())) {
						formattedTextField_66.setBackground(Color.GREEN);
						Main.numbersRemoved[5][6] = Integer.valueOf((formattedTextField_66).getText());
		        	}
					else {
						formattedTextField_66.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_67).getText().length() != 0) {
					if (Main.numbers[6][6] == Integer.valueOf((formattedTextField_67).getText())) {
						formattedTextField_67.setBackground(Color.GREEN);
						Main.numbersRemoved[6][6] = Integer.valueOf((formattedTextField_67).getText());
		        	}
					else {
						formattedTextField_67.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_68).getText().length() != 0) {
					if (Main.numbers[7][6] == Integer.valueOf((formattedTextField_68).getText())) {
						formattedTextField_68.setBackground(Color.GREEN);
						Main.numbersRemoved[7][6] = Integer.valueOf((formattedTextField_68).getText());
		        	}
					else {
						formattedTextField_68.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_69).getText().length() != 0) {
					if (Main.numbers[8][6] == Integer.valueOf((formattedTextField_69).getText())) {
						formattedTextField_69.setBackground(Color.GREEN);
						Main.numbersRemoved[8][6] = Integer.valueOf((formattedTextField_69).getText());
		        	}
					else {
						formattedTextField_69.setBackground(Color.RED);
					}
		        }
		        
		        
		        
		        if ((formattedTextField_71).getText().length() != 0) {
					if (Main.numbers[0][7] == Integer.valueOf((formattedTextField_71).getText())) {
						formattedTextField_71.setBackground(Color.GREEN);
						Main.numbersRemoved[0][7] = Integer.valueOf((formattedTextField_71).getText());
		        	}
					else {
						formattedTextField_71.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_72).getText().length() != 0) {
					if (Main.numbers[1][7] == Integer.valueOf((formattedTextField_72).getText())) {
						formattedTextField_72.setBackground(Color.GREEN);
						Main.numbersRemoved[1][7] = Integer.valueOf((formattedTextField_72).getText());
		        	}
					else {
						formattedTextField_72.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_73).getText().length() != 0) {
					if (Main.numbers[2][7] == Integer.valueOf((formattedTextField_73).getText())) {
						formattedTextField_73.setBackground(Color.GREEN);
						Main.numbersRemoved[2][7] = Integer.valueOf((formattedTextField_73).getText());
		        	}
					else {
						formattedTextField_73.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_74).getText().length() != 0) {
					if (Main.numbers[3][7] == Integer.valueOf((formattedTextField_74).getText())) {
						formattedTextField_74.setBackground(Color.GREEN);
						Main.numbersRemoved[3][7] = Integer.valueOf((formattedTextField_74).getText());
		        	}
					else {
						formattedTextField_74.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_75).getText().length() != 0) {
					if (Main.numbers[4][7] == Integer.valueOf((formattedTextField_75).getText())) {
						formattedTextField_75.setBackground(Color.GREEN);
						Main.numbersRemoved[4][7] = Integer.valueOf((formattedTextField_75).getText());
		        	}
					else {
						formattedTextField_75.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_76).getText().length() != 0) {
					if (Main.numbers[5][7] == Integer.valueOf((formattedTextField_76).getText())) {
						formattedTextField_76.setBackground(Color.GREEN);
						Main.numbersRemoved[5][7] = Integer.valueOf((formattedTextField_76).getText());
		        	}
					else {
						formattedTextField_76.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_77).getText().length() != 0) {
					if (Main.numbers[6][7] == Integer.valueOf((formattedTextField_77).getText())) {
						formattedTextField_77.setBackground(Color.GREEN);
						Main.numbersRemoved[6][7] = Integer.valueOf((formattedTextField_77).getText());
		        	}
					else {
						formattedTextField_77.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_78).getText().length() != 0) {
					if (Main.numbers[7][7] == Integer.valueOf((formattedTextField_78).getText())) {
						formattedTextField_78.setBackground(Color.GREEN);
						Main.numbersRemoved[7][7] = Integer.valueOf((formattedTextField_78).getText());
		        	}
					else {
						formattedTextField_78.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_79).getText().length() != 0) {
					if (Main.numbers[8][7] == Integer.valueOf((formattedTextField_79).getText())) {
						formattedTextField_79.setBackground(Color.GREEN);
						Main.numbersRemoved[8][7] = Integer.valueOf((formattedTextField_79).getText());
		        	}
					else {
						formattedTextField_79.setBackground(Color.RED);
					}
		        }
		        
		        
		        
		        if ((formattedTextField_81).getText().length() != 0) {
					if (Main.numbers[0][8] == Integer.valueOf((formattedTextField_81).getText())) {
						formattedTextField_81.setBackground(Color.GREEN);
						Main.numbersRemoved[0][8] = Integer.valueOf((formattedTextField_81).getText());
		        	}
					else {
						formattedTextField_81.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_82).getText().length() != 0) {
					if (Main.numbers[1][8] == Integer.valueOf((formattedTextField_82).getText())) {
						formattedTextField_82.setBackground(Color.GREEN);
						Main.numbersRemoved[1][8] = Integer.valueOf((formattedTextField_82).getText());
		        	}
					else {
						formattedTextField_82.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_83).getText().length() != 0) {
					if (Main.numbers[2][8] == Integer.valueOf((formattedTextField_83).getText())) {
						formattedTextField_83.setBackground(Color.GREEN);
						Main.numbersRemoved[2][8] = Integer.valueOf((formattedTextField_83).getText());
		        	}
					else {
						formattedTextField_83.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_84).getText().length() != 0) {
					if (Main.numbers[3][8] == Integer.valueOf((formattedTextField_84).getText())) {
						formattedTextField_84.setBackground(Color.GREEN);
						Main.numbersRemoved[3][8] = Integer.valueOf((formattedTextField_84).getText());
		        	}
					else {
						formattedTextField_84.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_85).getText().length() != 0) {
					if (Main.numbers[4][8] == Integer.valueOf((formattedTextField_85).getText())) {
						formattedTextField_85.setBackground(Color.GREEN);
						Main.numbersRemoved[4][8] = Integer.valueOf((formattedTextField_85).getText());
		        	}
					else {
						formattedTextField_85.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_86).getText().length() != 0) {
					if (Main.numbers[5][8] == Integer.valueOf((formattedTextField_86).getText())) {
						formattedTextField_86.setBackground(Color.GREEN);
						Main.numbersRemoved[5][8] = Integer.valueOf((formattedTextField_86).getText());
		        	}
					else {
						formattedTextField_86.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_87).getText().length() != 0) {
					if (Main.numbers[6][8] == Integer.valueOf((formattedTextField_87).getText())) {
						formattedTextField_87.setBackground(Color.GREEN);
						Main.numbersRemoved[6][8] = Integer.valueOf((formattedTextField_87).getText());
		        	}
					else {
						formattedTextField_87.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_88).getText().length() != 0) {
					if (Main.numbers[7][8] == Integer.valueOf((formattedTextField_88).getText())) {
						formattedTextField_88.setBackground(Color.GREEN);
						Main.numbersRemoved[7][8] = Integer.valueOf((formattedTextField_88).getText());
		        	}
					else {
						formattedTextField_88.setBackground(Color.RED);
					}
		        }
		        if ((formattedTextField_89).getText().length() != 0) {
					if (Main.numbers[8][8] == Integer.valueOf((formattedTextField_89).getText())) {
						formattedTextField_89.setBackground(Color.GREEN);
						Main.numbersRemoved[8][8] = Integer.valueOf((formattedTextField_89).getText());
		        	}
					else {
						formattedTextField_89.setBackground(Color.RED);
					}
		        }
		        boolean right = true;
		        for (int x = 0; x < 9; x++) {
		        	for (int y = 0; y < 9; y++) {
			        	if (Main.numbers[x][y] != Main.numbersRemoved[x][y]) {
			        		right = false;
			        	}
			        }
			        	
		        }
		        
		        
		        
		        if (right) {
		        	System.out.println("AllRight!!!");
		        }
		        else {
		        	System.out.println("false");
		        }
		        
		        
		    }
		});

		
		
		
		if (Main.numbersRemoved[0][0] != 0) {
			JLabel lblNewLabel_1 = new JLabel(Integer.toString(Main.numbersRemoved[0][0]));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(21, 20, 50, 50);
			lblNewLabel_1.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_1);
		}
		else {
			formattedTextField_1.setBounds(20, 20, 50, 50);
			formattedTextField_1.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_1.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_1);
		}
		if (Main.numbersRemoved[1][0] != 0) {
			JLabel lblNewLabel_2 = new JLabel(Integer.toString(Main.numbersRemoved[1][0]));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(80, 20, 50, 50);
			lblNewLabel_2.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_2);
		}	
		else {
			formattedTextField_2.setBounds(80, 20, 50, 50);
			formattedTextField_2.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_2.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_2);
		}
		if (Main.numbersRemoved[2][0] != 0) {
			JLabel lblNewLabel_3 = new JLabel(Integer.toString(Main.numbersRemoved[2][0]));
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(140, 20, 50, 50);
			lblNewLabel_3.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_3);
		}	
		else {
			formattedTextField_3.setBounds(140, 20, 50, 50);
			formattedTextField_3.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_3.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_3);
		}
		if (Main.numbersRemoved[3][0] != 0) {
			JLabel lblNewLabel_4 = new JLabel(Integer.toString(Main.numbersRemoved[3][0]));
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(211, 20, 50, 50);
			lblNewLabel_4.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_4);
		}
		else {
			formattedTextField_4.setBounds(211, 20, 50, 50);
			formattedTextField_4.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_4.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_4);
		}
		if (Main.numbersRemoved[4][0] != 0) {
			JLabel lblNewLabel_5 = new JLabel(Integer.toString(Main.numbersRemoved[4][0]));
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(271, 20, 50, 50);
			lblNewLabel_5.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_5);
		}	
		else {
			formattedTextField_5.setBounds(271, 20, 50, 50);
			formattedTextField_5.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_5.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_5);
		}
		if (Main.numbersRemoved[5][0] != 0) {
			JLabel lblNewLabel_6 = new JLabel(Integer.toString(Main.numbersRemoved[5][0]));
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setBounds(331, 20, 50, 50);
			lblNewLabel_6.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_6);
		}	
		else {
			formattedTextField_6.setBounds(331, 20, 50, 50);
			formattedTextField_6.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_6.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_6);
		}
		if (Main.numbersRemoved[6][0] != 0) {
			JLabel lblNewLabel_7 = new JLabel(Integer.toString(Main.numbersRemoved[6][0]));
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setBounds(404, 20, 50, 50);
			lblNewLabel_7.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_7);
		}	
		else {
			formattedTextField_7.setBounds(404, 20, 50, 50);
			formattedTextField_7.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_7.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_7);
		}
		if (Main.numbersRemoved[7][0] != 0) {
			JLabel lblNewLabel_8 = new JLabel(Integer.toString(Main.numbersRemoved[7][0]));
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setBounds(464, 20, 50, 50);
			lblNewLabel_8.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_8);
		}	
		else {
			formattedTextField_8.setBounds(464, 20, 50, 50);
			formattedTextField_8.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_8.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_8);
		}
		if (Main.numbersRemoved[8][0] != 0) {
			JLabel lblNewLabel_9 = new JLabel(Integer.toString(Main.numbersRemoved[8][0]));
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setBounds(523, 20, 50, 50);
			lblNewLabel_9.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_9);
		}	
		else {
			formattedTextField_9.setBounds(523, 20, 50, 50);
			formattedTextField_9.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_9.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_9);
		}
		
		
		
		if (Main.numbersRemoved[0][1] != 0) {
			JLabel lblNewLabel_10 = new JLabel(Integer.toString(Main.numbersRemoved[0][1]));
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10.setBounds(21, 79, 50, 50);
			lblNewLabel_10.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_10);
		}
		else {
			formattedTextField_11.setBounds(20, 79, 50, 50);
			formattedTextField_11.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_11.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_11);
		}
		if (Main.numbersRemoved[1][1] != 0) {
			JLabel lblNewLabel_12 = new JLabel(Integer.toString(Main.numbersRemoved[1][1]));
			lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_12.setBounds(80, 79, 50, 50);
			lblNewLabel_12.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_12);
		}	
		else {
			formattedTextField_12.setBounds(80, 79, 50, 50);
			formattedTextField_12.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_12.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_12);
		}
		if (Main.numbersRemoved[2][1] != 0) {
			JLabel lblNewLabel_13 = new JLabel(Integer.toString(Main.numbersRemoved[2][1]));
			lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_13.setBounds(140, 79, 50, 50);
			lblNewLabel_13.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_13);
		}
		else {
			formattedTextField_13.setBounds(140, 79, 50, 50);
			formattedTextField_13.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_13.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_13);
		}
		if (Main.numbersRemoved[3][1] != 0) {
			JLabel lblNewLabel_14 = new JLabel(Integer.toString(Main.numbersRemoved[3][1]));
			lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_14.setBounds(211, 79, 50, 50);
			lblNewLabel_14.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_14);
		}
		else {
			formattedTextField_14.setBounds(211, 79, 50, 50);
			formattedTextField_14.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_14.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_14);
		}
		if (Main.numbersRemoved[4][1] != 0) {
			JLabel lblNewLabel_15 = new JLabel(Integer.toString(Main.numbersRemoved[4][1]));
			lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_15.setBounds(271, 79, 50, 50);
			lblNewLabel_15.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_15);
		}	
		else {
			formattedTextField_15.setBounds(271, 79, 50, 50);
			formattedTextField_15.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_15.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_15);
		}
		if (Main.numbersRemoved[5][1] != 0) {
			JLabel lblNewLabel_16 = new JLabel(Integer.toString(Main.numbersRemoved[5][1]));
			lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_16.setBounds(331, 79, 50, 50);
			lblNewLabel_16.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_16);
		}	
		else {
			formattedTextField_16.setBounds(331, 79, 50, 50);
			formattedTextField_16.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_16.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_16);
		}
		if (Main.numbersRemoved[6][1] != 0) {
			JLabel lblNewLabel_17 = new JLabel(Integer.toString(Main.numbersRemoved[6][1]));
			lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_17.setBounds(404, 79, 50, 50);
			lblNewLabel_17.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_17);
		}	
		else {
			formattedTextField_17.setBounds(404, 79, 50, 50);
			formattedTextField_17.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_17.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_17);
		}
		if (Main.numbersRemoved[7][1] != 0) {
			JLabel lblNewLabel_18 = new JLabel(Integer.toString(Main.numbersRemoved[7][1]));
			lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_18.setBounds(464, 79, 50, 50);
			lblNewLabel_18.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_18);
		}	
		else {
			formattedTextField_18.setBounds(464, 79, 50, 50);
			formattedTextField_18.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_18.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_18);
		}
		if (Main.numbersRemoved[8][1] != 0) {
			JLabel lblNewLabel_19 = new JLabel(Integer.toString(Main.numbersRemoved[8][1]));
			lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_19.setBounds(523, 79, 50, 50);
			lblNewLabel_19.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_19);
		}	
		else {
			formattedTextField_19.setBounds(523, 79, 50, 50);
			formattedTextField_19.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_19.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_19);
		}
		
		
		
		if (Main.numbersRemoved[0][2] != 0) {
			JLabel lblNewLabel_20 = new JLabel(Integer.toString(Main.numbersRemoved[0][2]));
			lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_20.setBounds(21, 138, 50, 50);
			lblNewLabel_20.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_20);
		}
		else {
			formattedTextField_21.setBounds(20, 138, 50, 50);
			formattedTextField_21.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_21.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_21);
		}
		if (Main.numbersRemoved[1][2] != 0) {
			JLabel lblNewLabel_22 = new JLabel(Integer.toString(Main.numbersRemoved[1][2]));
			lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_22.setBounds(80, 138, 50, 50);
			lblNewLabel_22.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_22);
		}	
		else {
			formattedTextField_22.setBounds(80, 138, 50, 50);
			formattedTextField_22.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_22.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_22);
		}
		if (Main.numbersRemoved[2][2] != 0) {
			JLabel lblNewLabel_23 = new JLabel(Integer.toString(Main.numbersRemoved[2][2]));
			lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_23.setBounds(140, 138, 50, 50);
			lblNewLabel_23.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_23);
		}
		else {
			formattedTextField_23.setBounds(140, 138, 50, 50);
			formattedTextField_23.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_23.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_23);
		}
		if (Main.numbersRemoved[3][2] != 0) {
			JLabel lblNewLabel_24 = new JLabel(Integer.toString(Main.numbersRemoved[3][2]));
			lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_24.setBounds(211, 138, 50, 50);
			lblNewLabel_24.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_24);
		}
		else {
			formattedTextField_24.setBounds(211, 138, 50, 50);
			formattedTextField_24.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_24.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_24);
		}
		if (Main.numbersRemoved[4][2] != 0) {
			JLabel lblNewLabel_25 = new JLabel(Integer.toString(Main.numbersRemoved[4][2]));
			lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_25.setBounds(271, 138, 50, 50);
			lblNewLabel_25.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_25);
		}	
		else {
			formattedTextField_25.setBounds(271, 138, 50, 50);
			formattedTextField_25.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_25.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_25);
		}
		if (Main.numbersRemoved[5][2] != 0) {
			JLabel lblNewLabel_26 = new JLabel(Integer.toString(Main.numbersRemoved[5][2]));
			lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_26.setBounds(331, 138, 50, 50);
			lblNewLabel_26.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_26);
		}	
		else {
			formattedTextField_26.setBounds(331, 138, 50, 50);
			formattedTextField_26.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_26.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_26);
		}
		if (Main.numbersRemoved[6][2] != 0) {
			JLabel lblNewLabel_27 = new JLabel(Integer.toString(Main.numbersRemoved[6][2]));
			lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_27.setBounds(404, 138, 50, 50);
			lblNewLabel_27.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_27);
		}	
		else {
			formattedTextField_27.setBounds(404, 138, 50, 50);
			formattedTextField_27.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_27.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_27);
		}
		if (Main.numbersRemoved[7][2] != 0) {
			JLabel lblNewLabel_28 = new JLabel(Integer.toString(Main.numbersRemoved[7][2]));
			lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_28.setBounds(464, 138, 50, 50);
			lblNewLabel_28.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_28);
		}	
		else {
			formattedTextField_28.setBounds(464, 138, 50, 50);
			formattedTextField_28.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_28.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_28);
		}
		if (Main.numbersRemoved[8][2] != 0) {
			JLabel lblNewLabel_29 = new JLabel(Integer.toString(Main.numbersRemoved[8][2]));
			lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_29.setBounds(523, 138, 50, 50);
			lblNewLabel_29.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_29);
		}	
		else {
			formattedTextField_29.setBounds(523, 138, 50, 50);
			formattedTextField_29.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_29.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_29);
		}
		
		
		
		if (Main.numbersRemoved[0][3] != 0) {
			JLabel lblNewLabel_31 = new JLabel(Integer.toString(Main.numbersRemoved[0][3]));
			lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_31.setBounds(21, 209, 50, 50);
			lblNewLabel_31.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_31);
		}
		else {
			formattedTextField_31.setBounds(20, 209, 50, 50);
			formattedTextField_31.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_31.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_31);
		}
		if (Main.numbersRemoved[1][3] != 0) {
			JLabel lblNewLabel_32 = new JLabel(Integer.toString(Main.numbersRemoved[1][3]));
			lblNewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_32.setBounds(80, 209, 50, 50);
			lblNewLabel_32.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_32);
		}	
		else {
			formattedTextField_32.setBounds(80, 209, 50, 50);
			formattedTextField_32.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_32.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_32);
		}
		if (Main.numbersRemoved[2][3] != 0) {
			JLabel lblNewLabel_33 = new JLabel(Integer.toString(Main.numbersRemoved[2][3]));
			lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_33.setBounds(140, 209, 50, 50);
			lblNewLabel_33.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_33);
		}	
		else {
			formattedTextField_33.setBounds(140, 209, 50, 50);
			formattedTextField_33.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_33.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_33);
		}
		if (Main.numbersRemoved[3][3] != 0) {
			JLabel lblNewLabel_34 = new JLabel(Integer.toString(Main.numbersRemoved[3][3]));
			lblNewLabel_34.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_34.setBounds(211, 209, 50, 50);
			lblNewLabel_34.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_34);
		}
		else {
			formattedTextField_34.setBounds(211, 209, 50, 50);
			formattedTextField_34.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_34.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_34);
		}
		if (Main.numbersRemoved[4][3] != 0) {
			JLabel lblNewLabel_35 = new JLabel(Integer.toString(Main.numbersRemoved[4][3]));
			lblNewLabel_35.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_35.setBounds(271, 209, 50, 50);
			lblNewLabel_35.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_35);
		}	
		else {
			formattedTextField_35.setBounds(271, 209, 50, 50);
			formattedTextField_35.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_35.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_35);
		}
		if (Main.numbersRemoved[5][3] != 0) {
			JLabel lblNewLabel_36 = new JLabel(Integer.toString(Main.numbersRemoved[5][3]));
			lblNewLabel_36.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_36.setBounds(331, 209, 50, 50);
			lblNewLabel_36.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_36);
		}	
		else {
			formattedTextField_36.setBounds(331, 209, 50, 50);
			formattedTextField_36.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_36.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_36);
		}
		if (Main.numbersRemoved[6][3] != 0) {
			JLabel lblNewLabel_37 = new JLabel(Integer.toString(Main.numbersRemoved[6][3]));
			lblNewLabel_37.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_37.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_37.setBounds(404, 209, 50, 50);
			lblNewLabel_37.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_37);
		}	
		else {
			formattedTextField_37.setBounds(404, 209, 50, 50);
			formattedTextField_37.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_37.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_37);
		}
		if (Main.numbersRemoved[7][3] != 0) {
			JLabel lblNewLabel_38 = new JLabel(Integer.toString(Main.numbersRemoved[7][3]));
			lblNewLabel_38.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_38.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_38.setBounds(464, 209, 50, 50);
			lblNewLabel_38.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_38);
		}	
		else {
			formattedTextField_38.setBounds(464, 209, 50, 50);
			formattedTextField_38.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_38.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_38);
		}
		if (Main.numbersRemoved[8][3] != 0) {
			JLabel lblNewLabel_39 = new JLabel(Integer.toString(Main.numbersRemoved[8][3]));
			lblNewLabel_39.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_39.setBounds(523, 209, 50, 50);
			lblNewLabel_39.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_39);
		}	
		else {
			formattedTextField_39.setBounds(523, 209, 50, 50);
			formattedTextField_39.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_39.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_39);
		}
		
		
		
		if (Main.numbersRemoved[0][4] != 0) {
			JLabel lblNewLabel_41 = new JLabel(Integer.toString(Main.numbersRemoved[0][4]));
			lblNewLabel_41.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_41.setBounds(21, 268, 50, 50);
			lblNewLabel_41.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_41);
		}
		else {
			formattedTextField_41.setBounds(20, 268, 50, 50);
			formattedTextField_41.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_41.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_41);
		}
		if (Main.numbersRemoved[1][4] != 0) {
			JLabel lblNewLabel_42 = new JLabel(Integer.toString(Main.numbersRemoved[1][4]));
			lblNewLabel_42.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_42.setBounds(80, 268, 50, 50);
			lblNewLabel_42.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_42);
		}	
		else {
			formattedTextField_42.setBounds(80, 268, 50, 50);
			formattedTextField_42.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_42.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_42);
		}
		if (Main.numbersRemoved[2][4] != 0) {
			JLabel lblNewLabel_43 = new JLabel(Integer.toString(Main.numbersRemoved[2][4]));
			lblNewLabel_43.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_43.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_43.setBounds(140, 268, 50, 50);
			lblNewLabel_43.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_43);
		}	
		else {
			formattedTextField_43.setBounds(140, 268, 50, 50);
			formattedTextField_43.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_43.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_43);
		}
		if (Main.numbersRemoved[3][4] != 0) {
			JLabel lblNewLabel_44 = new JLabel(Integer.toString(Main.numbersRemoved[3][4]));
			lblNewLabel_44.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_44.setBounds(211, 268, 50, 50);
			lblNewLabel_44.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_44);
		}
		else {
			formattedTextField_44.setBounds(211, 268, 50, 50);
			formattedTextField_44.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_44.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_44);
		}
		if (Main.numbersRemoved[4][4] != 0) {
			JLabel lblNewLabel_45 = new JLabel(Integer.toString(Main.numbersRemoved[4][4]));
			lblNewLabel_45.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_45.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_45.setBounds(271, 268, 50, 50);
			lblNewLabel_45.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_45);
		}	
		else {
			formattedTextField_45.setBounds(271, 268, 50, 50);
			formattedTextField_45.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_45.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_45);
		}
		if (Main.numbersRemoved[5][4] != 0) {
			JLabel lblNewLabel_46 = new JLabel(Integer.toString(Main.numbersRemoved[5][4]));
			lblNewLabel_46.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_46.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_46.setBounds(331, 268, 50, 50);
			lblNewLabel_46.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_46);
		}	
		else {
			formattedTextField_46.setBounds(331, 268, 50, 50);
			formattedTextField_46.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_46.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_46);
		}
		if (Main.numbersRemoved[6][4] != 0) {
			JLabel lblNewLabel_47 = new JLabel(Integer.toString(Main.numbersRemoved[6][4]));
			lblNewLabel_47.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_47.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_47.setBounds(404, 268, 50, 50);
			lblNewLabel_47.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_47);
		}	
		else {
			formattedTextField_47.setBounds(404, 268, 50, 50);
			formattedTextField_47.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_47.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_47);
		}
		if (Main.numbersRemoved[7][4] != 0) {
			JLabel lblNewLabel_48 = new JLabel(Integer.toString(Main.numbersRemoved[7][4]));
			lblNewLabel_48.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_48.setBounds(464, 268, 50, 50);
			lblNewLabel_48.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_48);
		}	
		else {
			formattedTextField_48.setBounds(464, 268, 50, 50);
			formattedTextField_48.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_48.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_48);
		}
		if (Main.numbersRemoved[8][4] != 0) {
			JLabel lblNewLabel_49 = new JLabel(Integer.toString(Main.numbersRemoved[8][4]));
			lblNewLabel_49.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_49.setBounds(523, 268, 50, 50);
			lblNewLabel_49.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_49);
		}	
		else {
			formattedTextField_49.setBounds(523, 268, 50, 50);
			formattedTextField_49.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_49.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_49);
		}
		
		
		
		if (Main.numbersRemoved[0][5] != 0) {
			JLabel lblNewLabel_51 = new JLabel(Integer.toString(Main.numbersRemoved[0][5]));
			lblNewLabel_51.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_51.setBounds(21, 327, 50, 50);
			lblNewLabel_51.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_51);
		}
		else {
			formattedTextField_51.setBounds(20, 327, 50, 50);
			formattedTextField_51.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_51.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_51);
		}
		if (Main.numbersRemoved[1][5] != 0) {
			JLabel lblNewLabel_52 = new JLabel(Integer.toString(Main.numbersRemoved[1][5]));
			lblNewLabel_52.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_52.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_52.setBounds(80, 327, 50, 50);
			lblNewLabel_52.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_52);
		}	
		else {
			formattedTextField_52.setBounds(80, 327, 50, 50);
			formattedTextField_52.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_52.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_52);
		}
		if (Main.numbersRemoved[2][5] != 0) {
			JLabel lblNewLabel_53 = new JLabel(Integer.toString(Main.numbersRemoved[2][5]));
			lblNewLabel_53.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_53.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_53.setBounds(140, 327, 50, 50);
			lblNewLabel_53.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_53);
		}	
		else {
			formattedTextField_53.setBounds(140, 327, 50, 50);
			formattedTextField_53.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_53.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_53);
		}
		if (Main.numbersRemoved[3][5] != 0) {
			JLabel lblNewLabel_54 = new JLabel(Integer.toString(Main.numbersRemoved[3][5]));
			lblNewLabel_54.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_54.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_54.setBounds(211, 327, 50, 50);
			lblNewLabel_54.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_54);
		}
		else {
			formattedTextField_54.setBounds(211, 327, 50, 50);
			formattedTextField_54.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_54.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_54);
		}
		if (Main.numbersRemoved[4][5] != 0) {
			JLabel lblNewLabel_55 = new JLabel(Integer.toString(Main.numbersRemoved[4][5]));
			lblNewLabel_55.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_55.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_55.setBounds(271, 327, 50, 50);
			lblNewLabel_55.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_55);
		}	
		else {
			formattedTextField_55.setBounds(271, 327, 50, 50);
			formattedTextField_55.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_55.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_55);
		}
		if (Main.numbersRemoved[5][5] != 0) {
			JLabel lblNewLabel_56 = new JLabel(Integer.toString(Main.numbersRemoved[5][5]));
			lblNewLabel_56.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_56.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_56.setBounds(331, 327, 50, 50);
			lblNewLabel_56.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_56);
		}	
		else {
			formattedTextField_56.setBounds(331, 327, 50, 50);
			formattedTextField_56.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_56.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_56);
		}
		if (Main.numbersRemoved[6][5] != 0) {
			JLabel lblNewLabel_57 = new JLabel(Integer.toString(Main.numbersRemoved[6][5]));
			lblNewLabel_57.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_57.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_57.setBounds(404, 327, 50, 50);
			lblNewLabel_57.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_57);
		}	
		else {
			formattedTextField_57.setBounds(404, 327, 50, 50);
			formattedTextField_57.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_57.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_57);
		}
		if (Main.numbersRemoved[7][5] != 0) {
			JLabel lblNewLabel_58 = new JLabel(Integer.toString(Main.numbersRemoved[7][5]));
			lblNewLabel_58.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_58.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_58.setBounds(464, 327, 50, 50);
			lblNewLabel_58.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_58);
		}	
		else {
			formattedTextField_58.setBounds(464, 327, 50, 50);
			formattedTextField_58.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_58.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_58);
		}
		if (Main.numbersRemoved[8][5] != 0) {
			JLabel lblNewLabel_59 = new JLabel(Integer.toString(Main.numbersRemoved[8][5]));
			lblNewLabel_59.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_59.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_59.setBounds(523, 327, 50, 50);
			lblNewLabel_59.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_59);
		}	
		else {
			formattedTextField_59.setBounds(523, 327, 50, 50);
			formattedTextField_59.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_59.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_59);
		}
		
		
		
		
		if (Main.numbersRemoved[0][6] != 0) {
			JLabel lblNewLabel_61 = new JLabel(Integer.toString(Main.numbersRemoved[0][6]));
			lblNewLabel_61.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_61.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_61.setBounds(21, 398, 50, 50);
			lblNewLabel_61.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_61);
		}
		else {
			formattedTextField_61.setBounds(20, 398, 50, 50);
			formattedTextField_61.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_61.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_61);
		}
		if (Main.numbersRemoved[1][6] != 0) {
			JLabel lblNewLabel_62 = new JLabel(Integer.toString(Main.numbersRemoved[1][6]));
			lblNewLabel_62.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_62.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_62.setBounds(80, 398, 50, 50);
			lblNewLabel_62.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_62);
		}	
		else {
			formattedTextField_62.setBounds(80, 398, 50, 50);
			formattedTextField_62.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_62.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_62);
		}
		if (Main.numbersRemoved[2][6] != 0) {
			JLabel lblNewLabel_63 = new JLabel(Integer.toString(Main.numbersRemoved[2][6]));
			lblNewLabel_63.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_63.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_63.setBounds(140, 398, 50, 50);
			lblNewLabel_63.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_63);
		}	
		else {
			formattedTextField_63.setBounds(140, 398, 50, 50);
			formattedTextField_63.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_63.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_63);
		}
		if (Main.numbersRemoved[3][6] != 0) {
			JLabel lblNewLabel_64 = new JLabel(Integer.toString(Main.numbersRemoved[3][6]));
			lblNewLabel_64.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_64.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_64.setBounds(211, 398, 50, 50);
			lblNewLabel_64.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_64);
		}
		else {
			formattedTextField_64.setBounds(211, 398, 50, 50);
			formattedTextField_64.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_64.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_64);
		}
		if (Main.numbersRemoved[4][6] != 0) {
			JLabel lblNewLabel_65 = new JLabel(Integer.toString(Main.numbersRemoved[4][6]));
			lblNewLabel_65.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_65.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_65.setBounds(271, 398, 50, 50);
			lblNewLabel_65.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_65);
		}	
		else {
			formattedTextField_65.setBounds(271, 398, 50, 50);
			formattedTextField_65.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_65.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_65);
		}
		if (Main.numbersRemoved[5][6] != 0) {
			JLabel lblNewLabel_66 = new JLabel(Integer.toString(Main.numbersRemoved[5][6]));
			lblNewLabel_66.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_66.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_66.setBounds(331, 398, 50, 50);
			lblNewLabel_66.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_66);
		}	
		else {
			formattedTextField_66.setBounds(331, 398, 50, 50);
			formattedTextField_66.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_66.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_66);
		}
		if (Main.numbersRemoved[6][6] != 0) {
			JLabel lblNewLabel_67 = new JLabel(Integer.toString(Main.numbersRemoved[6][6]));
			lblNewLabel_67.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_67.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_67.setBounds(404, 398, 50, 50);
			lblNewLabel_67.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_67);
		}	
		else {
			formattedTextField_67.setBounds(404, 398, 50, 50);
			formattedTextField_67.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_67.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_67);
		}
		if (Main.numbersRemoved[7][6] != 0) {
			JLabel lblNewLabel_68 = new JLabel(Integer.toString(Main.numbersRemoved[7][6]));
			lblNewLabel_68.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_68.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_68.setBounds(464, 398, 50, 50);
			lblNewLabel_68.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_68);
		}	
		else {
			formattedTextField_68.setBounds(464, 398, 50, 50);
			formattedTextField_68.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_68.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_68);
		}
		if (Main.numbersRemoved[8][6] != 0) {
			JLabel lblNewLabel_69 = new JLabel(Integer.toString(Main.numbersRemoved[8][6]));
			lblNewLabel_69.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_69.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_69.setBounds(523, 398, 50, 50);
			lblNewLabel_69.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_69);
		}	
		else {
			formattedTextField_69.setBounds(523, 398, 50, 50);
			formattedTextField_69.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_69.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_69);
		}
		
		
		
		if (Main.numbersRemoved[0][7] != 0) {
			JLabel lblNewLabel_71 = new JLabel(Integer.toString(Main.numbersRemoved[0][7]));
			lblNewLabel_71.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_71.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_71.setBounds(21, 457, 50, 50);
			lblNewLabel_71.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_71);
		}
		else {
			formattedTextField_71.setBounds(20, 457, 50, 50);
			formattedTextField_71.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_71.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_71);
		}
		if (Main.numbersRemoved[1][7] != 0) {
			JLabel lblNewLabel_72 = new JLabel(Integer.toString(Main.numbersRemoved[1][7]));
			lblNewLabel_72.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_72.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_72.setBounds(80, 457, 50, 50);
			lblNewLabel_72.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_72);
		}	
		else {
			formattedTextField_72.setBounds(80, 457, 50, 50);
			formattedTextField_72.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_72.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_72);
		}
		if (Main.numbersRemoved[2][7] != 0) {
			JLabel lblNewLabel_73 = new JLabel(Integer.toString(Main.numbersRemoved[2][7]));
			lblNewLabel_73.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_73.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_73.setBounds(140, 457, 50, 50);
			lblNewLabel_73.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_73);
		}	
		else {
			formattedTextField_73.setBounds(140, 457, 50, 50);
			formattedTextField_73.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_73.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_73);
		}
		if (Main.numbersRemoved[3][7] != 0) {
			JLabel lblNewLabel_74 = new JLabel(Integer.toString(Main.numbersRemoved[3][7]));
			lblNewLabel_74.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_74.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_74.setBounds(211, 457, 50, 50);
			lblNewLabel_74.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_74);
		}
		else {
			formattedTextField_74.setBounds(211, 457, 50, 50);
			formattedTextField_74.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_74.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_74);
		}
		if (Main.numbersRemoved[4][7] != 0) {
			JLabel lblNewLabel_75 = new JLabel(Integer.toString(Main.numbersRemoved[4][7]));
			lblNewLabel_75.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_75.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_75.setBounds(271, 457, 50, 50);
			lblNewLabel_75.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_75);
		}	
		else {
			formattedTextField_75.setBounds(271, 457, 50, 50);
			formattedTextField_75.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_75.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_75);
		}
		if (Main.numbersRemoved[5][7] != 0) {
			JLabel lblNewLabel_76 = new JLabel(Integer.toString(Main.numbersRemoved[5][7]));
			lblNewLabel_76.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_76.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_76.setBounds(331, 457, 50, 50);
			lblNewLabel_76.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_76);
		}	
		else {
			formattedTextField_76.setBounds(331, 457, 50, 50);
			formattedTextField_76.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_76.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_76);
		}
		if (Main.numbersRemoved[6][7] != 0) {
			JLabel lblNewLabel_77 = new JLabel(Integer.toString(Main.numbersRemoved[6][7]));
			lblNewLabel_77.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_77.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_77.setBounds(404, 457, 50, 50);
			lblNewLabel_77.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_77);
		}	
		else {
			formattedTextField_77.setBounds(404, 457, 50, 50);
			formattedTextField_77.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_77.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_77);
		}
		if (Main.numbersRemoved[7][7] != 0) {
			JLabel lblNewLabel_78 = new JLabel(Integer.toString(Main.numbersRemoved[7][7]));
			lblNewLabel_78.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_78.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_78.setBounds(464, 457, 50, 50);
			lblNewLabel_78.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_78);
		}	
		else {
			formattedTextField_78.setBounds(464, 457, 50, 50);
			formattedTextField_78.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_78.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_78);
		}
		if (Main.numbersRemoved[8][7] != 0) {
			JLabel lblNewLabel_79 = new JLabel(Integer.toString(Main.numbersRemoved[8][7]));
			lblNewLabel_79.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_79.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_79.setBounds(523, 457, 50, 50);
			lblNewLabel_79.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_79);
		}	
		else {
			formattedTextField_79.setBounds(523, 457, 50, 50);
			formattedTextField_79.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_79.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_79);
		}
		
		
		
		if (Main.numbersRemoved[0][8] != 0) {
			JLabel lblNewLabel_81 = new JLabel(Integer.toString(Main.numbersRemoved[0][8]));
			lblNewLabel_81.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_81.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_81.setBounds(21, 516, 50, 50);
			lblNewLabel_81.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_81);
		}
		else {
			formattedTextField_81.setBounds(20, 516, 50, 50);
			formattedTextField_81.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_81.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_81);
		}
		if (Main.numbersRemoved[1][8] != 0) {
			JLabel lblNewLabel_82 = new JLabel(Integer.toString(Main.numbersRemoved[1][8]));
			lblNewLabel_82.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_82.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_82.setBounds(80, 516, 50, 50);
			lblNewLabel_82.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_82);
		}	
		else {
			formattedTextField_82.setBounds(80, 516, 50, 50);
			formattedTextField_82.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_82.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_82);
		}
		if (Main.numbersRemoved[2][8] != 0) {
			JLabel lblNewLabel_83 = new JLabel(Integer.toString(Main.numbersRemoved[2][8]));
			lblNewLabel_83.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_83.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_83.setBounds(140, 516, 50, 50);
			lblNewLabel_83.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_83);
		}	
		else {
			formattedTextField_83.setBounds(140, 516, 50, 50);
			formattedTextField_83.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_83.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_83);
		}
		if (Main.numbersRemoved[3][8] != 0) {
			JLabel lblNewLabel_84 = new JLabel(Integer.toString(Main.numbersRemoved[3][8]));
			lblNewLabel_84.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_84.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_84.setBounds(211, 516, 50, 50);
			lblNewLabel_84.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_84);
		}
		else {
			formattedTextField_84.setBounds(211, 516, 50, 50);
			formattedTextField_84.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_84.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_84);
		}
		if (Main.numbersRemoved[4][8] != 0) {
			JLabel lblNewLabel_85 = new JLabel(Integer.toString(Main.numbersRemoved[4][8]));
			lblNewLabel_85.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_85.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_85.setBounds(271, 516, 50, 50);
			lblNewLabel_85.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_85);
		}	
		else {
			formattedTextField_85.setBounds(271, 516, 50, 50);
			formattedTextField_85.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_85.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_85);
		}
		if (Main.numbersRemoved[5][8] != 0) {
			JLabel lblNewLabel_86 = new JLabel(Integer.toString(Main.numbersRemoved[5][8]));
			lblNewLabel_86.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_86.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_86.setBounds(331, 516, 50, 50);
			lblNewLabel_86.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_86);
		}	
		else {
			formattedTextField_86.setBounds(331, 516, 50, 50);
			formattedTextField_86.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_86.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_86);
		}
		if (Main.numbersRemoved[6][8] != 0) {
			JLabel lblNewLabel_87 = new JLabel(Integer.toString(Main.numbersRemoved[6][8]));
			lblNewLabel_87.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_87.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_87.setBounds(404, 516, 50, 50);
			lblNewLabel_87.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_87);
		}	
		else {
			formattedTextField_87.setBounds(404, 516, 50, 50);
			formattedTextField_87.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_87.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_87);
		}
		if (Main.numbersRemoved[7][8] != 0) {
			JLabel lblNewLabel_88 = new JLabel(Integer.toString(Main.numbersRemoved[7][8]));
			lblNewLabel_88.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_88.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_88.setBounds(464, 516, 50, 50);
			lblNewLabel_88.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_88);
		}	
		else {
			formattedTextField_88.setBounds(464, 516, 50, 50);
			formattedTextField_88.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_88.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_88);
		}
		if (Main.numbersRemoved[8][8] != 0) {
			JLabel lblNewLabel_89 = new JLabel(Integer.toString(Main.numbersRemoved[8][8]));
			lblNewLabel_89.setFont(new Font("Tahoma", Font.PLAIN, 51));
			lblNewLabel_89.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_89.setBounds(523, 516, 50, 50);
			lblNewLabel_89.setForeground(Color.BLACK);
			contentPane.add(lblNewLabel_89);
		}	
		else {
			formattedTextField_89.setBounds(523, 516, 50, 50);
			formattedTextField_89.setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField_89.setFont(new Font("Tahoma", Font.PLAIN, 51));
			contentPane.add(formattedTextField_89);
		}
	}	
}
