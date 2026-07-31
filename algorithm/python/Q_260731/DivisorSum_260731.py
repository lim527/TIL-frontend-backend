#문제: 약수의 개수와 덧셈
#링크:(https://school.programmers.co.kr/learn/courses/30/lessons/77884)
#날짜: 2026-07-31

def solution(left, right):
    answer = 0
    for i in range(left,right+1):
        idx=0
        for j in range(1,int(i**0.5)+1):
            if(i%j==0): 
                idx=idx + 2
            if(i==j*j):
                idx-=1
        if(idx%2 ==0): 
            answer+=i
        else:
            answer-=i
    return answer