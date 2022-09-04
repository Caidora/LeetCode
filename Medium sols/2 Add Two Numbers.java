class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode list = new ListNode();
        ListNode out = list;
        while(l1!=null || l2!=null || carry!=0){
            if(l1!=null){
                carry = carry+l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                carry = carry+l2.val;
                l2 = l2.next;
            }
            
            list.next = new ListNode(carry%10);
            carry = carry/10;
            list = list.next;
            if(l1==null && l2==null && carry!=0){
                list.next = new ListNode(carry%10);
                carry = carry/10;
                list = list.next;
                
            }
        }
        return(out.next);
    }
}