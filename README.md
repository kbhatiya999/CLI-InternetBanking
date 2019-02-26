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


Schema => Account{AccountNo,password,balance,address,email}

CREATE TABLE account
(
  account_no number not null,
  contact_name varchar2(500),
  balance number ,
  email varchar2(500),
  address varchar2(500),
  CONSTRAINT account_pk PRIMARY KEY (account_no)
);


Schema => Admin{AccountNo,password,balance,address,email}
CREATE TABLE admin
(
  account_no number not null,
  contact_name varchar2(500),
  balance number ,
  email varchar2(500),
  address varchar2(500),
  CONSTRAINT admin_pk PRIMARY KEY (account_no)
);

 Schema => Request{AccountNo,RequestType,req_time,status}
 CREATE TABLE Request
(
  account_no numeric not null,
  RequestType varchar2(500),
  req_time timestamp,
  email varchar2(500),
  address varchar2(500),
  CONSTRAINT admin_pk PRIMARY KEY (account_no,req_time)
);
 
Schema => FundTransfer{AccountNo,BeneficiaryAccount,amount,ttime,charges}
CREATE TABLE fundtransfer
(
  account_no numeric not null,
  account_no2 varchar2(500),
  amount number,
  ttime timestamp,
  charges number,
  CONSTRAINT fundtransfer_pk PRIMARY KEY (account_no,ttime)
);
	
=========================================================================
Pojo:
1. User
 
2.Transaction
    Account [Join] FundTransfer
    
	
===================================================
DAO Design:
1. AccountDao
   ->insertAccount() = createAccount
    ->updateAccount() = update address/change password
    ->deleteAccount() = close account
2. 






