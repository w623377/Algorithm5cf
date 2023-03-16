package schooloj.链表排序;

import java.util.PriorityQueue;

class Solution {
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>((a, b)->a.val-b.val);//小根堆
        while(head!=null)
        {
            heap.offer(head);//入堆
            head=head.next;//指针后移
        }
        ListNode dummy=new ListNode();//哑节点
        ListNode cur = dummy;//指针
        while(heap.size()>0)//堆不为空
        {
            cur.next=heap.peek();//指针指向堆顶
            heap.poll();//堆顶出堆
            cur=cur.next;//指针后移
        }
        cur.next=null;//最后一个节点指向空
        return dummy.next;//返回头节点
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
