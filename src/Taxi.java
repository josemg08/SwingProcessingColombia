import processing.core.PApplet;
public class Taxi{
float posX;
float posY;
float vel1=1;
float vel2=-1;
boolean reservado=false;
boolean NCamino=false;
float destinoX;float destinoY;
float direccionX; float direccionY;
PApplet parent;
public Taxi (PApplet p,float posX, float posY){
 this.posX=posX;
 this.posY=posY;
 parent = p;
}

void displayTaxi(){
parent.stroke(255,255,0);
 parent.line(posX,posY,posX,posY);
}

void moverTaxi(){
/**------Cuando_aun_no_fue_llamado-----*/
if((reservado==false)&&(NCamino==false)){
/**------Movimiento_aleatorio_princpio-----*/
if(parent.random(1)<0.6){
posX=posX+vel1;}
else{ posX=posX+vel2;}
if(parent.random(1)<0.6){
posY=posY+vel1;}
else{ posY=posY+vel2;}

/**------Movimiento_al_llegar_al_axtremo-----*/
if((posX>parent.width-5)||(posY>parent.height-5)){
 vel1=-1;
 vel2=1;
 
 if(parent.random(1)<0.6){
posX=posX+vel1;}
else{ posX=posX+vel2;}
if(parent.random(1)<0.6){
posY=posY+vel1;}
else{ posY=posY+vel2;}
}
/**------Y_luego_el_otro_extremo-----*/
if((posX<5)||(posY<5)){
vel1=1;
vel2=-1;
}
}
/**------Luego_de_ser_llamado-----*/
if((reservado==true)&&(NCamino==false)){
 if(posX<destinoX){posX=posX+1;}
 if(posX>destinoX){posX=posX-1;}
 
 if(posY<destinoY){posY=posY+1;}
 if(posY>destinoY){posY=posY-1;}
 
 if((posX==destinoX)&&(posY==destinoY)){
 reservado=false;NCamino=true;
 Principal.usuarios[Principal.h].NTaxi=true;}

}
/**------Cuando_llega_a_destino-----*/
if((NCamino==true)&&(reservado==false)){
if(posX<direccionX){posX=posX+1;}
if(posX>direccionX){posX=posX-1;}
 
if(posY<direccionY){posY=posY+1;}
if(posY>direccionY){posY=posY-1;}
if((posX==direccionX)&&(posY==direccionY)){
 NCamino=false;
 Principal.usuarios[Principal.h].ADestino=true;
}
}}}
