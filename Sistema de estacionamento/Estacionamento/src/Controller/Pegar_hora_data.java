package Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Da para utilizar um comado no sql para pegar a informaçao do banco caso deseja
// o cidogo abaixo pega a data e hora do pc em que esta rodando
public class Pegar_hora_data {
       
    public String Pegar_data(){
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String res = dt.format(LocalDateTime.now());
        return res;
    }
    public String Pegar_hora(){
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm");
        String res = dt.format(LocalDateTime.now());
        return res;
    }
    
}
