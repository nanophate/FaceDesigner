
/*package javacv
package javacpp

import javacv.cpp.opencv_core._
import javacv.cpp.opencv_imgproc._
import javacv.cpp.opencv_highgui._
import javacv.cpp.opencv_objdetect._
import javacpp.BytePointer
import java.nio.ByteBuffer
import javax.imageio.ImageIO
import java.io.ByteArrayOutputStream
import scala.tools.nsc.io.VirtualFile
 
object FaceDetect {
 
	var CASCADE_FILE =PATH_TO_CASCADE_FILE;
  var minsize = 20;
	var group = 0;
	var scale = 1.1;
 
  def detect(imageData:Array[Byte]) : Array[Byte] = {
 

    var wrappedData = ByteBuffer.wrap(imageData);
    var originalImage = cvDecodeImage(cvMat(1, imageData.length,CV_8UC1, new BytePointer(wrappedData)));
 
    var grayImage = IplImage.create(originalImage.width(), originalImage.height(), IPL_DEPTH_8U, 1);
    cvCvtColor(originalImage, grayImage, CV_BGR2GRAY);
 
	var storage = CvMemStorage.create();
 
	var cascade = new CvHaarClassifierCascade(cvLoad(CASCADE_FILE));
	var faces = cvHaarDetectObjects(grayImage, cascade, storage, scale, group, minsize);
 
	for (i <- 0 until faces.total) {
	  var r = new CvRect(cvGetSeqElem(faces, i));
	  cvRectangle(originalImage, cvPoint(r.x, r.y),
					cvPoint(r.x + r.width(), r.y + r.height),
					CvScalar.YELLOW, 1, CV_AA, 0);
	}
 
	var bout = new ByteArrayOutputStream();
	var imgb = originalImage.getBufferedImage();
	ImageIO.write(imgb, "png", bout);
 
    bout.toByteArray()
  }
}*/