
package contabanco;


public class Banco {
    public int numConta; 
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private String t;

        public void estadoAtual(){
            System.ou.println("");
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Dono: " + this.getDono());
            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("Status: " + this.getStatus());
            
        }
    
    public void Construtor(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }
         public void setNumConta(int n){
             this.numConta = n;
         }
         public int getNumConta(){
             return this.numConta;
         }
         public void setTipo(String t){
             this.tipo = t;
         }
         public String getTipo(){
                 return this.tipo;
         }
         public void setDono(String d){
             this.dono = d;
         }
         public String getDono(){
             return this.dono;
         }
         public void setSaldo(float s){
             this.saldo = s;
         }
         public float getSaldo(){
             return this.saldo;
         }
         public void setStatus(boolean s){
             this.status = s;
         }
         public boolean getStatus(){
             return this.status;
         }  
    public void abrirConta(String t) {
    setTipo(t);
    setStatus(true);
    if (t.equals("CC")) {
        saldo = 50;
    } else if (t.equals("CP")) {
        saldo = 150;
    }
}
    
public void fecharConta() {
    if(saldo > 0){
        
        System.out.println("Conta nao pode ser fechada porque ainda tem dinheiro ");
    } else if (saldo < 0 ){
        System.out.println("Conta nao pode ser fechada porque possui saldo negativo");
    }else{
        this.setStatus(false);
    }
        
}
    public void depositar(float v){
        if(status){
            setSaldo(getSaldo() + v);
                    System.out.println("Deposito realizado com sucesso na conta de: " + dono + ", Saldo da conta: " + saldo);   
        }else{
            System.out.println("Conta inativa. nao e possivel realizar o deposito");
        }
}   
    public void sacar(float v) {
    if (status) {
        if (v <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (saldo >= v) {
            saldo -= v;
            System.out.println("Saque realizado com sucesso.Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    } else {
        System.out.println("Impossível sacar, conta inativa.");
    }
}

    public void pagarMensal(){
      float v = 0;
      if(tipo.equals("CC")){
        v = 12;     
    }else if(tipo.equals("CP")){
        v = 20;
    }
      if (status) {
        if (saldo >= v) {
            saldo -= v;
            System.out.println("Mensalidade paga com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    } else {
        System.out.println("Impossível pagar mensalidade. Conta inativa.");
    }
}
}
  

