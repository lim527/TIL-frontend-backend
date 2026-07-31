#문제: 타겟 넘버
#링크:(https://school.programmers.co.kr/learn/courses/30/lessons/43165?language=python3)
#날짜: 2026-07-31

#조합을 세는 함수 즉,앞에 +,-을 붙였을 때 모두의 case 자체를 구함
def plusmin(index,currentSum,numbers, target):
    if index == len(numbers):
            if currentSum == target:
                return 1
            return 0
    plus=plusmin(index+1,currentSum+numbers[index],numbers,target)
    minus=plusmin(index+1,currentSum-numbers[index],numbers,target)
    return plus+ minus
    

def solution(numbers, target):
    return plusmin(0,0,numbers, target)

numbers= list(map(int,input("숫자").split()))
target=int(input("제한:"))
print(solution(numbers,target))