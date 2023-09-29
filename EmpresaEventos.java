/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizacion_eventos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author r3xzz
 */

public class EmpresaEventos {
    private List<Evento> eventos;

    public EmpresaEventos() {
        eventos = new ArrayList<>();
    }

    // Método para agregar un evento
    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Método para listar eventos por orden de fechas (sin usar Collections.sort())
    public List<Evento> listarEventosPorFecha() {
        int n = eventos.size();
        Evento[] eventosArray = eventos.toArray(new Evento[n]);

        // Implementación del ordenamiento de burbuja
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (eventosArray[j].getFecha().compareTo(eventosArray[j + 1].getFecha()) > 0) {
                    // Intercambiar eventosArray[j] y eventosArray[j + 1]
                    Evento temp = eventosArray[j];
                    eventosArray[j] = eventosArray[j + 1];
                    eventosArray[j + 1] = temp;
                }
            }
        }

        // Convertir el arreglo ordenado de nuevo a una lista
        List<Evento> eventosOrdenados = new ArrayList<>();
        for (Evento evento : eventosArray) {
            eventosOrdenados.add(evento);
        }

        return eventosOrdenados;
    }

    // Método para determinar el total de ventas por tipo de evento
    public double calcularTotalVentasPorTipoEvento(String tipoEvento) {
        double totalVentas = 0;
        for (Evento evento : eventos) {
            if (evento.getTipoEvento().equalsIgnoreCase(tipoEvento)) {
                totalVentas += evento.getPrecio();
            }
        }
        return totalVentas;
    }

    // Método para determinar el tipo de evento más solicitado (sin usar un mapa)
    public String tipoEventoMasSolicitado() {
        if (eventos.isEmpty()) {
            return null; // No hay eventos para determinar el tipo más solicitado.
        }

        int maxFrecuencia = 0;
        String tipoMasSolicitado = null;

        for (Evento evento : eventos) {
            String tipo = evento.getTipoEvento();
            int frecuencia = 1; // Inicio la frecuencia a 1 para el evento actual

            // Recorremos nuevamente la lista para contar eventos del mismo tipo
            for (Evento otroEvento : eventos) {
                if (otroEvento != evento && otroEvento.getTipoEvento().equalsIgnoreCase(tipo)) {
                    frecuencia++;
                }
            }

            // Comparamos con la frecuencia máxima encontrada hasta ahora
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                tipoMasSolicitado = tipo;
            }
        }

        return tipoMasSolicitado;
    }
}