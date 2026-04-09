package NominaEmpleados.model;

public class EmpleadoPlanta extends Empleado{
private String cargo;
private int horasExtra;
private float valorHoraExtra;
private float auxilioTransporte;
public EmpleadoPlanta(String nombre, String documento, int edad, float salarioBase, CategoriaEmpleado categoria,
        float descuentoSalud, float descuentopension, String cargo, int horasExtra, float valorHoraExtra,
        float auxilioTransporte) {
    super(nombre, documento, edad, salarioBase, categoria, descuentoSalud, descuentopension);
    this.cargo = cargo;
    this.horasExtra = horasExtra;
    this.valorHoraExtra = valorHoraExtra;
    this.auxilioTransporte = auxilioTransporte;
}
public String getCargo() {
    return cargo;
}
public void setCargo(String cargo) {
    this.cargo = cargo;
}
public int getHorasExtra() {
    return horasExtra;
}
public void setHorasExtra(int horasExtra) {
    this.horasExtra = horasExtra;
}
public float getValorHoraExtra() {
    return valorHoraExtra;
}
public void setValorHoraExtra(float valorHoraExtra) {
    this.valorHoraExtra = valorHoraExtra;
}
public float getAuxilioTransporte() {
    return auxilioTransporte;
}
public void setAuxilioTransporte(float auxilioTransporte) {
    this.auxilioTransporte = auxilioTransporte;
}

    
}
