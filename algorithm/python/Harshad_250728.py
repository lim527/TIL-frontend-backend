#문제: 하샤드 수
#링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12947)
#날짜: 2026-07-28

def solution(x):
    answer = True
    n=x
    sol=0
    while(n>0):
        sol+=n%10
        n//=10
    if(x%sol!=0):
        answer = False
    return answer

x = int(input("숫자를 입력하세요: "))
result = solution(x)
print(result)