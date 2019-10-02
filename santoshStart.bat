@echo off
echo "Start the Project"

if [%1]==[] (set environment=local) else (set environment=%1)

if [%2]==[] (set jarName=santosh-1.0.jar) else (set jarName=%2)

echo environment is %environment%
echo jar file name is %jarName%

java.exe -jar build/libs/%jarName% --spring.config.additional-location=gradle/env/%environment%/application.properties