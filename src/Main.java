import gt.edu.miumg.patronbuilder.Email;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Email email = Email.builder()
                .addDestinatario("mariops1988@gmail.com")
                .addDestinatario("sofkitty0@gmail.com")
                .setAsunto("Entrevista de Trabajo")
                .setCuerpo("Estimado candidato, Nos complace informarle que ha sido preseleccionado para una entrevista de trabajo en nuestra empresa. \n" +
                        "A continuación, se detallan los datos de la entrevista: Fecha: 20 de septiembre de 2024. Hora: 10:00 AM \n" +
                        "Ubicación: Oficinas Centrales, Avenida Principal #123\n" +
                        "Por favor, confirme su asistencia respondiendo a este correo. Si tiene alguna duda, no dude en contactarnos.\n" +
                        "Atentamente,Departamento de Recursos Humanos, Empresa Pol00")
                .addAdjunto("cv.pdf")
                .build();
        System.out.println(email);
    }
}