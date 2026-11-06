# 🐾 MundoAnimal

Aplicación de consola desarrollada en **Java** para practicar los fundamentos de la **Programación Orientada a Objetos (POO)**, mediante la representación de diferentes animales, sus características y comportamientos.

Este proyecto forma parte de una actividad individual del bootcamp **Generation México — CH73**.

## 🎯 Objetivo

Implementar los principales conceptos de la programación orientada a objetos:

- **Abstracción:** mediante una clase abstracta `Animal`.
- **Herencia:** utilizando las clases `Perro`, `Gato` y `Vaca`.
- **Encapsulamiento:** protegiendo los atributos de los objetos.
- **Polimorfismo:** utilizando un arreglo de tipo `Animal[]`.
- **Interfaces:** mediante `Movible` para definir el comportamiento de desplazamiento.
- **Sobrescritura:** utilizando `@Override` para implementar comportamientos específicos.

## 🛠️ Tecnologías

- Java
- IntelliJ IDEA
- Git
- GitHub

## 📁 Estructura del proyecto

```text
MundoAnimal/
├── src/
│   └── mx/
│       └── com/
│           └── animales/
│               ├── Animal.java
│               ├── Perro.java
│               ├── Gato.java
│               ├── Vaca.java
│               ├── Movible.java
│               └── Main.java
├── .gitignore
└── README.md
```

### Descripción de los archivos

| Archivo | Descripción |
|---|---|
| `Animal.java` | Clase abstracta que define los atributos y comportamientos comunes. |
| `Perro.java` | Clase que hereda de `Animal` e implementa `Movible`. |
| `Gato.java` | Clase que hereda de `Animal` e implementa `Movible`. |
| `Vaca.java` | Clase que hereda de `Animal` e implementa `Movible`. |
| `Movible.java` | Interfaz que declara el método `moverse()`. |
| `Main.java` | Clase principal donde se crean y recorren los objetos. |

## 🚀 Instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone https://github.com/EdGodinez/MundoAnimal.git
```

### 2. Abrir el proyecto

1. Abrir IntelliJ IDEA.
2. Seleccionar **Open**.
3. Elegir la carpeta `MundoAnimal`.
4. Configurar un JDK compatible con el proyecto.

### 3. Ejecutar

1. Abrir `src/mx/com/animales/Main.java`.
2. Ejecutar el método `main()` desde IntelliJ IDEA.
3. Visualizar los resultados en la consola.

## 💻 Ejemplo de salida

La siguiente salida es ilustrativa, basada en los animales definidos en el proyecto y el formato solicitado en la actividad:

```text
Nombre: Odin | Edad: 5 | Sonido: Wuf | Movimiento: Corre
Nombre: Pelusa | Edad: 4 | Sonido: Miau | Movimiento: Camina
Nombre: Pinta | Edad: 6 | Sonido: Muuu | Movimiento: Camina
```

## 📚 Preguntas de reflexión

### 1. ¿Qué se reutiliza al heredar de Animal?

Se reutilizan los atributos y métodos definidos en la clase padre `Animal`, como `nombre`, `edad` y `mostrarInformacion()`.

Esto permite que las clases hijas compartan características y comportamientos sin necesidad de duplicar código. Los atributos privados se administran mediante los métodos y el constructor de la clase padre.

### 2. ¿Qué hace super(nombre, edad)?

La instrucción `super(nombre, edad)` invoca el constructor de la clase padre `Animal`, enviándole los valores de `nombre` y `edad`.

Esto permite inicializar los atributos heredados sin repetir la lógica del constructor en cada clase hija.

### 3. ¿Para qué sirve @Override?

La anotación `@Override` indica que un método está sobrescribiendo uno declarado en una clase padre o implementando uno de una interfaz.

También permite que el compilador detecte errores si el método no coincide con alguno que pueda sobrescribirse.

### 4. ¿Por qué el mismo método hacerSonido() produce resultados distintos?

Porque se utiliza el **polimorfismo**.

Aunque todas las clases comparten la declaración del método `hacerSonido()`, cada una proporciona su propia implementación.

Cuando se invoca el método desde una referencia de tipo `Animal`, Java ejecuta la implementación correspondiente al objeto real.

### 5. ¿Cuál es la diferencia entre una clase abstracta y una interfaz?

Una **clase abstracta** funciona como una clase base que puede contener atributos de instancia, constructores y métodos concretos o abstractos.

Una **interfaz** define un contrato que las clases deben cumplir mediante la implementación de sus métodos abstractos. También puede contener métodos `default`, `static` y privados.

En este proyecto:

- `Animal` es una clase abstracta que comparte características y comportamientos.
- `Movible` es una interfaz que establece el comportamiento `moverse()`.

Una clase puede extender una sola clase, pero puede implementar múltiples interfaces.

## 👨‍💻 Autor

**Eduardo Godínez Santana**

Ingeniero en Sistemas Computacionales

GitHub: [@EdGodinez](https://github.com/EdGodinez)

## 📄 Contexto académico

Proyecto desarrollado con fines educativos como parte del bootcamp **Generation México — Cohorte 73**, para reforzar los conceptos fundamentales de la programación orientada a objetos en Java.