package NominaEmpleados;

import javax.swing.JOptionPane;
import NominaEmpleados.model.*;

public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("Mi Empresa");
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "1.Planta\n2.Ventas\n3.Temporal\n4.Mostrar\n5.Buscar\n6.Mayor salario\n7.Nómina\n8.Resumen\n9.Eliminar\n0.Salir"
            ));

            try {
                switch (opcion) {

                    case 1: {
                        String n = JOptionPane.showInputDialog("Nombre");
                        String d = JOptionPane.showInputDialog("Documento");
                        int e = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                        float s = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
                        int c = Integer.parseInt(JOptionPane.showInputDialog("1.JUNIOR 2.SEMI 3.SENIOR"));
                        CategoriaEmpleado cat = CategoriaEmpleado.values()[c - 1];
                        float sal = Float.parseFloat(JOptionPane.showInputDialog("Salud"));
                        float pen = Float.parseFloat(JOptionPane.showInputDialog("Pensión"));
                        String cargo = JOptionPane.showInputDialog("Cargo");
                        int h = Integer.parseInt(JOptionPane.showInputDialog("Horas"));
                        float vh = Float.parseFloat(JOptionPane.showInputDialog("Valor hora"));
                        float aux = Float.parseFloat(JOptionPane.showInputDialog("Auxilio"));

                        Empleado emp = new EmpleadoPlanta(n,d,e,s,cat,sal,pen,cargo,h,vh,aux);
                        JOptionPane.showMessageDialog(null, empresa.registrarEmpleado(emp));
                        break;
                    }

                    case 2: {
                        String n = JOptionPane.showInputDialog("Nombre");
                        String d = JOptionPane.showInputDialog("Documento");
                        int e = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                        float s = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
                        int c = Integer.parseInt(JOptionPane.showInputDialog("1.JUNIOR 2.SEMI 3.SENIOR"));
                        CategoriaEmpleado cat = CategoriaEmpleado.values()[c - 1];
                        float sal = Float.parseFloat(JOptionPane.showInputDialog("Salud"));
                        float pen = Float.parseFloat(JOptionPane.showInputDialog("Pensión"));
                        float v = Float.parseFloat(JOptionPane.showInputDialog("Ventas"));
                        float com = Float.parseFloat(JOptionPane.showInputDialog("Comisión"));

                        Empleado emp = new EmpleadoVentas(n,d,e,s,cat,sal,pen,v,com);
                        JOptionPane.showMessageDialog(null, empresa.registrarEmpleado(emp));
                        break;
                    }

                    case 3: {
                        String n = JOptionPane.showInputDialog("Nombre");
                        String d = JOptionPane.showInputDialog("Documento");
                        int e = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                        float s = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
                        int c = Integer.parseInt(JOptionPane.showInputDialog("1.JUNIOR 2.SEMI 3.SENIOR"));
                        CategoriaEmpleado cat = CategoriaEmpleado.values()[c - 1];
                        float sal = Float.parseFloat(JOptionPane.showInputDialog("Salud"));
                        float pen = Float.parseFloat(JOptionPane.showInputDialog("Pensión"));
                        int dias = Integer.parseInt(JOptionPane.showInputDialog("Días"));
                        float vd = Float.parseFloat(JOptionPane.showInputDialog("Valor día"));

                        Empleado emp = new EmpleadoTemporal(n,d,e,s,cat,sal,pen,dias,vd);
                        JOptionPane.showMessageDialog(null, empresa.registrarEmpleado(emp));
                        break;
                    }

                    case 4: empresa.mostrarEmpleados(); break;

                    case 5: {
                        String d = JOptionPane.showInputDialog("Documento");
                        var emp = empresa.buscarEmpleado(d);
                        JOptionPane.showMessageDialog(null,
                                emp.isPresent() ? emp.get().mostrarInformacion() : "No encontrado");
                        break;
                    }

                    case 6: empresa.mostrarEmpleadoMayorSalario(); break;

                    case 7: empresa.mostrarNominaTotal(); break;

                    case 8: empresa.mostrarResumenes(); break;

                    case 9: {
                        String d = JOptionPane.showInputDialog("Documento a eliminar");
                        JOptionPane.showMessageDialog(null, empresa.eliminarEmpleado(d));
                        break;
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }

        } while (opcion != 0);
    }
}
