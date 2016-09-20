import processing.core.PApplet;

public class Central {
double cercano;
 int este;
 int NUsuario=0;
 boolean EncontradoT=false;
 
 float PcuentaIX;float PcuentaFX;
 float PcuentaIY;float PcuentaFY;
 
 PApplet parent;
public Central(PApplet p){
parent = p;
}
//busca_taxi_cercano
void buscarTaxi( float buscandoX,float buscandoY){
 this.PcuentaIX=buscandoX;this.PcuentaIY=buscandoY;
cercano=600;
 if((Principal.usuarios[Principal.h].ADestino==false)&&(Principal.usuarios[Principal.h].NTaxi==false)&&
 (EncontradoT==false)){
  for(int i=0; i<Principal.taxis.length; i++){
  
  if (Math.sqrt(
  (Math.pow((Principal.taxis[i].posX-buscandoX),2)+
  (Math.pow((Principal.taxis[i].posY-buscandoY),2))))
  
  <cercano){cercano=
  
  (Math.sqrt(
  (Math.pow((Principal.taxis[i].posX-buscandoX),2)+
  (Math.pow((Principal.taxis[i].posY-buscandoY),2)))));
este=i;}
  
  }
 
  EncontradoT=true;
  Principal.taxis[este].reservado=true;
  Principal.taxis[este].destinoX=buscandoX;
  Principal.taxis[este].destinoY=buscandoY;
  
 }
  
  
  
 
}
//Le_dice_a_que_direccion_va
void dirigirTaxi(float direccionX, float direccionY){
this.PcuentaFX=direccionX;this.PcuentaFY=direccionY;
Principal.taxis[este].direccionX=direccionX;
Principal.taxis[este].direccionY=direccionY;
}
//Saca_cuentas_de_ganancias
    void Cuentas(){
     System.out.println("El usuario "+Principal.h+" debe "+
     Math.ceil((Math.sqrt(
  (Math.pow((PcuentaIX-PcuentaFX),2)+
  (Math.pow((PcuentaIY-PcuentaFY),2)))))/25)+" pesos al taxi "+este);
     
    }

}
