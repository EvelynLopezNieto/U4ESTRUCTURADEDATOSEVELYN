
/*
                INSTITUTO TECNOLOGICO DE TUXTLA GUTIERREZ
                        EXT. VENUSTIANO CARRANZA
                     ING. SISTEMAS COMPUTACIONALES
                            EVELYN LOPEZ NIETO
                              3er SEMESTRE
	         ESTRUCTURA DE DATOS
UNIDAD 3 examen
16/11/2018 */
package com.ittg.arbolesModificados;

//clase para el árbol binario
public class ArbolBinario {

    //se declara la variable raíz para que se pueda hacer referencia
    protected Nodo raiz;

    //colocamos en el constructor la variable
    public ArbolBinario() {
        raiz = null;
    }

    //le pasamos un parámetro para que se pueda hacer referencia en otra clase
    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }
//declaramos un método que enlaza la clase Nodo
    public Nodo raizArbol() {
        return raiz;
    }
    
    // Comprueba el estatus del árbol
    boolean esVacio() {
        return raiz == null;
    }

    //aquí se hace la inserción de los nodos que conectan a la clase Nodo y a esta clase
    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha) {
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }

    //creamos los métodos para hacer los recorrdidos
    //pasando como parámetro un objeto de la clase Nodo para que se puedan enlazar
    public void preorden(Nodo r) {
        if (r != null) {
            r.imprimir();
            System.out.print("|-> ");
            preorden(r.subarbolIzdo());
            preorden(r.subarbolDcho());
        }
    }

    public void inorden(Nodo r) {
        if (r != null) {
            inorden(r.subarbolIzdo());
            System.out.print("|-> ");
            r.imprimir();
            inorden(r.subarbolDcho());
        }
    }

    public void postorden(Nodo r) {
        if (r != null) {
            postorden(r.subarbolIzdo());
            System.out.print("|-> ");
            postorden(r.subarbolDcho());
            r.imprimir();
        }
    }
}
