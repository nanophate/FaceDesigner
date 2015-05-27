video = document.querySelector('video');  //look for tags indicated video
var constraints = {  //limit data going
  audio: false,
  video: true
};
    navigator.getUserMedia = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia;  //Multiple web broser support
      function successCallback(stream) {
        video.src = URL.createObjectURL(stream);  //get thing the src"http://asskao0-..."
      }
      function errorCallback(error) {
        console.log("Unable to get video stream!")
      }
navigator.getUserMedia(constraints, successCallback, errorCallback);  //main thats doing the function and the job