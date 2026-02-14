class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val , TreeNode left, TreeNode right){
        this.val = val;
        this.right = right;
        this.left = left;
    }
}

public class BinaryTree{
    TreeNode root;
    public BinaryTree(){
        this.root = null;
    }
    public void displayBFS(){
        bfs(this.root);
    }
    public void bfs (TreeNode node){
        if(node == null){
            return;
        }
        bfs(node.left);
        System.out.println(node.val);
        bfs(node.right);
    }
    public void insertValue(int val){
        TreeNode temp = root;
        TreeNode node = new TreeNode(val);
        if(temp == null){
            this.root = node;
            return;
        }
        TreeNode prev = new TreeNode();
        
        while(temp != null){
            prev = temp;
            if(temp.val > val ){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        if(prev.val > val){
            prev.left = node;
        }else{
            prev.right = node;
        }
        return ;
    }
    
    public void main(String[] args){
        BinaryTree b = new BinaryTree();
        b.insertValue(45);
        b.insertValue(25);
        b.insertValue(5);
        b.insertValue(245);
        b.insertValue(25);
        b.insertValue(565);
        b.displayBFS();
        // System.out.println("Hello");

    }
}
/* 
step1

45


step2
            25 < 45
     45
    /  \
  25    null


step3 
            25 > 5
        45
       /  \
     25    null
    /
   5

step4
            45 < 245
        45
       /  \
     25    245
    /
   5

step5
            245 < 565
        45
       /  \
     25    245
    /  \     \
   5    25    565
   
*/