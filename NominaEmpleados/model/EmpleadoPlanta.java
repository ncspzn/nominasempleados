package NominaEmpleados.model;

public class EmpleadoPlanta extends Empleado {

    private String cargo;
    private int horasExtra;
    private float valorHoraExtra;
    private float auxilioTransporte;

    public EmpleadoPlanta(String nombre, String documento, int edad, float salarioBase,
                          CategoriaEmpleado categoria, float descuentoSalud, float descuentoPension,
                          String cargo, int horasExtra, float valorHoraExtra, float auxilioTransporte) {

        super(nombre, documento, edad, salarioBase, categoria, descuentoSalud, descuentoPension);

        if (horasExtra < 0) throw new IllegalArgumentException("Horas inválidas");
        if (valorHoraExtra < 0) throw new IllegalArgumentException("Valor hora inválido");
        if (auxilioTransporte < 0) throw new IllegalArgumentException("Auxilio inválido");

        this.cargo = cargo;
        this.horasExtra = horasExtra;
        this.valorHoraExtra = valorHoraExtra;
        this.auxilioTransporte = auxilioTransporte;
    }

    @Override
    public float calcularSalarioBruto() {
        float pagoHoras = horasExtra * valorHoraExtra;
        return salarioBase + calcularBonificacionCategoria() + pagoHoras + auxilioTransporte;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               "\nTipo: Planta" +
               "\nCargo: " + cargo +
               "\nSalario Neto: " + calcularSalarioNeto();
    }
}
