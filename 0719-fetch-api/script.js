const loadBtn = document.querySelector("#loadBtn");
const todoList = document.querySelector("#todoList");
const post= document.querySelector("#post")

async function getTodos() {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/todos");
    const res=await fetch("https://jsonplaceholder.typicode.com/posts/1")
    const todos = await response.json();
    const singlePost =await res.json();

    todoList.innerHTML = "";  // 기존 목록 비우기
    const first10 = todos.slice(0, 10); // 상위 10개만 표시,저장
    post.innerHTML ="";

    first10.forEach((todo) => {
      const li = document.createElement("li");
      li.textContent = `${todo.completed ? "✅" : "❌"} ${todo.title}`;
      todoList.appendChild(li);
      
    });

    //게시물 제목/본문 화면에 표시
    post.innerHTML = `<strong>${singlePost.title}</strong><br>${singlePost.body}`;

  } catch (error) {
    console.log("데이터를 불러오지 못했어요:", error);
  }
}

loadBtn.addEventListener("click", getTodos);