const input = document.querySelector("#input");
const addBtn = document.querySelector("#addBtn");
const list = document.querySelector(".tags");

addBtn.addEventListener("click", () => {
  const text = input.value;

  if (text === "") {
    alert("태그를 입력해주세요!");
    return;   // 여기서 함수 실행 중단
  }

  // 1. 새 li 요소 만들기
  const li = document.createElement("span"); //span 태그 만들기
  li.textContent = text; // 내용 채우기
  li.classList.add("tag");  // tag 클래스 붙이기

  // 2. 삭제 버튼도 같이 만들기
  const deleteBtn = document.createElement("button");
  deleteBtn.textContent = "X";
  deleteBtn.addEventListener("click", () => {
    li.remove();
  });

  // 3. li 안에 삭제버튼 넣고, 리스트에 li 추가
  li.appendChild(deleteBtn);
  list.appendChild(li);

  // 4. 입력창 비우기
  input.value = "";
});