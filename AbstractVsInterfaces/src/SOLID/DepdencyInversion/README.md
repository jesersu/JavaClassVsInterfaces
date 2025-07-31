
# Dependecy Inversion - soliD

- Nos ayuda a podemos hacer que el código que es el núcleo de nuestra aplicación no dependa de los detalles de implementación.
* Piensa en un control remoto: no depende de pilas específicas (AA, AAA), sino de la abstracción de «una fuente de energía». Así, puedes cambiar las pilas sin modificar el control.
* Los módulos de alto nivel no deben depender de los de bajo nivel. Ambos deben depender de abstracciones
## Como detectar que estamos violando el principio Open Close?
Darnos cuenta:
*  Cualquier instanciación de clases complejas o módulos es una violación de este principio.
* Las opciones más rápidas son bien dejarlo vacío, bien lanzar una excepción cuando se use, asegurándote de que nadie llama incorrectamente a un método que no se puede utilizar.
* **Si un método sobrescrito no hace nada o lanza una excepción, es muy probable que estés violando el principio de sustitución de Liskov.**
* Otra herramienta que te avisará fácilmente son los tests. Si los tests de la clase padre no funcionan para la hija, también estarás violando este principio.
