package NominaEmpleados.model;

public class EmpleadoTemporal extends Empleado {

    private int diasTrabajados;
    private float valorDia;

    public EmpleadoTemporal(String nombre, String documento, int edad, float salarioBase,
                            CategoriaEmpleado categoria, float descuentoSalud, float descuentoPension,
                            int diasTrabajados, float valorDia) {

        super(nombre, documento, edad, salarioBase, categoria, descuentoSalud, descuentoPension);

        if (diasTrabajados < 0) throw new IllegalArgumentException("Días inválidos");
        if (valorDia < 0) throw new IllegalArgumentException("Valor inválido");

        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
    }

    @Override
    public float calcularSalarioBruto() {
        return (diasTrabajados * valorDia) + calcularBonificacionCategoria();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               "\nTipo: Temporal" +
               "\nSalario Neto: " + calcularSalarioNeto();
    }
}
