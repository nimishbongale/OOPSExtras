class MessageApp
{ 
    SOSCollection notifs; 
    public MessageApp(SOSCollection notifs) 
    { 
        this.notifs = notifs; 
    } 

    public void printStatus() 
    { 
        Iterator iterator = notifs.createIterator(); 
        System.out.println("*****MESSAGE APP*****"); 
        System.out.println("Ready");
        while (iterator.hasNext()) 
        { 
            SOS n = (SOS)iterator.next(); 
            System.out.println("\nSOS Message "+"\""+n.getMessage()+"\""+" sent to "+n.getNumber());
            try {
            Thread.sleep(1000);
            System.out.println("SOS Message Delivered!");
             Thread.sleep(500);
        }
            catch(Exception e){
            e.printStackTrace();
            }
        }
        System.out.println("\nReady");
    } 
}
