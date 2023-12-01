package Controller;

import Model.EstadiaDAO;
import static java.lang.Integer.parseInt;


public class Registrar_saida {
    EstadiaDAO dao = new EstadiaDAO();
    Pegar_hora_data h = new Pegar_hora_data();
    
    public void Registrar_saida(String ticket){
        int x = parseInt(ticket);
        dao.Registrar_saida(x, h.Pegar_data(), h.Pegar_hora()); 
    }

}
