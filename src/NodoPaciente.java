public class NodoPaciente {
    public Paciente paciente;
    public NodoPaciente siguiente;

    public NodoPaciente(Paciente paciente) {
        this.paciente = paciente;
        this.siguiente = null;
    }
}