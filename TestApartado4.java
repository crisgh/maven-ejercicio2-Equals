//Requisitos: 	(1,3,4) , (1,3,5) 
//		(3,5,6)
//		(5,6,7) , (5,6,10) 
//		(6,7,9)
//		(7,9,10) , (7,9,6) 
//		(9,6,7) , (9,6,8)

// requisitos de prueba: (1,3,5) , (3,5,6) , (5,6,7) , (6,7,9) , (7,9,10)
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add("foo");
list2.add("bar");
assumeFalse(list1.equals(list2));


// requisitos de prueba: (1,3,5),(3,5,6),(5,6,10)
List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
assumeTrue(list1.equals(list2));


// requisitos de prueba: (1,3,5),(3,5,6),(5,6,7),(6,7,9),(7,9,6),(9,6,7),(9,6,10)

List<String> list1 = new ArrayList<String>();
List<String> list2 = new ArrayList<String>();
list1.add("true");
list1.add("false");
list2.add("true");
list2.add("false");
assumeTrue(list1.equals(list2));
