# 👨‍💻 Unidad 7 - Herencia en Java

## 📌 Descripción
Este repositorio está dedicado al estudio de la **herencia en Programación Orientada a Objetos (POO)** utilizando Java.

La herencia es uno de los pilares fundamentales de la POO, ya que permite crear nuevas clases a partir de otras existentes. De esta forma, se reutiliza código, se mejora la organización del programa y se facilita el mantenimiento de las aplicaciones.

---

## 📚 ¿Qué es la herencia?
La herencia es un mecanismo mediante el cual una clase puede adquirir los atributos y métodos de otra clase. 

- La clase de la que se hereda se denomina **superclase** o clase padre.
- La clase que hereda se denomina **subclase** o clase hija.

Este concepto permite modelar relaciones del tipo “es un”, por ejemplo:
- Un *Empleado* es una *Persona*
- Un *Cliente* es una *Persona*

---

## 🎯 Objetivos del tema
- Comprender el funcionamiento de la herencia en Java
- Aprender a crear jerarquías de clases
- Reutilizar código de forma eficiente
- Aplicar correctamente los modificadores de acceso
- Entender el concepto de polimorfismo
- Conocer el uso de clases abstractas

---

## 🔐 Modificadores de acceso
Los modificadores de acceso determinan la visibilidad de los atributos y métodos:

- **private**: solo accesible dentro de la propia clase  
- **default**: accesible dentro del mismo paquete  
- **protected**: accesible en el mismo paquete y en subclases  
- **public**: accesible desde cualquier lugar  

El modificador **protected** es especialmente importante en herencia, ya que permite que las subclases accedan a ciertos miembros de la superclase.

---

## 🔁 Redefinición de métodos (Overriding)
En algunos casos, una subclase necesita modificar el comportamiento de un método heredado. Esto se consigue mediante la sobrescritura o *overriding*.

Para que exista overriding:
- El método debe tener el mismo nombre
- Debe tener los mismos parámetros
- Debe devolver el mismo tipo

Esto permite adaptar el comportamiento de la superclase a las necesidades específicas de la subclase.

---

## 🔄 Polimorfismo y selección dinámica
Gracias a la herencia, un objeto de una subclase puede ser tratado como un objeto de la superclase.

Esto permite que una misma variable pueda referenciar diferentes tipos de objetos, y que el método que se ejecute dependa del objeto real en tiempo de ejecución.

Este comportamiento se conoce como **polimorfismo**.

---

## 🧩 Uso de `super`
La palabra clave `super` se utiliza para acceder a los miembros de la superclase.

También existe `super()`, que permite llamar al constructor de la superclase desde la subclase. Esto es importante para inicializar correctamente los atributos heredados.

---

## 🌐 La clase Object
En Java, todas las clases heredan de forma directa o indirecta de la clase `Object`.

Esto significa que todas las clases disponen de métodos comunes como:
- `toString()`
- `equals()`
- `getClass()`

Estos métodos pueden ser redefinidos para adaptarlos a las necesidades de cada clase.

---

## 🧱 Clases abstractas
Las clases abstractas son aquellas que no se pueden instanciar y sirven como base para otras clases.

Pueden contener:
- Métodos implementados
- Métodos abstractos (sin implementación)

Las subclases están obligadas a implementar los métodos abstractos, lo que permite definir estructuras generales que luego se concretan en clases más específicas.

---

## ⚙️ Tecnologías utilizadas
- Java ☕
- Programación Orientada a Objetos (POO)

---

## 📚 Autor
- Eva Katherine Mayser Vanea DAM / SMR 💻

  <p align="center">
  <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExNnRkZ2JvZTNtcmE4NmtleGQ5NXoxNmI1dmVtYTdleHBoMmttZjdyZyZlcD12MV9naWZzX3RyZW5kaW5nJmN0PWc/ytu2GUYbvhz7zShGwS/giphy.gif" width="500" height="300"/>
</p>
