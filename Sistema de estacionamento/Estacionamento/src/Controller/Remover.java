package Controller;

import Model.EstadiaDAO;


public class Remover {
    EstadiaDAO d = new EstadiaDAO();
    
    public void Remover(Integer tk){
        try{
            d.remove(tk);
        }catch(Exception e){
            System.out.println("Campo ticket necessario");
        }
    }
}
