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

public class Ecuacion1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField A;
	private JTextField B;
	private JTextField C;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecuacion1 frame = new Ecuacion1();
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
	public Ecuacion1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Ecuacion 1 grado");
		setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resolver ecuación de primer grado (ax + b = 0)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(48, 11, 293, 32);
		contentPane.add(lblNewLabel);
		
		A = new JTextField();
		A.setText("0");
		A.setHorizontalAlignment(SwingConstants.CENTER);
		A.setFont(new Font("Tahoma", Font.PLAIN, 11));
		A.setBounds(53, 77, 46, 20);
		contentPane.add(A);
		A.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ax");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(53, 64, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		B = new JTextField();
		B.setText("0");
		B.setHorizontalAlignment(SwingConstants.CENTER);
		B.setFont(new Font("Tahoma", Font.PLAIN, 11));
		B.setColumns(10);
		B.setBounds(156, 77, 46, 20);
		contentPane.add(B);
		
		C = new JTextField();
		C.setEditable(false);
		C.setText("0");
		C.setHorizontalAlignment(SwingConstants.CENTER);
		C.setFont(new Font("Tahoma", Font.PLAIN, 11));
		C.setColumns(10);
		C.setBounds(259, 77, 46, 20);
		contentPane.add(C);
		
		JLabel lblNewLabel_1_1 = new JLabel("+");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(109, 80, 37, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("b");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(156, 64, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("=");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(212, 80, 37, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(48, 142, 277, 69);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Calular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double a = Double.parseDouble(A.getText());
				    double b = Double.parseDouble(B.getText());
					if (a == 0) {
					  if (b == 0) {
						  resultado.setText("La ecuación tiene infinitas soluciones.");
					  } else {
						  resultado.setText("La ecuación no tiene solución.");
					  }
					  } else {
					  double x = -b / a;
					  String solucion = "La solución es x= "+x;
					  resultado.setText(solucion);
					  }
				}catch(NumberFormatException e1) {
				resultado.setText("Operación invalida");	
				}
			}
		});
		btnNewButton.setBounds(63, 108, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu mn = new Menu();
				mn.setVisible(true);
				Ecuacion1.this.dispose();
			}
		});
		btnAtras.setBounds(326, 420, 89, 23);
		contentPane.add(btnAtras);
		
		JButton btnBorras = new JButton("Borrar");
		btnBorras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A.setText("0");
				B.setText("0");
				resultado.setText("");
			}
		});
		btnBorras.setBounds(212, 108, 89, 23);
		contentPane.add(btnBorras);

	}
}
