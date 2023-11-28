package atencion;

/**
 *
 * @author Student
 */
import java.util.ArrayList;

public class OrdenAtencion extends Paciente {

    private Paciente paciente;

    ArrayList<String> pacientes;

    public OrdenAtencion(ArrayList<String> pacientes) {
        this.pacientes = Paciente;
    }

    public void Añadir() {
        pacientes.add = paciente
    }

    public boolean Borrar(String Cedula) {
        if (Cedula = Equals(getCedula)   {
            pacientes.remove(this.paciente);
            return true;
        }
        return false;

    }

    public void Actualizar() {
        pacientes.replace()
    }

    public void MoverPaciente() {
        pacientes.set(0, paciente)
    }

    public boolean atendito(String HoraSalida) {
        if (HoraSalida.equals(paciente.getHoraSalida().isEmpty(""))) {
            return true;
        }
        return false;

    }
}
