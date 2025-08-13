public class EmpleadoPorHoras extends Empleado {
    

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento,genero);
        super.setSalarioBase(calcularSalario());
        
    }

   

    @Override
    public double calcularSalario() {
        // Validación de horas trabajadas con Guard Clause
        if (getHorasTrabajadas() < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
        
        double salario = getHorasTrabajadas() * getTarifaHora();
        return salario;
    }


    // Más metodos
}