# -*- coding: utf-8 -*-
"""
Created on Thu Dec 10 09:38:28 2020

@author: Admin
"""

def numberOfPrime(number):
    sosu = 0
    prime_list = list()

    for i in range(2,number+1):
        yaksu =0
        for j in range(1, i+1):
            if i % j ==0:
                yaksu = yaksu + 1

        if yaksu == 2:
            prime_list.append(i)
            sosu = sosu + 1

    print(prime_list)
    print("\n소수의 갯수는 {0}개 입니다 ".format(sosu))

while True:
    try:
        number = int(input("enter number ..."))
        break
    except ValueError:
        continue 

numberOfPrime(number)

