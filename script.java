document.getElementById("addBtn").addEventListener("click", function () {
  let taskInput = document.getElementById("taskInput");
  let taskText = taskInput.value;

  if (taskText === "") {
    alert("Please enter a task!");
    return;
  }

  let li = document.createElement("li");

  let span = document.createElement("span");
  span.textContent = taskText;
  span.addEventListener("click", function () {
    span.classList.toggle("completed");
  });

  let removeBtn = document.createElement("button");
  removeBtn.textContent = "Remove";
  removeBtn.className = "remove-btn";
  removeBtn.addEventListener("click", function () {
    li.remove();
  });

  li.appendChild(span);
  li.appendChild(removeBtn);
  document.getElementById("taskList").appendChild(li);

  taskInput.value = ""; // clear input box
});