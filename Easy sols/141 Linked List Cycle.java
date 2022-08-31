class Solution {
    
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return(false);
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        return(checkCycle(fast, slow));
        
    }
    private boolean checkCycle(ListNode fast, ListNode slow){
        if(fast == null || fast.next == null){
            return(false);
        }
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow){
            return(true);
        }
        return(checkCycle(fast, slow));
    }
}

/**
 * Recursively moves rabbit(fast) and hare(slow) along the linked list at different speeds.
 * If They are ever equal then that must mean that the rabbit(fast) looped back behind the hare(slow) so returns true. 
 * If fast or fast.next ever == null then that must mean they reached the end of the linked list without looping so returns false.
 */
