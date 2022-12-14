class newNode
{
	int data;
	newNode left,middle,right;
	public newNode(int data)
	{
		this.data = data;
		left = middle = right = null;
	}
}

class Terniarytreetolinkedlist {
	static newNode tail;
	public static void push(newNode node)
	{
		
		tail.right = node;				
		node.left = tail;		
		node.middle = node.right = null;
		tail = node;			
	}
	
	
	public static void ternaryTree(newNode node,newNode head)
	{
		if(node == null)
			return;					
		newNode left = node.left;
		newNode middle = node.middle;
		newNode right = node.right;
		if(tail != node)
		
			
			push(node);			
			
		
		ternaryTree(left,head);		
		ternaryTree(middle,head);
		ternaryTree(right,head);
	}

	
	public static newNode startTree(newNode root)
	{
		
		newNode head = root;
		tail = root;
		ternaryTree(root,head);
		
		
		return head;		
	}
	
	
	public static void printList(newNode head)
	{
		System.out.print("Created Double Linked list is:\n");
		while(head != null)
		{
			System.out.print(head.data + " ");
			head = head.right;
		}
	}
	
	
	public static void main(String args[])
	{
		
		newNode root = new newNode(30);
		root.left = new newNode(5);
		root.middle = new newNode(11);
		root.right = new newNode(63);
		root.left.left = new newNode(1);
		root.left.middle = new newNode(4);
		root.left.right = new newNode(8);
		root.middle.left = new newNode(6);
		root.middle.middle = new newNode(7);
		root.middle.right = new newNode(15);
		root.right.left = new newNode(31);
		root.right.middle = new newNode(55);
		root.right.right = new newNode(65);
		
	
		newNode head = startTree(root);		
		printList(head);
	}
}


