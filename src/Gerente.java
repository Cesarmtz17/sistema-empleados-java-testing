// Gerente.java
public class Gerente extends Empleados {
    private double sueldoBase;

    public Gerente(int idEmpleado, String nombre, double sueldoBase) {
        super(idEmpleado, nombre);
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sueldo Base: " + sueldoBase);
    }
}