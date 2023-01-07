package Linkedlist;

import java.util.Scanner;

public class SingleLinkedlistDemo {
    public static void main(String[] args) {

        // ��������
        Scanner S = new Scanner(System.in);
        SingleLinkedlist.jugde(S);

    }

}

class SingleLinkedlist {
    // �˵�����
    static void Menu() {
        System.out.println("          ���Ա�Ĳ���");
        System.out.println("   ���һ�� �̼��� 216230119");
        System.out.println("|============================|");
        System.out.println("|      (1)-��ʼ��            |");
        System.out.println("|      (2)-�������Ա�        |");
        System.out.println("|      (3)-���Ԫ��          |");
        System.out.println("|      (4)-��ʾ����          |");
        System.out.println("|      (5)-��������          |");
        System.out.println("|      (6)-ɾ������          |");
        System.out.println("|      (7)-���Ա���        |");
        System.out.println("|      (8)-����              |");
        System.out.println("|      (9)-���Ա�����        |");
        System.out.println("|      (10)-��������         |");
        System.out.println("|      (0)-�˳�              |");
        System.out.println("|============================|");
    }

    static void sortMenu() {
        System.out.println("|============================|");
        System.out.println("|      (1)-ð������          |");
        System.out.println("|      (2)-ѡ������          |");
        System.out.println("|      (3)-��������          |");
        System.out.println("|      (0)-�˳�              |");
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
                    System.out.println("��ʼ���ɹ���");
                    break;
                case "2":
                    if (link == null) {
                        System.out.println("���ȳ�ʼ��");
                        break;
                    }
                    System.out.println("===========�������Ա�==========");
                    n = create(J, n);
                    break;
                case "3":
                    if (link == null) {
                        System.out.println("���ȳ�ʼ��");
                        break;
                    }
                    if (n == null) {
                        System.out.println("���Ƚ���");
                        break;
                    }
                    System.out.println("======���Ԫ��======");
                    for (int i = 0; i < n.length; i++) {
                        System.out.println("\n��" + (i + 1) + "λͬѧ��ѧ��Ϊ:");
                        n[i].no = J.nextInt();
                        System.out.println("\n��" + (i + 1) + "λͬѧ������Ϊ:");
                        n[i].name = J.next();
                        link.add(n[i]);
                    }
                    break;
                case "4":
                    if (link == null) {
                        System.out.println("���ȳ�ʼ��");
                        break;
                    }
                    if (n == null) {
                        System.out.println("���Ƚ���");
                        break;
                    }
                    System.out.println("=========��ʾ����=========");
                    link.list();
                    break;
                case "5":
                    if (link == null) {
                        System.out.println("���ȳ�ʼ��");
                        break;
                    }
                    if (n == null) {
                        System.out.println("���Ƚ���");
                        break;
                    }
                    System.out.println("==========��������=========");

                    NodeJobW temp = new NodeJobW();
                    System.out.println("��Ҫ����ѧ��Ϊ��");
                    temp.no = J.nextInt();
                    System.out.println("������Ϊ��");
                    temp.name = J.next();
                    link.update(temp);
                    break;
                case "6":
                    if (link == null) {
                        System.out.println("���ȳ�ʼ��");
                        break;
                    }
                    if (n == null) {
                        System.out.println("���Ƚ���");
                        break;
                    }
                    System.out.println("============ɾ������=============");
                    int tmpV = 0;
                    System.out.println("��Ҫɾ��ѧ��Ϊ��");
                    tmpV = J.nextInt();
                    link.delete(tmpV);
                    System.out.println("ɾ�����");
                    break;
                case "7":
                    if (link == null) {
                        System.out.println("���ȳ�ʼ��");
                        break;
                    }
                    if (n == null) {
                        System.out.println("���Ƚ���");
                        break;
                    }
                    System.out.println("==========���Ա���=========");
                    System.out.println("���Ա���" + link.LinkLength() + "��Ԫ��");
                    break;
                case "8":
                    if (link == null) {
                        System.out.println("���ȳ�ʼ��");
                        break;
                    }
                    if (n == null) {
                        System.out.println("���Ƚ���");
                        break;
                    }
                    System.out.println("==========����=========");

                    boolean sortflag = true;
                    while (sortflag) {
                        System.out.println("��ѡ������ʽ:");
                        sortMenu();
                        switch (J.next()) {
                            case "1":
                                n = link.sort(n);
                                System.out.println("����������");
                                for (int k = 0; k < n.length; k++) {
                                    System.out.println("ѧ��Ϊ��" + n[k].no + ",����Ϊ��" + n[k].name);
                                }
                                break;
                            case "2":
                                n = link.selectSort(n);
                                System.out.println("����������");
                                for (int k = 0; k < n.length; k++) {
                                    System.out.println("ѧ��Ϊ��" + n[k].no + ",����Ϊ��" + n[k].name);
                                }
                                break;
                            case "3":
                                n = link.insetSort(n);
                                System.out.println("����������");
                                for (int k = 0; k < n.length; k++) {
                                    System.out.println("ѧ��Ϊ��" + n[k].no + ",����Ϊ��" + n[k].name);
                                }
                                break;
                            case "0":
                                sortflag = false;
                                System.out.println("�˳�����");
                                break;

                        }

                    }
                    break;
                case "9":
                    if (link == null) {
                        System.out.println("���ȳ�ʼ��");
                        break;
                    }
                    if (n == null) {
                        System.out.println("���Ƚ���");
                        break;
                    }
                    System.out.println("==========���Ա�����=========");
                    if (link.LinkLength() == 0) {
                        System.out.println("����Ϊ�գ�����Ҫ��������");
                        break;
                    }
                    n[0] = link.reverselLinklist(n[0]);
                    System.out.println("�������");
                    System.out.println("����������");
                    while (n[0] != null) {
                        System.out.println("ѧ��Ϊ��" + n[0].no + ",����Ϊ��" + n[0].name);
                        n[0] = n[0].next;
                    }
                    break;
                case "10":
                    if (link == null) {
                        System.out.println("���ȳ�ʼ��");
                        break;
                    }
                    if (n == null) {
                        System.out.println("���Ƚ���");
                        break;
                    }
                    System.out.println("===========���Ա����==========");
                    System.out.println("��Ҫ����ѧ��Ϊ��");
                    int tmpVV = J.nextInt();
                    link.select(tmpVV);
                    break;
                case "0":
                    System.out.println("���˳�");
                    flag = false;
                    break;
                default:
                    System.out.println("������������������");
                    break;
            }
        }
    }

    // �ȳ�ʼ��һ�����ܶ���ͷ�ڵ� ���������
    private static NodeJobW head = new NodeJobW(0, "");

    // ��ʼ�� ����һ���յ�����
    public static SingleLinkedlist initList() {
        SingleLinkedlist List = new SingleLinkedlist();
        return List;
    }

    // �����սڵ�
    public static NodeJobW[] create(Scanner J, NodeJobW[] n) {
        int tmp = 0;
        System.out.println("��Ҫ��Ӽ���ͬѧ��Ϣ��");
        System.out.print("������:");
        tmp = J.nextInt();
        if (tmp <= 0) {
            System.out.println("���������0��ͬѧ��");
            return null;
        }
        n = new NodeJobW[tmp];
        for (int i = 0; i < tmp; i++) {
            n[i] = new NodeJobW();// ʵ����ÿһ���ڵ�

        }

        System.out.println("�����" + n.length + "λͬѧ");
        return n;
    }

    // ��˳����ӽڵ㵽������
    public void add(NodeJobW Node) {
        // ˼·���������Ǳ��˳��ʱ
        // 1.�ҵ���ǰ��������ڵ�
        // 2.���������ڵ��nextָ���½ڵ�

        NodeJobW tmp = head;
        // ��Ϊhead�ڵ㲻�ܶ������������Ҫһ���������� tmp
        while (true) {
            // ��������,�ҵ����
            if (tmp.next == null) {
                break;
                // �ҵ�������ѭ��
            }
            tmp = tmp.next;
            // û�ҵ��ͺ���
        }
        // ���˳�whileѭ��ʱ��tmp�Ѿ�Ϊ���һ���ڵ���
        tmp.next = Node;
        // tmp����һ���ڵ���� Node���½ڵ㣩
    }

    // ˳����ӽڵ㵽������
    public static void add2(NodeJobW Node) {
        NodeJobW tmp = head;
        // ��ȡͷ�ڵ�
        boolean flag = false;// ��־��ӱ���Ƿ����
        while (true) {
            if (tmp.next == null) {
                break;
            }
            if (tmp.next.no > Node.no) {
                break;
            } else if (tmp.next.no == Node.no) {
                // ˵������Ѿ�����
                flag = true;
                break;
            }
            tmp = tmp.next;
            // ����
        }
        // �ж��Ƿ����
        if (flag) {
            System.out.println("׼�������" + Node.no + "�Ѿ�����");
        } else {
            Node.next = tmp.next;
            // Nodeָ��tmp����һ��
            tmp.next = Node;
            // tmpָ��Node
        }

    }

    // ��ʾ����
    public void list() {
        if (head.next == null) {
            System.out.println("����Ϊ��");
            return;
        }
        // ���ж������Ƿ�Ϊ��
        NodeJobW tmp = head.next;
        // ��Ϊͷ�ڵ㲻�ܶ���������Ҫ��������������
        while (true) {
            if (tmp == null) {
                System.out.println("��ʾ���");
                break;
            }
            System.out.println(tmp.toString());
            // ����ڵ���Ϣ
            tmp = tmp.next;
            // ��next����

        }
    }

    // ��������Ԫ��
    public void update(NodeJobW newNode) {

        if (head.next == null) {
            System.out.println("����Ϊ��");
            return;
        }
        NodeJobW tmp = head.next;
        // tmpָ��head����һ���ڵ�
        boolean flag = false;
        while (true) {
            if (tmp == null) {
                // �Ѿ�������������
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
            System.out.printf("û���ҵ�ѧ��Ϊ%d��ͬѧ", newNode.no);
        }
    }

    // ɾ������Ԫ��
    public void delete(int no) {
        boolean flag = false;
        NodeJobW tmp = head;
        if (head.next == null) {
            System.out.println("����Ϊ��");
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
            System.out.println("�����ڱ��Ϊ" + no + "��ͬѧ");
        }

    }

    // ����
    public void select(int no) {
        NodeJobW tmp = head;
        boolean flag = false;
        if (head.next == null) {
            System.out.println("����Ϊ��");
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
            System.out.println("���Ϊ" + no + "����ϢΪ��");
            System.out.println("����Ϊ:" + tmp.name);

        } else {
            System.out.println("������");
        }
    }

    // ���Ա���
    public int LinkLength() {
        int count = 0;
        NodeJobW tmp = head;
        while (true) {
            // ��������,�ҵ����
            if (tmp.next == null) {
                break;
                // �ҵ�������ѭ��
            }
            count++;
            tmp = tmp.next;
            // û�ҵ��ͺ���
        }
        return count;
    }

    // ���Ա�����
    public NodeJobW reverselLinklist(NodeJobW head) {
        /*
         * 1.��head����һ��λ���ø�next
         * 2.head����һ��λ��ָ��pre
         * 3.pre�õ�head��ǰλ��
         * 4.head����
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

    // ð������
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

    // ѡ������
    public NodeJobW[] selectSort(NodeJobW[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        } // ���Ǳ߽�����
        int n = arr.length;
        // 0 ���� n-1
        // 1 ���� n-1
        // 2 ���� n-1
        for (int i = 0; i < n; i++) {
            // i ���� n-1 ���for�綨��෶Χ
            int minIndex = i;// ���ó�ʼλ��
            for (int j = i + 1; j < n; j++) {
                minIndex = arr[j].no < arr[minIndex].no ? j : minIndex;
                // ������߱�ǰ��С��minIndex����Ϊ�����λ�ã����򲻱�
            } // ��ȡ��Сֵλ��
            NodeJobW cur = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = cur;

        }
        return arr;
    }// ��ȡ��λ�ú󼴿ɽ���λ��

    // ��������
    public NodeJobW[] insetSort(NodeJobW[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr == null || arr.length < 2) {
                return null;
            }
            // 0~0�����
            // 0~1
            // 0~2
            // 0~3�۲��βλ���ڱ�
            // 0~n-1
            for (int end = 1; end < arr.length; end++) {
                for (int pre = end - 1; pre >= 0 && arr[pre].no > arr[pre + 1].no; pre--) {
                    // pre ������ǰһ��λ��
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
    // ����ָ����һ���ڵ�ĵ�ַ

    public NodeJobW(int no, String name) {
        // ������
        this.no = no;// ���
        this.name = name;

    }

    public NodeJobW() {

    }

    public String toString() {
        // ��дtoString
        return "ѧ��Ϊ��" + no + ",����Ϊ��" + name;

    }

}
// Node�Ķ���
// ����һ��Node��ÿһ��Node�������һ���ڵ