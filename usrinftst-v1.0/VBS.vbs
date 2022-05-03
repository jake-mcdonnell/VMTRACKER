Set WshShell = CreateObject("WScript.Shell")
WshShell.Run chr(34) & "C:\usrinftst\chk.bat" & Chr(34), 0
Set WshShell = Nothing 
