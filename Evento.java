/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizacion_eventos;

import java.util.Date;
/**
 *
 * @author r3xzz
 */
public class Evento {
    private int codigoEvento;
    private Date fecha;
    private String horaInicio;
    private String horaFin;
    private String ubicacion;
    private double precio;
    private int cantidadPersonas;
    private String tipoEvento;
    private boolean incluyeEntretencion;
    
    //Metodo constructor

    public Evento(int codigoEvento, Date fecha, String horaInicio, String horaFin, String ubicacion, double precio, int cantidadPersonas, String tipoEvento, boolean incluyeEntretencion) {
        this.codigoEvento = codigoEvento;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoEvento = tipoEvento;
        this.incluyeEntretencion = incluyeEntretencion;
    }
    
    //getter y setters

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public boolean isIncluyeEntretencion() {
        return incluyeEntretencion;
    }

    public void setIncluyeEntretencion(boolean incluyeEntretencion) {
        this.incluyeEntretencion = incluyeEntretencion;
    }
    
    
}
