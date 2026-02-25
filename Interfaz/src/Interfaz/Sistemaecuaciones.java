package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sistemaecuaciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField A1;
	private JTextField B1;
	private JTextField C1;
	private JTextField A2;
	private JTextField B2;
	private JTextField C2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistemaecuaciones frame = new Sistemaecuaciones();
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
	public Sistemaecuaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Sistema de ecuaciones");
		setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resolver sistema de ecuaciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(112, 11, 202, 26);
		contentPane.add(lblNewLabel);
		
		A1 = new JTextField();
		A1.setText("0");
		A1.setHorizontalAlignment(SwingConstants.CENTER);
		A1.setBounds(79, 68, 50, 20);
		contentPane.add(A1);
		A1.setColumns(10);
		
		B1 = new JTextField();
		B1.setText("0");
		B1.setHorizontalAlignment(SwingConstants.CENTER);
		B1.setColumns(10);
		B1.setBounds(173, 68, 50, 20);
		contentPane.add(B1);
		
		C1 = new JTextField();
		C1.setText("0");
		C1.setHorizontalAlignment(SwingConstants.CENTER);
		C1.setColumns(10);
		C1.setBounds(274, 68, 50, 20);
		contentPane.add(C1);
		
		A2 = new JTextField();
		A2.setText("0");
		A2.setHorizontalAlignment(SwingConstants.CENTER);
		A2.setColumns(10);
		A2.setBounds(79, 120, 50, 20);
		contentPane.add(A2);
		
		B2 = new JTextField();
		B2.setText("0");
		B2.setHorizontalAlignment(SwingConstants.CENTER);
		B2.setColumns(10);
		B2.setBounds(173, 120, 50, 20);
		contentPane.add(B2);
		
		C2 = new JTextField();
		C2.setText("0");
		C2.setHorizontalAlignment(SwingConstants.CENTER);
		C2.setColumns(10);
		C2.setBounds(274, 120, 50, 20);
		contentPane.add(C2);
		
		JLabel lblNewLabel_1 = new JLabel("a1x");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(79, 53, 50, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("b1y");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(173, 53, 50, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("c1");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(274, 53, 50, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("a2x");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(79, 105, 50, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("b2y");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(173, 105, 50, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("c2");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(274, 105, 50, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2 = new JLabel("+");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(128, 71, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("+");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(128, 123, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("=");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(223, 71, 46, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("=");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setBounds(223, 123, 46, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("{");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 62));
		lblNewLabel_3.setBounds(43, 39, 46, 112);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a1 = Double.parseDouble(A1.getText());
				double b1 = Double.parseDouble(B1.getText());
				double c1 = Double.parseDouble(C1.getText());
				double a2 = Double.parseDouble(A2.getText());
				double b2 = Double.parseDouble(B2.getText());
				double c2 = Double.parseDouble(C2.getText());
				
				  double determinante = a1 * b2 - a2 * b1;
					 
				  if (determinante == 0) {
					  resultado.setText("El sistema no tiene solución única.");
				  } else {
				  double x = (c1 * b2 - c2 * b1) / determinante;
				  double y = (a1 * c2 - a2 * c1) / determinante;
				  String solucion = "La solución es x = " + x + " e y = " + y;
				  resultado.setText(solucion);
				  }
				}catch(NumberFormatException e1) {
					resultado.setText("Operacion invalida");
				}
				
				
			}
		});
		btnNewButton.setBounds(85, 162, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A1.setText("0");
				B1.setText("0");
				C1.setText("0");
				A2.setText("0");
				B2.setText("0");
				C2.setText("0");
				resultado.setText("");
			}
		});
		btnLimpiar.setBounds(225, 162, 89, 23);
		contentPane.add(btnLimpiar);
		
		resultado = new JTextField();
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setEditable(false);
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		resultado.setBounds(10, 219, 388, 73);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu mn = new Menu ();
				mn.setVisible(true);
				Sistemaecuaciones.this.dispose();
			}
		});
		btnNewButton_1.setBounds(10, 324, 89, 23);
		contentPane.add(btnNewButton_1);

	}

}
