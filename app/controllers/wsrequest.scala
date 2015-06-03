def wsrequest = WebSocket.using[Array[Byte]] { request =>
 
  // Create the outbound value that is called for each
  val out = Enumerator.imperative[Array[Byte]]();
 
 val in = Iteratee.foreach[Array[Byte]](content => {
	   out.push(FaceDetect.detect(content));
  })
 
  // tie the in and out values to each other
  (in, out)
}