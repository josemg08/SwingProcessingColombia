import processing.core.*;
import javax.swing.JOptionPane;
public class Principal extends PApplet{

static Taxi[] taxis = new Taxi[50];
static Usuario[] usuarios = new Usuario[1];
Central central=new Central(this);
static int h=0;
int k=0;
public void setup(){
 size(500,500);
 noFill();
 smooth();
 strokeWeight(2);
 for(int i=0; i<taxis.length; i++){
 taxis[i]= new Taxi(this, ceil(random(500)), ceil(random(500)));
 
 usuarios[0]= new Usuario(this, ceil(random(500)),ceil(random(500)));
 }
}
public void draw(){
background(0);
 for(int i=0; i<taxis.length; i++){
 taxis[i].displayTaxi();
 taxis[i].moverTaxi();
 
 }
   usuarios[h].displayUsuario();
   if(usuarios[h].ADestino==false){
   central.buscarTaxi(usuarios[h].posX,usuarios[h].posY);}
   
   if(usuarios[h].ADestino==true){
   
central.Cuentas();}
   
   for(int i=0; i<usuarios.length; i++){usuarios[i].displayUsuario();}
   NUsuario_o_direccion();
   
 }
//crea_usuario_y_da_direccion
 void NUsuario_o_direccion(){
 if (usuarios[h].ADestino==true){
 Usuario N=new Usuario(this, ceil(random(500)),ceil(random(500)));
 usuarios=(Usuario[]) append(usuarios, N);
 h=h+1;k=0;central.EncontradoT=false;}
 
 if(usuarios[h].NTaxi==true){while(k==0){
 String dato1 = JOptionPane.showInputDialog("Digite coordenadas X entre 0 y 500");
float x=Float.parseFloat(dato1);
while((x>500)||(x<0)){dato1 = JOptionPane.showInputDialog("Incorrecto digite X nuevamente");
x=Float.parseFloat(dato1);}
 String dato2 = JOptionPane.showInputDialog("Digite coordenadas Y entre 0 y 500");
float y=Float.parseFloat(dato2);
while((y>500)||(y<0)){dato2 = JOptionPane.showInputDialog("Incorrecto digite Y nuevamente");
y=Float.parseFloat(dato2);}
 central.dirigirTaxi(x,y);
 
 usuarios[h].direccionX=x;
 usuarios[h].direccionY=y;
 k=1;
 }}
 }
/**
* 
*/
private static final long serialVersionUID = 1L;
}