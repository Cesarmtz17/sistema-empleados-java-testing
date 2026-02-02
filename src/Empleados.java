// Empleados.java
public class Empleados {
    private int idEmpleado;
    private String nombre;

    public Empleados(int idEmpleado, String nombre) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + idEmpleado + ", Nombre: " + nombre);
    }
}
