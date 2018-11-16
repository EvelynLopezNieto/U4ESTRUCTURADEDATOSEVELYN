
package com.ittg.arboles;

public class NodoArbol {
    NodoArbol nodoIzq;
    NodoArbol nodoDer;
    int datos;

    public NodoArbol(){
        
    }
    public NodoArbol(int datosNodo) {
        datos=datosNodo;
        nodoIzq=nodoDer=null;
    }
    public NodoArbol getNodoDer() {
        return nodoDer;
    }
    public void setNodoDer(NodoArbol nodoDer) {
        this.nodoDer = nodoDer;
    }
    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }
    public void setNodoIzq(NodoArbol nodoIzq) {
        this.nodoIzq = nodoIzq;
    }
    public int getDatos() {
        return datos;
    }
    public void setDatos(int datos) {
        this.datos = datos;
    }
    
    public void insertar(int valorInsertar){
        //rama izquierda
        if(valorInsertar<datos){
            if(nodoIzq==null){
                nodoIzq=new NodoArbol(valorInsertar);
                
            }else{
                nodoIzq.insertar(valorInsertar);
            }
        }else if(valorInsertar>datos){
            if(nodoDer==null){
                nodoDer=new NodoArbol(valorInsertar);
            }else{
                nodoDer.insertar(valorInsertar);
            }
        }
    }
    
    public void imprimir(){
        System.out.println(datos+"  ");
    }
}
