//-----------------------------------------------
// 원하는 항목이 어디에 있는지 알아내기
// indexOf(v)

let superheroes = ["아이언맨", "캡틴", "토르", "헐크"]

let index = superheroes.indexOf("토르")
console.log("index =", index)

index = superheroes.indexOf("블랙위도우")  // 없으면 -1 리턴
console.log("index =", index)

//----------------------------------------------
// findIndex(함수)
// 찾고자 하는 대상이 object 이면.  어떻게 찾나?

let todos = [
    {
      id: 1,
      text: "자바스크립트 입문",
      done: true
    },
    {
      id: 2,
      text: "함수 배우기",
      done: true
    },
    {
      id: 3,
      text: "객체와 배열 배우기",
      done: true
    },
    {
      id: 4,
      text: "배열 내장함수 배우기",
      done: false
    }
  ];

// id가 3인것을 구하려면?
console.log(todos.indexOf(3))   // -1

// findIndex(함수)
index = todos.findIndex(todo => todo.id === 3)
console.log(index)

//---------------------
// find(함수) : 배열 원소 자체를 리턴
console.log(todos.find(todo => todo.id === 3))


// indexOf(), findIndex(), find() 는
// 가장 '첫번째'로 찾은 것을 리턴한다.