@echo off
REM Script for running XSB when built natively on Windows
REM Generated automatically from wxsb.in by configure.

set BINDIR=%0\..\..

%BINDIR%\config\x86-pc-windows\bin\xsb %1 %2 %3 %4 %5 %6 %7
