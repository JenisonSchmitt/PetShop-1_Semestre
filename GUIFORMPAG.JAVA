package A3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class GUIFORMPAG extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIFORMPAG frame = new GUIFORMPAG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUIFORMPAG() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Selecione a forma de pagamento:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 434, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Dinheiro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Você selecionou pagamento em dinheiro!");
		        JOptionPane.showMessageDialog(null,"Por favor, realize o pagamento na nossa recepção! \nObrigado!");
		        EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GUIFINAL frame = new GUIFINAL();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setBounds(105, 84, 94, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pix");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Você selecionou pagamento no Pix!");
		        JOptionPane.showMessageDialog(null,"Por favor, realize o pagamento na nossa recepção! \nObrigado!");
	            EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GUIFINAL frame = new GUIFINAL();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setBounds(247, 84, 94, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Débito");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Você selecionou pagamento no Débito!");
		        JOptionPane.showMessageDialog(null,"Por favor, realize o pagamento na nossa recepção! \nObrigado!");
            	EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GUIFINAL frame = new GUIFINAL();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_2.setBounds(105, 146, 94, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Crédito");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Você selecionou pagamento no Crédito!");
		        JOptionPane.showMessageDialog(null,"Por favor, realize o pagamento na nossa recepção! \nObrigado!");
	            EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GUIFINAL frame = new GUIFINAL();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_3.setBounds(247, 146, 94, 23);
		contentPane.add(btnNewButton_3);
	}

}
