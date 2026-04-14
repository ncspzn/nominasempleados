package NominaEmpleados.model;

import java.util.ArrayList;
import java.util.Optional;
import javax.swing.JOptionPane;

public class Empresa {

    private String nombre;
    private ArrayList<Empleado> listaEmpleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

    public String registrarEmpleado(Empleado empleado) {
        Optional<Empleado> existente = buscarEmpleado(empleado.getDocumento());
        if (existente.isPresent()) return "El empleado ya existe";
        listaEmpleados.add(empleado);
        return "Empleado registrado correctamente";
    }

    public Optional<Empleado> buscarEmpleado(String documento) {
        return listaEmpleados.stream()
                .filter(e -> e.getDocumento().equals(documento))
                .findFirst();
    }

    public String actualizarEmpleado(String documento, Empleado nuevo) {
        Optional<Empleado> existente = buscarEmpleado(documento);
        if (existente.isEmpty()) return "Empleado no encontrado";
        Empleado e = existente.get();
        e.setEdad(nuevo.getEdad());
        e.setSalarioBase(nuevo.getSalarioBase());
        e.setCategoria(nuevo.getCategoria());
        e.setDescuentoSalud(nuevo.getDescuentoSalud());
        e.setDescuentoPension(nuevo.getDescuentoPension());
        return "Empleado actualizado";
    }

    public String eliminarEmpleado(String documento) {
        Optional<Empleado> existente = buscarEmpleado(documento);
        if (existente.isEmpty()) return "Empleado no encontrado";
        listaEmpleados.remove(existente.get());
        return "Empleado eliminado";
    }

    public void mostrarEmpleados() {
        String info = "";
        for (Empleado e : listaEmpleados) {
            info += e.mostrarInformacion() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }

    public void mostrarEmpleadoMayorSalario() {
        if (listaEmpleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados");
            return;
        }
        Empleado mayor = listaEmpleados.get(0);
        for (Empleado e : listaEmpleados) {
            if (e.calcularSalarioNeto() > mayor.calcularSalarioNeto()) {
                mayor = e;
            }
        }
        JOptionPane.showMessageDialog(null, mayor.mostrarInformacion());
    }

    public void mostrarNominaTotal() {
        float total = 0;
        for (Empleado e : listaEmpleados) {
            total += e.calcularSalarioNeto();
        }
        JOptionPane.showMessageDialog(null, "Nómina total: " + total);
    }

    public void mostrarResumenes() {
        String resumen = "";
        for (Empleado e : listaEmpleados) {
            resumen += e.generarResumenPago() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, resumen);
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
}
