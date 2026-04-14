package NominaEmpleados.model;

public class EmpleadoVentas extends Empleado {

    private float totalVentas;
    private float porcentajeComision;

    public EmpleadoVentas(String nombre, String documento, int edad, float salarioBase,
                          CategoriaEmpleado categoria, float descuentoSalud, float descuentoPension,
                          float totalVentas, float porcentajeComision) {

        super(nombre, documento, edad, salarioBase, categoria, descuentoSalud, descuentoPension);

        if (totalVentas < 0) throw new IllegalArgumentException("Ventas inválidas");
        if (porcentajeComision < 0 || porcentajeComision > 100)
            throw new IllegalArgumentException("Comisión inválida");

        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public float calcularSalarioBruto() {
        float comision = (totalVentas * porcentajeComision) / 100;
        return salarioBase + calcularBonificacionCategoria() + comision;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               "\nTipo: Ventas" +
               "\nSalario Neto: " + calcularSalarioNeto();
    }
}
