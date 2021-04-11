# -*- coding: utf-8 -*-
"""
Created on Thu Dec 10 09:37:48 2020

@author: Admin
"""

def IsPrime(number):

    yaksu =0

    for i in range(1,number+1):
        if number % i ==0:
            yaksu = yaksu + 1

    if yaksu == 2:
        print(True)

    else:
        print(False)



while True:
    try:
        number = int(input("enter number ..."))
        break
    except ValueError:
        continue 
        
IsPrime(number)
