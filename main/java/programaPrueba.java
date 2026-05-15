import java.util.Scanner;

public class ConversorDias.java{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de días: ");
        int days = scanner.nextInt();
        
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        
        System.out.println("En " + days + " días hay...");
        System.out.println(hours + " horas");
        System.out.println(minutes + " minutos");
        System.out.println(seconds + " segundos");
        
        scanner.close();
