package gt.edu.miumg.patronbuilder;
import java.util.ArrayList;
import java.util.List;

public class Email {
    private List<String> destinatarios;
    private String asunto;
    private String cuerpo;
    private List<String> adjuntos;


    Email(EmailBuilder builder) {
        this.destinatarios = builder.destinatarios;
        this.asunto = builder.asunto;
        this.cuerpo = builder.cuerpo;
        this.adjuntos = builder.adjuntos;
    }

    public List<String> getDestinatarios() {
        return destinatarios;
    }
    public String getAsunto() {
        return asunto;
    }
    public String getCuerpo() {
       return cuerpo;
    }
    public List<String> getAdjuntos() {
        return adjuntos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destinatarios: "). append(destinatarios).append("\n");
        sb.append("Asunto: "). append(asunto).append("\n");
        sb.append("Cuerpo: "). append(cuerpo).append("\n");
        sb.append("Adjuntos: "). append(adjuntos).append("\n");
        return sb.toString();
    }
    public static EmailBuilder builder(){
        return new EmailBuilder();
    }
}
