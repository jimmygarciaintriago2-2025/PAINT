package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ecuacion2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField A;
	private JTextField B;
	private JTextField C;
	private JTextField textField_3;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecuacion2 frame = new Ecuacion2();
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
	public Ecuacion2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Ecuacion de 2do grado");
		setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resolver ecuación de segundo grado (ax^2 + bx + c = 0)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(62, 11, 316, 36);
		contentPane.add(lblNewLabel);
		
		A = new JTextField();
		A.setHorizontalAlignment(SwingConstants.CENTER);
		A.setText("0");
		A.setBounds(50, 91, 56, 20);
		contentPane.add(A);
		A.setColumns(10);
		
		B = new JTextField();
		B.setText("0");
		B.setHorizontalAlignment(SwingConstants.CENTER);
		B.setColumns(10);
		B.setBounds(150, 91, 56, 20);
		contentPane.add(B);
		
		C = new JTextField();
		C.setText("0");
		C.setHorizontalAlignment(SwingConstants.CENTER);
		C.setColumns(10);
		C.setBounds(249, 91, 56, 20);
		contentPane.add(C);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("0");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(349, 91, 56, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(103, 94, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("+");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(205, 94, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("=");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(304, 94, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("ax^2");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(50, 74, 56, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("bx");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(150, 74, 56, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("c");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(249, 74, 56, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(A.getText());
				double b = Double.parseDouble(B.getText());
				double c = Double.parseDouble(C.getText());
				double discriminante = b * b - 4 * a * c;
				 
				  if (discriminante < 0) {
					  resultado.setText("La ecuación no tiene soluciones reales.");
				  } else if (discriminante == 0) {
				  double x = -b / (2 * a);
				  String solucion = "La ecuación tiene una solución real doble: x = " + x;
				  resultado.setText(solucion);
				  } else {
				  double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				  double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				  String soluciones = "Las soluciones son x1 = " + x1 + " y x2 = " + x2;
				  resultado.setText(soluciones);
				  }
				}catch(NumberFormatException e1) {
					resultado.setText("Operación invalida");
				}
				
				
			}
		});
		btnNewButton.setBounds(105, 135, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A.setText("0");
				B.setText("0");
				C.setText("0");
				resultado.setText("");
			}
		});
		btnLimpiar.setBounds(249, 135, 89, 23);
		contentPane.add(btnLimpiar);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		resultado.setEditable(false);
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(10, 190, 424, 81);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu mn = new Menu ();
				mn.setVisible(true);
				Ecuacion2.this.dispose();
			}
		});
		btnAtras.setBounds(10, 294, 89, 23);
		contentPane.add(btnAtras);
		

	}

}
