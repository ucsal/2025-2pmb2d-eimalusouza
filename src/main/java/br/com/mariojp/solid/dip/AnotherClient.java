package br.com.mariojp.solid.dip;

public class AnotherClient implements MailSender {
	public void send(String to, String subject, String body) {
		if(to == null || !to.contains("@")) throw new IllegalArgumentException("Email invalido");
	}

}
