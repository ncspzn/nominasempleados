package NominaEmpleados.model;

public class EmpleadoVentas extends Empleado {
    private float totalVentas;
    private float porcentajeComisions;
    public EmpleadoVentas(String nombre, String documento, int edad, float salarioBase, CategoriaEmpleado categoria,
            float descuentoSalud, float descuentopension, float totalVentas, float porcentajeComisions) {
        super(nombre, documento, edad, salarioBase, categoria, descuentoSalud, descuentopension);
        this.totalVentas = totalVentas;
        this.porcentajeComisions = porcentajeComisions;
    }
    public float getTotalVentas() {
        return totalVentas;
    }
    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }
    public float getPorcentajeComisions() {
        return porcentajeComisions;
    }
    public void setPorcentajeComisions(float porcentajeComisions) {
        this.porcentajeComisions = porcentajeComisions;
    }
    
    
}
