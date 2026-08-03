const btn = document.querySelector("#btn");
const result = document.querySelector("#result");
const student =["서영", "지민", "수빈", "현우", "민재", "서준", "예린"];

btn.addEventListener("click", () => {
  // 0~6 사이 랜덤 정수 만들기
  const score = Math.floor(Math.random() * 6 + 1) * 10; // 10, 20, 30, 40, 50, 60

  let num;
  if(score % 2 === 0) {
    num = "짝수";
  } else {
    num = "홀수";
  }
  result.textContent = `${num}`+'!';
});

for (let i = 1; i <= 10; i++) {
  if (i % 3 === 0) {
    console.log(i);
  }
};

for(const name of student) {
  console.log(name+"님, 안녕하세요!");
};