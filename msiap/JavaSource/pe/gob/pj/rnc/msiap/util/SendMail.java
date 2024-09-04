package pe.gob.pj.rnc.msiap.util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import pe.gob.pj.util.Mensaje;

public class SendMail {


    private static int port;// = 465;
    private static String host;// = "smtp.example.com";
    private static String from;// = "matt@example.com";
    private static boolean auth = false;
    private static String username;// = "user@example.com";
    private static String password;// = "secretpw";
    private static Protocol protocol;// = Protocol.SMTPS;
    private static boolean debug;// = true;

    static{
    	host = Mensaje.getString("msiap.email.host");//"172.18.11.170";//"172.19.0.176";
    	port = Integer.parseInt(Mensaje.getString("msiap.email.port"));//25;
    	from = Mensaje.getString("msiap.email.from");//"sinoe@pj.gob.pe";
    	protocol = Protocol.SMTP;
    	username = Mensaje.getString("msiap.email.username");
    	password = Mensaje.getString("msiap.email.password");
    	debug = Boolean.parseBoolean(Mensaje.getString("msiap.email.debug"));//true;
    }

    public static void sendEmail(String to, String subject, String body) {
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        switch (protocol) {
            case SMTPS:
                props.put("mail.smtp.ssl.enable", true);
                break;
            case TLS:
                props.put("mail.smtp.starttls.enable", true);
                break;
			case SMTP:
				break;
			default:
				break;
        }

        Authenticator authenticator = null;
        if (auth) {
            props.put("mail.smtp.auth", true);
            authenticator = new Authenticator() {
                private PasswordAuthentication pa = new PasswordAuthentication(username, password);
                @Override
                public PasswordAuthentication getPasswordAuthentication() {
                    return pa;
                }
            };
        }

        Session session = Session.getInstance(props, authenticator);
        session.setDebug(debug);

        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            message.setRecipients(Message.RecipientType.TO, address);
            message.setSubject(subject);
            message.setSentDate(new Date());
            //message.setText(body);

            Multipart multipart = new MimeMultipart("alternative");
//
//            MimeBodyPart textPart = new MimeBodyPart();
//            String textContent = "Hi, Nice to meet you!";
//            textPart.setText(textContent);

            MimeBodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent(body, "text/html; charset=UTF-8");

            //multipart.addBodyPart(textPart);
            multipart.addBodyPart(htmlPart);
            message.setContent(multipart);

            Transport.send(message);
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }
}
