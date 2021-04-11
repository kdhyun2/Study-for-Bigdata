# -*- coding: utf-8 -*-
"""
Created on Thu Dec 10 17:50:35 2020

@author: Admin
"""

import time

def MENU():
    print(" ## 아메리카노 : 2500 원 ##")
    print(" ## 카페 라테  : 3000 원 ##")
    print(" ## 카푸 치노  : 3000 원 ##")

blist = ["아메리카노", "카페 라테", "카푸 치노"]
plist = [2500, 3000, 3000]

MENU()
i=0
sum_price = 0
tries =0

while i<len(blist):
    input_q = int(input("{0}의 잔수를 입력해주세요".format(blist[i])))
    sum_price = sum_price + (input_q*plist[i])
    i +=1

print("{0}원 입니다.".format(sum_price))

while True:
    if tries ==0:
        input_money = int(input("금액을 투입해 주세요 .."))
        tries = tries +1
    else:
        add_money = int(input("추가금을 투입 하세요"))
        input_money = input_money + add_money

    if sum_price > input_money:
        
        print("금액이 너무 작습니다..금액을 {0}원 이상을 더 투입하세요"\
            .format(sum_price-input_money))
        continue

    else:
        break

payback = input_money - sum_price
print("주문이 완료되었습니다 \n 잠시만 기다려주세요 \
\n음료를 준비중입니다...")

time.sleep(10)

print("주문하신 음료 나왔습니다. 거스름 돈은 {0} 입니다.".format(payback))
  