# Pregunta 18 — Historial enlazado

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
