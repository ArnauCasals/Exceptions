
````markdown id="rkjbac_es"
# Sistema de Ventas con Excepciones

**Descripción**: Aplicación Java desarrollada para practicar programación orientada a objetos, gestión de colecciones (`ArrayList`) y control de excepciones personalizadas y nativas. El sistema simula una venta de productos y permite calcular el total gestionando errores comunes como ventas vacías o accesos incorrectos a listas.

---

## Enunciado del ejercicio

Se desarrolla una aplicación para gestionar ventas de productos.

Cada venta puede contener varios productos, y el sistema debe ser capaz de calcular el precio total.

Si una venta no tiene productos, el sistema debe lanzar una excepción personalizada (`EmptySaleException`) para evitar cálculos incorrectos.

También se debe demostrar la gestión de errores típicos como `IndexOutOfBoundsException` al acceder a posiciones inexistentes de una lista.

---

## Funcionalidades

- Crear productos con nombre y precio
- Añadir productos a una venta
- Almacenar productos en una `ArrayList`
- Calcular el precio total de una venta
- Lanzar excepción personalizada si la venta está vacía
- Capturar excepciones nativas de Java (`IndexOutOfBoundsException`)
- Control de errores con `try-catch`

---

## Tecnologías

- Java
- IntelliJ IDEA
- Git
- GitHub

---

## Instalación y Ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/ArnauCasals/tasca1.git
````

2. Abrir el proyecto en IntelliJ IDEA.

3. Navegar hasta el directorio:

   ```text
   tasca1/exceptions
   ```

4. Ejecutar la clase `Main`.

5. Revisar la consola para ver el funcionamiento del sistema y el control de excepciones.

---

## Demo

```text
Total price: 275.0
Error: índice no válido -> Index 10 out of bounds for length 3
```

---

## Diagramas y justificación de decisiones técnicas

### Estructura de clases

```text id="oqqchc"
Sale
│
├── ArrayList<Product>
├── calculateTotal()
└── control de excepciones

Product
│
├── name
└── price

EmptySaleException
│
└── Extiende RuntimeException
```

---

### Decisiones técnicas

* `Product` representa una entidad simple con datos básicos (POJO).
* `Sale` gestiona la lógica principal del sistema y la colección de productos.
* Se utiliza `ArrayList` para permitir crecimiento dinámico de productos.
* Se crea una excepción personalizada (`EmptySaleException`) para controlar errores de lógica del negocio.
* Se usa `RuntimeException` para evitar la obligación de gestionar la excepción con `throws`.
* Se captura `IndexOutOfBoundsException` para demostrar control de errores en colecciones.
* El diseño sigue el principio de separación de responsabilidades.

```

