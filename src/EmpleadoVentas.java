// EmpleadoVentas.java
public class EmpleadoVentas extends Empleados {
    private double comision;

    public EmpleadoVentas(int idEmpleado, String nombre, double comision) {
        super(idEmpleado, nombre);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Comisión: " + comision);
    }
}