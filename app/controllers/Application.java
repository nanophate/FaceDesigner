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
    def websocket = WebSocket.using[String] { request => 

    // Log events to the console
    val in = Iteratee.foreach[String](println).mapDone { _ =>
      println("Disconnected")
    }

    // Send a single 'Hello!' message
    val out = Enumerator("Hello!")

    (in, out)
  }
}