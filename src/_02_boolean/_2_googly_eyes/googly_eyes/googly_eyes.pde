   PImage face;
   int num= 100;
   int pan=114;
void setup() {
  face = loadImage("panda.png");
 size(800,600);
    face.resize(width,height);
   
}

void draw() {
   background(face);
  if(mousePressed){
    println(mouseX + " " + mouseY);
  }
  fill(255,255,255);
  ellipse(292,220,100,110);
  fill(255,255,255);
  ellipse(459,167,80,90);
  fill(#1A1313);
  if(mouseX>266&&mouseX<320&&mouseY>185&&mouseY<253){
   num=mouseX;
   pan=mouseY;
   
  }
  
  
  
  
  
  ellipse(num,pan,50,50);
  ellipse(num+150,pan-50,45,45);
}
