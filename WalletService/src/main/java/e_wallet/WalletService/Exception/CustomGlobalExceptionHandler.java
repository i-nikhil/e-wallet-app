package e_wallet.WalletService.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(WalletNotFoundException.class)
    public void springHandleNotFound(HttpServletResponse response) throws IOException
    {
        response.sendError(HttpStatus.NOT_FOUND.value());
    }

    @ExceptionHandler(WalletBadRequest.class)
    public void springHandleNotFound1(HttpServletResponse response) throws IOException
    {
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(TransactionBadRequest.class)
    public void springHandleNotFound2(HttpServletResponse response) throws IOException
    {
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }
}
