
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

import com.ittg.arbolesModificados.PilaVector;

public class Principal {

    public static void main(String[] args) throws Exception {

        Nodo a1, a2, a, a3, a4, a5, b, c;
        PilaVector pila = new PilaVector();

        a1 = ArbolBinario.nuevoArbol(null, "Maria", null);
        a2 = ArbolBinario.nuevoArbol(null, "Rodrigo", null);
        a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);

        pila.insertar(a);
        a4 = ArbolBinario.nuevoArbol(null, "Anyora", null);
        a5 = ArbolBinario.nuevoArbol(null, "Abel", null);
        a3 = ArbolBinario.nuevoArbol(a4, "M Jesus", a5);

        pila.insertar(a);
        a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);

        ArbolBinario arbol = new ArbolBinario(a);
        Nodo no = new Nodo();
        System.out.println("RECORRIDO PREORDEN");
        a.imprimir();
        System.out.print("---> ");
        arbol.preorden(a);
        System.out.print("---> ");
        arbol.preorden(a3);
        System.out.println("\n\nRECORRIDO INORDEN");
        arbol.inorden(a);
        System.out.print("--->");
        a.imprimir();
        System.out.print("--->");
        arbol.inorden(a3);
        System.out.println("\n\nRECORRIDO POSTORDEN");
        arbol.postorden(a);
        System.out.print("--->");
        arbol.postorden(a3);
        System.out.print("--->");
        a.imprimir();

    }
}
