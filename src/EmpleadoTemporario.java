public class EmpleadoTemporario extends Empleado {
     
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento, String genero,int mesesContrato) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento,genero);
        this.mesesContrato=mesesContrato;
    }

    
    @Override
        public double calcularSalario() {
            // el salario de un empleado temporal podría ser simplemente el salario base
            return getSalarioBase();
        }
        
        @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Meses Contrato :"+getMesesContrato());
    }
        // Más metodos


        public int getMesesContrato() {
            return mesesContrato;
        }


        public void setMesesContrato(int mesesContrato) {
            this.mesesContrato = mesesContrato;
        }
}
