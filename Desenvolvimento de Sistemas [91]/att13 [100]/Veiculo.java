package Att13;
import java.util.Scanner;
public abstract class Veiculo implements Showroom{
    Scanner scan = new Scanner(System.in);
    private boolean pintura;
    private boolean carroceria;
    private boolean motor;
    private boolean pneus;

    public Veiculo() {
    }
    public Veiculo(boolean pintura, boolean carroceria) {
        this.pintura = pintura;
        this.carroceria = carroceria;
    }
    public Veiculo(boolean pintura, boolean carroceria, boolean motor, boolean pneus) {
        this.pintura = pintura;
        this.carroceria = carroceria;
        this.motor = motor;
        this.pneus = pneus;
    }
   
    public boolean isPintura() {
        return pintura;}
    public void setPintura(boolean pintura) {
        this.pintura = pintura;}
    public boolean isCarroceria() {
        return carroceria;}
    public void setCarroceria(boolean carroceria) {
        this.carroceria = carroceria;}
    public boolean isMotor() {
        return motor;}
    public void setMotor(boolean motor) {
        this.motor = motor;}
    public boolean isPneus() {
        return pneus;}
    public void setPneus(boolean pneus) {
        this.pneus = pneus;}
    
    
    public abstract void checklist();
    public abstract void adjust();
    public abstract void cleanup();

    @Override
    public String toString() {
        return String.format("Veiculo\npintura="+this.isPintura()+", carroceria="+this.isCarroceria()+", motor="+this.isMotor()+", pneus="+this.isPneus());
    }
    
    
    
}
