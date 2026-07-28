const bio = document.querySelector(".bio");
const button = document.querySelector("#btn");
const button2 = document.querySelector("#btn2");

const messages = ["AI공학과 3학년 · 프로그래밍 연습 중", "AI공학과 3학년 · IOT 복수 전공 중", "매일 성장 중"];
let count = 0;

button.addEventListener("click", () => {
  count++;
  const index = count % messages.length;  // 배열 범위를 안 넘게
  bio.textContent = messages[index];
});

button2.addEventListener("click", () => {
  count++;
  alert(count+"번 클릭했습니다.");
});