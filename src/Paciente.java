public class Paciente {
    public String id;
    public String nombre;
    public int edad;
    public String areaAntecion;
    public int diasInternado;

    public Paciente(String id, String nombre, int edad, String areaAtencion, int diasInternado) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.areaAntecion = areaAtencion;
        this.diasInternado = diasInternado;
    }
    
    @Override
    public String toString() {
        return "Paciente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", areaAntecion='" + areaAntecion + '\'' +
                ", diasInternado=" + diasInternado +
                '}';
    }
}
