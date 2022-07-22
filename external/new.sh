#!/bin/sh
read a
read b
s=1
while [ $b -gt 0 ]
do
s=$(($s * $a ))
b=$(($b - 1 ))
done
echo $s
 
