#문제: 자연수 뒤집기 배열로 만들기
#링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12932)
#날짜: 2026-07-28

def solution(n):
    answer = []
    while(n>0):
        answer.append(n % 10)
        n //= 10
    return answer

n = int(input("숫자를 입력하세요: "))
result = solution(n)
print(result)