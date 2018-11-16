
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

public class ArbolBinario {

    protected Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo raizArbol() {
        return raiz;
    }
// Comprueba el estatus del árbol

    boolean esVacio() {
        return raiz == null;
    }

    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha) {
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }

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
