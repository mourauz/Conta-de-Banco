package contabanco;


public class ContaBanco {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Banco p1 = new Banco();
        p1.setNumConta(1111);
        p1.setDono("*");
        p1.abrirConta("CC");
        
        
        Banco p2 = new Banco();
        p2.setNumConta(2222);
        p2.setDono("*");
        p2.abrirConta("*");
        
        p1.depositar(3700);
   
        
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        
        
    }
    
}
