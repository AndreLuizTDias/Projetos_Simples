package Controller;

import Model.Estadia;
import Model.EstadiaDAO;
import static java.lang.Integer.parseInt;
import java.util.List;


public class Carregar_buscar_tabela {
    
    EstadiaDAO dao = new EstadiaDAO();
    
    public Estadia Buscar(String t){
        int x = parseInt(t);
        return dao.findByTicket(x);  
    }
    
    public List<Estadia> Carregar_tabela(){
        return dao.findAll();
    }
}
