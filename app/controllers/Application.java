package controllers;

import play.*;
import play.mvc.*;
import java.lang.String;
import play.mvc.Result;
import play.mvc.WebSocket;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Welcome to FaceDesigner"));
    }
    public static Result videoJs(){
        return ok(views.js.video.render());
    }
    public static WebSocket<JsonNode> index)(dataBlob) {
      return new WebSocket<JsonNode>() {

        
        // Called when the Websocket Handshake is done.
        public void onReady(WebSocket.In<JsonNode> in, WebSocket.Out<JsonNode> out){

            /*// Join the chat room.
            try { 
                ChatRoom.join(username, in, out);
            } catch (Exception ex) {
                ex.printStackTrace();
            }*/
        }
    };
}
}
//https://devcenter.heroku.com/articles/play-java-websockets
//https://www.playframework.com/documentation/2.2.x/JavaWebSockets