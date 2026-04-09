package NominaEmpleados.model;

public class EmpleadoTemporal extends Empleado{
    private int diasTrabajados;
    private float valorDia;
    public EmpleadoTemporal(String nombre, String documento, int edad, float salarioBase, CategoriaEmpleado categoria,
            float descuentoSalud, float descuentopension, int diasTrabajados, float valorDia) {
        super(nombre, documento, edad, salarioBase, categoria, descuentoSalud, descuentopension);
        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
    }
    public int getDiasTrabajados() {
        return diasTrabajados;
    }
    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
    public float getValorDia() {
        return valorDia;
    }
    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }
    
}
