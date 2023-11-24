# Algoritmo A* - Práctica de búsqueda heurística sin adversarios

## **Introducción al Proyecto AStar en Java**

### **Descripción**

Este proyecto implementa el algoritmo de búsqueda A* en Java, utilizando el código proporcionado por Justin Wetherell en su repositorio de algoritmos y estructuras de datos. A lo largo del desarrollo, se ha creado una clase principal llamada `Main` que actúa como punto de entrada para el programa de la práctica.

### **Contenido del Repositorio**

1. **Código AStar en Java:**

Se ha clonado el código fuente de los algoritmos y estructuras de datos de Justin Wetherell desde su repositorio en [Github] (https://github.com/phishman3579/java-algorithms-implementation).

```bash
git clone https://github.com/phishman3579/java-algorithms-implementation.git
```
  
2. **Clase Principal (Main.java):**

Se ha implementado en la clase principal Main, que sirve como punto de entrada para el programa, un programa que a partir de un grafo no dirigido  __UndirectedGraph__ (g) y  un grafo dirigido __DirectedGraph__ (g1), obtiene e imprime por pantalla el camino óptimo entre dos vértices especificados _(en este caso desde v1 hasta v2 para ambos)_ utilizando el algoritmo A*, implementado en la clase AStar.

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
      /// Definir grafo
   }

   private static class DirectedGraph {
      /// Definir grafo
   }
}
```

Para verificar la funcionalidad, se puede ejecutar el comando desde el directorio del proyecot:

```bash
ant run_main
```

__Visualicón gráfico de los grafos no dirigidos y dirigidos__


__Resultado obtenido para un camino óptimo desde v1 hasta v2__

3. **Generación del camino A***

   - Siguiendo la referencia de los tests en Graphs.java, se ha desarrollado un programa principal que utiliza el algoritmo A* para generar un camino entre dos vértices.


## **Preguntas y Respuestas**

1. **Lista ABIERTA:**
   
La lista ABIERTA, que almacena los nodos candidatos para la expansión, se representa mediante la variable _openSet_ en el código A*.

2. **Función g:**
   
La función g, que representa el costo acumulado desde el nodo inicial hasta el nodo actual, se refleja comúnmente en una variable llamada _gScore_ dentro del contexto de un nodo.

3. **Función f:**

La función f, que es la función de evaluación total utilizada para determinar qué nodo se expandirá, se representa mediante la variable _fScore_ en el contexto de un nodo.

4. **Modificación de Heurística:**

La modificación de la heurística para representar la distancia aérea entre vértices se realizaría en el método encargado de calcular la heurística, llamado _heuristicCostEstimate_ en el código.

5. **Reevaluación de Nodos:**

Sí, el método responsable de la reevaluación de nodos se encuentra en la lógica de expansión de nodos y actualización de costos acumulados, en la clase interna privada  _reconstructPath_. Este proceso garantiza que se utilice la ruta más eficiente hasta el momento para llegar a cada nodo.

```java
// Reconstructs path because the path is stored in the edges not the vertices
    private List<Graph.Edge<T>> reconstructPath(Map<Graph.Vertex<T>,Graph.Vertex<T>> cameFrom, Graph.Vertex<T> current) {
        final List<Graph.Edge<T>> totalPath = new ArrayList<Graph.Edge<T>>();

        while (current != null) {
            final Graph.Vertex<T> previous = current;
            current = cameFrom.get(current);
            if (current != null) {
                final Graph.Edge<T> edge = current.getEdge(previous);
                totalPath.add(edge);
            }
        }
        Collections.reverse(totalPath);
        return totalPath;
    }
```


## **Licencia**

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
