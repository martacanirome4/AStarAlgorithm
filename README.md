# Algoritmo A* - Práctica de búsqueda heurística sin adversarios

Este proyecto implementa el algoritmo de búsqueda A* en Java, utilizando código proporcionado por Justin Wetherell en su repositorio de algoritmos y estructuras de datos. A lo largo del desarrollo, se creó una clase principal llamada Main que actúa como punto de entrada para el programa de práctica.

## Contenido del repositorio

El repositorio contiene los siguientes elementos principales:

1. Código A en Java:*

Se ha clonado el código fuente de los algoritmos y estructuras de datos de Justin Wetherell desde su repositorio en Github.

        ``bash
        git clone https://github.com/phishman3579/java-algorithms-implementation.git
    
2. Clase Principal (Main.java):

Se ha desarrollado una clase principal llamada Main, que sirve como punto de entrada para el programa. Inicialmente, el código proporciona una salida simple para verificar el    correcto funcionamiento.

        ``java
        package aplicacion;
    
        import com.jwetherell.algorithms.data_structures.Graph;
        import com.jwetherell.algorithms.data_structures.Graph.Edge;
        import com.jwetherell.algorithms.data_structures.Graph.TYPE;
        import com.jwetherell.algorithms.data_structures.Graph.Vertex;
        
        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Iterator;
        import java.util.List;
        import java.util.Map;
        
        import com.jwetherell.algorithms.graph.*;
        
        public class Main {
            // Programa que genera un camino aplicando el algoritmo A estrella (implementado en la clase AStar)
            public static void main(String[] args) {
                UndirectedGraph g = new UndirectedGraph();
                System.out.println(g.graph);
                AStar<Integer> aStar = new AStar<Integer>();
                List<Graph.Edge<Integer>> path = aStar.aStar(g.graph, g.v1, g.v5);
                System.out.println(path);
            }
        
            private static class UndirectedGraph {
               /// definir grafo
            }
        
    }


Para verificar la funcionalidad, se puede ejecutar el comando desde el directorio del proyecot:

        ```bash
        ant run_main

3. Generación del camino A*

   - Siguiendo la referencia de los tests en Graphs.java, se ha desarrollado un programa principal que utiliza el algoritmo A* para generar un camino entre dos vértices.


## Preguntas y Respuestas

1. Lista ABIERTA:
La lista ABIERTA, que almacena los nodos candidatos para la expansión, se representa mediante la variable openSet (o una similar) en el código A*.

2. Función g:
La función g, que representa el costo acumulado desde el nodo inicial hasta el nodo actual, se refleja comúnmente en una variable llamada g dentro del contexto de un nodo.

3. Función f:
La función f, que es la función de evaluación total utilizada para determinar qué nodo se expandirá, se representa mediante la variable f (o similar) en el contexto de un nodo.

4. Modificación de Heurística:
La modificación de la heurística para representar la distancia aérea entre vértices se realizaría en el método encargado de calcular la heurística, comúnmente llamado calculateHeuristic o h en el código.

5. Reevaluación de Nodos:
Sí, el método responsable de la reevaluación de nodos se encuentra en la lógica de expansión de nodos y actualización de costos acumulados, probablemente bajo un nombre como updateNode. Este proceso garantiza que se utilice la ruta más eficiente hasta el momento para llegar a cada nodo.


## Licencia

Copyright 2023 Marta Canino Romero

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
