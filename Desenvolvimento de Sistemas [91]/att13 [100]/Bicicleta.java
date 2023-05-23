package Att13;
public class Bicicleta extends Veiculo {
    private String modelo;
    private String marca;
    private int aro;

    public Bicicleta() {
    }
    public Bicicleta(String modelo, String marca, boolean pintura, boolean carroceria) {
        super(pintura, carroceria);
        this.modelo = modelo;
        this.marca = marca;
    }
    public Bicicleta(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAro() {
        return aro;
    }
    public void setAro(int aro) {
        this.aro = aro;
    }
    
    @Override
    public void checklist(){
        System.out.printf("==================\n    Check list\n    __________\n");
        ;
        System.out.printf("Marca: "+this.getMarca()+"\nModelo: "+this.getModelo()+"\nAro: "+this.getAro()+"\n");
        if(this.isPintura()==true){
            System.out.println("Pintura Ok");
        }else if(this.isPintura()==false){
             System.out.println("Problema na Pintura!!");   
        }
        if(this.isPneus()==true){
            System.out.println("Pneus Ok");
        }else if(this.isPneus()==false){
             System.out.println("Problema na Pneus!!");   
        }
    }
     @Override
    public void adjust(){
        int confirm=0;
        System.out.printf("Insira a marca da bicicleta: ");
        String marca=scan.next();
        this.setMarca(marca);
        System.out.printf("Insira o modelo da bicicleta: ");
        String modelo=scan.next();
        this.setModelo(modelo);
        System.out.printf("Insira o aro da bicicleta: ");
        int aro =scan.nextInt();
        this.setAro(aro);
        while(confirm!=1){
            System.out.println("Pintura esta ok?(Sim ou Nao)");
            String escolha = scan.next();
            if(escolha.equals("sim")||escolha.equals("Sim")){
                this.setPintura(true);
                confirm=1;
            }else if(escolha.equals("nao")||escolha.equals("não")||escolha.equals("Não")){
                this.setPintura(false);
                confirm=1;
            }else{
                System.out.println("Resposta invalida, Tente novamente");
            }    
        }
        while(confirm!=2){
            System.out.println("Pneus esta ok?(Sim ou Nao)");
            String escolha= scan.next();
            if(escolha.equals("sim")||escolha.equals("Sim")){
                this.setPneus(true);
                confirm=2;
            }else if(escolha.equals("nao")||escolha.equals("não")||escolha.equals("Não")){
                this.setPneus(false);
                confirm=2;
            }else{
                System.out.println("Resposta invalida, Tente novamente");
            }   
        }
    }
    @Override
     public void cleanup(){
        this.setMarca("Não definida");
        this.setModelo("Não definida");
        this.setAro(0);
        this.setPintura(false);
        this.setPneus(false);
        System.out.println("Tudo foi limpo!!");
    }
    @Override
    public String toString() {
        return String.format("Bicicleta\nmodelo="+modelo+", marca="+marca+", aro="+aro);
    }
}
