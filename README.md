# ⭐ Algoritmo A\*: Búsqueda Heurística sin Adversarios

![Version](https://img.shields.io/badge/version-1.0.0-blue)
![Java](https://img.shields.io/badge/language-Java-orange)
![License](https://img.shields.io/badge/license-Apache_2.0-lightgrey)

### 🚀 Implementación práctica del algoritmo A* para encontrar caminos óptimos en grafos dirigidos y no dirigidos. Desarrollado en Java.

---

## 🧠 ¿Qué es A\*?

El algoritmo A\* (A-Star) es un algoritmo de búsqueda heurística usado para encontrar el **camino más corto** entre dos puntos. Combina lo mejor de la búsqueda por costo uniforme y la búsqueda primero el mejor (greedy).  
Usa una función **f(n) = g(n) + h(n)**, donde:
- **g(n)** = costo desde el nodo inicial hasta n.
- **h(n)** = heurística (estimación del costo desde n hasta el objetivo).

> A\* se usa en videojuegos 🎮, sistemas GPS 🚗 y navegación de robots 🤖.

---

## 🗂️ Contenido del Repositorio

- Clonado del código de Justin Wetherell → [Repositorio original](https://github.com/phishman3579/java-algorithms-implementation)
- Clase principal `Main.java` que prueba A* sobre dos grafos:
  - **UndirectedGraph (g)**
  - **DirectedGraph (g1)**
- Visualización de grafos y caminos óptimos.
- Preguntas clave sobre la implementación del algoritmo.

---

## 📦 Instalación y Ejecución

Requisitos: tener Java y Apache Ant instalados.

```bash
git clone https://github.com/martacanirome4/AStarAlgorithm.git
cd AStarAlgorithm/
ant run_main
```

La consola mostrará el camino óptimo para cada grafo:

![resultado](https://github.com/martacanirome4/AStarAlgorithm/assets/50625677/81abcc28-cd28-493a-b811-a4600029a715)

---

## 🔍 Visualización de Grafos

### 📊 Grafo No Dirigido (g)

![g](https://github.com/martacanirome4/AStarAlgorithm/assets/50625677/5480b29d-741f-43be-8dc7-6c7c158df53d)

➡️ **Camino óptimo:**  
![g*](https://github.com/martacanirome4/AStarAlgorithm/assets/50625677/938d99d3-758a-469e-8c31-f595d857dfed)

### 📊 Grafo Dirigido (g1)

![g1](https://github.com/martacanirome4/AStarAlgorithm/assets/50625677/3a388b53-2006-401d-b8ae-998c8de3576e)

➡️ **Camino óptimo:**  
![g1*](https://github.com/martacanirome4/AStarAlgorithm/assets/50625677/83395098-e958-4986-acf0-221a6782d672)

---

## ❓ Preguntas Clave

### 1. 📌 ¿Qué es la lista ABIERTA?
- Variable `openSet`: nodos candidatos a ser evaluados.
- Inicialmente contiene solo el nodo inicial.
- Se va actualizando durante la búsqueda.

### 2. 📌 ¿Qué representa la función **g**?
- Variable `gScore`: costo acumulado desde el nodo inicial.
- Se actualiza cuando se encuentra una ruta más corta a un nodo.

### 3. 📌 ¿Qué representa la función **f**?
- Variable `fScore`: estimación total desde el nodo inicial hasta el objetivo.
- Se calcula como `g(n) + h(n)`.

### 4. 🔧 ¿Cómo modificar la heurística?
Reemplazar la función `heuristicCostEstimate` para calcular **distancia euclidiana**.

```java
protected int heuristicCostEstimate(Vertex<T> start, Vertex<T> goal) {
    // Ejemplo: return distanciaEuclidiana(start, goal);
}
```

### 5. ♻️ Reevaluación de nodos
- Ocurre cuando se encuentra un camino más corto a un nodo ya evaluado.
- Se actualizan `gScore`, `fScore` y la ruta (`cameFrom`).

---

## 🛠️ Código Principal

Ver [`Main.java`](#) para implementación completa.

> Incluye clases internas para grafos dirigidos y no dirigidos, e imprime caminos óptimos por consola.

---

## 📚 Recursos

- 📄 Algoritmos de Justin Wetherell: [GitHub](https://github.com/phishman3579/java-algorithms-implementation)
- 📘 Explicación visual de A*: [Red Blob Games](https://www.redblobgames.com/pathfinding/a-star/introduction.html)

---

## 👩‍💻 Autora

Marta Canino Romero – 2023  
[GitHub](https://github.com/martacanirome4)

---

## 📄 Licencia

Licensed under the Apache License 2.0 – [Ver licencia](http://www.apache.org/licenses/LICENSE-2.0)
