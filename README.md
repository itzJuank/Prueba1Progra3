# Prueba1Progra3 — Java con Ant

Aplicación de consola para el ejercicio C.1, con JDK 17 o superior y JUnit 4.
Las bibliotecas de pruebas están incluidas en `lib`; no requieren descargas.

## Abrir y ejecutar en NetBeans

1. Selecciona **Archivo → Abrir proyecto**.
2. Abre la carpeta `Prueba1Progra3`, que contiene `build.xml` y `nbproject`.
3. Haz clic derecho sobre el proyecto y selecciona **Ejecutar**.
4. Para ejecutar las pruebas JUnit, haz clic derecho en el proyecto y selecciona **Probar**.

NetBeans lo reconoce como proyecto Java con Ant. La clase principal es
`prueba1.PruebaDocumentos`. Si la versión anterior sigue abierta, ciérrala y
vuelve a abrir esta carpeta.

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

## Usar Ant desde la terminal

Desde la raíz del proyecto:

```sh
ant clean
ant jar
ant run
ant test
```

El JAR ejecutable queda en `dist/Prueba1Progra3.jar`:

```sh
java -jar dist/Prueba1Progra3.jar
```

## Resultado esperado

```text
Contado: 10735.00
Credito: 11526.00
Nota: -11300.00
Cierre: 10961.00
```

Un único ciclo recorre los documentos, calcula sus totales mediante polimorfismo
y acumula el cierre. Las dos pruebas JUnit separan preparar, ejecutar y verificar,
y usan tolerancia de `0.01`.
