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

public class H_jhus extends PApplet {

//Årsprøve - Programmering B
//Test #4 - Lys i højhuset
//Animer et højhus på 5 etager og 10 vinduer på hver etage. Når du trykker på et vindue skal lyset i rummet enten tænde eller slukke. 
//Der skal også animeres en sol og en måne. Når man trykker på månen skal den skifte til sol og omvendt.

//Teoretisk spørgsmål
//Forklar hvad kode-blokke eller "scopes" er, og hvilken betydning har de for variabler. Giv gerne eksempler.

Vindue v;
Himmel h;

public void setup() {
  
  v = new Vindue();
  h = new Himmel();
}

public void draw() {
  background(179, 218, 255); 
  rectMode(CENTER);
  //Hus
  fill(175, 163, 138);
  rect(1000, 1250, 1500, 1500);
  v.display();
  h.display();
  //Dør
  fill(90, 90, 90);
  rect(1000, 1400, 70, 125);
  //Grund
  fill(155, 224, 152);
  rect(1000, 1485, 2000, 70);


  //Sol til måne
  if (mousePressed == true) {
    fill(227, 226, 218);
  } else {
    fill(255, 235, 13);
  }
  ellipse(1800, 150, 150, 150);


  //Lys i vinduer

  //1. sal
  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(350, 1270, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(490, 1270, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(630, 1270, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(770, 1270, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(910, 1270, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1090, 1270, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1230, 1270, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1370, 1270, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1510, 1270, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1650, 1270, 70, 70);


  //2. sal
  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(350, 1130, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(490, 1130, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(630, 1130, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(770, 1130, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(910, 1130, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1090, 1130, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1230, 1130, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1370, 1130, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1510, 1130, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1650, 1130, 70, 70);


  //3. sal
  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(350, 990, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(490, 990, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(630, 990, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(770, 990, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(910, 990, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1090, 990, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1230, 990, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1370, 990, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1510, 990, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1650, 990, 70, 70);


  //4. sal
  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(350, 850, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(490, 850, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(630, 850, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(770, 850, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(910, 850, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1090, 850, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1230, 850, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1370, 850, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1510, 850, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1650, 850, 70, 70);


  //5. sal
  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(350, 710, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(490, 710, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(630, 710, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(770, 710, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(910, 710, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1090, 710, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1230, 710, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1370, 710, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1510, 710, 70, 70);

  if (mousePressed == true) {
    fill(254, 255, 13);
  } else {
    fill(41, 41, 41);
  }
  rect(1650, 710, 70, 70);
}
class Himmel {

  float x;
  float y;

  public void display() {
    stroke(0);
    fill(255, 235, 13);
    ellipse(1800, 150, 150, 150);
  }
}
class Vindue {

  float x;
  float y;

  public void display() {
    stroke(0);
    fill(41, 41, 41);
    //1. sal
    rect(350, 1270, 70, 70);
    rect(490, 1270, 70, 70);
    rect(630, 1270, 70, 70);
    rect(770, 1270, 70, 70);
    rect(910, 1270, 70, 70);
    rect(1090, 1270, 70, 70);
    rect(1230, 1270, 70, 70);
    rect(1370, 1270, 70, 70);
    rect(1510, 1270, 70, 70);
    rect(1650, 1270, 70, 70);
    //2. sal
    rect(350, 1130, 70, 70);
    rect(490, 1130, 70, 70);
    rect(630, 1130, 70, 70);
    rect(770, 1130, 70, 70);
    rect(910, 1130, 70, 70);
    rect(1090, 1130, 70, 70);
    rect(1230, 1130, 70, 70);
    rect(1370, 1130, 70, 70);
    rect(1510, 1130, 70, 70);
    rect(1650, 1130, 70, 70);
    //3. sal
    rect(350, 990, 70, 70);
    rect(490, 990, 70, 70);
    rect(630, 990, 70, 70);
    rect(770, 990, 70, 70);
    rect(910, 990, 70, 70);
    rect(1090, 990, 70, 70);
    rect(1230, 990, 70, 70);
    rect(1370, 990, 70, 70);
    rect(1510, 990, 70, 70);
    rect(1650, 990, 70, 70);
    //4. sal
    rect(350, 850, 70, 70);
    rect(490, 850, 70, 70);
    rect(630, 850, 70, 70);
    rect(770, 850, 70, 70);
    rect(910, 850, 70, 70);
    rect(1090, 850, 70, 70);
    rect(1230, 850, 70, 70);
    rect(1370, 850, 70, 70);
    rect(1510, 850, 70, 70);
    rect(1650, 850, 70, 70);
    //5. sal
    rect(350, 710, 70, 70);
    rect(490, 710, 70, 70);
    rect(630, 710, 70, 70);
    rect(770, 710, 70, 70);
    rect(910, 710, 70, 70);
    rect(1090, 710, 70, 70);
    rect(1230, 710, 70, 70);
    rect(1370, 710, 70, 70);
    rect(1510, 710, 70, 70);
    rect(1650, 710, 70, 70);
  }
}
  public void settings() {  size(2000, 1500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "H_jhus" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
