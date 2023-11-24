# Algoritmo A* - Práctica de búsqueda heurística sin adversarios

Este proyecto implementa el algoritmo de búsqueda A* en Java, utilizando código proporcionado por Justin Wetherell en su repositorio de algoritmos y estructuras de datos. A lo largo del desarrollo, se creó una clase principal llamada Main que actúa como punto de entrada para el programa de práctica.

## Contenido del repositorio

El repositorio contiene los siguientes elementos principales:

1. Código A en Java:*

Se ha clonado el código fuente de los algoritmos y estructuras de datos de Justin Wetherell desde su repositorio en Github.

        ```bash
        git clone https://github.com/phishman3579/java-algorithms-implementation.git
    
2. Clase Principal (Main.java):

Se ha desarrollado una clase principal llamada Main, que sirve como punto de entrada para el programa. Inicialmente, el código proporciona una salida simple para verificar el    correcto funcionamiento.

        ```java
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


## Preguntas

1. ¿Qué variable representa la lista ABIERTA?
    La variable que representa la lista "abierta" en la implementación del algoritmo "AStar" es "openSet"

3. ¿Qué variable representa la función g?
   La variable que representa la la función 'g' es "gScore"
   
5. ¿Qué variable representa la función f?
   La variable que representa la la función 'f' es "fScore"

6. ¿Qué método habría que modificar para que la heurística representara la distancia aérea entre vértices?
   El método es heuristicCostEstimate()
   
8. ¿Realiza este método reevaluación de nudos cuando se encuentra una nueva ruta a un determinado vértice? Justifique la respuesta.
    Sí, dentro de la clase privada "reconstructPath()", el algoritmo reevalúa todos los nudos dentro del bucle while

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
