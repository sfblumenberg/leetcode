/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def sumOfLeftLeaves(root: TreeNode): Int = {

        def isLeaf(node:TreeNode):Boolean = {
            if (node.left == null && node.right == null) true
            else false
        }

        def sumTree(node:TreeNode):Int = {
            val left = {
                if (node.left == null) 0
                else if (isLeaf(node.left)) node.left.value
                else sumTree(node.left)
            }
            val right = {
                if (node.right == null) 0
                else if (isLeaf(node.right)) 0
                else sumTree(node.right)
            }
            left + right
        }
        if (root == null) 0
        else sumTree(root)
        
    }
}
