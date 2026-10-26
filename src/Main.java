public class Main {
    public static void main(String[] args) {
        // ---------- CASO 1: lista con pacientes variados ----------
        System.out.println("=== CASO 1: lista con pacientes variados ===");
        ListPacientes lista = new ListPacientes();
        lista.agregar(new Paciente("1", "Ana",   30, "Urgencias",   2));
        lista.agregar(new Paciente("2", "Luis",  45, "Cardiología", 5));
        lista.agregar(new Paciente("3", "Eva",   22, "Urgencias",   1));
        lista.agregar(new Paciente("4", "Mario", 60, "Urgencias",   7));
        lista.agregar(new Paciente("5", "Sofía", 28, "Pediatría",   3));

        System.out.println("Lista original (" + lista.getTamanio() + " pacientes):");
        lista.imprimir();

        ListPacientes urgencias = lista.obtenerPacientesEnUrgencias();
        System.out.println("Pacientes en Urgencias (" + urgencias.getTamanio() + "):");
        urgencias.imprimir();

        // ---------- CASO 2: lista original vacía ----------
        System.out.println("\n=== CASO 2: lista original vacía ===");
        ListPacientes vacia = new ListPacientes();
        ListPacientes resVacia = vacia.obtenerPacientesEnUrgencias();
        System.out.println("Tamaño resultado: " + resVacia.getTamanio() + " (esperado 0)");
        resVacia.imprimir();

        // ---------- CASO 3: hay pacientes pero ninguno en Urgencias ----------
        System.out.println("\n=== CASO 3: sin pacientes en Urgencias ===");
        ListPacientes otra = new ListPacientes();
        otra.agregar(new Paciente("10", "Pedro", 50, "Cardiología", 4));
        otra.agregar(new Paciente("11", "Lucía", 33, "Pediatría",   2));
        ListPacientes resOtra = otra.obtenerPacientesEnUrgencias();
        System.out.println("Tamaño resultado: " + resOtra.getTamanio() + " (esperado 0)");
        resOtra.imprimir();

        // ---------- CASO 4: paciente con areaAtencion null (prueba anti-NPE) ----------
        System.out.println("\n=== CASO 4: paciente con areaAtencion = null ===");
        ListPacientes conNull = new ListPacientes();
        conNull.agregar(new Paciente("20", "Nulo", 40, null, 0));
        conNull.agregar(new Paciente("21", "Real", 41, "Urgencias", 1));
        ListPacientes resNull = conNull.obtenerPacientesEnUrgencias();
        System.out.println("Tamaño resultado: " + resNull.getTamanio() + " (esperado 1)");
        resNull.imprimir();
    }
}
