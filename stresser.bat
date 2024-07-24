@echo off
setlocal enabledelayedexpansion

set /p "id=Enter IP Address: "

:stress
ping !id! -n 1
goto stress
