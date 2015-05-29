package controllers;

import play.*;
import play.mvc.*;
import java.lang.String.*;
import play.mvc.Result;
import play.mvc.WebSocket;
//import models.t;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }
    public static Result videoJs(){
        return ok(views.js.video.render());
    }
}
//https://devcenter.heroku.com/articles/play-java-websockets
//https://www.playframework.com/documentation/2.2.x/JavaWebSockets