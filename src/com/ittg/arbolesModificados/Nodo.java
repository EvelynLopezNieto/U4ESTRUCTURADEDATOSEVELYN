
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

public class Nodo {

    protected Object dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo() {
    }

    public Nodo(Object valor) {
        dato = valor;
        izdo = dcho = null;
    }

    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }

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

    public void imprimir() {
        System.out.print(dato + " ");
    }
}
