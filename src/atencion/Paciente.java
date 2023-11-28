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
    private String horaEntrada;
    private String horaSalida;
    private String clasifiicacion;

    public String getClasifiicacion() {
        return clasifiicacion;
    }

    public void setClasifiicacion(String clasifiicacion) {
        this.clasifiicacion = clasifiicacion;
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
        return horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }
  public Paciente(String cedula, String Nombre, Date Fecha, String horaEntrada, String horaSalida, String clasifiicacion) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.clasifiicacion = clasifiicacion;
    }
  
    public Paciente(String cedula, String Nombre, Date Fecha, String horaEntrada, String horaSalida) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.clasifiicacion = "Verde";
    }

  

    @Override
    public String toString() {
        return "Paciente{" + "cedula=" + cedula + ", Nombre=" + Nombre + ", Fecha=" + Fecha + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", clasifiicacion=" + clasifiicacion + '}';
    }

}
