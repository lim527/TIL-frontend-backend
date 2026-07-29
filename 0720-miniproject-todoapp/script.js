const input = document.querySelector("#todoInput");
const addBtn = document.querySelector("#addBtn");
const list = document.querySelector("#todoList");

let todos = JSON.parse(localStorage.getItem("todos")) || [];

function renderTodos() {
  list.innerHTML = "";

  todos.forEach((todo, index) => {
    const li = document.createElement("li");
    li.textContent = todo.text;

    if (todo.done) {
      li.style.textDecoration = "line-through";
    }

    li.addEventListener("click", () => {
      todos[index].done = !todos[index].done;
      saveTodos();
      renderTodos();
    });

    const deleteBtn = document.createElement("button");
    deleteBtn.textContent = "삭제";
    deleteBtn.addEventListener("click", (event) => {
      event.stopPropagation();
      todos.splice(index, 1);
      saveTodos();
      renderTodos();
    });

    li.appendChild(deleteBtn);
    list.appendChild(li);
  });

  // ⭐ forEach 밖으로 뺌 — 전체 목록 다 그린 다음, 딱 한 번만 계산
  const remainingCount = todos.filter((todo) => !todo.done).length;
  document.querySelector("#remaining").textContent = `완료 안 한 일: ${remainingCount}개`;
}

function saveTodos() {
  localStorage.setItem("todos", JSON.stringify(todos));
}

addBtn.addEventListener("click", () => {
  const text = input.value;
  if (text === "") {
    alert("할 일을 입력해주세요!");
    return;
  }

  todos.push({ text: text, done: false });
  saveTodos();
  renderTodos();
  input.value = "";
});

renderTodos();