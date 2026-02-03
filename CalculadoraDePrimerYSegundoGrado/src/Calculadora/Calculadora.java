package Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		int opcion;
		 

		  do {
		  System.out.println("\nMenú:");
		  System.out.println("1. Ecuación de primer grado");
		  System.out.println("2. Ecuación de segundo grado");
		  System.out.println("3. Sistema de ecuaciones");
		  System.out.println("4. Función cuadrática");
		  System.out.println("5. Operaciones con matrices");
		  System.out.println("6. Cálculo de áreas y perímetros");
		  System.out.println("0. Salir");
		  System.out.print("Elige una opción: ");
		 

		  opcion = sc.nextInt();
		  sc.nextLine(); 
		 

		  switch (opcion) {
		  case 1:
		  resolverEcuacionPrimerGrado(sc);
		  break;
		  case 2:
		  resolverEcuacionSegundoGrado(sc);
		  break;
		  case 3:
		  resolverSistemaEcuaciones(sc);
		  break;
		  case 4:
		  analizarFuncionCuadratica(sc);
		  break;
		  case 5:
		  operacionesConMatrices(sc);
		  break;
		  case 6:
		  calcularAreaPerimetro(sc);
		  break;
		  case 0:
		  System.out.println("¡Regrese Pronto!");
		  break;
		  default:
		  System.out.println("Opción no válida. Inténtalo de nuevo.");
		  }
		  } while (opcion != 0);
		 

		  sc.close();
		  }
		 

		  
		  public static void resolverEcuacionPrimerGrado(Scanner sc) {
		  System.out.println("Resolver ecuación de primer grado (ax + b = 0)");
		  System.out.print("Ingrese el valor de a: ");
		  double a = sc.nextDouble();
		  System.out.print("Ingrese el valor de b: ");
		  double b = sc.nextDouble();
		 

		  if (a == 0) {
		  if (b == 0) {
		  System.out.println("La ecuación tiene infinitas soluciones.");
		  } else {
		  System.out.println("La ecuación no tiene solución.");
		  }
		  } else {
		  double x = -b / a;
		  System.out.println("La solución es x = " + x);
		  }
		  }
		 

		  
		  public static void resolverEcuacionSegundoGrado(Scanner sc) {
		  System.out.println("Resolver ecuación de segundo grado (ax^2 + bx + c = 0)");
		  System.out.print("Ingrese el valor de a: ");
		  double a = sc.nextDouble();
		  System.out.print("Ingrese el valor de b: ");
		  double b = sc.nextDouble();
		  System.out.print("Ingrese el valor de c: ");
		  double c = sc.nextDouble();
		 

		  double discriminante = b * b - 4 * a * c;
		 

		  if (discriminante < 0) {
		  System.out.println("La ecuación no tiene soluciones reales.");
		  } else if (discriminante == 0) {
		  double x = -b / (2 * a);
		  System.out.println("La ecuación tiene una solución real doble: x = " + x);
		  } else {
		  double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
		  double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
		  System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
		  }
		  }
		 

		 
		  public static void resolverSistemaEcuaciones(Scanner sc) {
		  System.out.println("Resolver sistema de ecuaciones:");
		  System.out.println("a1x + b1y = c1");
		  System.out.println("a2x + b2y = c2");
		 

		  System.out.print("Ingrese el valor de a1: ");
		  double a1 = sc.nextDouble();
		  System.out.print("Ingrese el valor de b1: ");
		  double b1 = sc.nextDouble();
		  System.out.print("Ingrese el valor de c1: ");
		  double c1 = sc.nextDouble();
		 

		  System.out.print("Ingrese el valor de a2: ");
		  double a2 = sc.nextDouble();
		  System.out.print("Ingrese el valor de b2: ");
		  double b2 = sc.nextDouble();
		  System.out.print("Ingrese el valor de c2: ");
		  double c2 = sc.nextDouble();
		 

		  double determinante = a1 * b2 - a2 * b1;
		 

		  if (determinante == 0) {
		  System.out.println("El sistema no tiene solución única.");
		  } else {
		  double x = (c1 * b2 - c2 * b1) / determinante;
		  double y = (a1 * c2 - a2 * c1) / determinante;
		  System.out.println("La solución es x = " + x + " e y = " + y);
		  }
		  }
		 

		  
		  public static void analizarFuncionCuadratica(Scanner sc) {
		  System.out.println("Analizar función cuadrática (ax^2 + bx + c)");
		  System.out.print("Ingrese el valor de a: ");
		  double a = sc.nextDouble();
		  System.out.print("Ingrese el valor de b: ");
		  double b = sc.nextDouble();
		  System.out.print("Ingrese el valor de c: ");
		  double c = sc.nextDouble();
		 

		  
		  double verticeX = -b / (2 * a);
		  double verticeY = a * verticeX * verticeX + b * verticeX + c;
		  System.out.println("Vértice: (" + verticeX + ", " + verticeY + ")");
		 

		  
		  System.out.println("Eje de simetría: x = " + verticeX);
		 

		  
		  System.out.println("Intersección con el eje y: (0, " + c + ")");
		 

		  
		  double discriminante = b * b - 4 * a * c;
		  if (discriminante < 0) {
		  System.out.println("No hay intersecciones con el eje x (raíces reales).");
		  } else if (discriminante == 0) {
		  double x = -b / (2 * a);
		  System.out.println("Una intersección con el eje x (raíz doble): x = " + x);
		  } else {
		  double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
		  double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
		  System.out.println("Intersecciones con el eje x: x1 = " + x1 + " y x2 = " + x2);
		  }
		 

		  
		  if (a > 0) {
		  System.out.println("La parábola es cóncava hacia arriba.");
		  } else {
		  System.out.println("La parábola es cóncava hacia abajo.");
		  }
		  }
		 

		  
		  public static void operacionesConMatrices(Scanner sc) {
		  System.out.println("Operaciones con matrices");
		  System.out.print("Ingrese el número de filas de la matriz: ");
		  int filas = sc.nextInt();
		  System.out.print("Ingrese el número de columnas de la matriz: ");
		  int columnas = sc.nextInt();
		 

		  double[][] matriz1 = leerMatriz(sc, filas, columnas, "Matriz 1");
		  double[][] matriz2 = leerMatriz(sc, filas, columnas, "Matriz 2");
		 

		  System.out.println("1. Sumar matrices");
		  System.out.println("2. Restar matrices");
		  System.out.print("Elige la operación: ");
		  int opcion = sc.nextInt();
		 

		  switch (opcion) {
		  case 1:
		  double[][] suma = sumarMatrices(matriz1, matriz2);
		  System.out.println("La suma de las matrices es:");
		  imprimirMatriz(suma);
		  break;
		  case 2:
		  double[][] resta = restarMatrices(matriz1, matriz2);
		  System.out.println("La resta de las matrices es:");
		  imprimirMatriz(resta);
		  break;
		  default:
		  System.out.println("Opción no válida.");
		  }
		  }
		 

		  public static double[][] leerMatriz(Scanner sc, int filas, int columnas, String nombre) {
		  System.out.println("Introduce los elementos de " + nombre + ":");
		  double[][] matriz = new double[filas][columnas];
		  for (int i = 0; i < filas; i++) {
		  for (int j = 0; j < columnas; j++) {
		  System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
		  matriz[i][j] = sc.nextDouble();
		  }
		  }
		  return matriz;
		  }
		 

		  public static double[][] sumarMatrices(double[][] matriz1, double[][] matriz2) {
		  int filas = matriz1.length;
		  int columnas = matriz1[0].length;
		  double[][] resultado = new double[filas][columnas];
		  for (int i = 0; i < filas; i++) {
		  for (int j = 0; j < columnas; j++) {
		  resultado[i][j] = matriz1[i][j] + matriz2[i][j];
		  }
		  }
		  return resultado;
		  }
		 

		  public static double[][] restarMatrices(double[][] matriz1, double[][] matriz2) {
		  int filas = matriz1.length;
		  int columnas = matriz1[0].length;
		  double[][] resultado = new double[filas][columnas];
		  for (int i = 0; i < filas; i++) {
		  for (int j = 0; j < columnas; j++) {
		  resultado[i][j] = matriz1[i][j] - matriz2[i][j];
		  }
		  }
		  return resultado;
		  }
		 

		  public static void imprimirMatriz(double[][] matriz) {
		  for (int i = 0; i < matriz.length; i++) {
		  for (int j = 0; j < matriz[0].length; j++) {
		  System.out.print(matriz[i][j] + " ");
		  }
		  System.out.println();
		  }
		  }
		 

		  
		  public static void calcularAreaPerimetro(Scanner sc) {
		  System.out.println("Cálculo de áreas y perímetros");
		  System.out.println("1. Círculo");
		  System.out.println("2. Rectángulo");
		  System.out.println("3. Triángulo");
		  System.out.print("Elige la figura geométrica: ");
		  int opcion = sc.nextInt();
		 

		  switch (opcion) {
		  case 1:
		  calcularCirculo(sc);
		  break;
		  case 2:
		  calcularRectangulo(sc);
		  break;
		  case 3:
		  calcularTriangulo(sc);
		  break;
		  default:
		  System.out.println("Opción no válida.");
		  }
		  }
		 

		  public static void calcularCirculo(Scanner sc) {
		  System.out.print("Ingrese el radio del círculo: ");
		  double radio = sc.nextDouble();
		  double area = Math.PI * radio * radio;
		  double perimetro = 2 * Math.PI * radio;
		  System.out.println("Área: " + area);
		  System.out.println("Perímetro: " + perimetro);
		  }
		 

		  public static void calcularRectangulo(Scanner sc) {
		  System.out.print("Ingrese la base del rectángulo: ");
		  double base = sc.nextDouble();
		  System.out.print("Ingrese la altura del rectángulo: ");
		  double altura = sc.nextDouble();
		  double area = base * altura;
		  double perimetro = 2 * (base + altura);
		  System.out.println("Área: " + area);
		  System.out.println("Perímetro: " + perimetro);
		  }
		 

		  public static void calcularTriangulo(Scanner sc) {
		  System.out.print("Ingrese la base del triángulo: ");
		  double base = sc.nextDouble();
		  System.out.print("Ingresela altura del triángulo: ");
		  double altura = sc.nextDouble();
		  double area = (base * altura) / 2;
		  System.out.println("Área: " + area);
		  System.out.println("No se puede calcular el perímetro sin conocer los tres lados.");
		  
		 
        

	}

}
