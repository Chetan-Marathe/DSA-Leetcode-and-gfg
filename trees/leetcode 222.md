Count nodes in tree

if(root==null){
    return 0;
}

int leftans = countNodes(root.left);
int rightans = countNodes(root.right);

return leftans+rightans+1;