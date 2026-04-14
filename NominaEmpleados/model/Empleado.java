package NominaEmpleados.model;

public abstract class Empleado {

    protected String nombre;
    protected String documento;
    protected int edad;
    protected float salarioBase;
    protected CategoriaEmpleado categoria;
    protected float descuentoSalud;
    protected float descuentoPension;

    public Empleado(String nombre, String documento, int edad, float salarioBase,
                    CategoriaEmpleado categoria, float descuentoSalud, float descuentoPension) {

        if (salarioBase < 0) throw new IllegalArgumentException("Salario inválido");
        if (descuentoSalud < 0 || descuentoSalud > 100) throw new IllegalArgumentException("Salud inválido");
        if (descuentoPension < 0 || descuentoPension > 100) throw new IllegalArgumentException("Pensión inválido");

        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.categoria = categoria;
        this.descuentoSalud = descuentoSalud;
        this.descuentoPension = descuentoPension;
    }

    public abstract float calcularSalarioBruto();

    public float calcularBonificacionCategoria() {
        switch (categoria) {
            case JUNIOR: return salarioBase * 0.05f;
            case SEMI_SENIOR: return salarioBase * 0.10f;
            case SENIOR: return salarioBase * 0.15f;
            default: return 0;
        }
    }

    public float calcularDescuentos() {
        return salarioBase * (descuentoSalud / 100) +
               salarioBase * (descuentoPension / 100);
    }

    public float calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularDescuentos();
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre +
               "\nDocumento: " + documento +
               "\nEdad: " + edad +
               "\nSalario Base: " + salarioBase +
               "\nCategoría: " + categoria;
    }

    public ResumenPago generarResumenPago() {
        return new ResumenPago(
                documento,
                nombre,
                this.getClass().getSimpleName(),
                calcularSalarioBruto(),
                calcularDescuentos(),
                calcularSalarioNeto()
        );
    }

    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }
    public int getEdad() { return edad; }
    public float getSalarioBase() { return salarioBase; }
    public CategoriaEmpleado getCategoria() { return categoria; }
    public float getDescuentoSalud() { return descuentoSalud; }
    public float getDescuentoPension() { return descuentoPension; }

    public void setEdad(int edad) { this.edad = edad; }
    public void setSalarioBase(float salarioBase) { this.salarioBase = salarioBase; }
    public void setCategoria(CategoriaEmpleado categoria) { this.categoria = categoria; }
    public void setDescuentoSalud(float descuentoSalud) { this.descuentoSalud = descuentoSalud; }
    public void setDescuentoPension(float descuentoPension) { this.descuentoPension = descuentoPension; }
}
