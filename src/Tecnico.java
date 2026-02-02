// Tecnico.java
public class Tecnico extends Empleados {
    private String area;

    public Tecnico(int idEmpleado, String nombre, String area) {
        super(idEmpleado, nombre);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Área: " + area);
    }
}