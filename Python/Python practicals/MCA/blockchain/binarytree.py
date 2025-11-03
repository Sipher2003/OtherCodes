#Implementation of Binary Tree
class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key
class BinaryTree:
    def __init__(self):
        self.root = None

    def insert(self, key):
        if self.root is None:
            self.root = Node(key)
        else:
            self._insert_rec(self.root, key)

    def _insert_rec(self, root, key):
        if key < root.val:
            if root.left is None:
                root.left = Node(key)
            else:
                self._insert_rec(root.left, key)
        else:
            if root.right is None:
                root.right = Node(key)
            else:
                self._insert_rec(root.right, key)

    def inorder_traversal(self, root):
        return self._inorder_rec(root)

    def _inorder_rec(self, root):
        res = []
        if root:
            res = self._inorder_rec(root.left)
            res.append(root.val)
            res = res + self._inorder_rec(root.right)
        return res
if __name__ == "__main__":
    btree = BinaryTree()
    btree.insert(50)
    btree.insert(30)
    btree.insert(20)
    btree.insert(40)
    btree.insert(70)
    btree.insert(60)
    btree.insert(80)

    print("Inorder traversal of the binary tree is:")
    print(btree.inorder_traversal(btree.root))
    