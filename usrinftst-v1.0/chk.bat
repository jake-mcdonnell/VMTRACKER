@echo off 

timeout 60

if not exist C:\usrinftst\spt.txt (
START C:\usrinftst\VMTRACKER.exe
exit
)

:x
if exist C:\usrinftst\spt.txt (
exit
)

goto :x
