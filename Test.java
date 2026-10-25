public class Test {
    public static void main(String[] args) {
        Entidad entidad = new Entidad("E001", "Juan Pérez", 34, "Emergencia", 5);

        System.out.println("ID: " + entidad.id);
        System.out.println("Nombre: " + entidad.nombre);
        System.out.println("Edad: " + entidad.edad);
        System.out.println("Área de atención: " + entidad.areaAntecion);
        System.out.println("Días internado: " + entidad.diasInternado);
    }
}
