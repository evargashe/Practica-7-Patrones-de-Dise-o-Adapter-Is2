package backend;

public class MotorEconomico extends Motor {

    public MotorEconomico(){
        super();
        System.out.println("Creando motor econůmico...");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor econůmico.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el motor econůmico.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor econůmico.");
    }
}

