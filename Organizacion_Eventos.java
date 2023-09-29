/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package organizacion_eventos;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author r3xzz
 */
public class Organizacion_Eventos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmpresaEventos empresa = new EmpresaEventos();

        // Solicitar datos para el primer evento
        System.out.println("Ingresar datos para el primer evento:");
        System.out.print("Código de evento: ");
        int codigoEvento1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer de entrada
        System.out.print("Fecha (en formato dd/MM/yyyy): ");
        String fechaStr1 = scanner.nextLine();
        System.out.print("Hora de inicio (en formato HH:mm): ");
        String horaInicio1 = scanner.nextLine();
        System.out.print("Hora de fin (en formato HH:mm): ");
        String horaFin1 = scanner.nextLine();
        System.out.print("Ubicación: ");
        String ubicacion1 = scanner.nextLine();
        System.out.print("Precio: ");
        double precio1 = scanner.nextDouble();
        System.out.print("Cantidad de personas: ");
        int cantidadPersonas1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer de entrada
        System.out.print("Tipo de evento: ");
        String tipoEvento1 = scanner.nextLine();
        System.out.print("¿Incluye entretenimiento? (true/false): ");
        boolean incluyeEntretencion1 = scanner.nextBoolean();
        scanner.nextLine(); // Limpiar el búfer de entrada

        // Crear el primer evento
        Evento evento1 = new Evento(codigoEvento1, new Date(), horaInicio1, horaFin1, ubicacion1, precio1, cantidadPersonas1, tipoEvento1, incluyeEntretencion1);

        // Solicitar datos para el segundo evento
        System.out.println("\nIngresar datos para el segundo evento:");
        System.out.print("Código de evento: ");
        int codigoEvento2 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer de entrada
        System.out.print("Fecha (en formato dd/MM/yyyy): ");
        String fechaStr2 = scanner.nextLine();
        System.out.print("Hora de inicio (en formato HH:mm): ");
        String horaInicio2 = scanner.nextLine();
        System.out.print("Hora de fin (en formato HH:mm): ");
        String horaFin2 = scanner.nextLine();
        System.out.print("Ubicación: ");
        String ubicacion2 = scanner.nextLine();
        System.out.print("Precio: ");
        double precio2 = scanner.nextDouble();
        System.out.print("Cantidad de personas: ");
        int cantidadPersonas2 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer de entrada
        System.out.print("Tipo de evento: ");
        String tipoEvento2 = scanner.nextLine();
        System.out.print("¿Incluye entretenimiento? (true/false): ");
        boolean incluyeEntretencion2 = scanner.nextBoolean();
        scanner.nextLine(); // Limpiar el búfer de entrada

        // Crear el segundo evento
        Evento evento2 = new Evento(codigoEvento2, new Date(), horaInicio2, horaFin2, ubicacion2, precio2, cantidadPersonas2, tipoEvento2, incluyeEntretencion2);

        // Agregar los eventos a la empresa
        empresa.agregarEvento(evento1);
        empresa.agregarEvento(evento2);

        // Ejemplo de cómo usar los métodos corregidos
        List<Evento> eventosPorFecha = empresa.listarEventosPorFecha();
        System.out.println("\nEventos ordenados por fecha:");
        for (Evento evento : eventosPorFecha) {
            System.out.println("Evento: " + evento.getCodigoEvento() + ", Fecha: " + evento.getFecha());
        }

        System.out.print("\nIngrese el tipo de evento para calcular total de ventas: ");
        String tipoVentas = scanner.nextLine();
        double totalVentasCumpleaños = empresa.calcularTotalVentasPorTipoEvento(tipoVentas);
        System.out.println("Total de ventas de " + tipoVentas + ": " + totalVentasCumpleaños);

        String tipoMasSolicitado = empresa.tipoEventoMasSolicitado();
        System.out.println("\nTipo de evento más solicitado: " + tipoMasSolicitado);
        
        scanner.close(); // Cerrar el scanner cuando hayas terminado de usarlo
    }
}