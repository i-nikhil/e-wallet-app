package e_wallet.WalletService.Util;

import e_wallet.WalletService.Model.Transaction;

public class TransactionValidator {
    public boolean validateRequest (Transaction request){
        if(request.getAmount()<=0)
            return false;
        return true;
    }
}
