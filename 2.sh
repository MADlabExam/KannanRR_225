#!/bin/sh
a=0
b=1
n=2
echo $a
echo $b
while [ $n -lt 10 ]
do
s=$( expr $a + $b )
echo $s
a=$b
b=$s
n=$( expr $n + 1 )
done
