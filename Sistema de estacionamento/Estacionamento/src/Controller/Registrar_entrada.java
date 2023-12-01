package Controller;

import Model.Estadia;
import Model.EstadiaDAO;
import javax.swing.JOptionPane;


public class Registrar_entrada {
    EstadiaDAO dao = new EstadiaDAO();
    Estadia est = new Estadia();
    
    public void aviso(String a){
        JOptionPane.showMessageDialog(null, a);
    }
    
    public boolean InserirDados(String nome_cliente, String cpf_cliente, String placa_veiculo, String cor_veiculo, String modelo_veiculo, String data_entrada, String hora_entrada, String data_saida, String hora_saida, String valor){
        
        int nome_t = nome_cliente.length();
        int cpf_t = cpf_cliente.length();
        int placa_t = placa_veiculo.length();
        boolean isNumeric = cpf_cliente.matches("[+-]?\\d*(\\.\\d+)?");

        if(nome_t > 0){
            if(cpf_t == 11){
                if(isNumeric){
                    if(placa_t == 7){
                        est.setNome_cliente(nome_cliente);
                        est.setCpf_cliente(cpf_cliente);
                        est.setPlaca_veiculo(placa_veiculo);
                        est.setCor_veiculo(cor_veiculo);
                        est.setModelo_veiculo(modelo_veiculo);
                        est.setData_entrada(data_entrada);
                        est.setHora_entrada(hora_entrada);
                        est.setData_saida(data_saida);
                        est.setHora_saida(hora_saida);
                        est.setValor(valor);

                        est = dao.Inserir(est);

                        System.out.println("ENTRADA REGISTRADA COM SUCESSO");
                        aviso("ENTRADA REGISTRADA COM SUCESSO");
                        return true;
                    }else{
                        System.out.println("Placa precisa de 7 caracteres");
                        aviso("Placa precisa de 7 digitos");
                    }
                }else{
                    aviso("CPF ACEITA SOMENTO NUMEROS");
                }
            }else{
                System.out.println("Cpf precisa de 11 numeros");
                aviso("CPF PRECISA DE 11 NUMEROS");
            }
        }else{
            System.out.println("Insira um nome");
            aviso("INSIRA UM NOME");
        }
        
        return false;
    }
}
