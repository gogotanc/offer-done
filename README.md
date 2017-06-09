# 剑指 Offer 一书题集

最近在看《剑指 Offer》，这里使用 **Java** 解决书中的题目。

## 题目

### 面试题 1：赋值运算符函数

如下为类型 CMString 的声明，请为该类型添加赋值运算符函数。

```c++
class CMString
{
  public:
    CMString(char* pData = Null);
    CMString(const CMString& str);
    ~CMString(void);
  private:
    char* m_pData;
}
```

解答：无

### 面试题 2：实现 Singleton 模式

设计一个类，我们只能生成该类的一个实例。

解答：[代码地址](https://github.com/gogotanc/offer-done/tree/master/src/main/java/org/offer/case02)

**注意：** 使用双重检验锁的方式有很多需要注意的细节，为什么是双重检验，为什么使用 volatile 关键字，详情见[参考文章](#参考文章)第一篇。

### 面试题 3：二维数组的查找

在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case03/ArraySearch.java)

### 面试题 4：替换空格

请实现一个函数，把字符串中的每个空格替换成 ”%20“。例如输入 ”We are happy.“，则输出 ”We%20are%20happy.”。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case04/ReplaceSpace.java)

### 面试题 5：从尾到头打印链表

输入一个链表的头节点，从尾到头反过来打印出每个节点的值。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case05/PrintList.java)

### 面试题 6：重建二叉树

输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列 {1, 2, 4, 7, 3, 5, 6, 8} 和中序遍历序列 {4, 7, 2, 1, 5, 3, 8, 6}，则重建出二叉树并输出它的头节点。二叉树结点的定义如下：

```
struct BinaryTreeNode
{
    int m_nValue;
    BinaryTreeNode m_pLeft;
    BinaryTreeNode m_pRight;
};
```

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case06/BuildTree.java)

### 面试题 7：用两个栈实现队列

用两个栈实现一个队列。请实现它的两个函数 appendTail 和 deleteHead，分别完成在队列尾部插入结点和在队列头部删除结点的功能。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case07/QueueByStack.java)

### 面试题 8：旋转数组的最小数字

把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如数组 {3, 4, 5, 1, 2} 为数组 {1, 2, 3, 4, 5} 的一个旋转，该数组的最小为 1。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case08/RotatingArray.java)

### 面试题 9：斐波那契数列

写一个函数，输入 n，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：

```
F[0] = 0               (n =  0)
F[1] = 1               (n =  1)
F[n] = F[n-1]+ F[n-2]  (n => 2)
```

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case09/Fibonacci.java)

### 面试题 10：二进制中 1 的个数

请实现一个函数，输入一个证书，输出该数的二进制表示中 1 的个数。例如把 9 表示成二进制是 1001，有 2 位是 1。因此如果输入 9，该函数输出 2。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case10/CountBit.java)

### 面试题 11：数值的整数次方

实现函数 double Power(double base, int exponent)，求 base 的 exponent 次方。不得使用库函数，同时不需要考虑大数问题。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case11/Power.java)

### 面试题 12：打印 1 到最大的 n 位数

输入数字 n，按顺序打印出从 1 到最大 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case12/PrintNum.java)

### 面试题 13：在 O(1) 时间删除链表结点

给定单向链表的头指针和一个结点指针，定义一个函数在 O(1) 时间删除该结点。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case13/DeleteListNode.java)

### 面试题 14：调整数组顺序使奇数位于偶数前面

输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case14/ReorderOddEven.java)

### 面试题 15：链表中倒数第 K 个结点

输入一个链表，输出该链表倒数第 K 个结点。为了符合大多数人的习惯，本题从 1 开始计数，即链表的尾结点是倒数第 1 个结点。例如一个链表有 6 个结点，从头结点开始它们的顺序依次是 1、2、3、4、5、6。这个链表的倒数第 3 个结点是值为 4 的结点。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case15/KthNodeFromEnd.java)

### 面试题 16：反转链表

