package com.apress.springrecipes.bank;

import org.easymock.MockControl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountServiceImplMockTests {

    private static final String TEST_ACCOUNT_NO = "1234";
    private MockControl mockControl;
    private AccountDao accountDao;
    private AccountService accountService;

    @Before
    public void init2() {
    	System.out.println("@@@@@@@@@@@222---init()@@@@@@@@@@");
    }
    @Before
    public void init3() {
    	System.out.println("@@@@@@@@@@@333---init()@@@@@@@@@@");
    }
    @Before
    public void init() {
    	System.out.println("@@@@@@@@@@@111---init()@@@@@@@@@@");
        mockControl = MockControl.createControl(AccountDao.class);
        accountDao = (AccountDao) mockControl.getMock();
        accountService = new AccountServiceImpl(accountDao);
    }
   
    
    @Test
    public void deposit() {
        Account account = new Account(TEST_ACCOUNT_NO, 100);
        accountDao.findAccount(TEST_ACCOUNT_NO);
        mockControl.setReturnValue(account);
        account.setBalance(150);
        accountDao.updateAccount(account);
        mockControl.replay();

        accountService.deposit(TEST_ACCOUNT_NO, 50);
        mockControl.verify();
    }

    @Test
    public void withdrawWithSufficientBalance() {
        Account account = new Account(TEST_ACCOUNT_NO, 100);
        accountDao.findAccount(TEST_ACCOUNT_NO);
        mockControl.setReturnValue(account);
        account.setBalance(50);
        accountDao.updateAccount(account);
        mockControl.replay();

        accountService.withdraw(TEST_ACCOUNT_NO, 50);
        mockControl.verify();
    }

    @Test(expected = InsufficientBalanceException.class)
    public void testWithdrawWithInsufficientBalance() {
        Account account = new Account(TEST_ACCOUNT_NO, 100);
        accountDao.findAccount(TEST_ACCOUNT_NO);
        mockControl.setReturnValue(account);
        mockControl.replay();

        accountService.withdraw(TEST_ACCOUNT_NO, 150);
        mockControl.verify();
    }
    
    @After
    public void afterM(){
    	System.out.println("#######after()######");
    }
}
