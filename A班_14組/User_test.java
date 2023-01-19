
/*107403538�����*/
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class User_test extends JFrame {

	private String[] dataTitle = {"id","�~��","���\","����"};
	private Menu m = new Menu();
	private order_test o = new order_test();
	private String [][] data = {
		{"1","������","X","44��"},
		{"2","���ֳ�","���\","48��"},
		{"3","�j���J","X","72��"},
		{"4","����(�p)","X","33��"},
		{"5","����(��)","X","44��"},
		{"6","����(�j)","X","55��"},
		{"7","����","X","30��"},
		{"8","�i��(�p)","X","28��"},
		{"9","����(�p)","X","28��"},
		{"10","�ɦ̿@��","X","40��"},
	};
	private JPanel contentPane;
	private JTable table;  


  //frame
	public User_test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 710);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
    //top
		JPanel top = new JPanel();
		top.setBackground(new Color(112, 128, 144));
		contentPane.add(top, BorderLayout.NORTH);
		
		JLabel title = new JLabel("�t���I�\��");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setForeground(new Color(255, 255, 255));
		title.setFont(new Font("�L�n������", Font.BOLD | Font.ITALIC, 25));
		title.setPreferredSize(new Dimension(500, 70));
		top.add(title);
		
    //table
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(480, 300));
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//���i�s��table
		DefaultTableModel tableModel = new DefaultTableModel(data,dataTitle) {
		    @Override
		    public boolean isCellEditable(int row, int column) {
		       //all cells false
		       return false;
		    }
		};
		table = new JTable(data,dataTitle);
		table.setFillsViewportHeight(true);
		table.setBackground(new Color(248, 248, 255));
        //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�������C���۰ʽվ�\��
		table.setPreferredScrollableViewportSize(new Dimension(480, 300));
		table.setFont(new Font("�L�n������", Font.PLAIN, 17));
		table.setRowHeight(50); //�]�w�椸�檺�氪��50
		table.setModel(tableModel);
		scrollPane.setViewportView(table);
		
    //�k��
		JPanel right = new JPanel();
		right.setBackground(new Color(248, 248, 255));
		contentPane.add(right, BorderLayout.EAST);
		right.setPreferredSize(new Dimension(120, 300));
		right.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel blank = new JLabel(" ");
		blank.setVerticalAlignment(SwingConstants.TOP);
		blank.setHorizontalAlignment(SwingConstants.CENTER);
		blank.setPreferredSize(new Dimension(150, 20));
		right.add(blank);

	//button
		JButton add1 = new JButton("+");
		add1.setBackground(new Color(255, 255, 255));
		add1.setFont(new Font("Calibri", Font.PLAIN, 20));
		add1.setPreferredSize(new Dimension(45, 45));
		right.add(add1);
		
		JButton less1 = new JButton("-");
		less1.setBackground(new Color(255, 255, 255));
		less1.setFont(new Font("Calibri", Font.PLAIN, 20));
		less1.setPreferredSize(new Dimension(45, 45));
		right.add(less1);
		
		JButton add2 = new JButton("+");
		add2.setBackground(new Color(255, 255, 255));
		add2.setPreferredSize(new Dimension(45, 45));
		add2.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(add2);
		
		JButton less2 = new JButton("-");
		less2.setBackground(new Color(255, 255, 255));
		less2.setPreferredSize(new Dimension(45, 45));
		less2.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(less2);
		
		JButton add3 = new JButton("+");
		add3.setBackground(new Color(255, 255, 255));
		add3.setPreferredSize(new Dimension(45, 45));
		add3.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(add3);
		
		JButton less3 = new JButton("-");
		less3.setBackground(new Color(255, 255, 255));
		less3.setPreferredSize(new Dimension(45, 45));
		less3.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(less3);
		
		JButton add4 = new JButton("+");
		add4.setBackground(new Color(255, 255, 255));
		add4.setPreferredSize(new Dimension(45, 45));
		add4.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(add4);
		
		JButton less4 = new JButton("-");
		less4.setBackground(new Color(255, 255, 255));
		less4.setPreferredSize(new Dimension(45, 45));
		less4.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(less4);
		
		JButton add5 = new JButton("+");
		add5.setBackground(new Color(255, 255, 255));
		add5.setPreferredSize(new Dimension(45, 45));
		add5.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(add5);
		
		JButton less5 = new JButton("-");
		less5.setBackground(new Color(255, 255, 255));
		less5.setPreferredSize(new Dimension(45, 45));
		less5.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(less5);
		
		JButton add6 = new JButton("+");
		add6.setBackground(new Color(255, 255, 255));
		add6.setPreferredSize(new Dimension(45, 45));
		add6.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(add6);
		
		JButton less6 = new JButton("-");
		less6.setBackground(new Color(255, 255, 255));
		less6.setPreferredSize(new Dimension(45, 45));
		less6.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(less6);
		
		JButton add7 = new JButton("+");
		add7.setBackground(new Color(255, 255, 255));
		add7.setPreferredSize(new Dimension(45, 45));
		add7.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(add7);
		
		JButton less7 = new JButton("-");
		less7.setBackground(new Color(255, 255, 255));
		less7.setPreferredSize(new Dimension(45, 45));
		less7.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(less7);
		
		JButton add8 = new JButton("+");
		add8.setBackground(new Color(255, 255, 255));
		add8.setPreferredSize(new Dimension(45, 45));
		add8.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(add8);
		
		JButton less8 = new JButton("-");
		less8.setBackground(new Color(255, 255, 255));
		less8.setPreferredSize(new Dimension(45, 45));
		less8.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(less8);
		
		JButton add9 = new JButton("+");
		add9.setBackground(new Color(255, 255, 255));
		add9.setPreferredSize(new Dimension(45, 45));
		add9.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(add9);
		
		JButton less9 = new JButton("-");
		less9.setBackground(new Color(255, 255, 255));
		less9.setPreferredSize(new Dimension(45, 45));
		less9.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(less9);
		
		JButton add10 = new JButton("+");
		add10.setBackground(new Color(255, 255, 255));
		add10.setPreferredSize(new Dimension(45, 45));
		add10.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(add10);
		
		JButton less10 = new JButton("-");
		less10.setBackground(new Color(255, 255, 255));
		less10.setPreferredSize(new Dimension(45, 45));
		less10.setFont(new Font("Calibri", Font.PLAIN, 20));
		right.add(less10);
		
	//�U��
		JPanel button = new JPanel();
		button.setBackground(new Color(248, 248, 255));
		contentPane.add(button, BorderLayout.SOUTH);
		
		JButton order = new JButton("�d�ݭq��");
		order.setBackground(new Color(255, 240, 245));
		order.setFont(new Font("�L�n������", Font.PLAIN, 20));
		button.add(order);

		
	//���s��@
	//add
		//�M�\
		add1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] options = {"���I","�M�\"};
				int result = JOptionPane.showOptionDialog(User_test.this,"�п���I�\�Ҧ�","�M�\/���I",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,null);
				if(result == JOptionPane.YES_OPTION) {
					o.addSingleOrder(1);
					JOptionPane.showMessageDialog(User_test.this,"���I���\");
				}
				else if(result == JOptionPane.NO_OPTION) {
					String [] Setoptions = {"A�I","B�\","C�\"};
					int response = JOptionPane.showOptionDialog(User_test.this,"�M�\�ﶵ\n+60�� A ���q�M�\:����(��)+�p�M����\n+70�� B ����M�\:����(�p)+����+�p�M�i��\n+70�� C �Y�ܹ��M�\:����(�j)+�p�M����","�M�\",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Setoptions,null);
					if(response == 0) {
						//A�\
						o.addSingleOrder(1);
						o.addSetOrder("A");
					}
					else if(response == 1) {
						//B�\
						o.addSingleOrder(1);
						o.addSetOrder("B");
					}
					else  if(response == 2){
						//C�\
						o.addSingleOrder(1);
						o.addSetOrder("C");
					}

				}
			}
		});

		add2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] options = {"���I","�M�\"};
				int result = JOptionPane.showOptionDialog(User_test.this,"�п���I�\�Ҧ�","�M�\/���I",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,null);
				if(result == JOptionPane.YES_OPTION) {
					o.addSingleOrder(2);
					JOptionPane.showMessageDialog(User_test.this,"���I���\");
				}
				else if(result == JOptionPane.NO_OPTION) {
					String [] Setoptions = {"A�I","B�\","C�\"};
					int response = JOptionPane.showOptionDialog(User_test.this,"�M�\�ﶵ\n+60�� A ���q�M�\:����(��)+�p�M����\n+70�� B ����M�\:����(�p)+����+�p�M�i��\n+70�� C �Y�ܹ��M�\:����(�j)+�p�M����","�M�\",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Setoptions,null);
					if(response == JOptionPane.YES_OPTION) {
						//A�\
						o.addSingleOrder(2);
						o.addSetOrder("A");
					}
					else if(response == JOptionPane.NO_OPTION) {
						//B�\
						o.addSingleOrder(2);
						o.addSetOrder("B");
					}
					else if(response == JOptionPane.CANCEL_OPTION) {
						//C�\
						o.addSingleOrder(2);
						o.addSetOrder("C");
					}

				}
			}
		});
		add3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] options = {"���I","�M�\"};
				int result = JOptionPane.showOptionDialog(User_test.this,"�п���I�\�Ҧ�","�M�\/���I",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,null);
				if(result == JOptionPane.YES_OPTION) {
					o.addSingleOrder(3);
					JOptionPane.showMessageDialog(User_test.this,"���I���\");
				}
				else if(result == JOptionPane.NO_OPTION) {
					String [] Setoptions = {"A�I","B�\","C�\"};
					int response = JOptionPane.showOptionDialog(User_test.this,"�M�\�ﶵ\n+60�� A ���q�M�\:����(��)+�p�M����\n+70�� B ����M�\:����(�p)+����+�p�M�i��\n+70�� C �Y�ܹ��M�\:����(�j)+�p�M����","�M�\",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Setoptions,null);
					if(response == JOptionPane.YES_OPTION) {
						//A�\
						o.addSingleOrder(3);
						o.addSetOrder("A");
					}
					else if(response == JOptionPane.NO_OPTION) {
						//B�\
						o.addSingleOrder(3);
						o.addSetOrder("B");
					}
					else if(response == JOptionPane.CANCEL_OPTION) {
						//C�\
						o.addSingleOrder(3);
						o.addSetOrder("C");
					}

				}
			}
		});
		//���\
		add4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addorder
				o.addSingleOrder(4);
				JOptionPane.showMessageDialog(User_test.this,"���I���\");
			}
		});
		add5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addorder
				o.addSingleOrder(5);
				JOptionPane.showMessageDialog(User_test.this,"���I���\");
			}
		});
		add6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addorder
				o.addSingleOrder(6);
				JOptionPane.showMessageDialog(User_test.this,"���I���\");
			}
		});
		add7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addorder
				o.addSingleOrder(7);
				JOptionPane.showMessageDialog(User_test.this,"���I���\");
			}
		});
		add8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addorder
				o.addSingleOrder(8);
				JOptionPane.showMessageDialog(User_test.this,"���I���\");
			}
		});
		add9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addorder
				o.addSingleOrder(9);
				JOptionPane.showMessageDialog(User_test.this,"���I���\");
			}
		});
		add10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addorder
				o.addSingleOrder(10);
				JOptionPane.showMessageDialog(User_test.this,"���I���\");
			}
		});
		
	//less
		//�M�\
		less1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (o.getTotalprice()==0) {
					JOptionPane.showMessageDialog(User_test.this,"�S���\�I");
				}
				else {
					String [] options = {"���I","�M�\"};
					int result = JOptionPane.showOptionDialog(User_test.this,"�R�����~","�M�\/���I",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,null);
					if(result == JOptionPane.YES_OPTION) {
						o.delSingleOrder(1);
						JOptionPane.showMessageDialog(User_test.this,"�R�����\");
					}
					else if(result == JOptionPane.NO_OPTION) {
						String [] Setoptions = {"A�I","B�\","C�\"};
						int response = JOptionPane.showOptionDialog(User_test.this,"�R���w�I���M�\","�M�\",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Setoptions,null);
						if(response == JOptionPane.YES_OPTION) {
							//A�\
							o.delSingleOrder(1);
							o.delSetOrder("A");
						}
						else if(response == JOptionPane.NO_OPTION) {
							//B�\
							o.delSingleOrder(1);
							o.delSetOrder("B");
						}
						else if(response == JOptionPane.CANCEL_OPTION) {
							//C�\
							o.delSingleOrder(1);
							o.delSetOrder("C");
						}

					}
				}
			}
		});
		less2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (o.getTotalprice()==0) {
					JOptionPane.showMessageDialog(User_test.this,"�S���\�I");
				}
				else {
					String [] options = {"���I","�M�\"};
					int result = JOptionPane.showOptionDialog(User_test.this,"�R�����~","�M�\/���I",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,null);
					if(result == JOptionPane.YES_OPTION) {
						o.delSingleOrder(2);
						JOptionPane.showMessageDialog(User_test.this,"�R�����\");
					}
					else if(result == JOptionPane.NO_OPTION) {
						String [] Setoptions = {"A�I","B�\","C�\"};
						int response = JOptionPane.showOptionDialog(User_test.this,"�R���w�I���M�\","�M�\",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Setoptions,null);
						if(response == JOptionPane.YES_OPTION) {
							//A�\
							o.delSingleOrder(2);
							o.delSetOrder("A");
						}
						else if(response == JOptionPane.NO_OPTION) {
							//B�\
							o.delSingleOrder(2);
							o.delSetOrder("B");
						}
						else if(response == JOptionPane.CANCEL_OPTION) {
							//C�\
							o.delSingleOrder(2);
							o.delSetOrder("C");
						}

					}
				}
			}
		});
		less3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (o.getTotalprice()==0) {
					JOptionPane.showMessageDialog(User_test.this,"�S���\�I");
				}
				else {
					String [] options = {"���I","�M�\"};
					int result = JOptionPane.showOptionDialog(User_test.this,"�R�����~","�M�\/���I",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,null);
					if(result == JOptionPane.YES_OPTION) {
						o.delSingleOrder(3);
						JOptionPane.showMessageDialog(User_test.this,"�R�����\");
					}
					else if(result == JOptionPane.NO_OPTION) {
						String [] Setoptions = {"A�I","B�\","C�\"};
						int response = JOptionPane.showOptionDialog(User_test.this,"�R���w�I���M�\","�M�\",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Setoptions,null);
						if(response == JOptionPane.YES_OPTION) {
							//A�\
							o.delSingleOrder(3);
							o.delSetOrder("A");
						}
						else if(response == JOptionPane.NO_OPTION) {
							//B�\
							o.delSingleOrder(3);
							o.delSetOrder("B");
						}
						else if(response == JOptionPane.CANCEL_OPTION) {
							//C�\
							o.delSingleOrder(3);
							o.delSetOrder("C");
						}

					}
				}
			}
		});
		//���I
		less4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (o.getTotalprice()==0) {
					JOptionPane.showMessageDialog(User_test.this,"�S���\�I");
				}
				else {
					o.delSingleOrder(4);
					JOptionPane.showMessageDialog(User_test.this,"�R�����\");
				}
			}
		});
		less5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (o.getTotalprice()==0) {
					JOptionPane.showMessageDialog(User_test.this,"�S���\�I");
				}
				else {
					o.delSingleOrder(5);
					JOptionPane.showMessageDialog(User_test.this,"�R�����\");
				}
			}
		});
		less6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (o.getTotalprice()==0) {
					JOptionPane.showMessageDialog(User_test.this,"�S���\�I");
				}
				else {
					o.delSingleOrder(6);
					JOptionPane.showMessageDialog(User_test.this,"�R�����\");
				}
			}
		});
		less7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (o.getTotalprice()==0) {
					JOptionPane.showMessageDialog(User_test.this,"�S���\�I");
				}
				else {
					o.delSingleOrder(7);
					JOptionPane.showMessageDialog(User_test.this,"�R�����\");
				}
			}
		});
		less8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (o.getTotalprice()==0) {
					JOptionPane.showMessageDialog(User_test.this,"�S���\�I");
				}
				else {
					o.delSingleOrder(8);
					JOptionPane.showMessageDialog(User_test.this,"�R�����\");
				}
			}
		});
		less9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (o.getTotalprice()==0) {
					JOptionPane.showMessageDialog(User_test.this,"�S���\�I");
				}
				else {
					o.delSingleOrder(9);
					JOptionPane.showMessageDialog(User_test.this,"�R�����\");
				}
			}
		});
		less10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (o.getTotalprice()==0) {
					JOptionPane.showMessageDialog(User_test.this,"�S���\�I");
				}
				else {
					o.delSingleOrder(10);
					JOptionPane.showMessageDialog(User_test.this,"�R�����\");
				}
			}
		});

	//order button��@
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] Orderoptions = {"�~���I�\","���b"};
				int result = JOptionPane.showOptionDialog(User_test.this,o+"\n����:"+o.getTotalprice(),"�q��ﶵ",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, Orderoptions,"�~���I�\");
				if(result == JOptionPane.YES_OPTION) {
				}
				else if(result == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(User_test.this,"���b����");
					restart();
				}
			}
		});

	}
	
//restart
	public void restart() {
		try {
			this.dispose();
			User_test nframe = new User_test();
			nframe.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			}
	}
//�D�{��
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try {
					User_test frame = new User_test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}

}























