package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Result;
import play.mvc.WebSocket;
import models.t;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }
    public static WebSocket<String> index() {
    return new WebSocket<String>() {

        // Called when the Websocket Handshake is done.
        public void onReady(WebSocket.In<String> in, WebSocket.Out<String> out) {

            // For each event received on the socket,
            in.onMessage(new Callback<String>() {
                public void invoke(String event) {

                    // Log events to the console
                    System.out.println(event);

                }
            });

            // When the socket is closed.
            in.onClose(new Callback0() {
                public void invoke() {

                    System.out.println("Disconnected");

                }
            });

            // Send a single 'Hello!' message
            out.write("Hello!");

        }

    };
}
    public static Result videoJs(){
        return ok(views.js.video.render());
    }
}
