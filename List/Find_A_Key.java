// find a key

//Fist -> [10] -> [20] -> [30] -> [40] --.null


public Link find (int key)
{
  Link current = first;
  
    while (current != null)
    {
        if (current.iData == key )
            return current;
            
        else
            current = current.next;
    }
    
    return null;
}


/*
Implement insert After method

Fist -> [10] -> [20] -> [30] -> [40] --.null

insert (35) after (30) 
*/

public boolean insertAfter (int key, int newData)
{
  Link current = first;
  
  while (current != null)
  {
    if (current.iData == key) //  Find key 30
    {
      Link newLink = new Link(35);  // New link
      newLink.next = current.next;  // Define 40
      current.next = newLink;       // Define current link's next item (35)
      
      return true;    // If its created return true.
    }
    
    else    // If didn't find the key (30) 
    {
      current = current.next;
    }
    
    return false; // If theres nothing end.
      
  }
}
