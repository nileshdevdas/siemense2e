package com.vinsys.e2eapp;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankService {
	Logger logger = Logger.getLogger("BankService");
	// we know that service
	@GetMapping(path = "/account")
	public String openAccount(@RequestParam(name = "accountid") String accountid) {
		logger.info(String.format("you are opening a account with %s ", accountid));
		return "You Opened a Acccount Successfully";
	}

	@GetMapping(path = "/accountupdate")
	public String updateAccount(@RequestParam(name = "accountid") String accountid) {
		logger.info(String.format("you are details are updated for account with %s", accountid));
		return "You Updated a Acccount Successfully";
	}
}
