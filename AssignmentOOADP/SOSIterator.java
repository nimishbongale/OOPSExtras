class SOSIterator implements Iterator 
{ 
    SOS[] sosList; 
    int pos = 0; 
    public SOSIterator (SOS[] sosList) 
    { 
        this.sosList = sosList; 
    } 

    public Object next() 
    { 
        SOS notif = sosList[pos]; 
        pos += 1; 
        return notif; 
    } 

    public boolean hasNext() 
    { 
        if (pos >= sosList.length || 
            sosList[pos] == null) 
            return false; 
        else
            return true; 
    } 
}