定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case16/ReverseList.java)

### 面试题 17：合并两个排序的链表

输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case17/MergeSortedList.java)

### 面试题 18：树的子结构

输入两颗二叉树 A 和 B，判断 B 是不是 A 的子结构。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case18/SubStructureInTree.java)

### 面试题 19：二叉树的镜像

请完成一个函数，输入一个二叉树，该函数输出它的镜像。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case19/MirrorOfBinaryTree.java)

### 面试题 20：顺时针打印矩阵

输入一个矩阵，按照从外向里以顺时针的顺序打印出每一个数字。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case20/PrintMatrix.java)

### 面试题 21：包含 min 函数的栈

定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数。在该栈中，调用 min、push、pop 的时间复杂度都是 O(1)。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case21/StackWithMin.java)

### 面试题 22：栈的压入、弹出序列

输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出序列。假设压入栈的所有数字均不相等。例如序列 1、2、3、4、5 是某栈的压栈序列，序列 4、5、3、2、1 是该压栈序列对应的一个弹出序列，但 4、3、5、1、2 就不可能是该压栈序列的弹出序列。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case22/StackPushPopOrder.java)

### 面试题 23：从上往下打印二叉树

从上往下打印二叉树的每个结点，同一层的结点按照从左到右的顺序打印。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case23/PrintTree.java)

### 面试题 24：二叉搜索树的后序遍历序列

输入一个整数数组，判断该数组是否为某二叉搜索树的后序遍历的结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case24/VerifySequenceOfBST.java)

### 面试题 25：二叉树中和为某一值的路径

输入一颗二叉树和一个整数，打印出二叉树结点值和为输入整数的所有路径。从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case25/FindPath.java)

### 面试题 26: 复杂链表的复制

请实现函数 complexListNodeClone(ComplexListNode head)，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点外，还有一个 sibling 指向链表中的任意节点或者 null。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case26/ComplexList.java)

### 面试题 27: 二叉搜索树与双向链表

输入一颗二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case27/ConvertBinarySearchTree.java)

### 面试题 28: 字符串的排列

输入一个字符串，打印出该字符串中字符的所有排列。例如输入字符串 abc，则打印出字符 a、b、c 所能排列出来的所有字符串 abc、acb、bac、bca、cab 和 cba。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case28/Permutation.java)

### 面试题 29: 数组中出现次数超过一半的数字

数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入长度为 9 的数组 {1, 2, 3, 2, 2, 2, 2, 5, 4, 2}。由于数字 2 在数组中出现了 5 次，超过数组长度的一半，因此输出 2。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case29/FindNumber.java)

### 面试题 30: 最小的 K 个数

输入 n 个整数，找出其中最小的 k 个数。例如输入 4、5、1、6、2、7、3、8 这 8 个数字，则最小的 4 个数字是 1、2、3、4。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case30/GetLeastNumber.java)

### 面试题 31: 连续子数组的最大和

输入一个整型数组，数组里有正数也有负数，数组中一个或连续的多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为 O(n)。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case31/SumOfSubarray.java)

### 面试题 32: 从 1 到 n 整数中 1 出现的次数

输入一个整数 n，求从 1 到 n 这 n 个整数的十进制表示中 1 出现的次数。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case32/CountOne.java)

### 面试题 33: 把数组排成最小的数

输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出所有数字中最小的一个。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case33/PrintMinNum.java)

### 面试题 34: 丑数

我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number)。求按从小到大的顺序的第 1500 个丑数。例如 6、8 都是丑数，但 14 不是，因为它包含因子 7。习惯上我们把 1 当做第一个丑数。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case34/UglyNumber.java)

### 面试题 35: 第一个只出现一次的字符

在字符串中找出第一个只出现一次的字符。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case35/FirstNotRepeatingChar.java)

## 参考文章

1. [如何正确地写出单例模式](http://wuchong.me/blog/2014/08/28/how-to-correctly-write-singleton-pattern/)
