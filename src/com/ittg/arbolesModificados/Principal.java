
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

        //creamos las variables nodo para guarden los valores que a la vez están enlazados con las demás clases
        Nodo a1, a2, a, a3, a4, a5, b, c;
        //instanciamos la clase PilaVector para poder insertar los datos a la pila
        PilaVector pila = new PilaVector();

        //los nodos declarados guardarán un dato que también está guardado en la clase del arbol
        a1 = ArbolBinario.nuevoArbol(null, "Maria", null);
        a2 = ArbolBinario.nuevoArbol(null, "Rodrigo", null);
        a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
        //esta parte hará insertar otro bucle de datos como parte de otra rama del arbol en la pila
        pila.insertar(a);
        a4 = ArbolBinario.nuevoArbol(null, "Anyora", null);
        a5 = ArbolBinario.nuevoArbol(null, "Abel", null);
        a3 = ArbolBinario.nuevoArbol(a4, "M Jesus", a5);
        //aquí se hará la inserción de la raíz o nodo padre
        pila.insertar(a);
        a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);

        //en esta parte está declarada la clase arbol binario para mandar a llamar los recorridos
        //como ya existe un objeto nodo de la clase Nodo, mandamos a llamar el dato guardado para el nodo padre
        ArbolBinario arbol = new ArbolBinario(a);
        
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
