package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class triangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField b;
	private JTextField a;
	private JTextField ar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					triangulo frame = new triangulo();
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
	public triangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Triangulo");
		setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon(triangulo.class.getResource("/imagenes/triangulo rectangulo (1).png")));
		lblNewLabel_2_1.setBounds(39, 49, 120, 120);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3. Triángulo");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(158, 11, 94, 19);
		contentPane.add(lblNewLabel_1_2);
		
		b = new JTextField();
		b.setText("0");
		b.setHorizontalAlignment(SwingConstants.CENTER);
		b.setBounds(302, 74, 101, 20);
		contentPane.add(b);
		b.setColumns(10);
		
		a = new JTextField();
		a.setText("0");
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setBounds(302, 130, 101, 20);
		contentPane.add(a);
		a.setColumns(10);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBase.setBounds(214, 75, 46, 14);
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAltura.setBounds(214, 131, 46, 14);
		contentPane.add(lblAltura);
		
		ar = new JTextField();
		ar.setEditable(false);
		ar.setBounds(175, 223, 181, 20);
		contentPane.add(ar);
		ar.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Area");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(103, 224, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double altura = Double.parseDouble(a.getText());
				double base = Double.parseDouble(b.getText());
				if(altura<0 || base<0) {
					ar.setText("No negativos");
				}else {
					double area = (base * altura) / 2;
					String total = ""+area;
					ar.setText(total);
					
				}
				}catch(NumberFormatException e1) {
					ar.setText("Datos invalidos");
				}
				
			}
		});
		btnNewButton.setBounds(129, 180, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Figuras fi = new Figuras();
				fi.setVisible(true);
				triangulo.this.dispose();
			}
		});
		btnNewButton_1.setBounds(10, 310, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(229, 180, 89, 23);
		contentPane.add(btnBorrar);

	}

}
