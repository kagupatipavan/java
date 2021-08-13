import java.util.*;

class LinkedList{
    class Nod{
        int data;
        Nod next;
        Nod(int d){
            data=d;
            next=null;
        }
    }
    Nod head;
    void insert(int d){
        Nod a = new Nod(d);
        a.data=d;
        a.next=head;
        head=a;
    }
    void insertEnd(int d){
        Nod ne1= new Nod(d);
        if(head==null){
            head=ne1;
            return;
        }
        Nod tem=head;
        while(tem.next!=null){
            tem=tem.next;
        }
        tem.next=ne1;
    }
    void pri(){
        Nod t=head;
        System.out.println("List is : ");
        while(t!=null){
           System.out.print(t.data + " ");
           t=t.next;
        }
        System.out.println();
    }
    void rev(){
        Nod temp=null,curr,next;
        curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=temp;
            temp=curr;
            curr=next;
        }
        head=temp;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        LinkedList l1=new LinkedList();
        int ele;
        char yorn;
        while(true){
            System.out.println("Enter element :  And if you want to stop then press Y/N");
            yorn=s1.next().charAt(0);
            if(yorn=='Y' || yorn=='y'){
            break;
        }
            else{
               ele=s1.nextInt();
               l1.insertEnd(ele);
            }

        }

       l1.pri();
       l1.rev();
       l1.pri();  
       s1.close();
    }
}