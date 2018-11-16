
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

//clase Nodo que definirá los nodos hijos y la raíz del árbol binario
public class Nodo {

    //variables declaradas para esta clase
    protected Object dato;//esta variable hará referencia a la raíz
    protected Nodo izdo;//esta variable hará referencia al nodo hijo izquierdo
    protected Nodo dcho;//esta variable hará referencia al nodo hijo derecho

    //constructor vacío
    public Nodo() {
    }

    //este contructor asigna parámetros como valor inicial de las variables
    public Nodo(Object valor) {
        dato = valor;
        izdo = dcho = null;
    }

    //aquí se declaran variables parámetro para hacer referencia a las variables de esta clase
    //en las otras clases donde se utilizarán
    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }

    //mandamos un valor al nodo como objeto
    //operaciones de acceso
    public Object valorNodo() {
        return dato;
    }

    public Nodo subarbolIzdo() {
        return izdo;
    }

    public Nodo subarbolDcho() {
        return dcho;
    }

    public void nuevoValor(Object d) {
        dato = d;
    }

    public void ramaIzdo(Nodo n) {
        izdo = n;
    }

    public void ramaDcho(Nodo n) {
        dcho = n;
    }
//con este se imprime el valor dato que hace una referencia a la raíz del árbol
    public void imprimir() {
        System.out.print(dato + " ");
    }
}
