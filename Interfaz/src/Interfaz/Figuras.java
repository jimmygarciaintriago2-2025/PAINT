package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Figuras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Figuras frame = new Figuras();
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
	public Figuras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Figuras geometricas");
		this.setResizable(false);
		setSize(800, 600);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cálculo de áreas y perímetros");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(156, 11, 229, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. Círculo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(63, 66, 82, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2. Rectángulo");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(213, 66, 107, 19);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3. Triángulo");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(389, 66, 94, 19);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Figuras.class.getResource("/imagenes/circulo (1).png")));
		lblNewLabel_2.setBounds(46, 96, 113, 113);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon(Figuras.class.getResource("/imagenes/triangulo.jpg")));
		lblNewLabel_2_1.setBounds(389, 103, 113, 98);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setIcon(new ImageIcon(Figuras.class.getResource("/imagenes/rectangulo (1).png")));
		lblNewLabel_2_2.setBounds(202, 106, 140, 95);
		contentPane.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("Ir...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				circulo ci = new circulo();
				ci.setVisible(true);
				Figuras.this.dispose();
			}
		});
		btnNewButton.setBounds(56, 219, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnIr = new JButton("Ir...");
		btnIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rectangulo re = new rectangulo();
				re.setVisible(true);
				Figuras.this.dispose();
			}
		});
		btnIr.setBounds(231, 219, 89, 23);
		contentPane.add(btnIr);
		
		JButton btnIr_1 = new JButton("Ir...");
		btnIr_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				triangulo tri = new triangulo();
				tri.setVisible(true);
				Figuras.this.dispose();
			}
		});
		btnIr_1.setBounds(399, 219, 89, 23);
		contentPane.add(btnIr_1);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu mn = new Menu();
				mn.setVisible(true);
				Figuras.this.dispose();
			}
		});
		btnAtras.setBounds(10, 280, 89, 23);
		contentPane.add(btnAtras);
		

	}

}
