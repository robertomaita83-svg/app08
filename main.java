//Crear un programa que determine el salario final de un trabajador
// SI EL PROGRAMA SE AGREGA UN 25% AL SALARIO TOTAL
// SI ES MEDICO SE AGREGA $100 AL SALARIO TOTAL
// SI ES ADMINISTRATIVO SE AGREGA 2% DEL SALARIO TOTAL
// SI TIENE MULTA SE DESCUENTA $15 AL SALARIO FINAL
// EL PROGRAMA DEBE RECIBIR EL NOMBRE Y EL SALARIO DEL TRABAJADOR
import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

String nombre;
double salario;
int opcion;

System.out.println("################");
System.out.println("Es Programador");
System.out.println("Es medico");
System.out.println("Es administrativo");
System.out.println("Ingrese una opcion");

System.out.println("Ingrese una opcion");
opcion = entrada.nextInt();

System.out.print("Ingrese el salario: ");
salario = entrada.nextDouble();


switch (opcion) {
case 1:
    salario = salario + (salario * 0.25);
    break;

case 2:
break;

case 3:
break;

default:
System.out.println("Opción no válida"); 
break;
}

JOptionPane.showMessageDialog(null, "El salario final es de " +salario);



}
}