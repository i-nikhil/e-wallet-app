package e_wallet.WalletService.Model;

public class AddBalanceDetails {
    private int uid;//user id
    private int amount;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
