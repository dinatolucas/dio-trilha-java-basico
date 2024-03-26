import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();


            System.out.println("O candidato " + candidato + " solicitou R$" + salarioPretendido + " reais de salário");
            if (salarioBase >= salarioPretendido){
                candidatoSelecionado ++;
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
       }

    static void analisarCandidato(Double salarioPretendido){
        double baseSalarial = 2000.0;
        
        if (baseSalarial > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (baseSalarial == salarioPretendido){
            System.out.println("Ligar para o candidato para fazer uma contra proposta");
        } else
            System.out.println("Aguardando o resultado dos demais candidatos");
    }

}
