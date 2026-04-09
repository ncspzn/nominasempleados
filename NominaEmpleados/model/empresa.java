package NominaEmpleados.model;

import java.util.ArrayList;
import java.util.Optional;

public class empresa {
    private String nombre;
    private ArrayList listaEmpleados;

    public empresa(String nombre, ArrayList listaEmpleados) {
        this.nombre = nombre;
        this.listaEmpleados = listaEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String registrarEmpleado(Empleado empleado){
        String respuesta="";
        Optional<Empleado> optionalEmpleado = buscarEmpleado(empleado.getDocumento());
        if(optionalEmpleado.isPresent()){
            Empleado empleadoencontrado=optionalEmpleado.get();
            respuesta="el empleado ya existe";

        }
        return respuesta;
    }
    private Optional <Empleado> buscarEmpleado(String documento){
        return listaEmpleados.stream().filter(Empleado empleado -> empleado.getdocumento().equals(documento)).findAny;

    }

    public ArrayList getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
}
