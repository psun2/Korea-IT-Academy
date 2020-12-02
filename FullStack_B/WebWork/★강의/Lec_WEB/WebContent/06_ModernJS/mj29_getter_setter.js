/* object 의 getter, setter

getter 함수: 특정 값을 조회할때마다
setter 함수: 특정 값을 설정할때마다

https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Functions/get

ES 5.1 에 최초 정의
https://www.ecma-international.org/ecma-262/5.1/#sec-11.1.5

ES 6 에서 계산된 프로퍼티 이름이 추가
https://www.ecma-international.org/ecma-262/6.0/#sec-method-definitions


JS 에서 매우 유용

*/

const numbers = {
    a: 1,
    b: 2,

    // getter 함수
    get sum(){
        // get 키워드로 시작
        console.log("sum getter함수가 실행됩니다")
        // 반드시 무엇인가 리턴해주도록 하자.
        return this.a + this.b   // return 없으면 undefined 값 리턴됨.
    }
}

//numbers.sum()  // TypeError: numbers.sum is not a function

// getter 함수는 아래와 같이 '조회' 하려 할때
// 해당 코드가 호출된다.
console.log(numbers.sum)
numbers.b = 5
console.log(numbers.sum)

console.log()

// setter 함수
const dog = {
    _name: "멍멍이",

    // setter
    set name(value){
        // 반드시 parameter 가 설정되 있도록 하자
        console.log("이름이 바뀝니다.." + value)
        this._name = value
    }
}

// setter 는 값을 '쓰는(write/update)' 동작을 할때 호출된다.
console.log(dog._name)
dog.name = "흰둥이"  // setter name() 호출
console.log(dog._name)
console.log()

//---------------------------------------
 
const numbers2 = {
    _a: 1,
    _b: 2,
    sum: 3,

    calculate(){
        console.log("calculate() 호출")
        this.sum = this._a + this._b
    },

    get a(){return this._a},
    get b(){return this._b},
    set a(value){
        this._a = value     // _a 가 업데이트 될때마다
        this.calculate()   // .sum 도 업데이트
    },
    set b(value){
        this._b = value   // _b 가 업데이트 될때마다
        this.calculate()  // .sum 도 업데이트
    }
}
  
console.log(numbers2.sum)
numbers2.a = 5
numbers2.b = 7  
console.log(numbers2.sum)

// 여러번 조회해도 이전에 이미 계산된 값을 
// 조회하는 것이기 때문에 재계산을 하지 않는다.
console.log(numbers2.sum)
console.log(numbers2.sum)


// 다르게 동작하게 하는 경우
const numbers3 = {
    _a: 1,
    _b: 2,
    get sum() {
        console.log("sum() 호출 : 연산수행")
        return this._a + this._b
    }
}

console.log(numbers3.sum)
numbers3._a = 100
numbers3._b = 200
console.log(numbers3.sum)
console.log(numbers3.sum)

