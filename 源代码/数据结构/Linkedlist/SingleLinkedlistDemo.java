package Linkedlist;

import java.util.Scanner;

public class SingleLinkedlistDemo {
    public static void main(String[] args) {

        // 创建链表
        Scanner S = new Scanner(System.in);
        SingleLinkedlist.jugde(S);

    }

}

class SingleLinkedlist {
    // 菜单函数
    static void Menu() {
        System.out.println("          线性表的操作");
        System.out.println("   软件一班 蔡佳霖 216230119");
        System.out.println("|============================|");
        System.out.println("|      (1)-初始化            |");
        System.out.println("|      (2)-建立线性表        |");
        System.out.println("|      (3)-添加元素          |");
        System.out.println("|      (4)-显示内容          |");
        System.out.println("|      (5)-更改内容          |");
        System.out.println("|      (6)-删除内容          |");
        System.out.println("|      (7)-线性表长度        |");
        System.out.println("|      (8)-排序              |");
        System.out.println("|      (9)-线性表逆序        |");
        System.out.println("|      (10)-查找内容         |");
        System.out.println("|      (0)-退出              |");
        System.out.println("|============================|");
    }

    static void sortMenu() {
        System.out.println("|============================|");
        System.out.println("|      (1)-冒泡排序          |");
        System.out.println("|      (2)-选择排序          |");
        System.out.println("|      (3)-插入排序          |");
        System.out.println("|      (0)-退出              |");
        System.out.println("|============================|");
    }

