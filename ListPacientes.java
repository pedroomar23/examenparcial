public class ListPacientes {

    private NodoPaciente cabeza;
    private int tamanio;

    public ListPacientes() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    /** Inserta un paciente al final de la lista. */
    public void agregar(Paciente p) {
        NodoPaciente nuevo = new NodoPaciente(p);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoPaciente actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        tamanio++;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    /**
     * Recorre la lista y devuelve una NUEVA lista con los pacientes
     * cuyo areaAtencion sea exactamente "Urgencias".
     * Si no hay ninguno (o la lista original está vacía),
     * devuelve una lista vacía. Nunca lanza NullPointerException.
     */
    public ListPacientes obtenerPacientesEnUrgencias() {
        ListPacientes resultado = new ListPacientes();

        NodoPaciente actual = cabeza;
        while (actual != null) {
            Paciente p = actual.paciente;
            // "Urgencias".equals(...) evita NPE si areaAtencion es null
            if (p != null && "Urgencias".equals(p.areaAntecion)) {
                resultado.agregar(p);
            }
            actual = actual.siguiente;
        }

        return resultado; // vacía si no hubo coincidencias
    }

    /** Imprime todos los pacientes de la lista (útil para el main). */
    public void imprimir() {
        if (cabeza == null) {
            System.out.println("  (lista vacía)");
            return;
        }
        NodoPaciente actual = cabeza;
        while (actual != null) {
            System.out.println("  " + actual.paciente);
            actual = actual.siguiente;
        }
    }
}