#문제: 핸드폰 번호 가리기
#링크:(https://school.programmers.co.kr/learn/courses/30/lessons/12948)
#날짜: 2026-07-30

def solution(phone_number):
    answer = ''
    for i in range(len(phone_number)-4):
        answer+='*'
    for i in range(len(phone_number)-4,len(phone_number)):
        answer+=phone_number[i]
    return answer

phone_number=input("숫자만 입력:")
print(solution(phone_number))

#return ('*' * (len(s)-4)) + s[-4:]