    static void jugde(Scanner S) {
        SingleLinkedlist link = null;
        Scanner J = new Scanner(System.in);
        NodeJobW[] n = null;
        boolean flag = true;
        while (flag) {
            Menu();
            switch (S.next()) {
                case "1":
                    link = initList();
                    System.out.println("初始化成功！");
                    break;
                case "2":
                    if (link == null) {
                        System.out.println("请先初始化");
                        break;
                    }
                    System.out.println("===========建立线性表==========");
                    n = create(J, n);
                    break;
                case "3":
                    if (link == null) {
                        System.out.println("请先初始化");
                        break;
                    }
                    if (n == null) {
                        System.out.println("请先建表");
                        break;
                    }
                    System.out.println("======添加元素======");
                    for (int i = 0; i < n.length; i++) {
                        System.out.println("\n第" + (i + 1) + "位同学的学号为:");
                        n[i].no = J.nextInt();
                        System.out.println("\n第" + (i + 1) + "位同学的姓名为:");
                        n[i].name = J.next();
                        link.add(n[i]);
                    }
                    break;
                case "4":
                    if (link == null) {
                        System.out.println("请先初始化");
                        break;
                    }
                    if (n == null) {
                        System.out.println("请先建表");
                        break;
                    }
                    System.out.println("=========显示内容=========");
                    link.list();
                    break;
                case "5":
                    if (link == null) {
                        System.out.println("请先初始化");
                        break;
                    }
                    if (n == null) {
                        System.out.println("请先建表");
                        break;
                    }
                    System.out.println("==========更改内容=========");

                    NodeJobW temp = new NodeJobW();
                    System.out.println("你要更改学号为：");
                    temp.no = J.nextInt();
                    System.out.println("的姓名为：");
                    temp.name = J.next();
                    link.update(temp);
                    break;
                case "6":
                    if (link == null) {
                        System.out.println("请先初始化");
                        break;
                    }
                    if (n == null) {
                        System.out.println("请先建表");
                        break;
                    }
                    System.out.println("============删除内容=============");
                    int tmpV = 0;
                    System.out.println("你要删除学号为：");
                    tmpV = J.nextInt();
                    link.delete(tmpV);
                    System.out.println("删除完毕");
                    break;
                case "7":
                    if (link == null) {
                        System.out.println("请先初始化");
                        break;
                    }
                    if (n == null) {
                        System.out.println("请先建表");
                        break;
                    }
                    System.out.println("==========线性表长度=========");
                    System.out.println("线性表有" + link.LinkLength() + "个元素");
                    break;
                case "8":
                    if (link == null) {
                        System.out.println("请先初始化");
                        break;
                    }
                    if (n == null) {
                        System.out.println("请先建表");
                        break;
                    }
                    System.out.println("==========排序=========");

                    boolean sortflag = true;
                    while (sortflag) {
                        System.out.println("请选择排序方式:");
                        sortMenu();
                        switch (J.next()) {
                            case "1":
                                n = link.sort(n);
                                System.out.println("排序后的内容");
                                for (int k = 0; k < n.length; k++) {
                                    System.out.println("学号为：" + n[k].no + ",姓名为：" + n[k].name);
                                }
                                break;
                            case "2":
                                n = link.selectSort(n);
                                System.out.println("排序后的内容");
                                for (int k = 0; k < n.length; k++) {
                                    System.out.println("学号为：" + n[k].no + ",姓名为：" + n[k].name);
                                }
                                break;
                            case "3":
                                n = link.insetSort(n);
                                System.out.println("排序后的内容");
                                for (int k = 0; k < n.length; k++) {
                                    System.out.println("学号为：" + n[k].no + ",姓名为：" + n[k].name);
                                }
                                break;
                            case "0":
                                sortflag = false;
                                System.out.println("退出排序！");
                                break;

                        }

                    }
                    break;
                case "9":
                    if (link == null) {
                        System.out.println("请先初始化");
                        break;
                    }
                    if (n == null) {
                        System.out.println("请先建表");
                        break;
                    }
                    System.out.println("==========线性表逆序=========");
                    if (link.LinkLength() == 0) {
                        System.out.println("链表为空，不需要进行逆序");
                        break;
                    }
                    n[0] = link.reverselLinklist(n[0]);
                    System.out.println("逆序完毕");
                    System.out.println("逆序后的内容");
                    while (n[0] != null) {
                        System.out.println("学号为：" + n[0].no + ",姓名为：" + n[0].name);
                        n[0] = n[0].next;
                    }
                    break;
                case "10":
                    if (link == null) {
                        System.out.println("请先初始化");
                        break;
                    }
                    if (n == null) {
                        System.out.println("请先建表");
                        break;
                    }
                    System.out.println("===========线性表查找==========");
                    System.out.println("你要查找学号为：");
                    int tmpVV = J.nextInt();
                    link.select(tmpVV);
                    break;
                case "0":
                    System.out.println("已退出");
                    flag = false;
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    // 先初始化一个不能动的头节点 不存放数据
    private static NodeJobW head = new NodeJobW(0, "");

    // 初始化 创建一个空的链表
    public static SingleLinkedlist initList() {
        SingleLinkedlist List = new SingleLinkedlist();
        return List;
    }

    // 创建空节点
    public static NodeJobW[] create(Scanner J, NodeJobW[] n) {
        int tmp = 0;
        System.out.println("您要添加几个同学信息？");
        System.out.print("请输入:");
        tmp = J.nextInt();
        if (tmp <= 0) {
            System.out.println("请输入大于0的同学数");
            return null;
        }
        n = new NodeJobW[tmp];
        for (int i = 0; i < tmp; i++) {
            n[i] = new NodeJobW();// 实例化每一个节点

        }

        System.out.println("已添加" + n.length + "位同学");
        return n;
    }

    // 无顺序添加节点到单链表
    public void add(NodeJobW Node) {
        // 思路：当不考虑编号顺序时
        // 1.找到当前链表的最后节点
        // 2.将最后这个节点的next指向新节点

        NodeJobW tmp = head;
        // 因为head节点不能动，因此我们需要一个辅助变量 tmp
        while (true) {
            // 遍历链表,找到最后
            if (tmp.next == null) {
                break;
                // 找到就跳出循环
            }
            tmp = tmp.next;
            // 没找到就后移
        }
        // 当退出while循环时，tmp已经为最后一个节点了
        tmp.next = Node;
        // tmp的下一个节点等于 Node（新节点）
    }

    // 顺序添加节点到单链表
    public static void add2(NodeJobW Node) {
        NodeJobW tmp = head;
        // 获取头节点
        boolean flag = false;// 标志添加编号是否存在
        while (true) {
            if (tmp.next == null) {
                break;
            }
            if (tmp.next.no > Node.no) {
                break;
            } else if (tmp.next.no == Node.no) {
                // 说明编号已经存在
                flag = true;
                break;
            }
            tmp = tmp.next;
            // 后移
        }
        // 判断是否存在
        if (flag) {
            System.out.println("准备插入的" + Node.no + "已经存在");
        } else {
            Node.next = tmp.next;
            // Node指向tmp的下一个
            tmp.next = Node;
            // tmp指向Node
        }

    }

    // 显示链表
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        // 先判断链表是否为空
        NodeJobW tmp = head.next;
        // 因为头节点不能动，所以需要辅助变量来遍历
        while (true) {
            if (tmp == null) {
                System.out.println("显示完毕");
                break;
            }
            System.out.println(tmp.toString());
            // 输出节点信息
            tmp = tmp.next;
            // 将next后移

        }
    }

    // 更改链表元素
    public void update(NodeJobW newNode) {

        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        NodeJobW tmp = head.next;
        // tmp指向head的下一个节点
        boolean flag = false;
        while (true) {
            if (tmp == null) {
                // 已经遍历完链表了
                break;
            }
            if (tmp.no == newNode.no) {
                flag = true;
                break;
            }
            tmp = tmp.next;

        }

        if (flag) {
            tmp.name = newNode.name;

        } else {
            System.out.printf("没有找到学号为%d的同学", newNode.no);
        }
    }

    // 删除链表元素
    public void delete(int no) {
        boolean flag = false;
        NodeJobW tmp = head;
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        while (true) {

            if (tmp.next == null) {
                break;
            }
            if (tmp.next.no == no) {
                flag = true;
                break;
            }
            tmp = tmp.next;
        }
        if (flag) {
            tmp.next = tmp.next.next;
        } else {
            System.out.println("不存在编号为" + no + "的同学");
        }

    }

    // 查找
    public void select(int no) {
        NodeJobW tmp = head;
        boolean flag = false;
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        while (true) {
            if (tmp.next == null) {
                break;
            }
            if (tmp.no == no) {
                flag = true;
                break;
            }
            tmp = tmp.next;
        }
        if (flag) {
            System.out.println("编号为" + no + "的信息为：");
            System.out.println("姓名为:" + tmp.name);

        } else {
            System.out.println("不存在");
        }
    }

    // 线性表长度
    public int LinkLength() {
        int count = 0;
        NodeJobW tmp = head;
        while (true) {
            // 遍历链表,找到最后
            if (tmp.next == null) {
                break;
                // 找到就跳出循环
            }
            count++;
            tmp = tmp.next;
            // 没找到就后移
        }
        return count;
    }

    // 线性表逆序
    public NodeJobW reverselLinklist(NodeJobW head) {
        /*
         * 1.把head的下一个位置拿给next
         * 2.head的下一个位置指向pre
         * 3.pre拿到head当前位置
         * 4.head后移
         */
        NodeJobW pre = null;
        NodeJobW next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    // 冒泡排序
    public NodeJobW[] sort(NodeJobW[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].no > arr[j + 1].no) {
                    NodeJobW temp = null;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        return arr;
    }

    // 选择排序
    public NodeJobW[] selectSort(NodeJobW[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        } // 考虑边界条件
        int n = arr.length;
        // 0 —— n-1
        // 1 —— n-1
        // 2 —— n-1
        for (int i = 0; i < n; i++) {
            // i —— n-1 这个for界定左侧范围
            int minIndex = i;// 设置初始位置
            for (int j = i + 1; j < n; j++) {
                minIndex = arr[j].no < arr[minIndex].no ? j : minIndex;
                // 如果后者比前者小则将minIndex更新为后面的位置，否则不变
            } // 获取最小值位置
            NodeJobW cur = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = cur;

        }
        return arr;
    }// 获取到位置后即可交换位置

    // 插入排序
    public NodeJobW[] insetSort(NodeJobW[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr == null || arr.length < 2) {
                return null;
            }
            // 0~0已完成
            // 0~1
            // 0~2
            // 0~3观察结尾位置在变
            // 0~n-1
            for (int end = 1; end < arr.length; end++) {
                for (int pre = end - 1; pre >= 0 && arr[pre].no > arr[pre + 1].no; pre--) {
                    // pre 新数的前一个位置
                    NodeJobW tmp;
                    tmp = arr[pre];
                    arr[pre] = arr[pre + 1];
                    arr[pre + 1] = tmp;
                }
            }

        }
        return arr;
    }

}

class NodeJobW {
    public int no;
    public String name;
    public NodeJobW next;
    // 保存指向下一个节点的地址

    public NodeJobW(int no, String name) {
        // 构造器
        this.no = no;// 编号
        this.name = name;

    }

    public NodeJobW() {

    }

    public String toString() {
        // 重写toString
        return "学号为：" + no + ",姓名为：" + name;

    }

}
// Node的定义
// 定义一个Node，每一个Node对象就是一个节点