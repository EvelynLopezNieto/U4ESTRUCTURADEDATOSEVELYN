
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

import java.util.Vector;

//esta clase nos servirá para poder guardar los datos que se van a ingresar en el árbol
public class PilaVector {

    //declaramos las variables
    private static final int INICIAL = 19;
    private int cima;
    private Vector listaPila;

    //ingresamos valores a las variables en el constructor
    public PilaVector() {
        cima = -1;
        listaPila = new Vector(INICIAL);
    }

    //este método nos servirá para insertar un objeto que está enlazado
    public void insertar(Object elemento) throws Exception {
        cima++;
        listaPila.addElement(elemento);
    }
//este método nos servirá para eliminar los datos de la pila
    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        aux = listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        return listaPila.elementAt(cima);
    }
//lógica para comprobar si la pila está vacía
    public boolean pilaVacia() {
        return cima == -1;
    }

    //este nos servirá para limpiar la pila
    public void limpiarPila() throws Exception {
        while (!pilaVacia()) {
            quitar();
        }
    }
}
