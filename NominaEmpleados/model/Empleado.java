package NominaEmpleados.model;

abstract class Empleado {
    private String nombre;
    private String documento;
    private int edad;
    private float salarioBase;
    private CategoriaEmpleado categoria;
    private float descuentoSalud;
    private float descuentopension;
    //constructor
    public Empleado(String nombre, String documento, int edad, float salarioBase, CategoriaEmpleado categoria,
            float descuentoSalud, float descuentopension) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.categoria = categoria;
        this.descuentoSalud = descuentoSalud;
        this.descuentopension = descuentopension;
    }
    //getters
    public String getNombre() {
        return nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public int getEdad() {
        return edad;
    }
    public float getSalarioBase() {
        return salarioBase;
    }
    public CategoriaEmpleado getCategoria() {
        return categoria;
    }
    public float getDescuentoSalud() {
        return descuentoSalud;
    }
    public float getDescuentopension() {
        return descuentopension;
    }
    //setters
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    public void setCategoria(CategoriaEmpleado categoria) {
        this.categoria = categoria;
    }
    public void setDescuentoSalud(float descuentoSalud) {
        this.descuentoSalud = descuentoSalud;
    }
    public void setDescuentopension(float descuentopension) {
        this.descuentopension = descuentopension;
    }
    
abstract float SalarioBruto();
public float calcularBonificacionCategoria(){
    float resultado=0;
    
    return resultado;
}
public float calcularDescuento(){
    float resultado=0;
    
    return resultado;
}
public float calcularSalarioNeto(){
    float resultado=0;
    
    return resultado;
}
public String MostrarInformacion(){
    String resultado="";
    
    return resultado;
}

}




