package Controller;

import Model.Estadia;
import Model.EstadiaDAO;


public class teste {
    public static void main(String[] args){
        Pegar_hora_data h = new Pegar_hora_data();
        String res = h.Pegar_hora();
        //System.out.println(res);
        
        /**/
        //Calcular_valor v = new Calcular_valor();
        //v.valor("7");
        
        
        EstadiaDAO d = new EstadiaDAO();
        Estadia l2 = new Estadia();
        
        // CONSULTA UNICA
        l2 = d.findByTicket(14);
        //l2 = d.findByPlaca("FLA010RJ");
        //String x1 = l2.getPlaca_veiculo();
        System.out.println(l2.getPlaca_veiculo());
        
        //System.out.println(x1);
        //System.out.println(l2.getData_entrada() + l2.getHora_entrada() + l2.getData_saida() + l2.getHora_saida());
        
        // mostra todos os registros
        /*
        for(Estadia estadia: d.findAll()){
            System.out.println("Nome: "+estadia.getNome_cliente());
        }
        */
    }
}
