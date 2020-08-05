

int num=245;
int wal=273;

void setup() {
  
  //Find a Where's Waldo picture and drop it into this sketch.     
  PImage waldo = loadImage("waldo.png");
  waldo.resize(500,500);// Change this to match your file name.
  size(440, 440); // Change this to match the size of your waldo picture
  image(waldo, 0, 0);

  

    
  
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo when you press the mouse
      // println("X: " + mouseX + " Y: " + mouseY); 


      // If the mouse is on Waldo, print “Waldo found!”

if(mouseX>237&&mouseY<325&&mouseX>266&&mouseY<280){
 
  if(mousePressed){
    println(mouseX + " " + mouseY);
  System.out.print("Waldo found");
  }
}
}
