package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class circulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField radio;
	private JTextField area;
	private JTextField perimetro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					circulo frame = new circulo();
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
	public circulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Cicrulo");
		this.setResizable(false);
		setSize(800, 600);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1. Círculo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(462, 11, 85, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(circulo.class.getResource("/imagenes/circulo (1).png")));
		lblNewLabel_2.setBounds(85, 38, 113, 142);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el radio del círculo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(417, 73, 181, 14);
		contentPane.add(lblNewLabel_1);
		
		radio = new JTextField();
		radio.setText("0");
		radio.setHorizontalAlignment(SwingConstants.CENTER);
		radio.setBounds(443, 110, 58, 20);
		contentPane.add(radio);
		radio.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("r=");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(387, 112, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		area = new JTextField();
		area.setEditable(false);
		area.setBounds(448, 270, 176, 20);
		contentPane.add(area);
		area.setColumns(10);
		
		perimetro = new JTextField();
		perimetro.setEditable(false);
		perimetro.setColumns(10);
		perimetro.setBounds(448, 333, 176, 20);
		contentPane.add(perimetro);
		
		JLabel lblNewLabel_1_1 = new JLabel(" Area=");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(243, 276, 67, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Perimetro=");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(243, 339, 94, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	
				double r = Double.parseDouble(radio.getText());
				if(r<0) {
					area.setText("No negativos");
					perimetro.setText("No negativos");
				}else {
					double a = Math.PI*r*r;
				double p = Math.PI*r*2;
				String totala = ""+a;
				String totalp = ""+p;
				area.setText(totala);
				perimetro.setText(totalp);
				}
				
				}catch(NumberFormatException e1) {
					area.setText("Operacion invalida");
					perimetro.setText("Operacion invalida");
				}
				
			}
		});
		btnNewButton.setBounds(412, 183, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.setText("0");
				area.setText("");
				perimetro.setText("");
			}
		});
		btnBorrar.setBounds(535, 183, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Figuras fi = new Figuras();
				fi.setVisible(true);
				circulo.this.dispose();
			}
		});
		btnNewButton_1.setBounds(81, 529, 89, 23);
		contentPane.add(btnNewButton_1);

	}
}
