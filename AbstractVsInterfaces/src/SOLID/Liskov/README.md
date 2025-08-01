
# Liskov - soLid

- Las subclases deben ser sustituibles por sus clases base.
* Esto significa que, dado que la clase B es una subclase de la clase A, deberíamos poder pasar un objeto de la clase B a cualquier método que espere un objeto de la clase A y el método no debería dar ningún resultado extraño en ese caso.
## Como detectar que estamos violando el principio Open Close?
Darnos cuenta:
* Creas una clase que extiende de otra, pero de repente uno de los métodos te sobra, y no sabes que hacer con él.
* Las opciones más rápidas son bien dejarlo vacío, bien lanzar una excepción cuando se use, asegurándote de que nadie llama incorrectamente a un método que no se puede utilizar.
* **Si un método sobrescrito no hace nada o lanza una excepción, es muy probable que estés violando el principio de sustitución de Liskov.**
* Otra herramienta que te avisará fácilmente son los tests. Si los tests de la clase padre no funcionan para la hija, también estarás violando este principio.
## 