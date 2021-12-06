package Binary_Trees.HashTable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		HashTableOperations obj = new HashTableOperations(6);
		obj.put("to");
		obj.put("be");
		obj.put("or");
		obj.put("not");
		obj.put("to");
		obj.put("be");
		
		obj.display();
		
	}

}
