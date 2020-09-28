class Mypromise {
  constructor(runPromise) {
    this.runPromise = runPromise;
    this.myResponse = null;
    this.myReject = null;
  }
  then(func) {
    this.runPromise(
      (resolveValue) => {
        this.myResponse = resolveValue;
      },
      (rejectValue) => {
        this.Myreject = rejectValue;
      },
    );
    func(this.myResponse);
  }
}

function runPromise(resolve, reject) {
  resolve('전달해줄 데이터');
}
const fetch = ('응답받은 서버주소') => {
  return new Promise(runPromise);
};
