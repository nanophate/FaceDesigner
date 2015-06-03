package controllers;

import play.*;
import play.mvc.*;
import java.lang.String;
import play.mvc.Result;
import play.mvc.WebSocket;


import views.html.*;
import controllers.scala.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Welcome to FaceDesigner"));
    }
  public static Result videoJs(){
        return ok(views.js.video.render());
    }
}