package com.stackroute.exception;
    public class Account {
        public Account() {
        }

        long accountBalance = 0;

        public long getAccountBalance() {
            return accountBalance;
        }

        public Account(long accountBalance) {
            this.accountBalance = accountBalance;
        }

        public long withdraw(long i) throws InsufficientFundException, NegativeIntegerException {
            if (i > accountBalance) {
                throw new InsufficientFundException("Fund exception");
            }
            if (i < 0) {
                throw new NegativeIntegerException("Integer exception");
            }
            return accountBalance - i;
        }
    }