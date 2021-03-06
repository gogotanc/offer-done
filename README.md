# 剑指 Offer 一书题集

[![GitHub stars](https://img.shields.io/badge/build-passing-blue.svg?style=flat-square)](https://github.com/gogotanc/offer-done)

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

### 面试题 36: 数组中的逆序对

在数组中的两个数字如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case36/InversePairs.java)

### 面试题 37: 两个链表的第一个公共节点

输入两个链表，找出他们的第一个公共节点。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case37/FirstCommonNode.java)

### 面试题 38: 数字在排序数组中出现的次数

统计一个数字在排序数组中出现的次数。例如输入排序数组 {1, 2, 3, 3, 3, 3, 4, 5} 和数字 3，由于 3 在这个数组中出现了 4 次，因此输出 4。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case38/GetNumberOfK.java)

### 面试题 39: 二叉树的深度

题目一：输入一个二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成的一条路径，最长路径的长度为树的深度。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case39/TreeDepth.java)

题目二：输入一颗二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过 1，那么它就是一颗平衡二叉树。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case39/IsBalanced.java)

### 面试题 40: 数组中只出现一次的数字

一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写出程序找出这两个只出现一次的数字。要求时间复杂度是 O(n)，空间复杂度是 O(1)。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case40/FindNumberAppearOnce.java)

### 面试题 41: 和为 S 的两个数字 VS 和为 S 的连续正数序列

题目一：输入一个递增排序的数组和一个数字 s，在数组中查找两个数，使得它们的和正好是 s。如果有多对数字的和等于 s，输出任意一对即可。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case41/TwoNumberWithSum.java)

题目二：输入一个正数 s，打印出所有和为 s 的连续正数序列（至少含有两个数）。例如输入 15，由于 1 + 2 + 3 + 4 + 5 = 4 + 5 + 6 = 7 + 8 = 15，所以结果打印出三个连续序列 1～5、4～6 和 7～8。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case41/ContinuesSequenceWithSum.java)

### 面试题 42: 翻转字符串 VS 左旋转字符串

题目一：输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串 "I am a student."，则输出 "student. a am I"。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case42/ReverseString.java)

题目二：字符串的左旋转操作是把字符串前面的若干个字母转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如输入字符串 "agcdefg" 和数字 2，该函数将返回左旋转 2 位得到的结果 "cdefgab"。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case42/LeftRotateString.java)

### 面试题 43: n 个骰子的点数

把 n 个骰子扔在地上，多有骰子朝上一面的点数和为 s。输入 n，打印出 s 的所有可能值出现的概率。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case43/PrintProbability.java)

### 面试题 44: 扑克牌的顺子

 从扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这 5 张牌是不是连续的。2~10 为数字本身，A 为 1，J 为 11，Q 为 12，K 为 13，而大小王可以看成任意数字。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case44/IsContinuous.java)

### 面试题 45: 圆圈中最后剩下的数字

0, 1, ..., n - 1 这 n 个数字排成一个圆圈，从数字 0 开始每次从这个圆圈里删除第 m 个数字。求出这个圆圈里剩下的最后一个数字。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case45/LastRemaining.java)

### 面试题 46: 求 1 + 2 + 3 + ... + n

求 1 + 2 + 3 + ... + n，要求不能使用乘除法、for、while、if、else、switch、case 等关键字及条件判断语句（A ? B : C）。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case46/Accumulate.java)

### 面试题 47: 不使用加减乘除做加法

写一个函数，求两个整数之和，要求在函数体内不得使用加减乘除四则运算。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case47/AddTwoNumber.java)

### 面试题 48: 不能继承的类

用 C++ 设计一个不能被继承的类。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case48/FinalClass.java)

### 面试题 49: 把字符串转换成整数

把字符串转换成整数。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case49/StringToInt.java)

### 面试题 50: 树中两个节点的最低公共祖先

寻找到树中两个节点的最低公共祖先。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case50/CommonParent.java)

### 面试题 51: 数组中重复的数字

