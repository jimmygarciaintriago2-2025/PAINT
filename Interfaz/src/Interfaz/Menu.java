package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//coloca titulo
		this.setTitle("Menú");
		//tamaño de ventana
		setSize(800, 600);
		//coloca en el centro de la pantalla
		this.setLocationRelativeTo(null);
		//Evita que el usuario ajuste la ventana
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("CALCULADORA ");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(290, 11, 174, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1. Ecuación de primer grado");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 82, 214, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("2. Ecuación de segundo grado");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(10, 139, 214, 29);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("3. Sistema de ecuaciones");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(10, 202, 214, 26);
		contentPane.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("Ir...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//se instancia a una clase eterna 
				Sistemaecuaciones se = new Sistemaecuaciones();
				//se visibiliza la clase eterna y se abre
				se.setVisible(true);
				//se cierra la clase actual
				Menu.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(252, 202, 60, 17);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ir...");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ecuacion2 ec2 = new Ecuacion2();
				ec2.setVisible(true);
				Menu.this.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(252, 140, 60, 17);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ir...");
		btnNewButton_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ecuacion1 ec1 = new Ecuacion1();
				ec1.setVisible(true);
				Menu.this.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_2.setBounds(252, 83, 60, 17);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("4. Función cuadrática");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3.setBounds(386, 75, 174, 28);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("5. Operaciones con matrices");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_4.setBounds(386, 140, 201, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("6. Cálculo de áreas y perímetros");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_5.setBounds(387, 199, 233, 29);
		contentPane.add(lblNewLabel_2_5);
		
		JButton btnNewButton_2_1 = new JButton("Ir...");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcion f = new Funcion();
				f.setVisible(true);
				Menu.this.dispose();
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_2_1.setBounds(630, 83, 60, 17);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Ir...");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operaciones op = new operaciones();
				op.setVisible(true);
				Menu.this.dispose();
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_2_2.setBounds(630, 147, 60, 17);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("Ir...");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Figuras fi = new Figuras();
				fi.setVisible(true);
				Menu.this.dispose();
			}
		});
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_2_3.setBounds(630, 202, 60, 17);
		contentPane.add(btnNewButton_2_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/calcu.jpg")));
		lblNewLabel.setBounds(258, 287, 206, 164);
		contentPane.add(lblNewLabel);

	}
}
