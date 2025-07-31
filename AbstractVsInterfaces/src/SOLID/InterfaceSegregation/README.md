
# Interface Segregation - solId
* Ninguna clase debe verse obligada a implementar métodos que no usa.
- (otra forma de decirlo) Ninguna clase debería depender de métodos que no usa
* Las interfaces nos ayudan a desacoplar módulos entre sí.
## Como detectar que estamos violando el principio Open Close?
Darnos cuenta:
*  si al implementar una interfaz ves que uno o varios de los métodos no tienen sentido y te hace falta dejarlos vacíos o lanzar excepciones, es muy probable que estés violando este principio.
* Si la interfaz forma parte de tu código, divídela en varias interfaces que definan comportamientos más específicos.
* **Recuerda que no pasa nada porque una clase ahora necesite implementar varias interfaces. El punto importante es que use todos los métodos definidos por esas interfaces.**
## 