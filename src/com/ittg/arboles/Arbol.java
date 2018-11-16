
package com.ittg.arboles;

public class Arbol {
    private NodoArbol raiz;

    public Arbol() {
        raiz=null;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }
    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
    
    public void insertarNodo(int valorInsertar){
        if(raiz==null){
            raiz=new NodoArbol(valorInsertar);
        }else{
            raiz.insertar(valorInsertar);
        }
    }
    
    public void preorden(NodoArbol a){
        if(a!=null){
            a.imprimir();
            preorden(a.getNodoIzq());
            preorden(a.getNodoDer());
        }
    }
    public void inorden(NodoArbol a){
        if(a!=null){
            inorden(a.getNodoIzq());
            a.imprimir();
            inorden(a.getNodoDer());
        }
    }
    public void postorden(NodoArbol a){
        if(a!=null){
            postorden(a.getNodoIzq());
            postorden(a.getNodoDer());
            a.imprimir();
        }
    }
    
    public static void main(String [] args){
        Arbol arbol=new Arbol();
        NodoArbol n=new NodoArbol();
        //arbol.imprimir();
        arbol.insertarNodo(7);
        arbol.insertarNodo(6);//izquierdo
        arbol.insertarNodo(8);//derecho
        n.imprimir();
        System.out.println();
        //Tarea: imprimir los datos del arbol
        //investigar qué es el recorrido inorden, postorden y preorden
    }
}
