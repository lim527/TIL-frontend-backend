#문제: 문자열 내림차순으로 배치하기
#링크:(https://school.programmers.co.kr/learn/courses/30/lessons/12917?language=python3)
#날짜: 2026-07-30

def solution(s):
    answer = ''.join(sorted(s, reverse=True))
    return answer

s =input("문자열을 입력하세요")
print(solution(s))

#join은 리스트를 앞의 문자열을 구분자로 사용하여 붙임.
#즉 앞에 아무것도 없어서 거꾸로 정렬된 것을 연달아 붙임. 
