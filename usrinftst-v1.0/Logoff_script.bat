echo off
 set /P name=<C:\usrinftst\spt.txt


xcopy /Y \\Dc-email-ca\ftp\Active_VM_User_POA\ACTIVE_USERS.txt C:\usrinftst\ACTIVE_USERS_TEMP.txt

type C:\usrinftst\ACTIVE_USERS_TEMP.txt | findstr /v "%name%" > C:\usrinftst\ACTIVE_USERS.txt

xcopy /Y C:\usrinftst\ACTIVE_USERS.txt \\Dc-email-ca\ftp\Active_VM_User_POA\ACTIVE_USERS.txt
