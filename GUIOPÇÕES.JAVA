package A3;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class GUIOPCOES extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIOPCOES frame = new GUIOPCOES();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUIOPCOES() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escola a opção desejada:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 66, 434, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Agendar Veterinário");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vacina vacina = new Vacina();
				JOptionPane.showMessageDialog(null,"Antes de prosseguirmos, aqui vai uma informação: \n ➤Todas as nossas consultas possuem um valor fixo de R$ 50,00!");
				vacina.setvacina (Integer.parseInt(JOptionPane.showInputDialog("A consulta será com vacina ou sem?: \n-> 1- Com vacina \n-> 2- Sem vacina")));
				switch(vacina.getvacina()) {
				case 1: {
					int raca = Integer.parseInt(JOptionPane.showInputDialog("Seu pet é: \n1- Cachorro \n2- Gato"));
					switch (raca) {
						case 1: {
							EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										GUIVACINADOG frame = new GUIVACINADOG();
										frame.setVisible(true);
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
						}
						case 2: {
							EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										GUIVACINACAT frame = new GUIVACINACAT();
										frame.setVisible(true);
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
						}
					}
					break;
				}
				case 2:{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								GUIVET frame = new GUIVET();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					break;
				}
				}
			}
		});
		btnNewButton.setBounds(130, 119, 168, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAgendarPetshop = new JButton("Agendar PetShop");
		btnAgendarPetshop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GUIPET frame = new GUIPET();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnAgendarPetshop.setBounds(130, 166, 168, 23);
		contentPane.add(btnAgendarPetshop);
	}
}
