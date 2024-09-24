package com.spencerstewart.ezbank.accounts.service;

import com.spencerstewart.ezbank.accounts.constants.AccountConstant;
import com.spencerstewart.ezbank.accounts.dto.CustomerDto;
import com.spencerstewart.ezbank.accounts.entity.Account;
import com.spencerstewart.ezbank.accounts.entity.Customer;
import com.spencerstewart.ezbank.accounts.mapper.CustomerMapper;
import com.spencerstewart.ezbank.accounts.repository.AccountRepository;
import com.spencerstewart.ezbank.accounts.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepository;
	private CustomerRepository customerRepository;

	@Override
	public void createAccount(CustomerDto customerDto) {

		Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
		Customer savedCustomer = customerRepository.save(customer);
		accountRepository.save(createNewAccount(savedCustomer));
	}

	private Account createNewAccount(Customer customer) {

		Account account = new Account();
		account.setCustomerId(customer.getCustomerId());
		long randomAccountNumber = 1000000000L + new Random().nextInt(900000000);

		account.setAccountNumber(randomAccountNumber);
		account.setAccountType(AccountConstant.SAVINGS);
		account.setBranchAddress(AccountConstant.ADDRESS);

		return account;
	}
}
