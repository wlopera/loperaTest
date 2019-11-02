# loperaTest
Prueba de Consulta de valores de lista - Uso de Genéricos y Recursividad

# Ejemplo
## Todos los usuarios...................
  User [id=1, firstname=Elivar, lastnama=Oswaldo, age=10, address=Address [id=1, name=San Pedro]]
  User [id=2, firstname=Antonio, lastnama=Carrion, age=15, address=Address [id=2, name=San Juan]]
  User [id=3, firstname=Juan, lastnama=Andrade, age=12, address=Address [id=3, name=San Jorge]]
  User [id=4, firstname=Luis, lastnama=Aguilar, age=17, address=Address [id=4, name=San Fernando]]
  User [id=5, firstname=Fidel, lastnama=Narvaez, age=8, address=Address [id=5, name=San Onofre]]
  User [id=6, firstname=Paul, lastnama=Guevara, age=5, address=Address [id=6, name=San Felix]]

## Todos los usuarios en session...................
  User [id=7, firstname=Mc, lastnama=Donald, age=10, address=Address [id=7, name=San Luis]]
  User [id=2, firstname=Antonio, lastnama=Carrion, age=15, address=Address [id=2, name=San Juan]]
  User [id=3, firstname=Juan, lastnama=Andrade, age=12, address=Address [id=3, name=San Jorge]]
  User [id=8, firstname=Tom, lastnama=Raider, age=17, address=Address [id=8, name=San Lucas]]
  User [id=5, firstname=Fidel, lastnama=Narvaez, age=8, address=Address [id=5, name=San Onofre]]
  User [id=9, firstname=Roberto, lastnama=Clemente, age=5, address=Address [id=9, name=San Isidro]]

## ------------Genericos y Recursividad-------------
CREATE : 
  User [id=1, firstname=Elivar, lastnama=Oswaldo, age=10, address=Address [id=1, name=San Pedro]]
  User [id=4, firstname=Luis, lastnama=Aguilar, age=17, address=Address [id=4, name=San Fernando]]
  User [id=6, firstname=Paul, lastnama=Guevara, age=5, address=Address [id=6, name=San Felix]]
DELETE : 
  User [id=8, firstname=Tom, lastnama=Raider, age=17, address=Address [id=8, name=San Lucas]]
  User [id=9, firstname=Roberto, lastnama=Clemente, age=5, address=Address [id=9, name=San Isidro]]
  User [id=7, firstname=Mc, lastnama=Donald, age=10, address=Address [id=7, name=San Luis]]

## Uso de recursividad......................
  No Existe: User [id=1, firstname=Elivar, lastnama=Oswaldo, age=10, address=Address [id=1, name=San Pedro]]
  Existe: User [id=2, firstname=Antonio, lastnama=Carrion, age=15, address=Address [id=2, name=San Juan]]
  Existe: User [id=3, firstname=Juan, lastnama=Andrade, age=12, address=Address [id=3, name=San Jorge]]
  No Existe: User [id=4, firstname=Luis, lastnama=Aguilar, age=17, address=Address [id=4, name=San Fernando]]
  Existe: User [id=5, firstname=Fidel, lastnama=Narvaez, age=8, address=Address [id=5, name=San Onofre]]
  No Existe: User [id=6, firstname=Paul, lastnama=Guevara, age=5, address=Address [id=6, name=San Felix]]

## Uso java clasica......................
  No Existe: User [id=1, firstname=Elivar, lastnama=Oswaldo, age=10, address=Address [id=1, name=San Pedro]]
  Existe: User [id=2, firstname=Antonio, lastnama=Carrion, age=15, address=Address [id=2, name=San Juan]]
  Existe: User [id=3, firstname=Juan, lastnama=Andrade, age=12, address=Address [id=3, name=San Jorge]]
  No Existe: User [id=4, firstname=Luis, lastnama=Aguilar, age=17, address=Address [id=4, name=San Fernando]]
  Existe: User [id=5, firstname=Fidel, lastnama=Narvaez, age=8, address=Address [id=5, name=San Onofre]]
  No Existe: User [id=6, firstname=Paul, lastnama=Guevara, age=5, address=Address [id=6, name=San Felix]]
