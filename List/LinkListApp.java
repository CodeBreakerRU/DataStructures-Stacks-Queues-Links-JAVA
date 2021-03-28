package List;
class Link{

	public int iData;		// data item (key)
	public double dData;	// data item
	public Link next;		// data item
	
	public Link(int id, double dd)  // constructor
	
	{ 	
		 iData = id;	 //initialize data
		 dData = dd;
		 next = null;
	 }
	 
	 public void displayLink() 	// display ourself
	 { 
		 System.out.print("{"+ iData +", "+ dData + "}");
	 } 
}

//-------------------------------------------------------------//

class LinkList{
	
	private Link first;			// ref to first link on list
	
	public LinkList() 			//constructor
	{
		first = null;			//no items on list yet
	}
	
	public boolean isEmpty() 	// true if list is empty
	{
		return (first == null);
	}
	
	public void insertFirst(int id, double dd) 	//insert at start of list
	
	{
		Link newLink = new Link(id, dd);	// make a new link
		newLink.next = first;				// newLink --> old first
		first = newLink;					// first --> newLink
	}
	
	public Link find(int id)			// Find a link
			 
	{
		Link current = first;
		while (current != null)
		{
			if (current.iData == id)
				return current;		// Display Current link value
			else
				current = current.next;  
				
		}
	}
	
	public Link deleteFirst() 				// delete first item
	{										// (assumes list not empty)
		Link temp = first;					// save reference to link
		first = first.next;					// delete it first--> old;
		return temp;						// return deleted link
	}
	
	public void displayList()
	{
		System.out.println("List (first-->last): ");
		Link current = first;				//	start at beginning of list
		while(current != null)				//	until end of list
		{
			current.displayLink();			//print data
			current = current.next;			//move to next link
		}
		System.out.println("");
	}
}


class LinkListApp{
	public static void main (String[] args) {
		
		LinkList theList = new LinkList();
		
		theList.insertFirst(22, 22.22);
		theList.insertFirst(33, 33.33);
		theList.insertFirst(44, 44.44);
		theList.insertFirst(55, 55.55);
		
		theList.displayList();
		
		while(!theList.isEmpty())
		{
			Link aLink = theList.deleteFirst();
			System.out.println("Deleted");
			aLink.displayLink();
			
			System.out.println("");
		}
		theList.displayList();
	}
}
