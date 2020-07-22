   PImage face;
void setup() {
  face = loadImage("panda.png");
 size(800,600);
    face.resize(width,height);
    background(face);
}

void draw() {
  if(mousePressed){
    println(mouseX + " " + mouseY);
  }
  fill(255,255,255);
  ellipse(292,220,100,110);
}
