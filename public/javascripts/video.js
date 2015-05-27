video = document.querySelector('video');  //look for tags indicated video
//var canvas = document.querySelector('canvas')
var canvas = $("#snap-source");  //jQuery get method
var constraints = {  //limit data going
  audio: false,
  video: true
};
//preparing web socket
var ws = new WebSocket("ws://face-designer.herokuapp.com:8080");
  ws.onopen = function () {
  console.log("Openened connection to websocket");
  }
//preparing to turn the camera media on
    navigator.getUserMedia = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia;  //Multiple web broser support
      function successCallback(stream) {
        video.src = URL.createObjectURL(stream);  //get thing the src"http://asskao0-..."
      }
      function errorCallback(error) {
        console.log("Unable to get video stream!")
      }
//main thats doing the function and calling parms
navigator.getUserMedia(constraints, successCallback, errorCallback);  
//capture the video and snap invervaly then send the data using websocket to the server
timer = setInterval(  
      function () {
        var ctx = canvas.get(0)[0].getContext('2d');  //d.graph similar thing
        ctx.drawImage(video, 0, 0, 320, 240);
        var data = canvas.get()[0].toDataURL('image/jpeg', 1.0);
        newblob = dataURItoBlob(data);
        ws.send(newblob);
      }, 250);



//http://stackoverflow.com/questions/4998908/convert-data-uri-to-file-then-append-to-formdata/5100158