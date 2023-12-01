package Controller;

import Model.Estadia;
import Model.EstadiaDAO;
import static java.lang.Integer.parseInt;
import java.time.Duration;
import java.time.LocalDateTime;


public class Calcular_valor {
    public void valor(String tk){
        EstadiaDAO d = new EstadiaDAO();
        Estadia l2 = new Estadia();
        
        int t = parseInt(tk);
        
        l2 = d.findByTicket(t);
        String data_entrada = l2.getData_entrada();
        String hora_entrada = l2.getHora_entrada();
        String data_saida = l2.getData_saida();
        String hora_saida = l2.getHora_saida();
        
        String[] result_data_entrada = data_entrada.split("/");
        String[] result_hora_entrada = hora_entrada.split(":");

        int dia_entrada = parseInt(result_data_entrada[0]);
        int mes_entrada = parseInt(result_data_entrada[1]);
        int ano_entrada = parseInt(result_data_entrada[2]);
        int hora_ent = parseInt(result_hora_entrada[0]);
        int minu_ent = parseInt(result_hora_entrada[1]);
        
        String[] result_data_saida = data_saida.split("/");
        String[] result_hora_saida = hora_saida.split(":");
        
        int dia_saida = parseInt(result_data_saida[0]);
        int mes_saida = parseInt(result_data_saida[1]);
        int ano_saida = parseInt(result_data_saida[2]);
        int hora_sai = parseInt(result_hora_saida[0]);
        int minu_sai = parseInt(result_hora_saida[1]);
        
        System.out.println(ano_entrada+"/"+ mes_entrada+"/"+dia_entrada+ " " + hora_ent+":"+ minu_ent);
        System.out.println(ano_saida +"/"+ mes_saida+"/"+ dia_saida+ " "+hora_sai+": " +minu_sai);
        
        LocalDateTime startDate = LocalDateTime.of(ano_entrada, mes_entrada, dia_entrada, hora_ent, minu_ent);
        
        LocalDateTime endDate = LocalDateTime.of(ano_saida, mes_saida, dia_saida, hora_sai, minu_sai);
        
        Duration duration = Duration.between(startDate, endDate);
        //System.out.println(duration);
        double x = duration.toMinutes();
        System.out.println(x);
        
        double preco = 0.15;
        //preço por hora = 9 reais / 60 = 0,15 centavos por minuto
        double valor = x*preco;
        String res = Double.toString(valor);
        System.out.println(res);
        
        d.atualizar_valor(t, res);
    }
}
