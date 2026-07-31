#문제: 구명보트
#링크:(https://school.programmers.co.kr/learn/courses/30/lessons/42885?language=python3)
#날짜: 2026-07-31

def solution(people, limit):
    answer = 0
    people.sort()
    lo, hi =0, len(people) -1
    while(lo<=hi):
        if(people[lo]+people[hi] <=limit):
            lo+=1
        hi-=1
        answer+=1 
            
    return answer