在一个长度为 n 的数组里所有的数字都在 0 ~ n - 1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case51/Duplication.java)

### 面试题 52: 构建乘积数组

给定一个数组 A[0, 1, 2, ..., n - 1]，请构建一个数组 B[0, 1, 2, ..., n - 1]，其中 B 中的元素 B[i] = A[0] * ... * A[i - 1] * A[i + 1] * ... * A[n - 1]。不能使用除法。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case51/Multiply.java)

### 面试题 53: 正则表达式匹配

请实现一个函数用来匹配包含 '.' 和 '*' 的正则表达式。模式中的字符 '.' 表示任意一个字符，而 '*' 表示它前面的字符可以出现任意次（含 0 次）。在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串 "aaa" 与模式 "a.a" 和 "ab*ac*c" 匹配，但与 "aa.a" 及 "ab*a" 均不匹配。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case53/Pattern.java)

### 面试题 54: 表示数值的字符串

请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串 "+100"、"5e2"、"-123"、"3.1416" 及 "-1E-16" 都表示数值，但 "12e"、"1a3.14"、"1.2.3"、"+-5" 及 "12e+5.4" 都不是。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case54/JudgeNumber.java)

### 面试题 55: 字符流中第一个不重复的字符

请实现一个函数用来找出字符流中第一个只出现一次的字符。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case55/CharFirstAppear.java)

### 面试题 56: 链表中环的入口节点

一个链表包含环，如何找到环的入口节点？

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case56/CycleEntry.java)

### 面试题 57: 删除链表中重复的节点

在一个排序的链表中，如何删除重复的节点？

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case57/DeleteRepeatNode.java)

### 面试题 58: 二叉树的下一个节点

给定一颗二叉树和其中的一个节点，如何找出中序遍历顺序的下一个节点？树中的节点除了有两个分别指向左右子节点的指针外，还有一个指向父节点的指针。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case58/NextTreeNode.java)

### 面试题 59: 对称的二叉树

请实现一个函数，用来判断一颗二叉树是不是对称的。如果一颗二叉树和它的镜像一样，则它是对称的。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case59/SymmetryTree.java)

### 面试题 60: 把二叉树打印成多行

从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case60/PrintByLine.java)

### 面试题 61: 按之字形顺序打印二叉树

请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，以此类推。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case61/PrintByS.java)

### 面试题 62: 序列化二叉树

请实现两个函数，分别用来序列化和反序列化二叉树。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case62/SerializeBinaryTree.java)

### 面试题 63: 二叉搜索树的第 K 个节点

给定一颗二叉搜索树，请找出其中第 K 大的节点。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case63/BinaryTreeKth.java)

### 面试题 64: 数据流中的中位数

如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均数。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case64/StreamMedian.java)

### 面试题 65: 滑动窗口的最大值

给定一个数组和滑动窗口大小，请找出所有滑动窗口里的最大值。例如，如果输入数组 {2, 3, 4, 2, 6, 2, 5, 1} 及滑动窗口的大小 3，那么一共存在 6 个滑动窗口，它们的最大值分别是 {4, 4, 6, 6, 6, 5}。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case65/MaxInSlidingWindow.java)

### 面试题 66: 矩阵中的路径

请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。如果某一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case66/StringPathInMatrix.java)

### 面试题 67: 机器人的运动范围

地上有一个 m 行 n 列的方格。一个机器人从坐标 (0,0) 的格子开始移动，它每一次可以向左、右、上、下移动一格，但不能进入行坐标和列坐标的数位之和大于 K 的格子。例如，当 K 为 18 时，机器人能够进入方格 (35,37)，因为 3 + 5 + 3 + 7 = 18。但它不能进入方格 (35,38)，因为 3 + 5 + 3 + 8 = 19。请问该机器人能够到达多少格子？

解答：[代码地址](https://github.com/gogotanc/offer-done/blob/master/src/main/java/org/offer/case67/RobotMove.java)

## 参考文章

1. [如何正确地写出单例模式](http://wuchong.me/blog/2014/08/28/how-to-correctly-write-singleton-pattern/)
