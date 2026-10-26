# Examen parcial

## Descripción del ejercicio

El ejercicio consiste en gestionar pacientes de un hospital mediante una lista y obtener aquellos que pertenecen al área de **Urgencias**. Cada paciente tiene identificador, nombre, edad, área de atención y días de internación.

## Arquitectura utilizada

La solución está implementada en **Java** y utiliza una lista enlazada simple desarrollada para el ejercicio:

- `Paciente` representa los datos de cada paciente.
- `NodoPaciente` almacena un paciente y la referencia al siguiente nodo.
- `ListPacientes` administra la lista, permite agregar pacientes y obtiene una nueva lista con los que están en Urgencias.
- `Main` ejecuta los casos de prueba y muestra los resultados.

La lista se implementa con nodos enlazados, sin utilizar `java.util.LinkedList`.

## Casos de errores y situaciones límite

- **Lista vacía:** la búsqueda devuelve una lista vacía.
- **Ningún paciente en Urgencias:** la búsqueda devuelve una lista vacía.
- **Área de atención nula:** el paciente no coincide con Urgencias y la búsqueda continúa sin lanzar `NullPointerException`.
- **Paciente nulo:** la búsqueda lo omite sin lanzar `NullPointerException`.

## Casos de prueba

1. Lista con pacientes de distintas áreas y varios pacientes en Urgencias: verifica que se seleccionen solo los de esa área.
2. Lista original vacía: verifica que el resultado tenga tamaño cero.
3. Lista con pacientes, pero ninguno en Urgencias: verifica que el resultado tenga tamaño cero.
4. Paciente con área nula junto con otro paciente en Urgencias: verifica que se ignore el área nula y se incluya el paciente correspondiente.
