# -*- coding: utf-8 -*-
"""
Created on Thu Dec 10 17:51:44 2020

@author: Admin
"""

import time
import random


def Start():
    print("구구단을 외자 구구단을 외자 !\n")

def Menual():
    print("---------------------------------------------------")
    print("구구단은 5단 에서 9단 까지만 진행 합니다.")
    print("총 3번의 기회가 주어집니다. ")
    print("문제를 풀면 총 문제풀이에 걸린 시간이 표시 됩니다.")
    print("---------------------------------------------------")


Menual()
i=0
answer = list()
a_count = 0
na_count = 0

tries = int(input("도전 횟수를 입력하세요 ...\t\n"))

for i in range(tries):
    Start()
    st = time.time()
    dan = [6,7,8,9]
    num = [1,2,3,4,5,6,7,8,9]
    choise_dan = random.choice(dan)
    choise_num = random.choice(num)
    print("{0} X {1} ".format(choise_dan,choise_num),end="=")
    result = choise_dan * choise_num

    input_result = int(input())
    ed = time.time()
    runtime = ed - st

    if input_result == (result):
        if runtime < 10:
            print("정답 입니다.")
            print("문제 풀이 시간은 총 {0:.2f}초 입니다.".format(runtime))
            a_count +=1
        else:
            print("시간 초과 입니다.")
            na_count +=1

    else:
        print("틀렸습니다.")
        na_count +=1

    num.remove(choise_num)

print("{0}회 도전 결과 정답 :{1} // 오답 : {2} 입니다.".format(tries, a_count,na_count))
