var video = document.querySelector('video');
    var ctx;
    navigator.webkitGetUserMedia("video",
            function(stream) {
                video.src = webkitURL.createObjectURL(stream);
            },
            function(err) {
                console.log("Unable to get video stream!")
            }
    )