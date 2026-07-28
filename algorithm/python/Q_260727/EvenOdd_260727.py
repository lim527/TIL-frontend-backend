#문제: 짝수와 홀수
#링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12937?language=java)
#날짜: 2026-07-27

def solution(num):
    if(num%2==0 ):
        answer = "Even"
    else: answer="Odd"
    return answer

num = int(input("숫자 입력"))
print(solution(num))