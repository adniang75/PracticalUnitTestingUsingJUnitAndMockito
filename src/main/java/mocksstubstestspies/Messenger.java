package mocksstubstestspies;

public class Messenger {

    private TemplateEngine templateEngine;
    private MailServer     mailServer;

    public Messenger( MailServer mailServer, TemplateEngine templateEngine ) {
        super();
        this.templateEngine = templateEngine;
        this.mailServer = mailServer;
    }

    public void sendMessage( Client client, Template template ) {
        String msgContent = templateEngine.prepareMessage( template, client );
        mailServer.send( client.getEmail(), msgContent );
    }

}
