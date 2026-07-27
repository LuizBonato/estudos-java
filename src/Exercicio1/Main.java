package Exercicio1;

public class Main {
    public static void main(String[] args) {
        ServicoMensagem sms = new SMS();
        ServicoMensagem email = new Email();
        ServicoMensagem redesSociais = new RedesSociais();
        ServicoMensagem whatsapp = new WhatsApp();

        ServicoMensagem[] servicos = { sms, email, redesSociais, whatsapp };
        for (ServicoMensagem s : servicos) {
            s.enviar("Promoção imperdível!");
        }
        }
}