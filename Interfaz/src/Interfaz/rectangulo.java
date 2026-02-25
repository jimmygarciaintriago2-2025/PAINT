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

public class rectangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField A;
	private JTextField B;
	private JTextField ar;
	private JTextField pr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rectangulo frame = new rectangulo();
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
	public rectangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Rectangulo");
		setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("2. Rectángulo");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(180, 11, 107, 19);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setIcon(new ImageIcon(rectangulo.class.getResource("/imagenes/rectangulo (1).png")));
		lblNewLabel_2_2.setBounds(48, 55, 140, 95);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel = new JLabel("Altura =");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(241, 72, 57, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Base =");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(241, 112, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		A = new JTextField();
		A.setHorizontalAlignment(SwingConstants.CENTER);
		A.setText("0");
		A.setBounds(308, 72, 57, 20);
		contentPane.add(A);
		A.setColumns(10);
		
		B = new JTextField();
		B.setHorizontalAlignment(SwingConstants.CENTER);
		B.setText("0");
		B.setColumns(10);
		B.setBounds(308, 109, 57, 20);
		contentPane.add(B);
		
		ar = new JTextField();
		ar.setEditable(false);
		ar.setBounds(225, 217, 140, 20);
		contentPane.add(ar);
		ar.setColumns(10);
		
		pr = new JTextField();
		pr.setEditable(false);
		pr.setColumns(10);
		pr.setBounds(225, 248, 140, 20);
		contentPane.add(pr);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(A.getText());
				double b = Double.parseDouble(B.getText());
				if(a<0 || b<0) {
					ar.setText("No negativos");
					pr.setText("No negativos");
				}else {
					 double area = b * a;
					 double perimetro = 2 * (b + a);
					 String totala = ""+area;
					 String totalp = ""+perimetro;
					 ar.setText(totala);
					 pr.setText(totalp);
				}
				}catch(NumberFormatException e1) {
					ar.setText("Datos invalidos");
					pr.setText("Datos invalidos");
				}
				
			}
		});
		btnNewButton.setBounds(140, 169, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A.setText("0");
				B.setText("0");
				ar.setText("");
				pr.setText("");
			}
		});
		btnBorrar.setBounds(276, 169, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Figuras fi = new Figuras();
				fi.setVisible(true);
				rectangulo.this.dispose();
			}
		});
		btnNewButton_1.setBounds(10, 321, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblArea = new JLabel("Area =");
		lblArea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblArea.setBounds(97, 219, 57, 14);
		contentPane.add(lblArea);
		
		JLabel lblNewLabel_1_2 = new JLabel("Perimetro =");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(97, 251, 89, 14);
		contentPane.add(lblNewLabel_1_2);

	}

}
