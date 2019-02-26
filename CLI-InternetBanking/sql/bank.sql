conn system/password
DROP USER BANK CASCADE;
CREATE USER bank IDENTIFIED BY bank;
GRANT CONNECT,RESOURCE,UNLIMITED TABLESPACE TO bank;
ALTER USER bank DEFAULT TABLESPACE USERS;
ALTER USER bank TEMPORARY TABLESPACE TEMP;
CONNECT bank/bank

Drop table account;
CREATE TABLE account
(
  account_no number not null,
  contact_name varchar2(500),
  balance number ,
  email varchar2(500),
  address varchar2(500),
  CONSTRAINT account_pk PRIMARY KEY (account_no)
);

CREATE TABLE Request
(
  account_no numeric not null,
  RequestType varchar2(500),
  req_time timestamp,
  email varchar2(500),
  address varchar2(500),
  CONSTRAINT admin_pk PRIMARY KEY (account_no,req_time)
);