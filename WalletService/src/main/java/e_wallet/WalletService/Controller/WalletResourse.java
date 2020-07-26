package e_wallet.WalletService.Controller;

import e_wallet.WalletService.Exception.WalletBadRequest;
import e_wallet.WalletService.Exception.WalletNotFoundException;
import e_wallet.WalletService.Model.Wallet;
import e_wallet.WalletService.Repository.TransactionRepository;
import e_wallet.WalletService.Repository.WalletRepository;
import e_wallet.WalletService.Util.WalletValidator;
import io.swagger.annotations.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WalletResourse {
    @Autowired
    private WalletRepository walletRepository;
    @Autowired
    private TransactionRepository trepository;

    WalletValidator walletValidator = new WalletValidator();
    private static final Logger logger = LoggerFactory.getLogger(WalletResourse.class);

    @ApiOperation(value = "Find List of all the wallets")
    @GetMapping("/findAllWallet")
    List<Wallet> findAllWallet() {
        return walletRepository.findAll();
    }

    @ApiOperation(value = "Find a wallet by Id")
    @GetMapping("/wallet/{id}")
    Wallet findOneWallet(@ApiParam(value = "Store id of the point of service to deliver to/collect from", required = true)@PathVariable int id) {
        logger.info("/wallet/{id} called with id "+ id);
        return walletRepository.findById(id)
                .orElseThrow(() -> new WalletNotFoundException(id));
    }

    @ApiOperation(value = "Create New Wallet ")
    @PostMapping("/createNewWallet")
    //return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    Wallet CreateNewWallet(@RequestBody Wallet newWallet) {
        if(!walletValidator.validateWalletRequest(newWallet)){
            logger.info("CreateNewWallet request not valid");
            throw  new WalletBadRequest();
        }
        Wallet wallet = walletRepository.save(newWallet);
        return wallet;
    }

    @ApiOperation(value = "Update Wallet")
    @PutMapping("/updateWallet")
    Wallet updateWallet(@RequestBody Wallet newWallet) {
        Wallet wallet = walletRepository.save(newWallet);
        return wallet;
    }
}
