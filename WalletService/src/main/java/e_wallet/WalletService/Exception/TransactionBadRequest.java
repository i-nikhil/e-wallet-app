package e_wallet.WalletService.Exception;

public class TransactionBadRequest extends RuntimeException
{
    public TransactionBadRequest(){
        super("TransactionBadRequest");
    }
}
