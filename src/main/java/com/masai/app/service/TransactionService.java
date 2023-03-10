package com.masai.app.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.masai.app.exceptions.TransactionException;
import com.masai.app.exceptions.WalletException;
import com.masai.app.model.Transaction;
import com.masai.app.model.Wallet;

public interface TransactionService {

	public Transaction addTransaction(Transaction transaction, String uuid)
			throws TransactionException, WalletException;

	public List<Transaction> viewAllTransactions(String uuid) throws WalletException, TransactionException;

	public List<Transaction> viewTransactionsByDate(LocalDate from, LocalDate to, String uuid) throws WalletException, TransactionException;

	public List<Transaction> viewAllTransactionsByType(String type, String uuid)
			throws WalletException, TransactionException;

}
