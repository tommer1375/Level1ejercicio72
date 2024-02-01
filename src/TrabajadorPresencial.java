public class TrabajadorPresencial extends Trabajador  {
    private static Integer gasoil=50;

    public TrabajadorPresencial (String name, String surname, double price){
        super (name, surname, price);
    }
    @Override
    public double salaryHours(double hours){
        return super.salaryHours(hours)+gasoil;
    }
    @Deprecated
    public double salaryNoGasoil (double hours){
        return price*hours;
    }
}
