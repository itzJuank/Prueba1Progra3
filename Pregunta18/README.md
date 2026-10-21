# Pregunta 18 — Historial enlazado

Proyecto independiente de Java con Ant para NetBeans. Requiere JDK 17 o superior.

## Abrir en NetBeans

En **Archivo → Abrir proyecto**, selecciona la subcarpeta `Pregunta18`.
Haz clic derecho en el proyecto **Pregunta18** y selecciona **Ejecutar**.
La clase principal es `prueba1.PruebaHistorial`.

## Ejecutar con Ant

Desde la carpeta `Pregunta18`:

```sh
ant jar
ant run
ant test
```

También puedes ejecutar el JAR con `java -jar dist/Pregunta18.jar`.
Las bibliotecas de JUnit están incluidas en `lib`.

## Salida esperada

```text
Historial nuevo: contar() = 0; getEstadoActual() = SIN ESTADO
registrar EMITIDO, PENDIENTE_ENVIO, ENVIADO
contar() = 3; getEstadoActual() = ENVIADO
eliminarPrimero() = EMITIDO; contar() = 2
eliminarPrimero() = PENDIENTE_ENVIO
eliminarPrimero() = ENVIADO
contar() = 0; getEstadoActual() = SIN ESTADO
eliminarPrimero() = null
```

`NodoEstado` y `HistorialDocumento` están en `prueba1.estructuras`.
El historial se guarda mediante nodos propios y una referencia `cabeza`.
`registrar` agrega al final, `contar` recorre con una referencia auxiliar,
`getEstadoActual` consulta el último nodo y `eliminarPrimero` retira la cabeza.

Las pruebas verifican el historial vacío, el orden de registro y eliminación,
que contar conserve los nodos y que el historial pueda reutilizarse tras vaciarlo.
