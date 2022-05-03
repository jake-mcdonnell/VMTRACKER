# VMTRACKER
![image](https://user-images.githubusercontent.com/77365789/166477129-7f61d75d-6e1d-4534-815a-243df6233f70.png)

Program is intended to be used on enterprise remote machines/servers. 
Can be used to make the end user sign into machine and give other users on the network the ability to track each other's activity and determine if another user is actively using said machine.

---- Install Guide ----
1. Install the VMTRACKER Repo on a network location accessible by both the server and virtual machine ( note this location )
2. The usrinftst-v1.0 folder should be pasted in the VM's C:\ Directory
3. Right-Click on User_Script.bat, Click edit (Use text editor of Choise e.g. NP++). Replace \\Dc-email-ca\ftp\Active_VM_User_POA with \\*Yourserver*\VMTRACKER. Repeat this step for instances on the Logoff_Script.bat. 
4. Logoff_Script.bat should be set to run on logout via the windows task scheduler
5. User_Script.bat should be set to run on Startup and Login via windows task scheduler
6. Compile VMTRACKER.java on the host/server. Run *jar cfve VMTRACKER2.jar VMTRACKER VMTRACKER.class* in a CMD or Powershell terminal in the VMTRACKER Folder. ( Make sure you have java installed on host computer )
7. Create a shortcut for VMTRACKER on Desktop.
8. Profit.
