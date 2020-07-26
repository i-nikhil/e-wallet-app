package e_wallet.WalletService.Util;

import e_wallet.WalletService.Model.Wallet;

public class WalletValidator {
    public boolean validateWalletRequest(Wallet wallet){
        if(wallet.getWallet_type()==null || wallet.getUser_id()<=0)
            return false;
        return true;
    }
}
