#문제: 예산
#링크: (https://school.programmers.co.kr/learn/courses/30/lessons/12982)
#날짜: 2026-07-27

def solution(d, budget):
    answer = 0
    d.sort()
    addd=0
    for i in range(len(d)):
        addd+=d[i]
        if(addd>budget):
            break
        answer+=1
    return answer

d=list(map(int,input("배열 입력: ").split()))
budget=int(input("예산 입력: "))
print(solution(d, budget))