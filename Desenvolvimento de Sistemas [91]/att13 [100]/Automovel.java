package Att13;
public class Automovel extends Veiculo {
    private String modelo;
    private String marca;
    private String placa;

    public Automovel() {
    }
    public Automovel(String modelo, String marca, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
    }
    public Automovel(String modelo, String marca, boolean pintura, boolean carroceria, boolean motor, boolean pneus) {
        super(pintura, carroceria, motor, pneus);
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
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    @Override
    public void checklist(){
        System.out.printf("==================\n    Check list\n    __________\n");
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        if(this.isPintura()==true){
            System.out.println("Pintura Ok");
        }else if(this.isPintura()==false){
             System.out.println("Problema na Pintura!!");   
        }
        if(this.isCarroceria()==true){
            System.out.println("Carroceria Ok");
        }else if(this.isCarroceria()==false){
             System.out.println("Problema na Carroceria!!");   
        }
        if(this.isMotor()==true){
            System.out.println("Motor Ok");
        }else if(this.isMotor()==false){
             System.out.println("Problema na Motor!!");   
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
        System.out.println("Nome da marca: ");
        String nomemarca=scan.next();
        this.setMarca(nomemarca);
        System.out.println("Nome da modelo: ");
        String nomemodelo=scan.next();
        this.setModelo(nomemodelo);
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
            System.out.println("Carroceria esta ok?(Sim ou Nao)");
            String escolha= scan.next();
            if(escolha.equals("sim")||escolha.equals("Sim")){
                this.setCarroceria(true);
                confirm=2;
           }else if(escolha.equals("nao")||escolha.equals("não")||escolha.equals("Não")){
                this.setCarroceria(false);
                confirm=2;
            }else{
                System.out.println("Resposta invalida, Tente novamente");
            }    
        }
        while(confirm!=3){
            System.out.println("Motor esta ok?(Sim ou Nao)");
            String escolha= scan.next();
            if(escolha.equals("sim")||escolha.equals("Sim")){
                this.setMotor(true);
                confirm=3;
            }else if(escolha.equals("nao")||escolha.equals("não")||escolha.equals("Não")){
                this.setMotor(false);
                confirm=3;
            }else{
                System.out.println("Resposta invalida, Tente novamente");
            }   
        }
        while(confirm!=4){
            System.out.println("Pneus esta ok?(Sim ou Nao)");
            String escolha= scan.next();
            if(escolha.equals("sim")||escolha.equals("Sim")){
                this.setPneus(true);
                confirm=4;
            }else if(escolha.equals("nao")||escolha.equals("não")||escolha.equals("Não")){
                this.setPneus(false);
                confirm=4;
            }else{
                System.out.println("Resposta invalida, Tente novamente");
            }   
        }
    }
    @Override
     public void cleanup(){
        this.setMarca("Não definida");
        this.setModelo("Não definida");
        this.setPlaca("Não definida");
        this.setCarroceria(false);
        this.setMotor(false);
        this.setPintura(false);
        this.setPneus(false);
        System.out.println("Tudo foi limpo!!");
    }

    @Override
    public String toString() {
        return String.format("Automovel\nmodelo="+modelo+",marca="+marca+",placa="+placa);
    }
    
    
    
}
