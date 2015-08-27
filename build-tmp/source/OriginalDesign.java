import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

PImage img;
public void setup()
{
size(870,485);
background(0);
noStroke();
noLoop();
img = loadImage("light.png");
}

public void draw()
{
  ellipse(250,250,170,200);
  rect(235, 320, 30, 50);
}

public void mousePressed()
{
  background(img);
  fill(255,255,0);
  ellipse(250,250,170,200);
  rect(235, 320, 30, 50);
  stroke(255,255,0);
  line(140,200,90,170);
  line(195,150,160,120);
  line(250,125,250,85);
  line(305,150, 340,120);
  line(360,200,410,170);
  redraw();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
