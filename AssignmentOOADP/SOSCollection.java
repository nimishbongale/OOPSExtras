class SOSCollection implements Collection 
{ 
    static final int MAX_ITEMS = 3; 
    int numberOfItems = 0; 
    SOS[] sosList; 

    public SOSCollection() 
    { 
        sosList = new SOS[MAX_ITEMS]; 
        addItem("9609876543"); 
        addItem("9087654321"); 
        addItem("9807654321"); 
    } 

    public void addItem(String str) 
    { 
        SOS notif = new SOS(str); 
        if (numberOfItems >= MAX_ITEMS) 
            System.err.println("Full"); 
        else
        { 
            sosList[numberOfItems] = notif; 
            numberOfItems = numberOfItems + 1; 
        } 
    } 
                
    public Iterator createIterator() 
    { 
        return new SOSIterator(sosList); 
    } 
}
