
public class Trabajador {

    protected String name;
    protected String surname;
    protected Double price;

    public Trabajador (String name, String surname, double price){

        this.name=name;
        this.surname=surname;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public double getPrice() {
        return price;
    }

    public double salaryHours(double hours){
        return hours*price;

    }
    public String returnName () {
        return this.name;
    }

    public String toString() {
        return "El trabajador "+name+ " "+surname+" e importe por horas es "+price+"€";
    }
}
