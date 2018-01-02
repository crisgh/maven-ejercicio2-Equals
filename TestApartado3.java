// Test para llegar al 3er return (ultimo return FALSE) --> nodos 1, 3, 5, 6, 7, 9 y 10
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add ("true");
list2.add ("false");
assumeFalse(list1.equals(list2));


// Test para llegar al return TRUE -- nodos 1 y 2
List<String> list1 = new ArrayList<String>();
list1.add ("true");
assumeTrue(list1.equals(list1));


// Test para llegar al return FALSE -- nodos 1, 3 y 4
List<String> list1 = new ArrayList<String>();
String list2 = new String();
list1.add ("true");
assumeFalse(list1.equals(list2));


// Test para llegar al return FALSE -- nodos 1, 3, 5, 6, 7, 9, 6 y 8 (toma bucle)
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add ("true");
list2.add ("true");
assumeTrue(list1.equals(list2));
