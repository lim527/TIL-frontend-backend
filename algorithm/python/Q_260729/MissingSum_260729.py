#문제: 없는 숫자 더하기
#링크: (https://school.programmers.co.kr/learn/courses/30/lessons/86051?language=python3)
#날짜: 2026-07-29

def solution(numbers):
    answer = -1
    for i in range(10):
        if(i not in numbers):
            answer+=i
    if(answer != -1):
        answer+=1
    return answer

numbers=list(map(int,input("배열을 입력하세요:").split()))
print(solution(numbers))

#def solution(numbers):
# return 45-sum(numbers)