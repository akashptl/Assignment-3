class BST { 
  
   
    class Node { 
        
    	int key; 
        Node left;
        Node right; 
       
        public Node(int item) { 
            
        	key = item; 
            left = right = null; 
        } 
    } 
    	Node root; 
  
   
    BST() {  
        root = null;  
    } 
  
    
    void put(int key) { 
       root = search(root, key); 
    } 
      
   
   
    Node search(Node root, int key) { 
  
       
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
     
        if (key < root.key) 
            root.left = search(root.left, key); 
        else if (key > root.key) 
            root.right = search(root.right, key); 
  
        return root; 
    } 
  
    
  
    void inorder()  { 
       sortedTree(root); 
    } 
  
   
    void sortedTree(Node root) { 
        if (root != null) { 
            sortedTree(root.left); 
            System.out.print(root.key + " "); 
            sortedTree(root.right); 
        } 
    } 
    
    
  Node rotateRight(Node root, Key key) {
	  	
	  	if (root == null) 
		return null;
		int cmp = key.compatreTo(x.key)
	  	
	  	return null;
	  	
	  	
	  	
  }
    
    
    public static void main(String[] args) { 
        BST tree = new BST(); 
        
        /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
        tree.put(50); 
        tree.put(30); 
        tree.put(20); 
        tree.put(40); 
        tree.put(70); 
        tree.put(60); 
        tree.put(80); 
  
        // print inorder traversal of the BST 
        tree.inorder(); 
    } 
} 

 
