/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotificadora;

/**
 *
 * @author Juan Zepeda
 */
public class Terreno {
    private double largo, ancho, precio;
ProyectoNotificacion h=new ProyectoNotificacion();
    public Terreno(double largo, double ancho, double precio) {
        this.largo = largo;
        this.ancho = ancho;
        this.precio = precio;
    }



   

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getPrecio() {
        return precio;
    }
    
    public double getArea()
    {
        return largo*ancho;
    }
    
    public double getPrecioTotal()
    {
        return precio + (precio * 0.15);
    }
    
    public boolean Ocupado(int x, int y){
       if(h.terrenos[x][y]==null){

    
     return true;
       }else{
      return false;
       
       }
        
       
    
    
    
    }
    
    
    
    public void printTerreno()
    {
        System.out.println("Largo: "+getLargo()+", Ancho: "+getAncho()+", Area: "+getArea()+" Mts2, Precio: L. "+getPrecioTotal());
    }
    
}
