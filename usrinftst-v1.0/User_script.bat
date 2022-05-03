COLOR 0E

if not exist C:\usrinftst\spt.txt (
START C:\usrinftst\VBS.vbs
)

if exist C:\usrinftst\spt.txt (
del C:\usrinftst\spt.txt
)


@echo off
	echo.>"C:\usrinftst\cpt.txt"

@mode con: cols=100 lines=40
@SET /P Name=PLEASE ENTER YOUR FULL NAME: 
echo user: %Name% computer: %computername% date: %date% time: %time% >> \\Dc-email-ca\ftp\Active_VM_User_POA\ACTIVE_USERS.txt
echo user: %Name% computer: %computername% date: %date% time: %time% > C:\usrinftst\ACTIVE_USERS_TEMP.txt


@echo off
	echo.>"C:\usrinftst\spt.txt"

del c:\usrinftst\cpt.txt

echo %Name% > "C:\usrinftst\spt.txt"

exit



