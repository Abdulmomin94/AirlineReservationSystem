package com.ars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ars.entity.CreditCardDeatils;
import com.ars.repository.CreditCardRepository;

public class PaymentController {
	@Autowired
	private CreditCardRepository creditCardRepository;

	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	public ResponseEntity<Boolean> validateCreditCard(@RequestBody CreditCardDeatils creditCard) {
		CreditCardDeatils cardDetails;
		boolean result = false;
		try {

			cardDetails = (CreditCardDeatils) creditCardRepository.findById(creditCard.getCardNumber()).get();
	
			
			if (cardDetails != null) {
				result = creditCard.getApin().equals(cardDetails.getApin())
						&& creditCard.getCvv().equals(cardDetails.getCvv())
						&& creditCard.getCardHolderName().equals(cardDetails.getCardHolderName());
				
			}
			
		} catch (Exception a) {
			
			return new ResponseEntity<Boolean>(result, HttpStatus.OK);
		}

		return new ResponseEntity<Boolean>(result, HttpStatus.OK);

	}

}
