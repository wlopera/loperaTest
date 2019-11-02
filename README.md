# loperaTest
Prueba de Consulta de valores de lista - Uso de Genéricos y Recursividad

# Ejemplo
## Todos los usuarios...................
  User [id=1, firstname=Elivar, lastnama=Oswaldo, age=10, address=Address [id=1, name=San Pedro]]<br>
  User [id=2, firstname=Antonio, lastnama=Carrion, age=15, address=Address [id=2, name=San Juan]]<br>
  User [id=3, firstname=Juan, lastnama=Andrade, age=12, address=Address [id=3, name=San Jorge]]<br>
  User [id=4, firstname=Luis, lastnama=Aguilar, age=17, address=Address [id=4, name=San Fernando]]<br>
  User [id=5, firstname=Fidel, lastnama=Narvaez, age=8, address=Address [id=5, name=San Onofre]]<br>
  User [id=6, firstname=Paul, lastnama=Guevara, age=5, address=Address [id=6, name=San Felix]]<br>

## Todos los usuarios en session...................
  User [id=7, firstname=Mc, lastnama=Donald, age=10, address=Address [id=7, name=San Luis]]<br>
  User [id=2, firstname=Antonio, lastnama=Carrion, age=15, address=Address [id=2, name=San Juan]]<br>
  User [id=3, firstname=Juan, lastnama=Andrade, age=12, address=Address [id=3, name=San Jorge]]<br>
  User [id=8, firstname=Tom, lastnama=Raider, age=17, address=Address [id=8, name=San Lucas]]<br>
  User [id=5, firstname=Fidel, lastnama=Narvaez, age=8, address=Address [id=5, name=San Onofre]]<br>
  User [id=9, firstname=Roberto, lastnama=Clemente, age=5, address=Address [id=9, name=San Isidro]]<br>

## ------------Genericos y Recursividad-------------
CREATE : 
  User [id=1, firstname=Elivar, lastnama=Oswaldo, age=10, address=Address [id=1, name=San Pedro]]<br>
  User [id=4, firstname=Luis, lastnama=Aguilar, age=17, address=Address [id=4, name=San Fernando]]<br>
  User [id=6, firstname=Paul, lastnama=Guevara, age=5, address=Address [id=6, name=San Felix]]<br>
DELETE : 
  User [id=8, firstname=Tom, lastnama=Raider, age=17, address=Address [id=8, name=San Lucas]]<br>
  User [id=9, firstname=Roberto, lastnama=Clemente, age=5, address=Address [id=9, name=San Isidro]]<br>
  User [id=7, firstname=Mc, lastnama=Donald, age=10, address=Address [id=7, name=San Luis]]<br>

## Uso de recursividad......................
  No Existe: User [id=1, firstname=Elivar, lastnama=Oswaldo, age=10, address=Address [id=1, name=San Pedro]]<br>
  Existe: User [id=2, firstname=Antonio, lastnama=Carrion, age=15, address=Address [id=2, name=San Juan]]<br>
  Existe: User [id=3, firstname=Juan, lastnama=Andrade, age=12, address=Address [id=3, name=San Jorge]]<br>
  No Existe: User [id=4, firstname=Luis, lastnama=Aguilar, age=17, address=Address [id=4, name=San Fernando]]<br>
  Existe: User [id=5, firstname=Fidel, lastnama=Narvaez, age=8, address=Address [id=5, name=San Onofre]]<br>
  No Existe: User [id=6, firstname=Paul, lastnama=Guevara, age=5, address=Address [id=6, name=San Felix]]<br>

## Uso java clasica......................
  No Existe: User [id=1, firstname=Elivar, lastnama=Oswaldo, age=10, address=Address [id=1, name=San Pedro]]<br>
  Existe: User [id=2, firstname=Antonio, lastnama=Carrion, age=15, address=Address [id=2, name=San Juan]]<br>
  Existe: User [id=3, firstname=Juan, lastnama=Andrade, age=12, address=Address [id=3, name=San Jorge]]<br>
  No Existe: User [id=4, firstname=Luis, lastnama=Aguilar, age=17, address=Address [id=4, name=San Fernando]]<br>
  Existe: User [id=5, firstname=Fidel, lastnama=Narvaez, age=8, address=Address [id=5, name=San Onofre]]<br>
  No Existe: User [id=6, firstname=Paul, lastnama=Guevara, age=5, address=Address [id=6, name=San Felix]]<br>
