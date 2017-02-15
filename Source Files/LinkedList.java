import java.io.*;
import java.util.*;
public class LinkedList {
    Person first,last,next=null;
    public void insert(String name,String gender,String phone,String mail,String address)
    {
	Person temp=new Person(name,gender,phone,mail,address,next);
		if(first==null)
		{
			first=temp;
			last=first;
		}
		else
		{
			last.next=temp;
			last=last.next;
		}
	}
    public void sort()
    {
		Person swap,temp,temp1,temp2;
		temp=first;
		temp1=first;
		temp2=null;
		while(temp1.next!=null)
		{
			temp=first;
		while(temp.next!=temp2)
		{
			if(temp.name.compareTo(temp.next.name)>=0)
			{
				swap=temp;
				temp=temp.next;
				temp.next=swap;
				break;
			}
			temp=temp.next;
		}
			temp2=temp;
			temp1=temp1.next;
		}
    } 
    public void delete(String key)
    {
		Person current=first;
		if((current.name).equals(key))
		{
			first=current.next;
		}
		else
		{
			while(current.next.next!=null)
			{
				if((current.next.name).equals(key))
				{
					current.next=current.next.next;
				}
				current=current.next;
				if((current.next.name).equals(key))
				{
				last=current;
				last.next=null;
				}
			}
		}
	}
       public void display()
	{
                FIO fobj=new FIO();
		Person current=first;
		while(current!=null)
		{
			System.out.println(current);
			current=current.next;
		}
	}
       public String[] getnames()
       {
                String store="";
                Person current=first;
		while(current!=null)
		{
			store=store+current.name+":";
			current=current.next;
		}
                return store.split(":");
       }
       public void readFile() throws IOException
       {   
        FIO fobj=new FIO();
        Scanner sobj=new Scanner(new File("phnoebook/data"));
     	String name,gender,phone,mail,address,s;
	while((s=sobj.nextLine())!=null)
	{
		System.out.println(s);
		StringTokenizer st=new StringTokenizer(s,"::");
                name=fobj.decrypt(st.nextToken(),10);
                gender=fobj.decrypt(st.nextToken(),10);
                phone=fobj.decrypt(st.nextToken(),10);
                mail=fobj.decrypt(st.nextToken(),10);
                address=fobj.decrypt(st.nextToken(),10);
		this.insert(name,gender,phone,mail,address);
        }
    }
}
