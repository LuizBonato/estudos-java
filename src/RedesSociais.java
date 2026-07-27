public class RedesSociais implements ServicoMensagem {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Mensagem: " + mensagem);
    }
}