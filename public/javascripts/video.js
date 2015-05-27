video = document.querySelector('video');
var constraints = {
  audio: false,
  video: true
};
    navigator.getUserMedia = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia;  
      function successCallback(stream) {
        video.src = webkitURL.createObjectURL(stream);
      }
      function errorCallback(error) {
        console.log("Unable to get video stream!")
      }
navigator.getUserMedia(constraints, successCallback, errorCallback);