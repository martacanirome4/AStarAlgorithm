# Algoritmo A*
Práctica de búsqueda heurística sin adversarios

"El propósito de esta práctica es que el alumno reutilice código que implementa el algoritmo A*. Se bajará código de Github, y lo utilizará para ejecutar este algoritmo para un grafo concreto."

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
