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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField A;
	private JTextField B;
	private JTextField C;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcion frame = new Funcion();
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
	public Funcion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Funcion cuadratica");
		setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Analizar función cuadrática (ax^2 + bx + c)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(96, 11, 281, 36);
		contentPane.add(lblNewLabel);
		
		A = new JTextField();
		A.setHorizontalAlignment(SwingConstants.CENTER);
		A.setText("0");
		A.setBounds(50, 74, 50, 20);
		contentPane.add(A);
		A.setColumns(10);
		
		B = new JTextField();
		B.setText("0");
		B.setHorizontalAlignment(SwingConstants.CENTER);
		B.setColumns(10);
		B.setBounds(159, 74, 50, 20);
		contentPane.add(B);
		
		C = new JTextField();
		C.setText("0");
		C.setHorizontalAlignment(SwingConstants.CENTER);
		C.setColumns(10);
		C.setBounds(262, 74, 50, 20);
		contentPane.add(C);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("0");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(357, 74, 50, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("ax^2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(50, 58, 50, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("bx");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(159, 58, 50, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("c");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(262, 58, 50, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("+");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(103, 77, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("+");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(206, 77, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("=");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(309, 77, 46, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu mn = new Menu ();
				mn.setVisible(true);
				Funcion.this.dispose();
			}
		});
		btnAtras.setBounds(10, 312, 89, 23);
		contentPane.add(btnAtras);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 152, 427, 81);
		contentPane.add(scrollPane);
		
		JTextArea respuesta = new JTextArea();
		respuesta.setEditable(false);
		scrollPane.setViewportView(respuesta);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(27, 244, 427, 36);
		contentPane.add(scrollPane_1);
		
		JTextArea respuesta2 = new JTextArea();
		respuesta2.setEditable(false);
		scrollPane_1.setViewportView(respuesta2);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Double.parseDouble(A.getText());
				double b = Double.parseDouble(B.getText());
				double c = Double.parseDouble(C.getText());
				
				  double verticeX = -b / (2 * a);
				  double verticeY = a * verticeX * verticeX + b * verticeX + c;
				  String vertices ="Vértice: (" + verticeX + ", " + verticeY + ")";
				 

				  String simetria = "\nEje de simetría: x = " + verticeX;

				  
				  String interseccion ="\nIntersección con el eje y: (0, " + c + ")";
				  
				 

				  
				  double discriminante = b * b - 4 * a * c;
				  if (discriminante < 0) {
					  respuesta2.setText("No hay intersecciones con el eje x (raíces reales)");
				  } else if (discriminante == 0) {
				  double x = -b / (2 * a);
				  String interseccionx = "Una intersección con el eje x (raíz doble): x = " + x;
				  respuesta2.setText(interseccionx);
				  } else {
				  double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				  double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				  String interseccionx2 = "Intersecciones con el eje x: x1 = " + x1 + " y x2 = " + x2;
				  respuesta2.setText(interseccionx2);
				  }
				 

				  if (a > 0) {
					  String arriba = "\nLa parábola es cóncava hacia arriba."; 
					  respuesta.setText(vertices+interseccion+simetria+arriba);
				  } else {
					  String abajo = "\nLa parábola es cóncava hacia abajo.";
					  respuesta.setText(vertices+interseccion+simetria+abajo);
					  
				  }
				  
				  
				}catch(NumberFormatException e1) {
					respuesta.setText("Operacion invalida");
				}
				
			}
		});
		btnNewButton.setBounds(120, 118, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBorra = new JButton("Borrar");
		btnBorra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A.setText("0");
				B.setText("0");
				C.setText("0");
				respuesta.setText("");
				respuesta2.setText("");
			}
		});
		btnBorra.setBounds(244, 118, 89, 23);
		contentPane.add(btnBorra);
		
		
	}
}
