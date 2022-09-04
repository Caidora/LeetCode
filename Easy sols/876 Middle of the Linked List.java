class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode root = head;
        while(head.next !=null){
            length++;
            head = head.next;
        }
        if(length%2==1){
            
        length = length/2+1;
        }else{
            length = length/2;
        }
        while(length>0){
            root = root.next;
            length--;
        }
        return(root);

    }
}