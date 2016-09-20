import processing.core.PApplet;

public class Usuario {
float posX;
float posY;
float direccionX;float direccionY;
float Llamador = 0;
boolean ADestino=false;
boolean NTaxi=false;
PApplet parent;
public Usuario(PApplet p, float posX, float posY){
   this.posX=posX;
   this.posY=posY;
   parent = p;
 }
void displayUsuario(){
if(NTaxi==false){
  parent.stroke(0,100,255);
parent.line(posX,posY,posX,posY);
if(Llamador < parent.width/32+15){
  parent.ellipse(posX,posY,0+Llamador,0+Llamador);
  Llamador = (float) (Llamador+0.5);}
  if (Llamador > parent.width/32){ 
   Llamador = Llamador-parent.width/32;}}
 
if(ADestino==true){
parent.stroke(0,100,255);
parent.line(direccionX,direccionY,direccionX,direccionY);}
}
 
}
