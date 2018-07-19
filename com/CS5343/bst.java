package com.CS5343;

public class bst {
    public Node rinsert(Node node, int value)
    {
        if(node==null)
        {
            Node root = new Node();
            root.val = value;
            root.lchild = null;
            root.rchild = null;
            return root;
        }
        else if(value > node.val)
        {
            if(node.rchild==null)
            {
                Node tmp = new Node();
                tmp.val = value;
                node.rchild = tmp;
            }

            else
            {
                rinsert(node.rchild, value);
            }
        }

        else if (value < node.val)
        {
            if(node.lchild==null)
            {
                Node tmp = new Node();
                tmp.val = value;
                node.lchild = tmp;
            }
            else
            {
                rinsert(node.lchild, value);
            }
        }
        return node;

    }

    public Node delete(Node root, int value)
    {
        if(root==null)
        {
            System.out.println("\nNumber not found");
            return root;
        }

        if(value<root.val)
        {
            root.lchild = delete(root.lchild,value);
        }
        else if (value>root.val)
        {
            root.rchild = delete(root.rchild,value);
        }

        else
        {
            if (root.lchild==null && root.rchild==null)
            {
                //System.out.println("Deleting "+root.val);
                return null;
            }
            else if(root.lchild==null)
            {
                //System.out.println("Deleting "+root.val);
                return root.rchild;
            }
            else if (root.rchild==null)
            {
                //System.out.println("Deleting"+root.val);
                return root.lchild;
            }
            else
            {
                Integer successor = Successor(root.rchild);
                root.val = successor;
                root.rchild = delete(root.rchild, successor);
                //System.out.println("Deleting "+value);
            }
        }
        return root;
    }

    public void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.lchild);
        System.out.print(" "+root.val);
        inorder(root.rchild);
    }

    public int Successor(Node root)
    {
        if(root.lchild!=null)
        {
            return Successor(root.lchild);
        }
        return root.val;
    }
}
