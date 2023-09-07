import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulacaoDatasStrings {
     public static void main(String[] args){
        String nome = "Mirian";
        //ISO 8061
        Locale brasil = new Locale("pt", "BR");
        // Locale brasil = new Locale("pt", "BR");
        LocalDate hoje = LocalDate.now();

        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        LocalDateTime agora = LocalDateTime.now();

        String saudacao;
        
        if(agora.getHour()>=0 && agora.getHour()<12){
            saudacao = "bom dia";
        } else if(agora.getHour()>=12 && agora.getHour()<18){
            saudacao = "boa tarde";
        } else if(agora.getHour()>=18 && agora.getHour()<=24){
            saudacao = "boa noite";
        } else {
            saudacao = "tenha um ótimo dia";
        }
        System.out.printf("Olá, %s, hoje é %s. %s.", nome, diaDaSemana, saudacao.toUpperCase());
     }
}
