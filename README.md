# Algoritmo A*: Práctica de búsqueda heurística sin adversarios

### **Descripción**

Este proyecto implementa el algoritmo de búsqueda A* en Java, utilizando el código proporcionado por Justin Wetherell en su repositorio de algoritmos y estructuras de datos. Se ha implementado una clase principal llamada `Main` que actúa como punto de entrada para el programa de la práctica, de manera que compruebe el funcionamiento correcto de este algoritmo sobre dos grafos, y devuelva el camino óptimo.

### **Contenido del Repositorio**

1. **Código AStar en Java:**

Se ha clonado el código fuente de los algoritmos y estructuras de datos de Justin Wetherell desde su repositorio en [Github] (https://github.com/phishman3579/java-algorithms-implementation).

```bash
git clone https://github.com/phishman3579/java-algorithms-implementation.git
```
  
2. **Clase Principal (Main.java):**

Se ha implementado en la clase principal Main, que sirve como punto de entrada para el programa, un programa que a partir de dos grafos, uno no dirigido  **__UndirectedGraph__ (g)** y uno dirigido **__DirectedGraph__ (g1)**, obtiene el camino óptimo entre dos vértices especificados _(desde v1 hasta v9 para ambos)_ utilizando el algoritmo A* de la clase __AStar__, e imprime por pantalla el camino óptimo.

A continuación se muestra el código implementado:

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

    // Undirected
    private static class UndirectedGraph {
        final List<Vertex<Integer>> verticies = new ArrayList<Vertex<Integer>>();
        final Graph.Vertex<Integer> v1 = new Graph.Vertex<Integer>(1);
        final Graph.Vertex<Integer> v2 = new Graph.Vertex<Integer>(2);
        final Graph.Vertex<Integer> v3 = new Graph.Vertex<Integer>(3);
        final Graph.Vertex<Integer> v4 = new Graph.Vertex<Integer>(4);
        final Graph.Vertex<Integer> v5 = new Graph.Vertex<Integer>(5);
        final Graph.Vertex<Integer> v6 = new Graph.Vertex<Integer>(6);
        final Graph.Vertex<Integer> v7 = new Graph.Vertex<Integer>(7);
        final Graph.Vertex<Integer> v8 = new Graph.Vertex<Integer>(8);
        final Graph.Vertex<Integer> v9 = new Graph.Vertex<Integer>(9);
        final Graph.Vertex<Integer> v10 = new Graph.Vertex<Integer>(10);
        
        {
            verticies.add(v1);
            verticies.add(v2);
            verticies.add(v3);
            verticies.add(v4);
            verticies.add(v5);
            verticies.add(v6);
            verticies.add(v7);
            verticies.add(v8);
            verticies.add(v9);
            verticies.add(v10);
        }

        final List<Edge<Integer>> edges = new ArrayList<Edge<Integer>>();
        final Graph.Edge<Integer> e1_2 = new Graph.Edge<Integer>(1, v1, v2);
        final Graph.Edge<Integer> e1_4 = new Graph.Edge<Integer>(9, v1, v4);
        final Graph.Edge<Integer> e2_9 = new Graph.Edge<Integer>(15, v2, v9);
        final Graph.Edge<Integer> e3_4 = new Graph.Edge<Integer>(2, v3, v4);
        final Graph.Edge<Integer> e3_5 = new Graph.Edge<Integer>(10, v3, v5);
        final Graph.Edge<Integer> e3_6 = new Graph.Edge<Integer>(1, v3, v6);
        final Graph.Edge<Integer> e3_7 = new Graph.Edge<Integer>(5, v3, v7);
        final Graph.Edge<Integer> e6_9 = new Graph.Edge<Integer>(7, v6, v9);
        final Graph.Edge<Integer> e7_8 = new Graph.Edge<Integer>(4, v7, v8);
        final Graph.Edge<Integer> e7_10 = new Graph.Edge<Integer>(3, v7, v10);
        {
            edges.add(e1_2);
            edges.add(e1_4);
            edges.add(e2_9);
            edges.add(e3_4);
            edges.add(e3_5);
            edges.add(e3_6);
            edges.add(e3_7);
            edges.add(e6_9);
            edges.add(e7_8);
            edges.add(e7_10);
        }

        final Graph<Integer> graph = new Graph<Integer>(verticies, edges);
    }

    // Directed
    private static class DirectedGraph {
        final List<Vertex<Integer>> verticies = new ArrayList<Vertex<Integer>>();
        final Graph.Vertex<Integer> v1 = new Graph.Vertex<Integer>(1);
        final Graph.Vertex<Integer> v2 = new Graph.Vertex<Integer>(2);
        final Graph.Vertex<Integer> v3 = new Graph.Vertex<Integer>(3);
        final Graph.Vertex<Integer> v4 = new Graph.Vertex<Integer>(4);
        final Graph.Vertex<Integer> v5 = new Graph.Vertex<Integer>(5);
        final Graph.Vertex<Integer> v6 = new Graph.Vertex<Integer>(6);
        final Graph.Vertex<Integer> v7 = new Graph.Vertex<Integer>(7);
        final Graph.Vertex<Integer> v8 = new Graph.Vertex<Integer>(8);
        final Graph.Vertex<Integer> v9 = new Graph.Vertex<Integer>(9);
        final Graph.Vertex<Integer> v10 = new Graph.Vertex<Integer>(10);
        {
            verticies.add(v1);
            verticies.add(v2);
            verticies.add(v3);
            verticies.add(v4);
            verticies.add(v5);
            verticies.add(v6);
            verticies.add(v7);
            verticies.add(v8);
            verticies.add(v9);
            verticies.add(v10);
        }

        final List<Edge<Integer>> edges = new ArrayList<Edge<Integer>>();
        final Graph.Edge<Integer> e1_2 = new Graph.Edge<Integer>(1, v1, v2);
        final Graph.Edge<Integer> e1_3 = new Graph.Edge<Integer>(2, v1, v3);
        final Graph.Edge<Integer> e1_4 = new Graph.Edge<Integer>(3, v1, v4);
        final Graph.Edge<Integer> e2_5 = new Graph.Edge<Integer>(10, v2, v5);
        final Graph.Edge<Integer> e3_5 = new Graph.Edge<Integer>(4, v3, v5);
        final Graph.Edge<Integer> e3_6 = new Graph.Edge<Integer>(1, v3, v6);
        final Graph.Edge<Integer> e3_8 = new Graph.Edge<Integer>(20, v3, v8);
        final Graph.Edge<Integer> e5_6 = new Graph.Edge<Integer>(5, v5, v6);
        final Graph.Edge<Integer> e8_7 = new Graph.Edge<Integer>(7, v8, v7);
        final Graph.Edge<Integer> e8_9 = new Graph.Edge<Integer>(6, v8, v9);
        final Graph.Edge<Integer> e7_10 = new Graph.Edge<Integer>(17, v7, v10);

        {
            edges.add(e1_2);
            edges.add(e1_3);
            edges.add(e1_4);
            edges.add(e2_5);
            edges.add(e3_5);
            edges.add(e3_6);
            edges.add(e3_8);
            edges.add(e5_6);
            edges.add(e8_7);
            edges.add(e8_9);
            edges.add(e7_10);
        
        }

        final Graph<Integer> graph = new Graph<Integer>(Graph.TYPE.DIRECTED, verticies, edges);
    }
}
```

## Visualización gráfica

<ins>Representación del grafo no dirigido implementado - g</ins>

![g](https://github.com/martacanirome4/AStarAlgorithm/assets/50625677/5480b29d-741f-43be-8dc7-6c7c158df53d)

<ins>Camino óptimo - g</ins>

![g*](https://github.com/martacanirome4/AStarAlgorithm/assets/50625677/938d99d3-758a-469e-8c31-f595d857dfed)



<ins>Representación del grafo dirigido implementado - g1</ins>

![g1](https://github.com/martacanirome4/AStarAlgorithm/assets/50625677/3a388b53-2006-401d-b8ae-998c8de3576e)

<ins>Camino óptimo - g1</ins>

![g1*](https://github.com/martacanirome4/AStarAlgorithm/assets/50625677/83395098-e958-4986-acf0-221a6782d672)


## Probar el funcionamiento del algoritmo

Para comprobar el resultado de probar el algoritmo A* sobre estos grafos, basta con navegar en la terminal hasta el directorio del proyecto y ejecutar el  siguiente comando:

  ```bash
  ant run_main
  ```

Es necesario tener instalado, previamente, el comando __ant__.

A continuación, el programa devolverá el resultado de la siguiente manera:

<img width="1001" alt="Captura de pantalla 2023-11-28 a las 15 41 27" src="https://github.com/martacanirome4/AStarAlgorithm/assets/50625677/81abcc28-cd28-493a-b811-a4600029a715">

Como se puede observar, la respuesta dada por el programa se corresponde con la solución correcta.

## **Preguntas y Respuestas**

1. **Lista ABIERTA:**
   
La lista ABIERTA en el contexto del algoritmo A*, que almacena los nodos candidatos para la expansión, está representada mediante la variable __openSet__. En el código proporcionado, openSet es una lista de vértices candidatos a ser evaluados durante la ejecución del algoritmo. Inicialmente, esta lista contiene sólo el vértice inicial y se actualiza a medida que el algoritmo explora los nodos en busca de la solución.

En la implementación del algoritmo A*, las operaciones de agregar y eliminar de la lista openSet se utilizan para administrar qué nodos se consideran para la exploración. La lista abierta contiene los nodos que aún no han sido evaluados completamente y que pueden considerarse como posibles candidatos para formar parte de la ruta óptima desde el nodo inicial hasta el nodo objetivo.

2. **Función g:**

La función g está representada por la variable '__gScore__'. En el código proporcionado, '__gScore__' es un mapa que realiza un seguimiento del costo acumulado desde el nodo inicial hasta cada nodo en el gráfico a lo largo de la ruta más conocida hasta ese punto.

La función g generalmente representa el costo real acumulado desde el nodo inicial hasta el nodo actual a lo largo de la ruta actual. En el código, puede ver que el gScore de un nodo se actualiza cuando se encuentra la ruta más corta a ese nodo durante la exploración del gráfico.

Aquí está la parte relevante del código que maneja la función g:

  ```java
  // Cost from start along best known path.
  final Map<Graph.Vertex<T>, Integer> gScore = new HashMap<Graph.Vertex<T>, Integer>();
  gScore.put(start, 0);
  
  // ...
  
  final int tentativeGScore = gScore.get(current) + distanceBetween(current, neighbor);
  if (!openSet.contains(neighbor))
      openSet.add(neighbor);
  else if (tentativeGScore >= gScore.get(neighbor))
      continue;
  
  // This path is the best until now. Record it!
  cameFrom.put(neighbor, current);
  gScore.put(neighbor, tentativeGScore);
  ```

En este fragmento, el nuevo costo acumulado (**'tentativeGScore'**(en  se calcula al pasar del nodo actual **('current')** a su vecino **('neighbor')**. Luego, se compara este nuevo costo con el mejor costo conocido hasta ese momento **('gScore.get(neighbor))'**, y si el nuevo costo es menor, se actualiza el **'gScore'** del nodo **'neighbor'** y se registra el nodo **'current'** como el mejor nodo para llegar a **'neighbor'**.

3. **Función f:**

En el contexto del algoritmo A*, la función f está representada por la variable __fScore__. En el código proporcionado, fScore es un mapa que realiza un seguimiento de la estimación del costo total desde el nodo inicial hasta el nodo objetivo a través de la mejor ruta conocida hasta ese punto.

La función f generalmente se define como la suma del costo acumulado real desde el nodo inicial hasta el nodo actual (g) y una estimación heurística del costo desde el nodo actual hasta el nodo objetivo (h). En el caso de A*, la suma de g y h se utiliza para determinar qué nodos explorar a continuación.

Aquí está la parte relevante del código que maneja la función f:

  ```java
  // Estimated total cost from start to goal through y.
  final Map<Graph.Vertex<T>, Integer> fScore = new HashMap<Graph.Vertex<T>, Integer>();
  for (Graph.Vertex<T> v : graph.getVertices())
      fScore.put(v, Integer.MAX_VALUE);
  fScore.put(start, heuristicCostEstimate(start, goal));
  
  // ...
  
  final int estimatedFScore = gScore.get(neighbor) + heuristicCostEstimate(neighbor, goal);
  fScore.put(neighbor, estimatedFScore);
  ```
En este fragmento, se calcula el nuevo valor estimado de f para el nodo **'neighbor'** y se actualiza en el mapa fScore. La estimación heurística (h) se obtiene llamando a la función **?heuristicCostEstimate'**, y el costo acumulado real (g) se obtiene del **'gScore'**. Este valor estimado de f se utiliza para priorizar la exploración de nodos durante el algoritmo A*.

4. **Modificación de Heurística:**

Para modificar el método que representa la heurística (h) para que represente la distancia aérea (también conocida como distancia euclidiana) entre vértices, deberías ajustar el método heuristicCostEstimate. Actualmente, este método tiene una implementación simple que devuelve un valor constante de 1. La implementación actual:

  ```java
  // Default heuristic: cost to each vertex is 1.
  @SuppressWarnings("unused") 
  protected int heuristicCostEstimate(Graph.Vertex<T> start, Graph.Vertex<T> goal) {
      return 1;
  }
  ```

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
