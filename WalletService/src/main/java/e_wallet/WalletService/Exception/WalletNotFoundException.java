package e_wallet.WalletService.Exception;

public class WalletNotFoundException extends RuntimeException
{
    public WalletNotFoundException(int id) {
        super("Wallet id not found : " + id);
    }
}
