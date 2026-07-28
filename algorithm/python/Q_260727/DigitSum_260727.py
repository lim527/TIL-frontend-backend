#문제: 자릿수 더하기
#링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12931?language=python3)
#날짜: 2026-07-27

def solution(n):
    answer = 0
    while n > 0:
        answer = answer+ (n % 10)
        n = n//10
    return answer

num = int(input("숫자 입력: "))
print(solution(num))