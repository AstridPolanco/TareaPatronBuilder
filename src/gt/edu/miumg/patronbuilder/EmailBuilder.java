package gt.edu.miumg.patronbuilder;

import java.util.ArrayList;
import java.util.List;

public class EmailBuilder {
    protected List<String> destinatarios;
    protected String asunto;
    protected String cuerpo;
    protected List<String> adjuntos;


    public EmailBuilder() {
        this.destinatarios = new ArrayList<>();
        this.adjuntos = new ArrayList<>();
    }
    public EmailBuilder addDestinatario(String destinatario) {
        this.destinatarios.add(destinatario);
        return this;
    }
    public EmailBuilder setAsunto(String asunto) {
        this.asunto = asunto;
        return this;
    }
    public EmailBuilder setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
        return this;
    }
    public EmailBuilder addAdjunto(String adjunto) {
        this.adjuntos.add(adjunto);
        return this;
    }
    public Email build() {
        return new Email(this);
    }
}
