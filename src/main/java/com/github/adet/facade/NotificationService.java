package com.github.adet.facade;

public class NotificationService {

    public void send(String message, String target) {
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("0.0.0.0");
        AuthToken authToken = server.authenticate("backend-app", "service-deposit");
        server.send(authToken, new Message(message), "target");
        connection.disconnect();
    }
}
