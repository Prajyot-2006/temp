@echo off

echo Running Java...

javac %1.java

if %errorlevel% neq 0 pause & exit /b

java %1

del /q *.class

echo.
echo --- Finished ---

pause