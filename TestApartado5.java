//requisitos: (1,2), (1,3,4), (1,3,5,6,8), (1,3,5,6,7,9,10), (6,7,9,6), (7,9,6,7), (9,6,7,9)

// requisito de prueba (1,2)
List<String> list1 = new ArrayList<String>();
list1.add("true");
assumeTrue(list1.equals(list1));


// requisito de prueba (1,3,4)
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
assumeFalse(list1.equals(null));


// requisito de prueba (1,3,5,6,8)
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
assumeTrue(list1.equals(list2));


// requisito de prueba (1,3,5,6,7,9,10)
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add("true");
list2.add("False");
assumeFalse(list1.equals(list2));


// requisito de prueba (6,7,9,6), (7,9,6,7), (9,6,7,9) -- bucles
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add("true");
list2.add("true");
list1.add("false");
list2.add("false");
assumeTrue(list1.equals(list2));
