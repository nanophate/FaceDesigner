package models;

import play.*;
import play.mvc.*;
import play.libs.*;

import akka.actor.UntypedActor;

public class t extends UntypedActor {
    WebSocket.In<String> in;
    WebSocket.Out<String> out;

    public t(WebSocket.In<String> in, WebSocket.Out<String> out) {
        this.in = in;
        this.out = out;
    }