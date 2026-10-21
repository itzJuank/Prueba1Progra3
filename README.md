# Prueba1Progra3

Respuesta a la pregunta 17 de la primera prueba de Progra3

La [pregunta 18](Pregunta18/README.md) está en la subcarpeta `Pregunta18`,
como un proyecto Java con Ant independiente. Ábrela en NetBeans mediante
**Archivo → Abrir proyecto → Pregunta18**.

## Estructura

```text
Prueba1Progra3/
├── build.xml
├── manifest.mf
├── nbproject/
├── lib/
│   ├── junit-4.13.2.jar
│   └── hamcrest-core-1.3.jar
├── src/prueba1/
│   ├── PruebaDocumentos.java
│   └── entidades/
│       ├── Documento.java
│       ├── FacturaContado.java
│       ├── FacturaCredito.java
│       └── NotaCredito.java
└── test/prueba1/
    └── DocumentoTest.java
```

## Resultado esperado

```text
Contado: 10735.00
Credito: 11526.00
Nota: -11300.00
Cierre: 10961.00
```

Un único ciclo recorre los documentos, calcula sus totales mediante polimorfismo
y acumula el cierre. Las dos pruebas JUnit separan preparar, ejecutar y verificar.
