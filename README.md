# CLI-InternetBanking

Project Title: CLI Internet banking

CLi MENU1:
1. Create Account
2. Update Account
3. delete account
4. Change Password
5. Transaction Details
6. Customer Information 
========================================================================
CLi MENU2:business functionalities:
1. Balance Enquiry
2. Fund Transfer NEFT/RTGS ( to another account in the same bank) *Charges Applicatble
3. Request for cheque book/change of address
=========================================================================
Database Tables:
	Account{AccountNo,password,timestamp,balance,address,email}
	Admin{AccountNo,password,timestamp,balance,address,email}
        Request{AccountNo,RequestType,Timestramp,status}
	FundTransfer{AccountNo,BeneficiaryAccount,amount,Timestamp}
	
=========================================================================
Pojo:
1. User
 
2.Transaction
    ->getTransactions(AccountNo)
    
	
===================================================
DAO Design:
1. AccountDao
   ->insertAccount() = createAccount
    ->updateAccount() = update address/change password
    ->deleteAccount() = close account
2. 






