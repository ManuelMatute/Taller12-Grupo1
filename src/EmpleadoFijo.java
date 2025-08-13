public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento,genero);
        this.bonoAnual = bonoAnual;
         
    }

    
    // Aplicando Replace Conditional with Polymorphism al sobreescribir el método para cada tipo de Empleado
    @Override 
    public double calcularSalario() {
        double salarioTotal = getSalarioBase();

        // Lógica de horas extra y validación
        if (getHorasTrabajadas() > 40) {
            salarioTotal += (getHorasTrabajadas() - 40) * 50; // Pago de horas extra
        }
        
        // Lógica del bono por departamento (si aplica)
        switch (getDepartamento()) {
            case "Sistemas":
                salarioTotal += 20;
                break;
            case "Contabilidad":
                salarioTotal += 10;
                break;
            default:
                break;
        }

        return salarioTotal;
    }
public double getBonoAnual() {
        return bonoAnual;
    }


    public void setBonoAnual(double bonoAnual) {
        this.bonoAnual = bonoAnual;
    }


@Override
public void imprimirDetalles() {
    super.imprimirDetalles();
    System.out.println("Bono Anual :"+getBonoAnual());
}
    // Más metodos
}
