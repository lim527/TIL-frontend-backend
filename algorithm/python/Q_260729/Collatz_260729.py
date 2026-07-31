#문제: 콜라츠 추측
#링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12943?language=python3)
#날짜: 2026-07-29

def solution(num):
    answer = 0
    if(num==1): 
        return 0
    while(num != 1):
        if(num % 2 ==0):
            num //=2
        else:
            num =num *3 +1
        answer+=1
        if(answer ==500): 
            answer =-1
            return -1
    return answer

num =int(input("숫자를 입력해주세요:"))
print(solution(num))