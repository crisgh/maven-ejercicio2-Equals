# maven-ejercicio2-Equals

public boolean equals (Object o){
if (o == this) // A
  return true;
if (!(o instanceof List)) // B
  return false;

ListIterator<E> e1 = listIterator();
ListIterator<?> e2 = ((List) o).listIterator();

while (e1.hasNext() && e2.hasNext()) // C
{
  E o1 = e1.next();
  Object o2 = e2.next();
  if (!(o1 == null ? o2 == null : o1.equals (o2))) // D
  return false;
}
  return !(e1.hasNext() || e2.hasNext()); // E
}

1. Dibuja el grafo de control de flujo para este m ́etodo.
2. Etiqueta nodos y arcos del grafo con el c ́odigo. Puedes utilizar estas etiquetas para escribir los predicados
en los arcos correspondientes
3. Sin escribir el código de pruebas en un fichero JUnit aparte, escribe los tests necesarios para cubrir todos
los nodos (node coverage). Ejemplo de test:
// Test para llegar al 3er return
  List<String> list1 = new ArrayList<String>();
  List<String> list2 = new ArrayList<String>();
  list1.add ("foo");
  list2.add ("bar");
  assumeFalse(list1.equals(list2));
4. Sin escribir el codigo de pruebas en un fichero JUnit aparte, escribe los tests necesarios para cubrir todas
las parejas de arcos (edge-pair coverage). Ejemplo de test:
// Test para el requisito de prueba [1,3,4]
  List<String> list1 = new ArrayList<String>();
  List<String> list2 = new ArrayList<String>();
  assumeFalse(list1.equals (null));
5. Sin escribir el codigo de pruebas en un fichero JUnit aparte, escribe los tests necesarios para satisfacer el
criterio de cobertura de caminos primarios (Prime path). Ejemplo de test:
// Test para el requisito de prueba [1,3,5,6,7,8]
  List<String> list1 = new ArrayList<String>();
  List<String> list2 = new ArrayList<String>();
  list2.add ("bat");
  assumeFalse(list1.equals (list2));
  
