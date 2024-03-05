package fintech.model;


public class TransferTransaction extends Transaction {

  
    private final String recipientName;
    private final String senderName;


    public TransferTransaction(String senderName, String recipientName, double amount, String postedAt, String note) {
        super(senderName, amount, postedAt, note);
        this.recipientName = recipientName;
        this.senderName = senderName;
        
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getSenderName() {
        return senderName;
    }
    

    @Override
    public String toString() {

        return this.getId() + "|" + this.getName() + "|" + this.getRecipientName() + "|" + this.getAmount() + "|" + this.getPosted_at() + "|" 
        + this.getNote();
    
    }

}
