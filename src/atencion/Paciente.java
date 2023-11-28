package atencion;

import java.util.Date;

/**
 *
 * @author Student
 */
public class Paciente {

    private String cedula;
    private String Nombre;
    private Date Fecha;
    private String HoraEntrada;
    private String HoraSalida;
    private String Clasifiicacion;

    public String getClasifiicacion() {
        return Clasifiicacion;
    }

    public void setClasifiicacion(String clasifiicacion) {
        this.Clasifiicacion = clasifiicacion;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public Date getFecha() {
        return Fecha;
    }

    public String getHoraEntrada() {
        return HoraEntrada;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }
  public Paciente(String cedula, String Nombre, Date Fecha, String HoraEntrada, String HoraSalida, String Clasifiicacion) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.HoraEntrada = HoraEntrada;
        this.HoraSalida = HoraSalida;
        this.Clasifiicacion = Clasifiicacion;
    }
  
    public Paciente(String cedula, String Nombre, Date Fecha, String HoraEntrada, String HoraSalida) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.HoraEntrada = HoraEntrada;
        this.HoraSalida = HoraSalida;
        this.Clasifiicacion = "Verde";
    }

  

    @Override
    public String toString() {
        return "Paciente{" + "cedula=" + cedula + ", Nombre=" + Nombre + ", Fecha=" + Fecha + ", horaEntrada=" + HoraEntrada + ", horaSalida=" + HoraSalida + ", clasifiicacion=" + Clasifiicacion + '}';
    }

}
