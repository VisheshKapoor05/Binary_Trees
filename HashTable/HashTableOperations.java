package Binary_Trees.HashTable;

public class HashTableOperations {
	
	static public class ListNode {
		Object key;
		int value = 0;
		ListNode next = null;
	}
	
	ListNode[] table;

	public HashTableOperations(int initializeValue) {
		this.table = new ListNode[initializeValue];
	}
	
	public void put(Object key) {
		int bucket = HashFunction(key);
		System.out.println("bucket "+bucket +" key: " +key);
		//ListNode table[bucket] = table[bucket];
		
		if(table[bucket] == null) {
			ListNode node = new ListNode();
			node.key = key;
			node.value = 1;
			table[bucket] = node;
			System.out.println("New index added: " +table[bucket].key);
			//table[bucket] = node;
		}
		else {
			while(table[bucket].next != null) {
				if(table[bucket].key.equals(key)) {
					table[bucket].value++;
					System.out.println(key +" key is added, value: " +table[bucket].value);
					break;
				}
				table[bucket] = table[bucket].next;
			}
			if(!table[bucket].key.equals(key)) {
				ListNode newNode = new ListNode();
				newNode.key = key;
				newNode.value = 1;
				table[bucket].next = newNode;
				System.out.println("key added in linkedList " +table[bucket].next.key);
			}
		}
	}

	private int HashFunction(Object key) {
		return (Math.abs(key.hashCode()))%table.length;
	}
	
	
	
	public void display() {
		
		for(int i=0; i<table.length; i++) {
			
			if(table[i] != null) {
				if(table[i].next != null)
				{
					ListNode currentNode = table[i];
					while(currentNode != null) {
						System.out.println("key " +currentNode.key +" value "+ currentNode.value +" next: " +currentNode.next);
						currentNode = currentNode.next;
					}
				}
				else {
					System.out.println("key " + table[i].key +" value "+ table[i].value +" next: " +table[i].next);
				}	
			}
			else {
				//System.out.println("key " + table[i].key +" value "+ table[i] +" next: " +table[i].next);
			}
		}	
	}
	
}
